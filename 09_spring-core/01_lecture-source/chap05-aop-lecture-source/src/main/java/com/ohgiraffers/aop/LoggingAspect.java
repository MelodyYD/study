package com.ohgiraffers.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Map;

// @Aspect 어노테이션 : AOP 기능을 사용하기 위한 어노테이션
@Aspect
@Component
public class LoggingAspect {

    /*
    *   @PointCut - 여러 조인 포인트를 매칭하기 위한 표현식
    *   사용식
    *   @PointCut("execution([수식어] 리턴타입 [클래스명].이름(파라미터)")
    *   수식어란, public-private-protected-default 등의 접근제어자를 의미하며, 생략이 가능하다.
    *   * -> 와일드 카드(전부 가능)
    *   *Service -> 이름이 Service 로 끝나는 클래스
    *   *Service.*(..) -> 매개변수가 0개 이상인 모든 메소드
    *   *Service.*(*) -> 매개변수가 1개인 모든 메소드
    *   *Service.*(*, ..) -> 매개변수가 1개 이상인 모든 메소드
    * */
    @Pointcut("execution(* com.ohgiraffers.aop.*Service.*(..))")
    public void logPointCut() {}

    /*
    *   JoinPoint : 포인트 컷으로 설정한 실행 지점을 의미한다.
    *   실행 지점을 설정하게 되면 우리가 메소드 내에 작성한 코드(Advice)를
    *   어노테이션의 종류에 따라 전, 후, 전후 등에 동작하도록 할 수 있다.
    *   메소드의 매개변수로 전달한 JoinPoint 객체는 현재 조인 포인트의 메소드명, 인수, 정보 등을 가지고 있다.
    * */

    @Before("LoggingAspect.logPointCut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before 타겟 정보 : " + joinPoint.getTarget());
        System.out.println("Before 타겟의 시그니처 : " + joinPoint.getSignature());
        if(joinPoint.getArgs().length > 0) {
            System.out.println("Before 타겟의 인자 : " + joinPoint.getArgs()[0]);
        }
    }

    // 같은 클래스 내에 PointCut 을 설정했다면 클래스명은 생략 가능
    // 만약 다른 클래스에 PointCut 을 설정했다면 반드시 풀클래스명(패키지 포함)을 표기해야 한다.
    @After("logPointCut()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After 타겟 정보 : " + joinPoint.getTarget());
        System.out.println("After 타겟의 시그니처 : " + joinPoint.getSignature());
        if(joinPoint.getArgs().length > 0) {
            System.out.println("After 타겟의 인자 : " + joinPoint.getArgs()[0]);
        }
    }

    /*
    *   @AfterReturning 어노테이션
    *   리턴할 결과 값을 변경할 수 있다.
    *   returning 속성
    *   - 메소드가 동작을 완료하고 자신을 호출한 쪽으로 가져가는 값
    *   - 즉 리턴값을 담아둘 변수명을 기술한다.
    * */
    @AfterReturning(pointcut = "logPointCut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("result 변수에 Service 에서 return 되는 값이 담겼나? : " + result);
        /*
        *   result 변수에 우리가 Service 클래스에서 return 되는 값이 담긴 것을 확인했ㄷ.
        *   그렇다느 ㄴ것은 우리가 result 변수에 접근해서 값을 조작할 수 있다는 의미로 해석할 수 있다.
        * */
        if (result != null && result instanceof Map) {
            ((Map<Long, MemberDTO>) result).put(1222L, new MemberDTO(1222L, "멜로디"));
        }

    }

    /*
    *   @AfterThrowing
    *
    * */
    @AfterThrowing(pointcut = "logPointCut()", throwing = "exception")
    public void logAfterThrowing(Throwable exception) {
        System.out.println("AfterThrowing exception : " + exception);
    }

    /*
    *   @Around (가장 강력한 녀석!)
    *   - Around 는 우리가 지정한 실행 위치(JoinPoint) 앞 뒤를 모두 장악한다.
    *   - 그리고 타겟 메소드의 실행 시점, 실행 여부, 계속 진행 여부 등을 결정한다.
    *   - Around Advice 는 JoinPoint 를 확장한 ProceedingJoinPoint 를 매개변수로 받게 된다.
    * */
    @Around("logPointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 앞뒤로 동작을 하게 되므로 여기서는 메소드 실행시 소요되는 시간을 체크하는 로직 작성
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Around Before : " + joinPoint.getSignature().getName());

        // Target 메소드 시작시키는 구문
        Object result = joinPoint.proceed();

        System.out.println("Around After : " + joinPoint.getSignature().getName());
        stopWatch.stop();
        System.out.println("메소드 실행에 소요 된 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)");

        // 조인 포인트를 호출한 쪽(지금은 Application) or 다른 어드바이스가 실행할 수 있도록 Object 반환

        return result;

    }

}

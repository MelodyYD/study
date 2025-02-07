import {Navigate} from 'react-router-dom';

/*
    컴포넌트 내에서 권한이나 다른 특정한 상황에 의해 다른 페이지로 보내고 싶을 때
    Navigate라는 컴포넌트를 사용할 수 있다.
    useNavigate랑 동일한 역할을 하지만 함수로 작성을 할 것인지 컴포넌트로 작성할 것인지에 따라 선택할 수 있다.
*/

function Mypage() {

    const isLogin = false;

    if(isLogin) {
        return <Navigate to='/menu'/>
    }

    return(
        <div>
            <h1>마이 페이지!</h1>
        </div>
    )
}

export default Mypage;
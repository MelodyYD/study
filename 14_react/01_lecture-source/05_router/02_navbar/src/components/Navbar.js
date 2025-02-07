/* 공용으로 사용할 네비게이션바 컴포넌트 */
// import {Link} from 'react-router-dom';
import {NavLink} from 'react-router-dom';

/*
    NavLink 는 Link 와 사용 방법은 거의 유사하다.
    차이점은 현재 Nav 의 상태가 active(활성화) 인지에 대한 값을
    사용할 수 있어 스타일 조작하거나 클래스 이름 변경 등의 추가적인
    기능을 수행할 수 있다.
*/

function Navbar() {

    const activeStyle = {
        backgroundColor: 'red',
        border: 1
    }

    return(
        <div>
            {/* <ul>
                <li><a href={"/"}>메인</a></li>
                <li><a href={"/menu"}>메뉴</a></li>
                <li><a href={"/about"}>소개</a></li>
            </ul> */}
            {/* <ul>
                <li><Link to='/'>메인</Link></li>
                <li><Link to='/menu'>메뉴</Link></li>
                <li><Link to='/about'>소개</Link></li>
            </ul> */}
            <ul>
                <li><NavLink to='/' style={({isActive}) => isActive ? activeStyle : undefined}>메인</NavLink></li>
                <li><NavLink to='/menu' style={({isActive}) => isActive ? activeStyle : undefined}>메뉴</NavLink></li>
                <li><NavLink to='/about' style={({isActive}) => isActive ? activeStyle : undefined}>소개</NavLink></li>
            </ul>
        </div>
    );
}

export default Navbar;
import { NavLink, useNavigate } from 'react-router-dom';
import { useDispatch } from "react-redux";
import { resetLoginUser } from "../../modules/UserModule";

function Navbar() {

    const loginStatus = !!localStorage.getItem('isLogin');
    const navigate = useNavigate();
    const dispatch = useDispatch();

    /* 로그아웃 호출 시 localStorage 저장 값 삭제, userReducer 값 리셋, 루트로 이동  */
    const logoutHandler = () => {
        localStorage.removeItem('isLogin');
        dispatch(resetLoginUser());
        navigate('/');
    }

    return (
        <div>
            <ul>
                <li><NavLink to='/'>메인으로</NavLink></li>
                <li><NavLink to='/menu'>메뉴보기</NavLink></li>
                {/* localStorage 안의 값으로 로그인 여부 판단하여 조건부 랜더링 */}
                { !loginStatus ? (
                        <li><NavLink to='/login'>로그인</NavLink></li>
                    ) : (
                        <li onClick={ logoutHandler }><a href="">로그아웃</a></li>
                    )
                }

            </ul>
        </div>
    );
}

export default Navbar;
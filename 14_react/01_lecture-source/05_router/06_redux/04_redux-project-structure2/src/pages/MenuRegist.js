
import { Navigate } from 'react-router-dom';
import MenuRegistForm from '../components/form/MenuRegistForm';

function MenuRegist() {

    /* 로그인 상태가 아닌데 호출할 경우 메인으로 */
    const loginStatus = !!localStorage.getItem('isLogin');

    if(!loginStatus) {
        return <Navigate to="/login" replace={ true }/>
    }

    return(
        <>  
            <h1>메뉴 등록 페이지</h1>
            <MenuRegistForm/>
        </>
    );
}

export default MenuRegist;
import Navbar from "../components/Navbar";
import Header from "../components/Header";
import {Outlet} from 'react-router-dom';

/*
    Outlet
    react-router-dom 에서 제공하는 기능으로서
    라우팅 된 컴포넌트를 렌더링 하는 컴포넌트이다.
    중첩 라우팅을 적용할 때 사용하게 되며
    url 주소에 따라서 자식 컴포넌트를 렌더링 하는 역할을 한다.
*/

function Layout() {
    return(
        <>
            <Header/>
            <Navbar/>
            <Outlet/>
        </>
    );
}

export default Layout;
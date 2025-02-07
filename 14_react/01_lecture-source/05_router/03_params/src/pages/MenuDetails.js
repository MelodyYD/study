import {useState, useEffect} from 'react';
// MenuDetails 컴포넌트가 호출되는 시점은 PathVariable 로
// menuCode 가 넘어오는 시점이다. 해당 파라미터를 꺼내올 수 있는
// useParams 라는 훅을 router 쪽에서 제공하고 있다.
import {useParams} from 'react-router-dom';
import {getMenuByMenuCode} from '../apis/MenuAPI';


function MenuDetails() {

    // useParams 에 pathvariable 이 들어있는 거 확인
    // console.log(useParams());
    const {menuCode} = useParams();
    const [menu, setMenu] = useState({
        menuName: '',
        menuPrice: 0,
        categoryName : '',
        detail : {}
    });

    useEffect(() => {
        setMenu(getMenuByMenuCode(menuCode));
    }, [])

    return(
        <>
            <h2>{menu.menuName} 상세 조회</h2>
            <h3>가격 : {menu.menuPrice}</h3>
            <h3>종류 : {menu.categoryName}</h3>
            <h3>설명 : {menu.detail.description}</h3>
            <img src={menu.detail.image} style={{maxWidth: 500}}></img>
        </>
    );

}

export default MenuDetails;
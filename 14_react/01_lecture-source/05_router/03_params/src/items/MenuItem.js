import itemStyle from './MenuItem.module.css';
import {NavLink} from 'react-router-dom';

function MenuItem({menu}) {
    return(
        <NavLink to={`/menu/${menu.menuCode}`}>
            <div className={itemStyle.MenuItem}>
                <h3>메뉴이름 : {menu.menuName}</h3>
                <h3>메뉴가격 : {menu.menuPrice}</h3>
                <h3>메뉴종류 : {menu.categoryName}</h3>
            </div>
        </NavLink>
    );
}

export default MenuItem;
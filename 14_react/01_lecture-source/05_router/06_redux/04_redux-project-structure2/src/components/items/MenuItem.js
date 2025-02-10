import { Link } from  'react-router-dom';

function MenuItem({ menu }) {

    return (
        <Link to={ `/menu/${ menu.id }` }>
            <div className="menuItem">
                <h3>이름 : { menu.menuName }</h3>
                <h3>가격 : { menu.menuPrice }</h3>
                <h4>종류 : { menu.categoryName }</h4>
            </div>
        </Link>
    );
}

export default MenuItem;
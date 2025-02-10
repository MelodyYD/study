
import { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { useDispatch, useSelector } from 'react-redux';
import { callRegistMenuAPI } from '../../apis/MenuAPICalls';

function MenuRegistForm() {

    const result = useSelector(state => state.menuReducer);
    const dispatch = useDispatch();
    const navigate = useNavigate();

    /* 입력 값 state 저장 */
    const [registMenu, setRegistMenu] = useState(
        {
            id: 0,
            menuName: '',
            menuPrice: 0,
            categoryName: '한식',
            isOrderable: false,
            detail : {
                description: '',
                image: ''
            }
        }
    );
    
    /* 입력 값 변경 시 이벤트 핸들러 */
    const onChangeHandler = (e) => {

        let name = e.target.name;
        let value = e.target.value;

        /* json-server에 저장될 데이터 타입 맞추기 위한 코드 */
        switch(name) {
            case 'menuPrice' : 
                value = parseInt(value); 
                break;
            case 'isOrderable' : 
                value = !!value; 
                break;
            case 'description' : 
                name = 'detail';
                value = {
                    description : value,
                    image : registMenu.detail.image
                };
                break;
        }

        setRegistMenu(
            {
                ...registMenu,
                [name] : value
            }
        );

        console.log(registMenu);

    }

    /* 파일 첨부 시 동작하는 이벤트 핸들러 */
    const fileChangeHandler = async (e) => {
        const file = e.target.files[0];
        console.log(file);
        const base64 = await convertBase64(file);
        console.log(base64);
        setRegistMenu(
            {
                ...registMenu,
                detail : {
                    description : registMenu.detail.description,
                    image : base64
                }
            }
        );

        console.log(registMenu);
    }

    /* FileReader API를 통해 input type="file"에 첨부 된 파일을 base64 인코딩 형식으로 변환 */
    const convertBase64 = (file) => {
        return new Promise((resolve, reject) => {
          const fileReader = new FileReader();
          fileReader.readAsDataURL(file)
          fileReader.onload = () => {
            resolve(fileReader.result);
          }
          fileReader.onerror = (error) => {
            reject(error);
          }
        })
      }

      
      useEffect(
        () => {
            /* 메뉴 등록 완료 확인 후 /menu로 이동 */
            if(result.regist) {
                alert('메뉴 등록');
                navigate(`/menu`);
            }
        },
        [result]
      );

    const onClickHandler = () => {
        /* registMenu에 대한 유효성 검사 후 호출 */
        dispatch(callRegistMenuAPI(registMenu));
    }

    return(
        <>  
            <label>메뉴 이름 : </label>
            <input type="text" name="menuName" value={ registMenu.menuName } onChange={ onChangeHandler }/>
            <br/>
            <label>메뉴 가격 : </label>
            <input type="number" name="menuPrice" value={ registMenu.menuPrice } onChange={ onChangeHandler }/>
            <br/>
            <label>카테고리 : </label>
            <select name="categoryName" value={ registMenu.categoryName } onChange={ onChangeHandler }>
                <option>한식</option>
                <option>일식</option>
                <option>서양</option>
                <option>동양</option>
                <option>커피</option>
                <option>쥬스</option>
                <option>기타</option>
            </select>
            <br/>
            <label>판매 여부 : </label>
            <select name="isOrderable" value={ registMenu.isOrderable } onChange={ onChangeHandler }>
                <option value="true">판매 가능</option>
                <option value="false">판매 불가</option>
            </select>
            <br/>
            <label>설명 : </label>
            <textarea name="description" value={ registMenu.detail.description } onChange={ onChangeHandler }></textarea>
            <br/>
            <label>사진 : </label>
            <input 
                type="file" 
                name="image"
                accept='image/*'
                onChange={ fileChangeHandler }/>
            <br/>
            <button onClick={ onClickHandler }>메뉴 등록</button>
        </>
    );
}

export default MenuRegistForm;
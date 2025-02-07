import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Main from './pages/Main';
import About from './pages/About';
import Menu from './pages/Menu';

function App() {

  /*
    최초 프로젝트 기본 설정
    프로젝트 만들고 싶은 폴더에 1. npx create-react-app ./
    이후 기본 세팅
    2. src 폴더에 App.js, index.js 빼고 지우기!!
    3. App.js, index.js 에 불필요한 import 구문, 코드 지우기!!
    4. npm install react-router-dom@6 으로 의존성 추가!!

    라우팅 이란??
    어떠한 요청을 어디로 안내 및 매핑할 것인지를 정해놓고
    진행하는 것.
    리액트는 요청에 따라 요청에 매핑 된 컴포넌트를 렌더링한다.
    /menu/detail => <Detail/>
    
    react-router-dom 에서 제공하는

    BrowserRouter
    - 라우팅이 필요한 컴포넌트를 감싸는 컴포넌트
    Routes 
    - Route 들을 묶어주는 단위
    Route
    - url 요청 주소와 컴포넌트를 매핑 해주는 단위
  */

  return (
      <>
        <BrowserRouter>
          <Routes>
            {/*<Route index element={<Main/>}/>*/}
            <Route path='/' element={<Main/>}/>
            <Route path='/menu' element={<Menu/>}/>
            <Route path='/about' element={<About/>}/>
          </Routes>
        </BrowserRouter>
      </>
  );
}

export default App;

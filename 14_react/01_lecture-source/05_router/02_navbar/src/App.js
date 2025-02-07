import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Layout from './layouts/Layout';
import Menu from './pages/Menu';
import About from './pages/About';
import Main from './pages/Main';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Layout/>}>
          <Route index element={<Main/>}/>
          <Route path='main' element={<Main/>}/>
          <Route path='menu' element={<Menu/>}/>
          <Route path='about' element={<About/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;

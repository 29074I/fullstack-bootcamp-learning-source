import { Route, Routes } from 'react-router-dom';
import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import Main from './components/Main';
import Storage from './components/Storage';

import ProductList from './components/ProductList';
import ProductDetail from './components/ProductDetail'
import { useState } from 'react';


function App() {

  /* 미션 수행 순서!
  1) Route 처리 
  - BrowserRouter, Routes, Route, ... etc
  - import export

  2) App.js에 list state관리해주기
  - tip* 함수 또한 props로 보낼 수 있다는 것을 명심!
  ex) const[list, setList] = useState([])prop
    ...
    <Main list={list} setList={setList}/>
  
    3) Header Mission
    4) ProductList Mission
    5) Product Item Mission
    6) Product Detail Mission
  */
  const [list, setList] = useState([])
  // 전체적으로 사용한다면 최상위 컴포넌트에 **

  return (
    <div className='container'>
      <Header />
      <Routes>
        <Route path='/' element={<Main />} />
        <Route path='/list' element={<ProductList list={list} setList={setList} />} />
        <Route path='/detail/:num' element={<ProductDetail list={list}  />} />
        <Route path='/storage' element={<Storage/>}/>
      </Routes>
      <Footer />
    </div>
  );
}

export default App;

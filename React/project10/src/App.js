import './App.css';
import Header from './components/Header';
import ProductList from './components/ProductList';
import { Route, Routes } from 'react-router-dom';
import ProductDetail from './components/ProductDetail';
import { useEffect, useState } from 'react';
import axios from 'axios'

function App() {

  const [list, setList] = useState([])

  useEffect(()=>{
    // 화면이 mount 되었을 때 back-end Data를 가져오겠다.
    axios.get('http://172.30.1.29:8090/shop/')
    .then((res)=>{
      // console.log('결과 : ',res.data);
      setList(res.data)
    })
  },[])

  return (
    <div>
      <Header />
      <Routes>
        <Route path='/' element={<ProductList list={list}/>}/>
        <Route path='/product/:num' element={<ProductDetail/>}/>
      </Routes>
    </div>
  );
}

export default App;

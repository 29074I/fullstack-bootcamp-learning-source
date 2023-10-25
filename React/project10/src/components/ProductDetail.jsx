import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import axios from 'axios'

const ProductDetail = () => {

  let { num } = useParams()
  // console.log('num :', num);
  

  const [a, setA] = useState({})

  // axios를 통해서 한가지 상품에 대한 정보만 가지고 올 것
  // 'http://172.30.1.29:8090/shop/' => 'http://172.30.1.29:8090/shop/p10'
  useEffect(()=>{
    axios.get('http://172.30.1.29:8090/shop/'+num)
  .then((res) =>{
    setA(res.data.product)
  })
  },[])

  // 값이 변했는지 정확히 확인하고 싶으면
  // useEffect(()=>{
  //   console.log(a);
  // },[a])
  
  
  return (
    <div>
      <img width='100px' src={"data:image/;base64,"+a.img}></img>
      <p>{a.pname} {a.price}</p>
        
    </div>
  )
}

export default ProductDetail
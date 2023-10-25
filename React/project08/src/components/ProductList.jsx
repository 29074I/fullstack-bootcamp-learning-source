import React, { useEffect } from 'react'
import axios from 'axios'
import ProductItem from './ProductItem'

const ProductList = ({ list, setList }) => {

    /* Mission!
    1) public 안에 두었던 bestList.json 값을 가지고 올 것
        => axios 이용, useEffect 이용, useState 배열 이용
    2) 가지고 온 데이터를 state값 관리
        => map 함수, props 처리 (index 값도 같이 가지고 오기)
    */
    // public 안 : 이미 서버에 올라갔다는 것
    // res : result, response



    useEffect(() => {
        axios.get('http://localhost:3000/bestlist.json')
            .then((res) => {
                // console.log(res.data.list);
                setList(res.data.list)
            })
    }, [])


    return (
        <div className='list-container'>
            {list.map((item,idx)=>(<ProductItem item={item} key={item.no} index={idx}/>))}
            {/* {list.map((item,index)=>{
                <ProductItem key={item.no} item={item} index={index}/>
            })} */}
        </div>
    )
}

export default ProductList
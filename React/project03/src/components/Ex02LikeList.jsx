import React from 'react'
import {useState} from 'react'

export const Ex02LikeList = () => {

    const [heart, setHeart] = useState("🤍")
    const [num, setNum] = useState(0)
    
    const ck=()=>{

        if(num==1){
            setHeart("🤍")
            setNum(0)
        }else{
            setHeart("💖")
            setNum(1)
        }   
    }
    

    return (
        <div>
            <span onClick={ck}>{heart}</span>{" "}
            <span className=''><b>좋아요 {num}개</b></span>

        </div>
    )
}

export default Ex02LikeList

import React from 'react'
import { useRef } from 'react'

const Ex07 = () => {

    /* 
        1) 사용자가 input 태그 안에 입력한 값을 가져오기
        2) 그 값에 따라서 사진의 src 속성을 변경하기

    */


    const inputRef = useRef()
    const imgRef = useRef()

    const chImg = () => {
        // console.log(inputRef.current.value);
        if (inputRef.current.value == '유진') {
            imgRef.current.src = 'https://daily.hankooki.com/news/photo/202302/921821_1173804_5532.jpg'
        } else if (inputRef.current.value == '수지'){
            imgRef.current.src = 'https://newsimg.sedaily.com/2019/09/04/1VO45O5N53_3.jpg'
        }
        inputRef.current.value = "";
        inputRef.current.focus()
        
    }



    return (
        <div>
            <p>희망하는 사진이 있으신가요?</p>
            <input ref={inputRef} type='text' />
            <button onClick={chImg}>변경!</button>

            <div>
                <img ref={imgRef} src='https://newsimg.sedaily.com/2019/09/04/1VO45O5N53_3.jpg'
                    width='200px'>
                </img>
            </div>
        </div>
    )
}

export default Ex07
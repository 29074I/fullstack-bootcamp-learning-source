import React from 'react'
import Ex03Header from './components/Ex03Header'
import Ex03Main from './components/Ex03Main'
import { DarkContext } from './context/Ex03DarkContext'
import { useState } from 'react'

const Ex03 = () => {
    /* 

    const [isDark, setIsDark] = useState(false)
    // const [bgColor, setBgColor] = useState('white')
    // const [txtColor, setTxtColor] = useState('black')

    if(isDark){
        // document.body.style.backgroundColor = 'black'
        // document.body.style.color = 'white'
        console.log(isDark);
    }else{
        // document.body.style.backgroundColor = 'white'
        // document.body.style.color = 'black'
        console.log(isDark);
    }*/

    // 어플리케이션의 Theme와 관련된 데이터
    // => 전역적으로 사용, 관리 => context

    const [isDark, setIsDark] = useState(false)


    return (
        /*
        <DarkContext.Provider value={{isDark, setIsDark}}>
        <div style={{backgroundColor : (isDark)? 'black' : "white",
                    color : (isDark) ?  'white' : 'black' ,height : "100vh"}}>
            <Ex03Header/>
            <Ex03Main />
        </div>
        </DarkContext.Provider>
        */
        <DarkContext.Provider value={{isDark, setIsDark}}>
            <div>
                <Ex03Header />
                <Ex03Main />
            </div>
        </DarkContext.Provider>
    )
}

export default Ex03
import React from 'react'
import { useContext } from 'react'
import { DarkContext } from '../context/Ex03DarkContext'

const Ex03Main = () => {

    
    const { isDark, setIsDark } = useContext(DarkContext)
    
    const toggleTheme = ()=>{
        setIsDark(!isDark)
    }



    return (
        /*
        <div>
            Ex03Main
            <br />
            <button onClick={() => {
                if (isDark) {
                    setIsDark(false)
                } else{
                    setIsDark(true)
                }
            }}>다크모드</button>
        </div>
        */
        <div style={{
            backgroundColor : isDark ? "black" : "white",
            color : isDark ? "white" : "black"
        }}>
            Ex03Main
            <br />
            <button onClick={toggleTheme}>다크모드</button>
        </div>


    )


}

export default Ex03Main
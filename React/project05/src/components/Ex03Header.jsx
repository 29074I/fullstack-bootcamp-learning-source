import React from 'react'
import { useContext } from 'react'
import { DarkContext } from '../context/Ex03DarkContext'

const Ex03Header = () => {

    const {isDark} = useContext(DarkContext)

    return (
        <div style={{
            backgroundColor : isDark ? "black" : "white",
            color : isDark ? "white" : "black"
        }}>Ex03Header</div>
    )
}

export default Ex03Header
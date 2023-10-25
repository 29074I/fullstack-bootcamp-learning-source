import React from 'react'
import menu from "./menu.json"
import MenuItem from "./components/Ex02MenuItem"


const Ex02 = () => {
    console.log('menu : ', menu.list)

    
    return (
        <div className='out'>
            {menu.list.map(item => 
            <MenuItem name={item.name} imgSrc={item.imgSrc}
            price={item.price} content={item.content}/>)}
        </div>

        
    )
}

export default Ex02
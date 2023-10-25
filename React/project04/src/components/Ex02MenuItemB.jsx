import React from 'react'

const Ex02MenuItemB = ({name, price, content, imgSrc}) => {
    return (
        <div>
            <img src={imgSrc}
            width="300px" class="img"></img>
            <p>
                <span><b>{name}</b></span>{" "}
                <span>{price}원</span>
            </p>
            <p>{content}</p>
            
        </div>
    )
}

export default Ex02MenuItemB
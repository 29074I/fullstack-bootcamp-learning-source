import React from 'react'

const Ex02MenuItem = ({imgSrc, name, price, content}) => {

    return (
        <div class='container'>
            <img src={imgSrc}
            width="300px" class="img"></img>
            <p>
                <span id='name'><b>{name}</b></span>{" "}
                <span>{price}원</span>
            </p>
            <p>{content}</p>
        </div>
    )
}

export default Ex02MenuItem
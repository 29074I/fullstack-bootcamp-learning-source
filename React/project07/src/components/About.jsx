import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

const About = () => {
    /* useNavigate
    - 페이지 이동을 도와주는 React Hooks
    

    (1) import { useNavigate } from 'react-router-dom'
    (2) const 변수 = useNavigate()
    (3) 페이지 이동을 해야할 때, 변수("경로")

    ex) const nav = useNavigate()
        nav("/mypage")
    */

    const nav = useNavigate()
    let auth = false; 

    return (
        <div>
            About
            <hr />
            {/* 만약, 회원이라면 mypage로 이동
                비회원이라면 main으로 이동 */}
            <button onClick={() => {
                auth ? nav('/mypage') : nav('/')
                }}>마이페이지</button >

                <br/>
                <Link to="/product/1?popular=인기">[1] 슬램덩크 </Link>
                <br/>
                <Link to="/product/2">[2] 약속의 네버랜드 </Link>
                <br/>
                <Link to="/product/3">[3] 도쿄 리벤저스 </Link>

        </div>
    )
}

export default About
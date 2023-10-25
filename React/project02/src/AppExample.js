// rafce + Enter

import React from 'react'
import MemberBox from './components/MemberBox'

const AppExample = () => {

    /* 팀원을 소개해주세요
    이름 : 홍길동
    성별 : 여성 / 남성
    좋아하는 노래 : 아이브 - I AM

    단, Component와 props 의 개념을 이용할 것
    - MemberBox 라는 컴포넌트를 생성하기
     */
    let {man, woman} = {
        man : '남성',
        woman : '여성'
    }
    return (
        <div>
            <MemberBox name="황정용" gender={man} music="시아 - 샹들리에"/><br/>
            <MemberBox name="홍재성" gender={man} music="찰리푸스 - one call away"/><br/>
            <MemberBox name="이유영" gender={woman} music="윤하 - 사건의 지평선"/><br/>
            <MemberBox name="손지연" gender={woman} music="WOODZ - chaser"/>
        </div>
    )
}

export default AppExample
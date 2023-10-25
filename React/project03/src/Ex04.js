import React, { useState } from 'react'
import Board from './components/Ex04Board'
import './style/ex04.css'

import 'bootstrap/dist/css/bootstrap.min.css';
import { Button } from 'react-bootstrap';

export const Ex04 = () => {

    // 이미지 경로 가져오기! (public폴더 이용할 때)
    let imgPath = '/img/dice'

    /* 주사위 게임을 만들어보자!

        1) user가 '던지기!' 버튼을 클릭한다. 
        2) 유저의 주사위 숫자가 랜덤으로 표시된다. 
        3) 컴퓨터의 주사위 숫자 또한 랜덤으로 표시된다. 
        4) 유저의 주사위 숫자 - 컴퓨터의 주사위 숫자를 비교 
            3-1) 내가 이겼을 경우는 나의 점수 + 1
            3-2) 내가 졌을 경우는 컴퓨터의 점수 + 1 
        5) 먼저 5점을 낸 사람이 최종 승리 
            => alert 당신의 승리입니다! 당신의 패배입니다! 
        6) RESET 버튼을 클릭 시, 모든 내용이 초기화 
            - 점수, 이미지 경로, 이미지 파일 번호 


        HINT!! 필요한 정보들 
        - 주사위 숫자 (나, 컴퓨터)
        - 이미지 경로 (나, 컴퓨터)
        - 점수 (나, 컴퓨터)
        ===> Board의 props 데이터로 
    */
        
        // 이미지 경로
        const [myPath, setMyPath] = useState(imgPath+'1.png')
        const [comPath, setComPath] = useState(imgPath+'1.png')

        // 점수
        const [myScore, setMyScore] = useState(0)
        const [comScore, setComScore] = useState(0)

        // 랜덤 값 함수
        const makeRandom=()=>{
            return parseInt(Math.random()*6)+1
        }
        
        const resetBtnClick=()=>{
            setMyPath(imgPath+'1.png')
            setComPath(imgPath+'1.png')
            setMyScore(0)
            setComScore(0)
        }

        const btnClick=()=>{
            
            let myDice = (makeRandom());
            let comDice = (makeRandom());
            setMyPath(imgPath+myDice+'.png')
            setComPath(imgPath+comDice+'.png')

            if(myDice>comDice){
                setMyScore(myScore+1)
            }else if(comDice>myDice){
                setComScore(comScore+1)
            }

            if(myScore<=4 && comScore <=4){
                if(myDice>comDice){
                    setMyScore(myScore+1)
                }else if(myDice<comDice){
                    setComScore(comScore+1)
                }
            }else{
                let result = myScore>comScore? "승리" : "패배"
                alert(result)
            }
        }
        
        
        return (
            <div className='container'>

            <h1>주사위게임</h1>
            <div className='btn-container'>
                <Button variant="secondary" onClick={btnClick}>던지기!</Button>{' '}
                <Button variant="danger" onClick={resetBtnClick}>RESET</Button>
            </div>

            <div className='board-container'>
                <Board name="나" path={myPath} score={myScore}/>
                <Board name="컴퓨터" path={comPath} score={comScore}/>
            </div>
                {myScore === 5 && alert('이김')}
                {comScore === 5 && alert('짐')}
        </div>
    )
}
export default Ex04

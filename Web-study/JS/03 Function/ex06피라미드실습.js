// 1. 이모티콘, 행의 개수 입력받기
let emo = prompt('이모티콘 입력하세요.');
let num = Number(prompt('출력할 행의 개수를 입력하세요.'));

// 2. 이모티콘을 행의 개수에 맞춰 피라미드 형태로 출력하는 함수 만들기
// 함수 매개변수 -> 이모티콘, 행의 개수
function pyramid() {
    for(let i=1;i<=num;i++){
        for(let j=1;j<=i;j++){
            document.write(emo);
        }
        document.write(`<br>`);
    }
}

pyramid();

// 화살표 함수
const pyramid1=(emo1,num1)=>{
    // 피라미드 형태로 출력
    for(let i=1;i<=num1;i++){
        for(let j=1;j<=i;j++){
            document.write(emo1);
        }
        document.write(`<br>`);
    }
    
}
pyramid1(emo,num);
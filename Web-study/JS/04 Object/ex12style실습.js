// 요소 가져오기
let redVal = document.getElementById('redBox') 
let blueVal = document.getElementById('blueBox')
let greenVal = document.getElementById('greenBox')
let grayVal = document.getElementById('grayBox')

// 요소.style.속성 = 값

// 이동하기 버튼 클릭 시
// 박스들이 계단 형태로 이동
// -> marginLeft
const marginFunc=()=>{
    blueVal.style.marginLeft='100px'
    greenVal.style.marginLeft='200px'
    grayVal.style.marginLeft='300px'
}

// 배열 형태로 요소 전체 가져오기
let divList = document.querySelectorAll('div'); 
// querySelector (Node) 
// querySelectorAll(NodeList) -> 배열 관련 함수 사용가능
console.log(divList);

// 둥글게 버튼 클릭 시
// 오른쪽 위, 왼쪽 아래 모서리 둥글게
// -> borderTopRightRadius, borderBottmLeftRadius

const radiusFunc=()=>{
    // for(let i of divList){
    //     i.style.borderTopRightRadius='50%'
    //     i.style.borderBottomLeftRadius='50%'
    // }

    divList.forEach(element => {
        element.style.borderTopRightRadius='50%'
        element.style.borderBottomLeftRadius='50%'
    });

    // redVal.style.borderTopRightRadius='50%'
    // redVal.style.borderBottomLeftRadius='50%'
    // blueVal.style.borderTopRightRadius='50%'
    // blueVal.style.borderBottomLeftRadius='50%'
    // greenVal.style.borderTopRightRadius='50%'
    // greenVal.style.borderBottomLeftRadius='50%'
    // grayVal.style.borderTopRightRadius='50%'
    // grayVal.style.borderBottomLeftRadius='50%'
}
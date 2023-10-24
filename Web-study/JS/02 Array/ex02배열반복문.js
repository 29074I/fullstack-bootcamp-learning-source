// 배열에 저장된 데이터를 반복문으로 출력하기!

// 1. for문
let nameList = ['이지희🍥','홍재성🍙','신지훈🍜','손지연🍨'];

for(let i=0; i<nameList.length;i++){
    console.log(nameList[i]);
}

// 2. for of문
let foodList = ['돈까스','쌀국수','김볶밥'];

for(let i of foodList){
    console.log(i);
}

// 3. forEach문
let colorList = new Array('보라', '파랑', '초록');
colorList.forEach((element,index)=>{
    console.log(index, element);
})
// 화살표 함수 : 함수 표현식 형태, function 키워드 대신 =>

const intro = ()=>{
    console.log('안녕');
}
intro();

// 매개변수
// const lunch = (menu)=> {
//     console.log(`점심으로 ${menu} 먹음 😎`);
// }
const lunch = menu=>console.log(`점심으로 ${menu} 먹음 😎`);
lunch('김볶밥');

// 매개변수 + return문
const dinner = menu=>  `저녁으로는 ${menu} 먹을래`
console.log(dinner('뭐'));

// 매개변수 1개 -> () 생략 가능
// 실행문 1개 -> {}, return 생략 가능
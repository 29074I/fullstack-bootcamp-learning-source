// 1. 입력창을 통한 입력
// '출력질문', ('입력창에 출력할 기본 값'-> 생략가능)
// 리턴타입 : String
let dinner = prompt('저녁 뭐 먹을랑가?','피자');
console.log(dinner);

// 2. 확인 및 취소를 통한 입력
// 리턴타입 : boolean
// 확인 -> true / 취소 -> false
// 2-1. 커피 마실 건지 대답 -> 저장 
// 2-2. 저장한 대답 -> 콘솔창 출력
let coffee = confirm('커피도 마실랑가?');
console.log(coffee);
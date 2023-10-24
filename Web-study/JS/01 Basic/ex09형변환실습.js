// 1. num1 -> '100', num -> 200
let num1 = '100';
let num2 = 200;
let sum = parseInt(num1)+num2;
// 더블클릭 + () 자동완성
// 2. 콘솔창에 형태에 맞춰 출력
console.log(num1+'과'+num2+'200의 합 >>',sum);

// Template literals(템플리 리터럴)
// : 표현식/문자열 삽입, 여러 줄 문자열 등 다양한 기능을 제공
// -> 백틱(`) 기호 사용 : 숫자 1 왼쪽에 물결이랑 같이 있는 기호
// -> 표현식 : ${data}

console.log(`${num1}과 ${num2}의 합 >> ${sum}`);
console.log(`안녕하세요.
반갑습니다.`);
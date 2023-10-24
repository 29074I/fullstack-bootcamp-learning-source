// 1. 사용자로부터 시작 숫자와 마지막 숫자를 입력받는다.
// 2. 시작~마지막 숫자까지의 합을 구한다.
// 3. 결과값을 콘솔창으로 출력해준다.

// String -> Number : 형변환
let num1 = Number(prompt('시작할 숫자를 입력하세요.'));
let num2 = Number(prompt('마지막 숫자를 입력하세요.'));

let sum=0; 

for(let i=num1;i<=num2;i++){
    sum+=i;
}
console.log(`${num1}부터 ${num2}까지의 합은? >> ${sum}`);
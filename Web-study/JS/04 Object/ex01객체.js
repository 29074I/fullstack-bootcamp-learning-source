// 객체 : 여러 데이터를 하나의 변수에 저장할 수 있는 데이터 타입

// key값에 따옴표 생략 가능
// 구조 -> {key1:value1, key2:value2, ...};
// key -> 객체의 속성(property)
// value -> 속성의 값 / 기본자료형, 함수, 배열, 객체

// 객체 생성
let person = {
    "name" : "손지연",
    age : 23,
    isPerson : true,
    friday : ()=>{
        console.log('금요일임');
    }, // 콤마 붙여주기
    favorite : {
        food : "피자",
        drink : "탄산수",
        color : "보라"
    },
    smhrd : ['예진','영표','세영']
};

// 객체 접근
console.log(person);
console.log('이름 :',person.name);
console.log('나이 :',person.age);
console.log('사람 :',person.isPerson);
person.friday();
console.log("좋아하는 음료 :",person.favorite.drink);
console.log('담임 선생님 :', person.smhrd[0]);

// 속성값 변경 및 추가
person.name = "정대만";
console.log('이름 변경', person.name);
person.height = 190;
console.log('키 :',person.height);
// weight 속성값 추가
person.weight = 100;
console.log('몸무게 :',person.weight);
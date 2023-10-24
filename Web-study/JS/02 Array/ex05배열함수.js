// 배열 관련 함수
let nameList = ['세영','예진','영표'];
console.log(nameList);

// 1. 마지막 인덱스 데이터 추가 : push()
nameList.push('해도')
console.log('마지막 추가',nameList);

// 2. 마지막 인덱스 데이터 삭제 : pop()
nameList.pop()
console.log('마지막 삭제',nameList);

// 3. 첫번째 인덱스 데이터 추가 : unshift()
nameList.unshift('자연');
console.log('첫번째 추가',nameList);

// 4. 첫번째 인덱스 데이터 삭제 : shift()
nameList.shift()
console.log('첫번째 삭제',nameList);

// 5. 원하는 위치에 데이터 추가 혹은 삭제 : splice()
// -> 추가 : splice(인덱스,0,추가데이터)
nameList.splice(1,0,'승호');
console.log('splice 추가',nameList);
// -> 삭제 : splice(인덱스, 삭제개수) ** 추가데이터 생략
nameList.splice(1,2)
console.log('splice 삭제',nameList);
// -> 추가 및 삭제
// 영표쌤 이름을 지우고, '예진','승호' 추가
nameList.splice(1,1,'예진','승호')
console.log(nameList);

// *** 리액트
// 6. 기존의 배열 -> 새로운 배열 : map()
let addHeart = nameList.map((element)=>{
    return `💜${element}💜`
})
console.log((addHeart));
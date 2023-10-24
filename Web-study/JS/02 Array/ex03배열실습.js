// 1. 주어진 데이터를 담은 배열을 생성
let numList = [23,54,78,13,44];

// 2-1. 반복문을 활용해 최댓값을 찾아준다.
// let maxNum = numList[0];
// for(let i=0;i<numList.length;i++){
//     if(maxNum<numList[i]){
//         maxNum = numList[i]
//     }
// }


// 2-2.정렬 후 최댓값 구하기 -> 팝업창으로 출력
let maxValue = numList.sort((a,b)=> b-a)[0];
alert(`최댓값 >> ${maxValue}`);

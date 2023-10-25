import logo from './logo.svg';
import './App.css';

function App() {

  let students = [
    {name : '정대만', age : 19, gender : 'man'},
    {name : '이한나', age : 18, gender : 'woman'},
    {name : '서태웅', age : 17, gender : 'man'}
  ]

  
  /* Map 함수
  - 주어진 함수를 호출한 결과를 모아 새로운 함수를 만든다
    ex) students라는 배열의 이름만 뽑아서 새로운 함수를 만들고 싶어!
  - 기존 배열은 영향을 받지 않는다.
  - key 값을 무조건 작성해야 한다.
    이 때, key 값은 서로 중복되면 안된다. ** 고유한 값
  */

  // let newStudents = students.map(item => item.name+"씨") -> JS
  let newStudents = students.map(item => <button key={item.name}>{item.name}</button>)
  console.log('new : ', newStudents);

  /* 간단한 예제!
    안녕하세요 저는 정대만입니다. 제 나이는 19살이에요.
    안녕하세요 저는 이한나입니다. 제 나이는 18살이에요.
    안녕하세요 저는 서태웅입니다. 제 나이는 17살이에요.
    => p태그로 화면에 출력
  */

    // let newStudents2 = students.map(item => <p key={item.itd}>안녕하세요 저는 {item.name}입니다. 제 나이는 {item.age}살이에요.</p>)



    // ===================== Filter =====================

  let womanList = students.filter(item => item.gender == 'woman')
  console.log('womanList : ',womanList);


  return (
    
    <div>
      <h2>Map함수</h2>
      {newStudents}

      {students.map(item =>
          <p key={item.name}>안녕하세요 저는 {item.name}입니다. 제 나이는 {item.age}살이에요.</p>)}
    <hr/>
    <h2>Filter 함수</h2>
    {/* filter 함수는 배열의 각 요소에 대해서 주어진 함수의 결과 값이 true인
        요소들만 모아서 새로운 배열로 반환하는 함수를 의미한다.
    */}

    {womanList.map(item => <p key={item.name}>{item.name}이구요, {item.age}살입니다.</p>)}
    

    </div>
  );
}

export default App;

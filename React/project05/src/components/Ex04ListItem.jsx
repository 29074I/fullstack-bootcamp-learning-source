import React from 'react'
import { useContext } from 'react'
import { TodoContext } from '../context/TodoContext'

const Ex04ListItem = ({ todo, index }) => {

    // 단일요소일 때
    const {handleTodoToggle, handleTodoDelete} = useContext(TodoContext)
    // console.log('todos : ', todos[0].text);

    return (
        <div>
            <input type='checkbox' id='todo-item' onChange={()=>{handleTodoToggle(index)}}></input>
            <label 
            style={{
                textDecoration : 
                todo.completed ? "line-through" : "none"
            }}
            >{todo.text}</label>{' '}
            <button onClick={()=>{handleTodoDelete(index)}}>삭제</button>
        </div>
    )
}

export default Ex04ListItem
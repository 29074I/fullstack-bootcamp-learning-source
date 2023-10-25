import React from 'react'
import { useContext } from 'react'
import { TodoContext } from '../context/TodoContext'

const Ex04AddTodo = () => {

    /* 전역 데이터 중, 내가 가지고와야 할 자료들 */
    const {newTodo,handleNewTodo,handleTodoAddition} = useContext(TodoContext)

    return (
        <div>
            <input type='text' onChange={handleNewTodo} value={newTodo}></input>{' '}
            <button onClick={handleTodoAddition}>추가</button>
        </div>
    )
}

export default Ex04AddTodo
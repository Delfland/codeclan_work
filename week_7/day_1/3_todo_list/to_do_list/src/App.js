import './App.css';
import React, {useState} from 'react';

function App() {

  const [todos, setTodos] = useState([
    "Buy shopping",
    "Clean bathroom",
    "Car's MOT"
  ]);

  const [newTodo, setNewTodo] = useState("");
  
  const todoNodes = todos.map((todo, index) => {
    return <li key={index}><span>{todo}</span></li>
  })

  const handleItemInput = (event) => {
    setNewTodo(event.target.value)
  }

  const saveNewTodo = (event) => {
    event.preventDefault();
    const copyTodos = [...todos]
    copyTodos.push(newTodo)
    setTodos(copyTodos)
    setNewTodo("")
  }

  return (
    <>
    <h1>To Do's</h1>
    <form  onSubmit={saveNewTodo}>
      <input id="new-todo" type="text" value={newTodo} onChange={handleItemInput}/>
      <input type="submit" value="Save Item" />
    </form>
    <ul>
      {todoNodes}
    </ul>
    </>
    
  );
}

export default App;

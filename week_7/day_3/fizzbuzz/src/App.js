import React, {useEffect, useState} from 'react';
import './App.css';

function App() {
  const [number, setNumber] = useState(0)

  const [result, setResult] = useState('')


  const handleInc = () => {
    setNumber(number + 1)
  }

  
  useEffect(() => {
    if (number % 3 === 0 && number % 5 === 0) {
      setResult('FizzBuzz');
    }
    else if (number % 3 === 0) {
      setResult('Fizz');
    }
    else if (number % 5 === 0) {
      setResult('Buzz');
    }
    else {
      setResult('')
    }
  }, [number])
  return (
    <>
    <button value={number} onClick={handleInc}>+</button>
    
    <h2>Number is {number}</h2>
    <h2>{result}</h2>
    </>
  );
}

export default App;
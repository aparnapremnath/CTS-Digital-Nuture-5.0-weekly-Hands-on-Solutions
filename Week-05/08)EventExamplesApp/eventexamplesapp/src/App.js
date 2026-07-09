import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const incrementCount = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    alert('Hello, welcome to the Event Examples App!');
  };

  const handleIncrementClick = () => {
    incrementCount();
    sayHello();
  };

  const decrementCount = () => {
    setCount(count - 1);
  };
  const sayWelcome = (message) => {
    alert(message);
  };
  const handlePress = (event) => {
    alert('I was clicked');
    console.log('Synthetic event type:', event.type);
  };
  return (
    <div>
      <h1>Event Examples App</h1>

      <h2>Counter: {count}</h2>
      <button onClick={handleIncrementClick}>Increment</button>
      <button onClick={decrementCount}>Decrement</button>

      <h2>Say Welcome</h2>
      <button onClick={() => sayWelcome('welcome')}>Say Welcome</button>

      <h2>Synthetic Event</h2>
      <button onClick={handlePress}>Click Me</button>

      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
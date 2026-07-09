import React, { useState } from 'react';
import Guest from './Guest';
import User from './User';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };
  let button;
  if (isLoggedIn) {
    button = <button onClick={handleLogoutClick}>Logout</button>;
  } else {
    button = <button onClick={handleLoginClick}>Login</button>;
  }
  return (
    <div>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? <User /> : <Guest />}
      {button}
    </div>
  );
}

export default App;
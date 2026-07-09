import React from 'react';

function User() {
  return (
    <div>
      <h2>Welcome back!</h2>
      <p>You are logged in. You can now book your flight tickets.</p>
      <ul>
        <li>Flight AI101 - Chennai to Delhi - 08:00 AM <button>Book</button></li>
        <li>Flight AI202 - Mumbai to Bengaluru - 11:30 AM <button>Book</button></li>
        <li>Flight AI303 - Delhi to Hyderabad - 03:15 PM <button>Book</button></li>
      </ul>
    </div>
  );
}

export default User;
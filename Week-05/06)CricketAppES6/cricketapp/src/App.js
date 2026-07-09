import React from 'react';
import ListofPlayers from './Components/ListofPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = false; // change to false to see IndianPlayers instead

  let content;
  if (flag) {
    content = <ListofPlayers />;
  } else {
    content = <IndianPlayers />;
  }

  return (
    <div>
      <h1>Cricket App</h1>
      {content}
    </div>
  );
}

export default App;
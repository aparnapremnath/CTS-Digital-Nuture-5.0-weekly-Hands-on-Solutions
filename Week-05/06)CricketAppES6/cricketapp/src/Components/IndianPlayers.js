import React from 'react';

const indianSquad = [
  'Rohit Sharma', 'Virat Kohli', 'Shubman Gill', 'Suryakumar Yadav',
  'KL Rahul', 'Hardik Pandya', 'Ravindra Jadeja', 'Axar Patel',
  'Jasprit Bumrah', 'Mohammed Shami', 'Kuldeep Yadav'
];

const T20players = ['Rohit Sharma', 'Virat Kohli', 'Suryakumar Yadav'];
const RanjiTrophyPlayers = ['Shubman Gill', 'Axar Patel', 'Kuldeep Yadav'];

function IndianPlayers() {
  const [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11] = indianSquad;
  const oddTeamPlayers = [p1, p3, p5, p7, p9, p11];
  const evenTeamPlayers = [p2, p4, p6, p8, p10];

  const allSquadPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeamPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeamPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 & Ranji Trophy Players</h2>
      <ul>
        {allSquadPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
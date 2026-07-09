import React from 'react';

const office = {
  name: 'Skyline Business Center',
  rent: 55000,
  address: '12th Floor, MG Road, Bengaluru'
};

const officeList = [
  { name: 'Skyline Business Center', rent: 55000, address: 'MG Road, Bengaluru' },
  { name: 'Tech Park Hub', rent: 72000, address: 'Whitefield, Bengaluru' },
  { name: 'Urban Coworks', rent: 48000, address: 'Anna Nagar, Chennai' },
  { name: 'GreenLeaf Offices', rent: 65000, address: 'Banjara Hills, Hyderabad' }
];
function App() {
  return (
    <div>
      <h1>Office Space Rentals</h1>

      <img src="/office.jpg" alt="Office Space" width="400" />

      <h2>Featured Office</h2>
      <p>Name: {office.name}</p>
      <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
        Rent: {office.rent}
      </p>
      <p>Address: {office.address}</p>
      <h2>All Available Offices</h2>
      <ul>
        {officeList.map((item, index) => (
          <li key={index}>
            <p>Name: {item.name}</p>
            <p style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
              Rent: {item.rent}
            </p>
            <p>Address: {item.address}</p>
            <hr />
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
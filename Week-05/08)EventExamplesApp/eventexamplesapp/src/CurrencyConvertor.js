import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = () => {
    const converted = (rupees * 0.011).toFixed(2); // approx INR to EUR rate
    setEuros(converted);
  };

  return (
    <div>
      <h2>Currency Convertor (INR to EUR)</h2>
      <input
        type="number"
        placeholder="Enter amount in Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euros !== null && (
        <p>{rupees} INR = {euros} EUR</p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
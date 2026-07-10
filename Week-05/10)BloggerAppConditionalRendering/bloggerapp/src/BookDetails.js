import React from 'react';

function BookDetails(props) {
  if (props.available) {
    return (
      <div>
        <h2>Book Details</h2>
        <p>Title: {props.title}</p>
        <p>Status: Available for borrowing</p>
      </div>
    );
  } else {
    return (
      <div>
        <h2>Book Details</h2>
        <p>Title: {props.title}</p>
        <p>Status: Currently unavailable</p>
      </div>
    );
  }
}

export default BookDetails;
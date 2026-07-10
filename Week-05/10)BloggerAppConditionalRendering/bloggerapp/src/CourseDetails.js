import React from 'react';

function CourseDetails(props) {
  let enrollmentMessage;
  if (props.seatsLeft > 0) {
    enrollmentMessage = <p>Seats available: {props.seatsLeft}</p>;
  } else {
    enrollmentMessage = <p>Course is full.</p>;
  }

  return (
    <div>
      <h2>Course Details</h2>
      <p>Title: {props.title}</p>
      {enrollmentMessage}
      {props.seatsLeft > 0 && <button>Enroll Now</button>}
    </div>
  );
}

export default CourseDetails;
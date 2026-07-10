import React from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  return (
    <div>
      <h1>Blogger App</h1>

      <BookDetails title="The Alchemist" available={true} />
      <BookDetails title="Atomic Habits" available={false} />

      <BlogDetails title="Getting Started with React" published={true} />
      <BlogDetails title="Advanced Hooks Guide" published={false} />

      <CourseDetails title="React Fundamentals" seatsLeft={5} />
      <CourseDetails title="Full Stack Development" seatsLeft={0} />
    </div>
  );
}

export default App;
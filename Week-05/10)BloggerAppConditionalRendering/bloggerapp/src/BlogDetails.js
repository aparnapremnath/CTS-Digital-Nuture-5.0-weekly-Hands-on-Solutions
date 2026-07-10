import React from 'react';

function BlogDetails(props) {
  return (
    <div>
      <h2>Blog Details</h2>
      <p>Title: {props.title}</p>
      <p>Status: {props.published ? 'Published' : 'Draft'}</p>
      {props.published ? (
        <p>This blog is live and visible to readers.</p>
      ) : (
        <p>This blog is still being edited.</p>
      )}
    </div>
  );
}

export default BlogDetails;
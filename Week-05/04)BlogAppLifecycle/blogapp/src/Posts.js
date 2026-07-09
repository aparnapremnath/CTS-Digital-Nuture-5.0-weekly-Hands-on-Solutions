import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.log('Error fetching posts:', error);
      });
  }
  componentDidMount() {
    this.loadPosts();
  }
  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.toString());
  }
}

export default Posts;
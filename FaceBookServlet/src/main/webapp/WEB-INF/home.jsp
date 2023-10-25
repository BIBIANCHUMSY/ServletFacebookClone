<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 24/10/2023
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
    <title>Facebook Clone</title>
</head>
<body>
<header>
  <!-- Facebook logo and navigation -->
  <div class="post-section">
    <div class="post-create">
      <textarea class="post-input" placeholder="Write a post"></textarea>
      <div class="post-actions">
        <button class="post-button">Post</button>
      </div>
    </div>

    <div class="post">
      <div class="post-header">
        <img class="avatar" src="profile-image.jpg" alt="Profile Image">
        <h3 class="username">John Doe</h3>
      </div>
      <p class="post-content">This is a sample post.</p>
      <div class="post-interactions">
        <button class="like-button">Like</button>
        <button class="unlike-button">Unlike</button>
        <button class="delete-button">Delete</button>
      </div>

      <div class="comments-section">
        <textarea class="comment-input" placeholder="Write a comment"></textarea>
        <button class="comment-button">Comment</button>

        <div class="comments">
          <div class="comment">
            <div class="comment-header">
              <img class="avatar" src="profile-image.jpg" alt="Profile Image">
              <h3 class="username">Jane Smith</h3>
            </div>
            <p class="comment-content">This is a sample comment.</p>
            <div class="comment-interactions">
              <button class="like-button">Like</button>
              <button class="unlike-button">Unlike</button>
              <button class="delete-button">Delete</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>


</header>

<main>
  <div class="post">
    <div class="post-header">
      <!-- Post author, date, and options -->
    </div>
    <div class="post-content">
      <!-- Post text, images, or videos -->
    </div>
    <div class="post-actions">
      <!-- Like, comment, and share buttons -->
    </div>
    <div class="comments">
      <!-- Comments section -->
    </div>
    <div class="comment-form">
      <!-- Comment input form -->
    </div>
  </div>

  <!-- More posts -->
</main>

<footer>
  <!-- Footer content -->
</footer>
</body>
</html>

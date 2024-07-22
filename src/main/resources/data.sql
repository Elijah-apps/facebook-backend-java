-- Users
INSERT INTO users (id, name, email, password) VALUES (1, 'John Doe', 'john.doe@example.com', 'password1');
INSERT INTO users (id, name, email, password) VALUES (2, 'Jane Smith', 'jane.smith@example.com', 'password2');
INSERT INTO users (id, name, email, password) VALUES (3, 'Alice Johnson', 'alice.johnson@example.com', 'password3');

-- Posts
INSERT INTO posts (id, user_id, content, created_at) VALUES (1, 1, 'Hello, this is my first post!', NOW());
INSERT INTO posts (id, user_id, content, created_at) VALUES (2, 2, 'Good morning everyone!', NOW());
INSERT INTO posts (id, user_id, content, created_at) VALUES (3, 3, 'Just had a great lunch!', NOW());

-- Comments
INSERT INTO comments (id, post_id, user_id, content, created_at) VALUES (1, 1, 2, 'Nice post, John!', NOW());
INSERT INTO comments (id, post_id, user_id, content, created_at) VALUES (2, 2, 3, 'Good morning, Jane!', NOW());
INSERT INTO comments (id, post_id, user_id, content, created_at) VALUES (3, 3, 1, 'What did you have for lunch, Alice?', NOW());

-- Likes
INSERT INTO likes (id, post_id, user_id) VALUES (1, 1, 3);
INSERT INTO likes (id, post_id, user_id) VALUES (2, 2, 1);
INSERT INTO likes (id, post_id, user_id) VALUES (3, 3, 2);

-- Friend Requests
INSERT INTO friend_requests (id, sender_id, receiver_id, status) VALUES (1, 1, 2, 'accepted');
INSERT INTO friend_requests (id, sender_id, receiver_id, status) VALUES (2, 2, 3, 'accepted');
INSERT INTO friend_requests (id, sender_id, receiver_id, status) VALUES (3, 3, 1, 'pending');

#### This project allows users to submit and view comments. It uses Spring Boot with MySQL for storage.
### Step 1: Create the Database

First, open your MySQL client and create the `commentsdb` database.

```sql
CREATE DATABASE commentsdb;
USE commentsdb;
```

### Step 2: Create the Comments Table

Now, create the `comments` table within the `commentsdb` database. The table will have an `id` column (auto-incremented primary key) and a `content` column for storing comment text.

```sql
CREATE TABLE comments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(500) NOT NULL
);
```

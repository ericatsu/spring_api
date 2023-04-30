# Difficulties

- Use a default constructor for Students is a constructor which has no parameters. It is used by Hibernate to create instances of the entity class.

- Created Student database using Postgres

# Student Database

This is a sample PostgreSQL database for managing student information.

## Setup

1. Install PostgreSQL on your local machine.
2. Clone this repository.
3. Navigate to the root directory of the project.
4. Open a terminal and run the following commands:

```
psql -U postgres
```

5. Create a new database:

```
CREATE DATABASE student;
```

6. Connect to the new database:

```
\c student
```

7. Create a new table:

```
CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL UNIQUE,
  phone VARCHAR(15) NOT NULL UNIQUE,
  address VARCHAR(200) NOT NULL,
  date_of_birth DATE NOT NULL,
  date_of_enrollment DATE NOT NULL
);
```

8. Grant access to the database:

```
GRANT ALL PRIVILEGES ON DATABASE student TO User;
```

9. Populate the table with sample data:

```
INSERT INTO student (first_name, last_name, email, phone, address, date_of_birth, date_of_enrollment)
VALUES ('John', 'Doe', 'johndoe@example.com', '555-1234', '123 Main St, Anytown USA', '1990-01-01', '2020-09-01'),
       ('Jane', 'Doe', 'janedoe@example.com', '555-5678', '456 Oak St, Anytown USA', '1992-02-02', '2020-09-01'),
       ('Bob', 'Smith', 'bobsmith@example.com', '555-9012', '789 Maple St, Anytown USA', '1994-03-03', '2020-09-01');
```

# Usage

You can now use this database to store and manage student information. Use SQL queries to perform CRUD (Create, Read, Update, Delete) operations on the student table.

# Contributing

Feel free to contribute to this project by submitting pull requests or opening issues.

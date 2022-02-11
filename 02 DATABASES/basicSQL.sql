-- CREATING DATABASE (with exists check)
CREATE DATABASE IF NOT EXISTS mydatabase;

-- USING DATABASE
USE mydatabase;

-- CREATING TABLE (with exists check)
CREATE TABLE IF NOT EXISTS testtable(      
    id INT AUTO_INCREMENT,
    name VARCHAR(255),
    age INT,
    
    PRIMARY KEY(id),                        --adding primary key
    FOREIGN KEY (id) REFERENCES users(id)   -- adding foreign key(s)
);

-- ALTER TABLES 
    -- add/remove COLUMNS   
    ALTER TABLE testtable
    ADD COLUMN age;                         -- ADD or REMOVE


    -- add/remove Keys
    ALTER TABLE testtable
    ADD FOREIGN KEY (id) REFERENCES example(exampleID)  -- ADD or REMOVE - FOREIGN or PRIMARY

-- INSERT INTO
INSERT INTO testtable (id, name, age)
VALUES 
("Peter", 54),                                      -- can insert multiple records as tuples
("Julia", 27)                                       -- don't need to insert auto-id

-- SELECT
SELECT COUNT(id), name                             -- * for all or Columns
FROM testtable
GROUP BY name;                 --group by, then we need an aggregate function (like count,sum etc)

-- UPDATE
UPDATE testtable
SET age = 50
WHERE name = "Peter";

-- JOINS
-- too complex to write everything down, take a look at the following picture:
-- https://i.stack.imgur.com/4zjxm.png
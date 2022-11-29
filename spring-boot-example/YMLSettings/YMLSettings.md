#SQL #YML

**Setting up .yml file for your Spring Boot Application:**
Change _application.**properties**_ to _application.**yml**_

## API server port setting
We will set up a port for using api, the default value is 8081.
API example: http://localhost:8081/api
```yml
server:
  port: 8081
```
## Accessing MySQL database
Before accessing to database using springboot application, we need configure the database url, username and user password in the file.
*Set up syntex :*
```yml
spring:  
  datasource:  
    url: jdbc:mysql://127.0.0.1:3306/sys  # default sql url
    username: root  
    password: somePassword 
    driver-class-name: com.mysql.cj.jdbc.Driver
```
---
## SQL Initialization
We can initialize the tables of our database so that we can test the api with the same data set every time we restart the spring boot application.
*Set up syntex :*
```yml
sql:  
  init:  
    schema-locations: classpath:DDL_TABLENAME.sql, # CREATE TABLE
    data-locations: classpath:DML_TABLENAME.sql, # INSERT DATA
    mode: always
```
In the .sql file, you may want to include some *sql syntex*:
*__DDL__ file set up :*
```sql
DROP TABLE tablename;  
  
CREATE TABLE tablename (  
  id INTEGER PRIMARY KEY AUTO_INCREMENT,  
  some_column VARCHAR(30) NOT NULL,  
  another_column VARCHAR(2) NOT NULL  
);
```
> Note: You might create `tablename` before execute `DROP TABLE` command, otherwise you will get error message.

*__DML__ file set up :*
```sql
DELETE FROM tablename;  
  
INSERT INTO tablename (id, some_column, another_column) VALUES (1, 'Some data', 'Some data');  -- good practice
INSERT INTO tablename VALUES (2, 'Some data', 'Some data'); -- short but not that good
```
> Note: You should always write the first `INSERT` statement for avoiding some errors.
---
## SQL modifying
We need to configue the .yml file before we try to modify the data through the spring boot application.
*Set up syntex :*
```yml
spring.jpa:  
  properties:  
    hibernate:  
      dialect: org.hibernate.dialect.MySQL8Dialect  
  hibernate.ddl-auto: update  
  show-sql: true
```
> Note: No need to change anything for most cases.
-- Tạo khóa chính
CREATE TABLE contacts(
contact_id INT(11) NOT NULL AUTO_INCREMENT,
last_name VARCHAR(30) NOT NULL,
first_name VARCHAR(25),
birthday DATE,
CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name;

CREATE TABLE users(
   user_id INT AUTO_INCREMENT PRIMARY KEY,
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255)
);
CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);
-- Tạo khóa chính phức hợp
-- Lưu ý: FOREIGN KEY là từ khoá được sử dụng để tạo khoá ngoại với các bảng khác, chúng ta sẽ tìm hiểu từ khoá này ở trong bài sau.
CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);
-- Tạo khoá chính khi thay đổi bảng
-- Có một số trường hợp, chúng ta muốn bổ sung khoá chính cho một bảng sau khi bảng đó đã được tạo. Chúng ta có thể sử dụng câu lệnh ADD PRIMARY KEY ở trong câu lệnh ALTER TABLE để đạt được mục đích này.
-- Trong đó, table_name là tên của bảng đã tồn tại, primary_key_column là tên của cột muốn tạo khoá chính.
ALTER TABLE table_name
    ADD PRIMARY KEY(primary_key_column);
CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);
CREATE TABLE orders(
   orderid INT AUTO_INCREMENT,
   staff VARCHAR(50),
   customer_id int,
   PRIMARY KEY (orderid),
   FOREIGN KEY (customer_id) REFERENCES customers(id)
);
-- Ngoài ra, chúng ta cũng có thể tách định nghĩa khoá ngoại thành một câu lệnh riêng biệt khỏi khai báo của cột, như sau:
CREATE TABLE orders(
   orderid INT AUTO_INCREMENT PRIMARY KEY,
   staff VARCHAR(50),
   customer_id INT REFERENCES customers(id)
);
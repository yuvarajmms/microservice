DROP TABLE IF EXISTS product;  

CREATE TABLE product (  
product_id INT AUTO_INCREMENT  PRIMARY KEY,
product_backlog varchar(50),  
product_name VARCHAR(50) NOT NULL,  
product_category VARCHAR(50) NOT NULL,
product_price INT,
product_location varchar(50) not null
);  


insert into product (product_name, product_category, product_price, product_location, product_backlog) values ('HP', 'LAPTOP', '500', 'Texas', 'Available for Texas only');
insert into product (product_name, product_category, product_price, product_location, product_backlog) values ('CANON', 'Camera', '750', 'Tokyo','');
insert into product (product_name, product_category, product_price, product_location, product_backlog) values ('HP', 'Printer', '40', 'New York','');
insert into product (product_name, product_category, product_price, product_location, product_backlog) values ('Canon', 'Printer', '50', 'Texas','');
insert into product (product_name, product_category, product_price, product_location, product_backlog) values ('NIKON', 'Camera', '650', 'Texas', 'In Store product');

//insert into product (product_id, product_name, product_category, product_price, product_location, product_backlog) values (1, 'HP', 'LAPTOP', '500', 'Texas', 'Available for Texas only');
//insert into product (product_id , product_name, product_category, product_price, product_location, product_backlog) values (2, 'CANON', 'Camera', '750', 'Tokyo','');
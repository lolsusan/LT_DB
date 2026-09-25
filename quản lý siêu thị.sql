CREATE TABLE Customer (
    customer_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY unique ,
    customer_name VARCHAR(50),
    customer_phone_num VARCHAR(15) unique
--     customer_bill VARCHAR(50) NOT NULL unique
);


CREATE TABLE Product (
    product_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT unique,
    product_name VARCHAR(50) NOT NULL unique,
    product_purchase_price INT NOT NULL,
    product_selling_price INT NOT NULL,
    product_stock_quantity INT NOT NULL
);


CREATE TABLE Bill (
    bill_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT unique,
    customer_id INT , 
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id) ,
    date DATETIME DEFAULT NOW()
);


CREATE TABLE Bill_Detail (
    bill_detail_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT unique,
    product_id INT NOT NULL,
    bill_id INT NOT NULL,
    quantity INT NOT NULL,
    sub_total_price INT NOT NULL,
    discount FLOAT,

    FOREIGN KEY (product_id)
        REFERENCES Product(product_id),

    FOREIGN KEY (bill_id)
        REFERENCES Bill(bill_id)
);


CREATE TABLE Shipments (
    shipment_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT unique,
    shipment_info VARCHAR(50) NOT NULL,
    carrier VARCHAR(50) NOT NULL
);


CREATE TABLE Shipment_Detail (
    shipments_detail_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT unique,
    product_id INT NOT NULL,
    shipment_id INT NOT NULL,
    quantity INT NOT NULL,

    FOREIGN KEY (product_id)
        REFERENCES Product(product_id),

    FOREIGN KEY (shipment_id)
        REFERENCES Shipments(shipment_id)
);

use ltdb2 ;

INSERT INTO Customer (customer_name, customer_phone_num)
VALUES
('Nguyen Van An', '0901234567'),
('Tran Thi Binh', '0912345678'),
('Le Van Cuong', '0923456789'),
('Pham Thi Dung', '0934567890'),
('Hoang Van Em', '0945678901');
select * from customer ;

INSERT INTO Product (
    product_name,
    product_purchase_price,
    product_selling_price,
    product_stock_quantity
)
VALUES
('Tra xanh', 20000, 30000, 100),
('Nuoc ngot Coca', 10000, 15000, 200),
('Nuoc loc', 5000, 8000, 300),
('Cafe sua', 15000, 25000, 150),
('Banh mi', 10000, 18000, 80),
('Sua tuoi', 12000, 20000, 120),
('Mi tom', 7000, 12000, 250);
select * from product ;

INSERT INTO Bill (customer_id, date)
VALUES
(1, '2026-09-15 09:30:00'),
(2, '2026-09-15 10:15:00'),
(3, '2026-09-16 14:20:00'),
(1, '2026-09-17 16:45:00'),
(4, '2026-09-18 08:30:00');
select * from bill ;

INSERT INTO Bill_Detail (
    product_id,
    bill_id,
    quantity,
    sub_total_price,
    discount
)
VALUES
(1, 1, 2, 60000, 0),
(2, 1, 3, 45000, 0.05),

(3, 2, 5, 40000, 0),
(4, 2, 2, 50000, 0.10),

(5, 3, 3, 54000, 0),
(6, 3, 2, 40000, 0),

(1, 4, 1, 30000, 0.05),
(7, 4, 5, 60000, 0),

(2, 5, 4, 60000, 0),
(3, 5, 2, 16000, 0.05);

select * from bill_detail;


SELECT 
    b.bill_id,
    b.customer_id,
    b.date,
    c.customer_name
FROM bill b
JOIN customer c 
    ON b.customer_id = c.customer_id
ORDER BY b.bill_id;



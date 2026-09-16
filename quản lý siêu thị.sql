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
    date DATE default now()
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
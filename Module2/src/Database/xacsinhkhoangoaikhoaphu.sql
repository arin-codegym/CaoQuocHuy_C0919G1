create table Customers (
customer_number int primary key,
fullname varchar(50),
address varchar(50),
email varchar(50),
phone int
);
create table Accounts (
account_number int primary key,
customer_number int,
account_type  varchar(50) ,
account_opening_date date,
balance double,
foreign key (customer_number) references Customers (customer_number),
foreign key (tran_number) references Transactions(tran_number)
);
create table Transactions (
tran_number int primary key,
account_number int,
transaction_time date ,
amounts double,
descriptions varchar(200),
foreign key (account_number) references Accounts (account_number)
)
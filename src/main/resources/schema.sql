CREATE TABLE IF NOT EXISTS `idea` (
    `id` int AUTO_INCREMENT PRIMARY KEY,
    `first_name` varchar(30) NOT NULL,
    `last_name` varchar(30) NOT NULL,
    `address_line1` varchar(100) NOT NULL,
    `address_line2` varchar(50) NOT NULL,
    `opinion` varchar(500) NOT NULL,
    `created_date` TIMESTAMP NOT NULL
);


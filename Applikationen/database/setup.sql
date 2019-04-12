CREATE database rand_numbers;
CREATE USER 'random_user'@'localhost' IDENTIFIED BY 'random_password';
GRANT ALL PRIVILEGES ON rand_numbers.* TO 'random_user'@'localhost';

CREATE TABLE IF NOT EXISTS Timesheet(
id INT PRIMARY KEY,
name VARCHAR(255),
punch_in_time TIMESTAMP,
punch_out_time TIMESTAMP,
hoursWorked INT,
location ENUM('OFFICE', 'REMOTE'),
payRate DECIMAL(10, 2)
);
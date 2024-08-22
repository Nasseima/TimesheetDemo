CREATE TABLE IF NOT EXISTS Timesheet(
id INT PRIMARY KEY,
name VARCHAR(255),
punchInTime TIMESTAMP,
punchOUTTime TIMESTAMP,
hoursWorked INT,
location VARCHAR(50),
payRate DECIMAL(10, 2)
);
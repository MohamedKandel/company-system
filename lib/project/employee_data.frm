TYPE=VIEW
query=select `project`.`employee`.`EmpNO` AS `Employee_ID`,`project`.`employee`.`EmpName` AS `Name`,`project`.`employee`.`Address` AS `Address`,`project`.`employee`.`Salary` AS `Salary`,`project`.`employee`.`HiringDate` AS `Hire_Date`,`project`.`employee`.`Birthdate` AS `Birthday_Date`,`project`.`employee`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department` from `project`.`employee` join `project`.`department` where `project`.`employee`.`DeptNO` = `project`.`department`.`DeptNO`
md5=12c6320dd6745764813bdee9a0dda5d9
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-06-14 17:45:24
create-version=2
source=select EmpNO as \'Employee_ID\',
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_unicode_ci
view_body_utf8=select `project`.`employee`.`EmpNO` AS `Employee_ID`,`project`.`employee`.`EmpName` AS `Name`,`project`.`employee`.`Address` AS `Address`,`project`.`employee`.`Salary` AS `Salary`,`project`.`employee`.`HiringDate` AS `Hire_Date`,`project`.`employee`.`Birthdate` AS `Birthday_Date`,`project`.`employee`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department` from `project`.`employee` join `project`.`department` where `project`.`employee`.`DeptNO` = `project`.`department`.`DeptNO`
mariadb-version=100411
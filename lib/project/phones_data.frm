TYPE=VIEW
query=select `project`.`employee_phone`.`EmpNO` AS `Employee_ID`,`project`.`employee_phone`.`Phone` AS `Phone`,`project`.`employee`.`EmpName` AS `Name` from `project`.`employee` join `project`.`employee_phone` where `project`.`employee_phone`.`EmpNO` = `project`.`employee`.`EmpNO`
md5=eb5957a76bfbf5017a878789148ca6cb
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-06-14 17:46:10
create-version=2
source=select employee_phone.EmpNO as \'Employee_ID\',\n       Phone,\n       EmpName as \'Name\'\n       from employee,employee_phone\n       where employee_phone.EmpNO = employee.EmpNO
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_unicode_ci
view_body_utf8=select `project`.`employee_phone`.`EmpNO` AS `Employee_ID`,`project`.`employee_phone`.`Phone` AS `Phone`,`project`.`employee`.`EmpName` AS `Name` from `project`.`employee` join `project`.`employee_phone` where `project`.`employee_phone`.`EmpNO` = `project`.`employee`.`EmpNO`
mariadb-version=100411

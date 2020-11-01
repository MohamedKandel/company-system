TYPE=VIEW
query=select `project`.`work_on`.`EmpNO` AS `Employee_ID`,`project`.`employee`.`EmpName` AS `Employee_Name`,`project`.`work_on`.`ProjectNO` AS `Project_ID`,`project`.`project`.`ProjectName` AS `Project_Name`,`project`.`department`.`DeptName` AS `Department` from `project`.`employee` join `project`.`work_on` join `project`.`department` join `project`.`project` where `project`.`work_on`.`EmpNO` = `project`.`employee`.`EmpNO` and `project`.`department`.`DeptNO` = `project`.`employee`.`DeptNO` and `project`.`project`.`ProjectNO` = `project`.`work_on`.`ProjectNO`
md5=3b3cb3751b0a76a82b09873c5af033e5
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-06-14 17:46:22
create-version=2
source=select work_on.EmpNO as \'Employee_ID\',\n	   EmpName as \'Employee_Name\',\n       work_on.ProjectNO as \'Project_ID\',\n       ProjectName as \'Project_Name\',\n       DeptName as \'Department\'\n       from employee, work_on, department,Project\n       where work_on.EmpNO = employee.EmpNO and \n       department.DeptNO = employee.DeptNO and\n       Project.ProjectNO = work_on.ProjectNO
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_unicode_ci
view_body_utf8=select `project`.`work_on`.`EmpNO` AS `Employee_ID`,`project`.`employee`.`EmpName` AS `Employee_Name`,`project`.`work_on`.`ProjectNO` AS `Project_ID`,`project`.`project`.`ProjectName` AS `Project_Name`,`project`.`department`.`DeptName` AS `Department` from `project`.`employee` join `project`.`work_on` join `project`.`department` join `project`.`project` where `project`.`work_on`.`EmpNO` = `project`.`employee`.`EmpNO` and `project`.`department`.`DeptNO` = `project`.`employee`.`DeptNO` and `project`.`project`.`ProjectNO` = `project`.`work_on`.`ProjectNO`
mariadb-version=100411

TYPE=VIEW
query=select `project`.`project`.`ProjectNO` AS `Project_ID`,`project`.`project`.`ProjectName` AS `Name`,`project`.`project`.`Location` AS `Location`,`project`.`project`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department` from `project`.`project` join `project`.`department` where `project`.`project`.`DeptNO` = `project`.`department`.`DeptNO`
md5=12db242d7e0f5dfbb0a9d74c4a102e10
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-06-14 17:45:55
create-version=2
source=select ProjectNO as \'Project_ID\',\n       ProjectName as \'Name\',\n       project.Location,\n       project.DeptNO as \'Department_ID\',\n       DeptName as \'Department\'\n       from Project,department\n       where project.DeptNO = department.DeptNO
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_unicode_ci
view_body_utf8=select `project`.`project`.`ProjectNO` AS `Project_ID`,`project`.`project`.`ProjectName` AS `Name`,`project`.`project`.`Location` AS `Location`,`project`.`project`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department` from `project`.`project` join `project`.`department` where `project`.`project`.`DeptNO` = `project`.`department`.`DeptNO`
mariadb-version=100411

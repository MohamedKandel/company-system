TYPE=VIEW
query=select `project`.`department`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department`,`project`.`department`.`Location` AS `Location` from `project`.`department`
md5=694ef12496efb8f3f9343d8ae0a91ba1
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2020-06-14 17:45:39
create-version=2
source=select department.DeptNO as \'Department_ID\',\n       DeptName as \'Department\',\n       Location\n       from department
client_cs_name=utf8mb4
connection_cl_name=utf8mb4_unicode_ci
view_body_utf8=select `project`.`department`.`DeptNO` AS `Department_ID`,`project`.`department`.`DeptName` AS `Department`,`project`.`department`.`Location` AS `Location` from `project`.`department`
mariadb-version=100411

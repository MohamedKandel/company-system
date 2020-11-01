package entity;

import javax.swing.JTable;

public class Employee implements maindata {

    private int EmpNO;
    private String EmpName;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String Birthdate;
    private int DeptNO;

    public int getEmpNO() {
        return EmpNO;
    }

    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public int getDeptNO() {
        return DeptNO;
    }

    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }

    @Override
    public void add() {
        String insert = "insert into employee values ( " + EmpNO + " , "
                + "'" + EmpName + "' , "
                + "'" + Address + "' , "
                + Salary + " , "
                + "' " + HiringDate + " ' ,"
                + " '" + Birthdate + "' , "
                + DeptNO + " )";
        db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        String update = "update employee set "
                + "EmpName = '" + EmpName + "', "
                + "Address = '" + Address + "', "
                + "Salary = " + Salary + ", "
                + "HiringDate = '" + HiringDate + "', "
                + "Birthdate = '" + Birthdate + "', "
                + "DeptNo = " + DeptNO + " "
                + "where EmpNO = " + EmpNO;
        db.database.RunNonQuery(update);
    }

    @Override
    public void delete() {
        String delete = "delete from employee where EmpNO = " + EmpNO;
        db.database.RunNonQuery(delete);
    }

    @Override
    public String getAutoNumber() {
        String AutoNum = db.database.getAutoNumber("employee", "EmpNO");
        return AutoNum;
    }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("employee_data", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from employee_data where "
                + "Employee_ID = " + EmpNO;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String get = "select Employee_ID from employee_data where "
                + "Name = '" + name + "'";
        String str = (String) db.database.getTableData(get).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String get = "select Name from employee_data where "
                + "Employee_ID = " + value;
        String str = (String) db.database.getTableData(get).items[0][0];
        return str;
    }
}

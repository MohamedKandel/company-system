package entity;

import javax.swing.JTable;

public class Department implements maindata {

    private int DeptNO;
    private String DeptName;
    private String Location;

    public int getDeptNO() {
        return DeptNO;
    }

    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    //interfaces methods
    @Override
    public void add() {
        //insert into department values (DeptNO,'DeptName','Location')
        String insert = "insert into department values ("
                + DeptNO + " , '" + DeptName + "' , '" + Location + "')";
        db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        String update = "update department set"
                + " DeptName = '" + DeptName + "' "
                + ", Location = '" + Location + "' "
                + "where DeptNO = " + DeptNO;
        db.database.RunNonQuery(update);
    }

    @Override
    public void delete() {
        String delete = "delete from department where DeptNO = " + DeptNO;
        db.database.RunNonQuery(delete);
    }

    @Override
    public String getAutoNumber() {
        String AutoNum = db.database.getAutoNumber("department_data" , "Department_ID");
        return AutoNum;
    }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("department_data", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from department_data where "
                + "Department_ID = " + DeptNO;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String select = "select Department_ID from department_data where "
                + "Department = '" +name+"'";
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String select = "select Department from department_data where "
                + "Department_ID = " +value;
        String str = (String) db.database.getTableData(select).items[0][0];
        return str;
    }
}

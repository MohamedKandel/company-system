
package entity;

import javax.swing.JTable;

public class Project implements maindata{
    private int ProjectNO;
    private String ProjectName;
    private String Location;
    private int DeptNO;
    
    public int getProjectNO() {
        return ProjectNO;
    }

    public void setProjectNO(int ProjectNO) {
        this.ProjectNO = ProjectNO;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDeptNO() {
        return DeptNO;
    }

    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }

    @Override
    public void add() {
        String insert = "insert into project values ("+ProjectNO + ", "
                +"'"+ProjectName +"' , "
                +"'"+Location    +"' , "
                +DeptNO           +")";
        db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        String update = "update project set ProjectName = '" + ProjectName+"' ,"
                + " Location = '"+Location+"' ,"
                + " DeptNO = " + DeptNO
                + " where ProjectNO = " + ProjectNO;
        db.database.RunNonQuery(update);
    }

    @Override
    public void delete() {
        String delete = "delete from project where ProjectNO = " + ProjectNO;
        db.database.RunNonQuery(delete); 
    }

    @Override
    public String getAutoNumber() {
        String auto = db.database.getAutoNumber("project", "ProjectNO");
        return auto;
    }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("project_data", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from project_data where "
                + "Project_ID = " + ProjectNO;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String get = "select ProjectNO from project where "
                + "ProjectName = '" +name+"'";
        String str = (String) db.database.getTableData(get).items[0][0];
        return str;
    }

    @Override
    public String getNameByValue(String value) {
        String get = "select Name from project_data where "
                + "Project_ID = " +value;
        String str = (String) db.database.getTableData(get).items[0][0];
        return str;
    }    
}

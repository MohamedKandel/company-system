
package entity;

import company.project.Tools;
import javax.swing.JTable;

public class Work_On implements maindata{
    private int EmpNO;
    private int ProjectNO;
    
    private boolean check;

    public int getEmpNO() {
        return EmpNO;
    }

    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }

    public int getProjectNO() {
        return ProjectNO;
    }

    public void setProjectNO(int ProjectNO) {
        this.ProjectNO = ProjectNO;
    }

    @Override
    public void add() {
        String insert = "insert into work_on values ("
                + EmpNO + " , "
                + ProjectNO + ")";
        db.database.RunNonQuery(insert);
    }

    @Override
    public void update() {
        Tools.msg("This service is not available here !");
    }

    @Override
    public void delete() {
        String delete = "delete from work_on where "
                + "EmpNO = " + EmpNO
                + " and ProjectNO = "+ProjectNO;
        db.database.RunNonQuery(delete);
    }

    @Override
    public String getAutoNumber() {
        Tools.msg("This service is not available here !");
        return "";
    }

    @Override
    public void selectAll(JTable table) {
        db.database.fillToJTable("working", table);
    }

    @Override
    public void selectOneRow(JTable table) {
        String select = "select * from working where "
                +"Employee_ID = " + EmpNO
                +" and "
                +"Project_ID = " + ProjectNO;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        Tools.msg("This service is not available here !");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msg("This service is not available here !");
        return "";
    }
}

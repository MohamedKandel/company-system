package entity;

import company.project.Tools;
import javax.swing.JTable;

public class Employee_Phones implements maindata {

    private int EmpNO;
    private String Phone;

    private boolean check;

    public int getEmpNO() {
        return EmpNO;
    }

    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public void add() {
        String insert = "insert into employee_phone values (" + EmpNO + " ,"
                + " '" + Phone + "' )";
        check = db.database.RunNonQuery(insert);
        if (check == true) {
            //Tools.msg("added");
        } else {
            //Tools.msg("faild");
        }
    }

    @Override
    public void update() {
        Tools.msg("Update method in employee_phone Class not Working !");
    }

    @Override
    public void delete() {
        String delete = "delete from employee_phone where"
                + " EmpNO = " + EmpNO
                + " and Phone = '"+Phone+"'";
        check = db.database.RunNonQuery(delete);
        if (check == true) {
            //Tools.msg("deleted");
        } else {
        
        }
    }
    
    public void deleteAllPhonesByEmp() {
        String delete = "delete from employee_phone where"
                + " EmpNO = " + EmpNO;
        check = db.database.RunNonQuery(delete);
        if (check == true){
            //Tools.msg("All deleted");
        } else {
            //Tools.msg("Faild");
        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msg("get Auto Number is not Working here");
        return null;
    }

    @Override
    public void selectAll(JTable table) {
        String select = "select Phone from phones_data where"
                + " Employee_ID = " + EmpNO;
        db.database.fillToJTable(select, table);
    }

    @Override
    public void selectOneRow(JTable table) {
    }

    @Override
    public void getCustom(String statement, JTable table) {
        db.database.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //editable method
    public String getEmpByPhone(String phonerequest) {
        String select = "SELECT EmpNO FROM `employee_phone` WHERE"
                + " Phone like '%"+phonerequest+"%'";
        Object row[][] = db.database.getTableData(select).items;
        String str = "";
        if (row.length<1) {
            str = "0";
        } else {
        str = (String)row[0][0];
        }
        return str;
    }
    
    public void GetAllData(JTable table){
        String select = "select * from `phones_data`";
        db.database.fillToJTable(select, table);
    }
}

package Tests.Form_Rio.Form_Rio_11;

import Tests.BD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BD_Request_FormRIO extends BD {

    public String DU_R;
    public String NDOCID;
    public List<String> CheckRequestGRBS() {

        List<String> RDOCID = new ArrayList<>();
        try {
            Statement statement1 = getConnection().createStatement();
            String sql = "Execute dbo.PRB_R_ZR_Doc_Check\n" +
                    " @GroupName='7830002430/1599',\n " +
                    "@CUL='7832000076',\n " +
                    "@CSTD='01',\n " +
                    "@YEAR='2023'";
            ResultSet Result1 = statement1.executeQuery(sql);

            while (Result1.next()) {
                NDOCID = Result1.getString("DOCID");
                //System.out.println(DOCID);
            }
            String DocIID = String.valueOf(90428907);
            Statement statement2 = getConnection().createStatement();
            String sql2 = "select * from DOC where docid=" + NDOCID;

            ResultSet Result2 = statement2.executeQuery(sql2);
            while (Result2.next()) {
                DU_R = Result2.getString("DU_R");
                RDOCID.add(String.join(" ", DU_R));

            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        //System.out.println(RDOCID);
        return RDOCID;
    }

    public void CheckKBKMessages () {
        CheckRequestGRBS();
        if (DU_R == null) {
            System.out.println("grbs request not approved");
        }
        else {
            System.out.println("EDO is broken");
        }


    }
}

package Tests.Form_Rio.Form_Rio_11;

import Tests.BD;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static Tests.Form_Rio.Document_Header_Rio.yearFormRIO;
import static Tests.Form_Rio.Document_Header_Rio.stageFormRIO;


public class BD_Request_FormRIO extends BD {

    public static String DU_R;
    public String NDOCID;


    public String CheckRequestGRBS() {

        List<String> RDOCID = new ArrayList<>();
        try {
            Statement statement1 = getConnection().createStatement();
            String sql = "Execute dbo.PRB_R_ZR_Doc_Check" +
                    " @GroupName='7830002430/1599', " +
                    "@CUL='7809029013', " +
                    "@CSTD=\"" + stageFormRIO + "\"," +
                    "@YEAR=\"" + yearFormRIO + "\"";
            ResultSet Result1 = statement1.executeQuery(sql);
            while (Result1.next()) {
                NDOCID = Result1.getString("DOCID");
            }
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
        return DU_R;
    }
}
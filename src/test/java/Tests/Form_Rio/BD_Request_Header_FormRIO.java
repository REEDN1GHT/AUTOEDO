package Tests.Form_Rio;

import Tests.BD;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Tests.Form_Rio.Document_Header_Rio.yearFormRIO;
import static Tests.Form_Rio.Document_Header_Rio.stageFormRIO;
import static Page.InteractiveDoc.iNNGRBS;


public class BD_Request_Header_FormRIO extends BD {

    public static String DU_R;
    public String NDOCID;

    public static String ListYEARformRIO;

    public String CheckListYEARformRIO() {

        List<String> RLyear = new ArrayList<>();
        try {
            Statement statementYEAR = getConnection().createStatement();
            String sqlYEAR = "Execute dbo.FO_Doc_List\n" +
                    " @FieldName='YEAR', \n" +
                    " @GroupName='7830002430/1599', \n" +
                    " @DOCID=Null, \n" +
                    " @DOCID_Old=Null, \n" +
                    " @CPR_CCS_FULL_CVR=Null, \n" +
                    " @CUL_PARENT=Null, \n" +
                    " @FO=Null, \n" +
                    " @STAGE=Null, \n" +
                    " @VER_DP=Null, \n" +
                    " @CTD_SUB=Null,\n" +
                    " @CPR_CCS_FULL_CVR_Old=Null, \n" +
                    " @FIO=Null, \n" +
                    " @JOB=Null, \n" +
                    " @PHONE=Null, \n" +
                    " @FIO_CHIEF=Null, \n" +
                    " @JOB_CHIEF=Null, \n" +
                    " @YEAR=Null;";
            ResultSet ResultYEAR = statementYEAR.executeQuery(sqlYEAR);
            while (ResultYEAR.next()) {
                 ListYEARformRIO = ResultYEAR.getString("Год");
                 RLyear.add(String.join(" ", ListYEARformRIO).trim());
                Collections.sort(RLyear);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLyear.toString();
    }

    public String CheckListSTAGEformRIO() {
        List<String> RLstage = new ArrayList<>();
        try {
        Statement statementSTAGE = getConnection().createStatement();
        String sqlSTAGE = "Execute dbo.FO_Doc_List \n" +
                "@FieldName='STAGE', \n" +
                "@GroupName='7830002430/1599', \n" +
                "@DOCID=Null, \n" +
                "@DOCID_Old=Null, \n" +
                "@CPR_CCS_FULL_CVR=Null, \n" +
                "@CUL_PARENT=Null, \n" +
                "@FO=Null, \n" +
                "@STAGE=Null, \n" +
                "@VER_DP=Null, \n" +
                "@CTD_SUB=Null, \n" +
                "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                "@FIO=Null, \n" +
                "@JOB=Null, \n" +
                "@PHONE=Null, \n" +
                "@FIO_CHIEF=Null, \n" +
                "@JOB_CHIEF=Null, \n" +
                "@YEAR=" + yearFormRIO;
        ResultSet ResultSTAGE = statementSTAGE.executeQuery(sqlSTAGE);
        while (ResultSTAGE.next()) {
            String ListSTAGEkod = ResultSTAGE.getString("Код");
            String ListSTAGEname = ResultSTAGE.getString("Наименование");
            RLstage.add(String.join(" - ", ListSTAGEkod, ListSTAGEname).trim());
        }
    }catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLstage.toString();
    }

    public String CheckKBKformRIO() {
        List<String> RLkbk = new ArrayList<>();
        try {
            Statement statementKBK = getConnection().createStatement();
            String sqlKBK = "Execute dbo.FO_Doc_List \n" +
                    "@FieldName='CPR_CCS_FULL_CVR', \n" +
                    "@GroupName='7830002430/1599', \n" +
                    "@DOCID=Null,\n" +
                    "@DOCID_Old=Null, \n" +
                    "@CPR_CCS_FULL_CVR=Null, \n" +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\", \n" +
                    "@FO='11', \n" +
                    "@STAGE='01', \n" +
                    "@VER_DP=Null, \n" +
                    "@CTD_SUB=Null, \n" +
                    "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                    "@FIO=Null, \n" +
                    "@JOB=Null, \n" +
                    "@PHONE=Null, \n" +
                    "@FIO_CHIEF=Null, \n" +
                    "@JOB_CHIEF=Null, \n" +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultKBK = statementKBK.executeQuery(sqlKBK);
            while (ResultKBK.next()); {
                String ListKBKformRIO = ResultKBK.getString(String.join("ПБК"));
                RLkbk.add(String.join(" ", ListKBKformRIO));
            }
        } catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return RLkbk.toString();
    }


    public String CheckRequestGRBS() {

        List<String> RDOCID = new ArrayList<>();
        try {
            Statement statement1 = getConnection().createStatement();
            String sql = "Execute dbo.PRB_R_ZR_Doc_Check" +
                    " @GroupName='7830002430/1599', " +
                    "@CUL=\"" + iNNGRBS + "\"," +
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
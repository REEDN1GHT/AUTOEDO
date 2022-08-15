package Tests.Form_Rio;

import Tests.BD;
import com.google.errorprone.annotations.Var;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Page.InteractiveDoc.foFormRio;
import static Page.InteractiveDoc.iNNGRBS;
import static Tests.Form_Rio.Document_Header_Rio.*;


public class BD_Request_Main_FormRIO extends BD {

    public static String DU_R;
    public static String DU_RETURN;
    public String NDOCID;

    public String CheckDOCID;

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
                 String ListYEARformRIO = ResultYEAR.getString("Год");
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
            String sqlKBK = "Execute dbo.FO_Doc_List\n" +
            "@FieldName='CPR_CCS_FULL_CVR',\n" +
            "@GroupName='7830002430/1599',\n" +
            "@DOCID=Null,\n" +
            "@DOCID_Old=Null,\n" +
            "@CPR_CCS_FULL_CVR=\"" +kbkFormRIO+ "\",\n" +
            "@CUL_PARENT=\"" +iNNGRBS+ "\",\n" +
            "@FO=\"" +foFormRio+ "\",\n" +
            "@STAGE=\"" +stageFormRIO+ "\", " +
            "@VER_DP=Null,\n" +
            "@CTD_SUB=Null,\n" +
            "@CPR_CCS_FULL_CVR_Old=Null,\n" +
            "@FIO=Null,\n" +
            "@JOB=Null,\n" +
            "@PHONE=Null,\n" +
            "@FIO_CHIEF=Null,\n" +
            "@JOB_CHIEF=Null,\n" +
            "@YEAR=" +yearFormRIO;
            ResultSet ResultKBK = statementKBK.executeQuery(sqlKBK);
            while (ResultKBK.next()) {
                String ListKBKformRIO = ResultKBK.getString("ПБК");
                RLkbk.add(String.join(" ", ListKBKformRIO));
            }
        } catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return RLkbk.toString();
    }
    public String CheckKBKDPformRIO() {
        List<String> RLkbk = new ArrayList<>();
        try {
            Statement statementKBK = getConnection().createStatement();
            String sqlKBK = "Execute dbo.FO_Doc_List\n" +
                    "@FieldName='CPR_CCS_FULL_CVR',\n" +
                    "@GroupName='7830002430/1599',\n" +
                    "@DOCID=Null,\n" +
                    "@DOCID_Old=Null,\n" +
                    "@CPR_CCS_FULL_CVR=\"" +kbkFormRIO+ "\",\n" +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\",\n" +
                    "@FO=\"" +foFormRio+ "\",\n" +
                    "@STAGE=\"" +stageDPFormRIO+ "\", " +
                    "@VER_DP=Null,\n" +
                    "@CTD_SUB=Null,\n" +
                    "@CPR_CCS_FULL_CVR_Old=Null,\n" +
                    "@FIO=Null,\n" +
                    "@JOB=Null,\n" +
                    "@PHONE=Null,\n" +
                    "@FIO_CHIEF=Null,\n" +
                    "@JOB_CHIEF=Null,\n" +
                    "@YEAR=" +yearFormRIO;
            ResultSet ResultKBK = statementKBK.executeQuery(sqlKBK);
            while (ResultKBK.next()) {
                String ListKBKformRIO = ResultKBK.getString("ПБК");
                RLkbk.add(String.join(" ", ListKBKformRIO));
            }
        } catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return RLkbk.toString();
    }

    public String CheckVERfromRIO() {
        List<String> RLver =new ArrayList<>();
        try {
            Statement statementVER = getConnection().createStatement();
            String sqlVER = "Execute dbo.FO_Doc_List " +
                    "@FieldName='VER_DP', " +
                    "@GroupName='7830002430/1599', " +
                    "@DOCID=Null, " +
                    "@DOCID_Old=Null, " +
                    "@CPR_CCS_FULL_CVR=\"" +kbkFormRIO+ "\"," +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\", " +
                    "@FO=\"" +foFormRio+ "\"," +
                    "@STAGE=\"" +stageFormRIO+ "\", " +
                    "@VER_DP=Null, " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@FIO=Null, " +
                    "@JOB=Null, " +
                    "@PHONE=Null, " +
                    "@FIO_CHIEF=Null, " +
                    "@JOB_CHIEF=Null, " +
                    "@YEAR=" +yearFormRIO;
            ResultSet ResultVER = statementVER.executeQuery(sqlVER);
            while (ResultVER.next()) {
                String ListVERforRIO = ResultVER.getString("Номер документа");
                RLver.add(ListVERforRIO);
            }

        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return RLver.toString();
    }
    public String CheckVERDPfromRIO() {
        List<String> RLver =new ArrayList<>();
        try {
            Statement statementVER = getConnection().createStatement();
            String sqlVER = "Execute dbo.FO_Doc_List " +
                    "@FieldName='VER_DP', " +
                    "@GroupName='7830002430/1599', " +
                    "@DOCID=Null, " +
                    "@DOCID_Old=Null, " +
                    "@CPR_CCS_FULL_CVR=\"" +kbkDPFormRIO+ "\", \n" +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\", \n" +
                    "@FO=\"" +foFormRio+ "\"," +
                    "@STAGE=\"" +stageDPFormRIO+ "\",\n" +
                    "@VER_DP=Null, " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@FIO=Null, " +
                    "@JOB=Null, " +
                    "@PHONE=Null, " +
                    "@FIO_CHIEF=Null, " +
                    "@JOB_CHIEF=Null, " +
                    "@YEAR=" +yearFormRIO;
            ResultSet ResultVER = statementVER.executeQuery(sqlVER);
            while (ResultVER.next()) {
                String ListVERforRIO = ResultVER.getString("Номер документа");
                RLver.add(ListVERforRIO);
            }

        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return RLver.toString();
    }

    public String CheckVersionDPFormRIO() {
        List<String> RLVersionDP = new ArrayList<>();
        try {
            Statement statementVersionDP = getConnection().createStatement();
            String sqlVersionDP = "Execute dbo.FO_Doc_List \n" +
                    "@FieldName='VAR_DP', \n" +
                    "@GroupName='7830002430/1599', \n" +
                    "@DOCID=null, \n" +
                    "@DOCID_Old=null, \n" +
                    "@CPR_CCS_FULL_CVR=\"" +kbkDPFormRIO+ "\", \n" +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\", \n" +
                    "@FO=\"" +foFormRio+ "\"," +
                    "@STAGE=\"" +stageDPFormRIO+ "\",\n" +
                    "@VER_DP=Null," +
                    "@CTD_SUB=Null, \n" +
                    "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                    "@FIO=Null, \n" +
                    "@JOB=Null, \n" +
                    "@PHONE=Null, \n" +
                    "@FIO_CHIEF=Null,\n" +
                    "@JOB_CHIEF=Null, \n" +
                    "@YEAR=" +yearFormRIO;
            ResultSet ResultVersionDP = statementVersionDP.executeQuery(sqlVersionDP);
            while (ResultVersionDP.next()) {
                String ListVersionDP = ResultVersionDP.getString("Номер документа");
                RLVersionDP.add(ListVersionDP);
            }
        }catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLVersionDP.toString();
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

    public String CheckDU_RETURN() {
        try {
            Statement statementCheckDOCID = getConnection().createStatement();
            String sqlDOCID = "Execute dbo.FO_Doc_Check " +
                    "@GroupName='7830002430/1599', " +
                    "@CPR_CCS_FULL_CVR=\"" + kbkDPFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\"," +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageDPFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@VAR_DP=Null, " +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultDOCID = statementCheckDOCID.executeQuery(sqlDOCID);
            while (ResultDOCID.next()) {
               CheckDOCID = ResultDOCID.getString("DOCID");
            }
            Statement statementDU_RETURN = getConnection().createStatement();
            String sqlDU_RETURN = "SELECT D_RETURN FROM DOC WHERE DOCID=" + CheckDOCID;
            ResultSet ResultDU_RETURN = statementDU_RETURN.executeQuery(sqlDU_RETURN);
            while (ResultDU_RETURN.next()) {
                DU_RETURN = ResultDU_RETURN.getString("D_RETURN");
            }
        }catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return DU_RETURN;
    }


    //БД реквесты для футера формы
    public String CheckListFIO() {
        List<String> RLfio = new ArrayList<>();
        try {
            Statement statementFIO = getConnection().createStatement();
            String sqlFIO = "Execute dbo.FO_Doc_List " +
                    "@FieldName='FIO', " +
                    "@GroupName='7830002430/1599', " +
                    "@DOCID=0, " +
                    "@DOCID_Old=0, " +
                    "@CPR_CCS_FULL_CVR=\"" + kbkFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\", " +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@FIO=Null, " +
                    "@JOB=Null, " +
                    "@PHONE=Null, " +
                    "@FIO_CHIEF=Null, " +
                    "@JOB_CHIEF=Null, " +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultFIO = statementFIO.executeQuery(sqlFIO);
            while (ResultFIO.next()) {
                String FIO = ResultFIO.getString("ФИО");
                RLfio.add(String.join(" ", FIO));
                Collections.sort(RLfio);

            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLfio.toString();
    }

    public String ChecKListJOB() {
        List<String> RLjob = new ArrayList<>();
        try {
            Statement statementJOB = getConnection().createStatement();
            String sqlJOB = "Execute dbo.FO_Doc_List " +
                    "@FieldName='JOB', " +
                    "@GroupName='7830002430/1599', " +
                    "@DOCID=0, " +
                    "@DOCID_Old=0, " +
                    "@CPR_CCS_FULL_CVR=\"" + kbkFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\", " +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@FIO=Null, " +
                    "@JOB=Null, " +
                    "@PHONE=Null, " +
                    "@FIO_CHIEF=Null, " +
                    "@JOB_CHIEF=Null, " +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultJOB = statementJOB.executeQuery(sqlJOB);
            while (ResultJOB.next()) {
                String JOB = ResultJOB.getString("Должность");
                RLjob.add(String.join(" ", JOB));
                Collections.sort(RLjob);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLjob.toString();
    }

    public String CheckListPHONE(){
        List<String> RLphone = new ArrayList<>();
        try {
            Statement statementPHONE = getConnection().createStatement();
            String sqlPHONE = "Execute dbo.FO_Doc_List " +
                    "@FieldName='PHONE', " +
                    "@GroupName='7830002430/1599', " +
                    "@DOCID=0, " +
                    "@DOCID_Old=0, " +
                    "@CPR_CCS_FULL_CVR=\"" + kbkFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\", " +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@FIO=Null, " +
                    "@JOB=Null, " +
                    "@PHONE=Null, " +
                    "@FIO_CHIEF=Null, " +
                    "@JOB_CHIEF=Null, " +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultPHONE = statementPHONE.executeQuery(sqlPHONE);
            System.out.println(sqlPHONE);
            while (ResultPHONE.next()) {
                String PHONE = ResultPHONE.getString("Телефон");
                RLphone.add(String.join(" , ", PHONE));
                Collections.sort(RLphone);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLphone.toString();
    }

    public String CheckListFIO_CHIEF() {
        List<String> RLfio_chief = new ArrayList<>();
        try {
            Statement statementFIO_CHIEF = getConnection().createStatement();
            String sqlFIO_CHIEF = "Execute dbo.FO_Doc_List \n" +
                    "@FieldName='FIO_CHIEF', \n" +
                    "@GroupName='7830002430/1599', \n" +
                    "@DOCID=0, \n" +
                    "@DOCID_Old=0, \n" +
                    "@CPR_CCS_FULL_CVR=\"" + kbkFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\", " +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                    "@FIO=Null, \n" +
                    "@JOB=Null, \n" +
                    "@PHONE=Null, \n" +
                    "@FIO_CHIEF=Null, \n" +
                    "@JOB_CHIEF=Null, \n" +
                    "@YEAR=" + yearFormRIO;
            ResultSet resultSetFIO_CHIEF = statementFIO_CHIEF.executeQuery(sqlFIO_CHIEF);
            while (resultSetFIO_CHIEF.next()) {
                String FIO_CHIEF = resultSetFIO_CHIEF.getString("ФИО");
                RLfio_chief.add(String.join(" ", FIO_CHIEF));
                Collections.sort(RLfio_chief);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLfio_chief.toString();
    }

    public String CheckListJOB_CHIEF() {
        List<String> RLjob_chief = new ArrayList<>();
        try {
            Statement statementJOB_CHIEF = getConnection().createStatement();
            String sqlJOB_CHIEF = "Execute dbo.FO_Doc_List \n" +
                    "@FieldName='JOB_CHIEF', \n" +
                    "@GroupName='7830002430/1599', \n" +
                    "@DOCID=0, \n" +
                    "@DOCID_Old=0, \n" +
                    "@CPR_CCS_FULL_CVR=\"" + kbkFormRIO + "\", " +
                    "@CUL_PARENT=\"" + iNNGRBS + "\", " +
                    "@FO=\"" + foFormRio + "\", " +
                    "@STAGE=\"" + stageFormRIO + "\", " +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", " +
                    "@CTD_SUB=Null, " +
                    "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                    "@FIO=Null, \n" +
                    "@JOB=Null, \n" +
                    "@PHONE=Null, \n" +
                    "@FIO_CHIEF=Null, \n" +
                    "@JOB_CHIEF=Null, \n" +
                    "@YEAR=" + yearFormRIO;
            ResultSet ResultJOB_CHIEF = statementJOB_CHIEF.executeQuery(sqlJOB_CHIEF);
            while (ResultJOB_CHIEF.next()) {
                String JOB_CHIEF = ResultJOB_CHIEF.getString("Должность");
                RLjob_chief.add(String.join(" ", JOB_CHIEF));
                Collections.sort(RLjob_chief);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLjob_chief.toString();
    }
}
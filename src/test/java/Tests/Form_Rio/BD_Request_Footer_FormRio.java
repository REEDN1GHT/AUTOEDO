package Tests.Form_Rio;

import Tests.BD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import static Page.InteractiveDoc.foFormRio;
import static Page.InteractiveDoc.iNNGRBS;
import static Tests.Form_Rio.Document_Header_Rio.*;

public class BD_Request_Footer_FormRio extends BD {

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
            while (ResultPHONE.next()) {
                String PHONE = ResultPHONE.getString("Телефон");
                RLphone.add(String.join(" ", PHONE));
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLphone.toString();
    }

    public String CheckFIO_CHIEF() {
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
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLjob_chief.toString();
    }
}


package Tests.Form_Rio.Form_Rio_11;

import Tests.BD;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Page.InteractiveDoc.foFormRio;
import static Tests.Form_Rio.Document_Header_Rio.*;
import static Page.InteractiveDoc.iNNGRBS;


public class BD_Requests_11formRIO extends BD {

    public static String SUMM12;

    public String FO_DOC_Load() {
        List<String> RLoad = new ArrayList<>();
        try {
            Statement statementFO_DOC_Load = getConnection().createStatement();
            String sqlFO_DOC_Load ="Execute dbo.FO_Doc_Load " +
                    "@GroupName='7830002430/1599', " +
                    "@CPR_CCS_FULL_CVR='0505 0920083140 851', " +
                    "@CUL_PARENT='7801042446', " +
                    "@FO='11', " +
                    "@STAGE='01', " +
                    "@VER_DP='01', " +
                    "@CPR_CCS_FULL_CVR_Old=Null, " +
                    "@VAR_DP=Null, " +
                    "@YEAR='2023'";
            ResultSet ResultRLoad = statementFO_DOC_Load.executeQuery(sqlFO_DOC_Load);
            while (ResultRLoad.next()) {
                String CDOC = ResultRLoad.getString("CDOC");
                System.out.println("Документ" + CDOC + "Успешно загружен");
            }
            /*Statement statementSUMM12 = getConnection().createStatement();
            String sqlSUMM12 ="select round(sum(SUMM_12), 1) as [113] from FO_DATA_Work with (Nolock) WHERE CTD_SUB ='113'";
            ResultSet resultSetSUMM12 = statementSUMM12.executeQuery(sqlSUMM12);
            while (resultSetSUMM12.next()) {
                SUMM12 = resultSetSUMM12.getString("SUMM_12");
            }
            Statement statementWorkDelete = getConnection().createStatement();
            String sqlWorkDelete = "Execute dbo.WorkDelete @TableName='FO_DATA_Work'";
            ResultSet ResultWorkDelete = statementWorkDelete.executeQuery(sqlWorkDelete);*/
        }catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLoad.toString();
    }

    public String RequestSUMMfromBODYdocFormRIO() {
        try {
            Statement statementSUMM = getConnection().createStatement();
            String sqlSUMM12 ="select round(sum(SUMM_12), 1) as [113] from FO_DATA_Work with (Nolock) WHERE CTD_SUB ='113'";
            ResultSet resultSetSUMM12 = statementSUMM.executeQuery(sqlSUMM12);
            while (resultSetSUMM12.next()) {
                SUMM12 = resultSetSUMM12.getString("SUMM_12");
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return SUMM12;
    }

    public void WorkDelete () {
        try {
            Statement statementWorkDelete = getConnection().createStatement();
            String sqlWorkDelete = "Execute dbo.WorkDelete @TableName='FO_DATA_Work'";
            ResultSet ResultWorkDelete = statementWorkDelete.executeQuery(sqlWorkDelete);
        }catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

}

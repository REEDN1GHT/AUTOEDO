package Tests.Form_Rio.Form_Rio_11;

import Tests.BD;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static Page.InteractiveDoc.foFormRio;
import static Tests.Form_Rio.Document_Header_Rio.*;
import static Page.InteractiveDoc.iNNGRBS;


public class BD_Requests_11formRIO_TableOne extends BD {


    public String CheckHandbookNAMEPOKAZATEL() {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnection().createStatement();
            String sqlNAME ="Execute dbo.FO_Doc_List \n" +
                    "@FieldName='FO_NAME2', \n" +
                    "@GroupName='7801042446/ЭДО', \n" +
                    "@DOCID=Null, \n" +
                    "@DOCID_Old=0, \n" +
                    "@CPR_CCS_FULL_CVR=\"" +kbkFormRIO+ "\", \n" +
                    "@CUL_PARENT=\"" +iNNGRBS+ "\", \n" +
                    "@FO=\"" +foFormRio+ "\", \n" +
                    "@STAGE=\"" + stageFormRIO + "\", \n" +
                    "@VER_DP=\"" + NUMBERdpFormRIO + "\", \n" +
                    "@FO_NAME2=Null, \n" +
                    "@CTD_SUB='111', \n" +
                    "@CPR_CCS_FULL_CVR_Old=Null, \n" +
                    "@FIO=Null, \n" +
                    "@JOB=Null, \n" +
                    "@PHONE=Null, \n" +
                    "@FIO_CHIEF=Null,\n" +
                    "@JOB_CHIEF=Null, \n" +
                    "@YEAR=" +yearFormRIO;
            ResultSet ResultNAME = statementNAME.executeQuery(sqlNAME);
            while (ResultNAME.next()) {
                String ListNAME = ResultNAME.getString("Платеж");
                RLname.add(ListNAME);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RLname.toString();
    }



}

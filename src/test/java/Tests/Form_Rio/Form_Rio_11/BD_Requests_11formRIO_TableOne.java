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

    String Sum2022,Sum2023,Sum2024,Sum2025;

    public String CheckHandbookNAMEPOKAZATEL() {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnectionBudget22().createStatement();
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

    public float CheckStringTotalSumm2022()
    {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnectionBudget22().createStatement();
            String sqlNAME ="Select  Sum([R_R].[SUMM])/1000 As [Сумма в тысячах]\n" +
                    "From ((((((([R_R] With (NoLock)\n" +
                    "    Inner Join [K_LSR] With (NoLock) On ([R_R].[K_LSRID]=[K_LSR].[K_LSRID]))\n" +
                    "    Inner Join [K_PR] With (NoLock) On ([K_LSR].[K_PRID]=[K_PR].[K_PRID]))\n" +
                    "    Inner Join [K_CS] With (NoLock) On ([K_LSR].[K_CSID]=[K_CS].[K_CSID]))\n" +
                    "    Inner Join [Apps_Groups_K_LSR_My]\n" +
                    "        With (NoLock) On ([K_LSR].[K_LSRID]=[Apps_Groups_K_LSR_My].[K_LSRID]))\n" +
                    "    Inner Join [DOC] With (NoLock) On ([R_R].[DOCID]=[DOC].[DOCID]))\n" +
                    "    Inner Join [Apps_Groups] With (NoLock) On ([DOC].[Apps_GroupsID]=[Apps_Groups].[Apps_GroupsID]))\n" +
                    "    Inner Join [K_TD] With (NoLock) On ([R_R].[K_TDID]=[K_TD].[K_TDID]))\n" +
                    "Where [K_LSR].[CUL] Like '%' And ([DOC].K_TDID<>17 Or [DOC].DU Is Not Null Or '%'='%') And\n" +
                    "      [DOC].K_TDID<>IIf ( 1=2552, 17, 0) And [DOC].K_TDID<>IIf (1=2559, 17, 0) And (0=0)\n" +
                    "  And ([K_CS].[CCS_FULL]='0920083140') And ([K_PR].[CPR]='0505') And ([K_LSR].[CVR]='851') And\n" +
                    "      ([DOC].[DU] Is not Null) AND ([K_LSR].[CUL]='7809029013')\n" +
                    "\n" +
                    "Order by 1";
            ResultSet ResultNAME = statementNAME.executeQuery(sqlNAME);
            while (ResultNAME.next()) {
                Sum2022 = ResultNAME.getString("Сумма в тысячах");
                RLname.add(Sum2022);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return Float.parseFloat(Sum2022);
    }
    public float CheckStringTotalSumm2023()
    {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnectionBudget22().createStatement();
            String sqlNAME ="Select  Sum(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/1) % 2) *\n" +
                    "           Abs(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/2) % 2)-1) * [PRB_R_ZR].[SUMM_1] *\n" +
                    "           Sign(Right([K_TD].[CTD],1)))/1000 As [1 год (ЗР)]\n" +
                    "From ((((((((([PRB_R_ZR] With (NoLock) Inner Join [DOC] With (NoLock) On ([PRB_R_ZR].[DOCID]=[DOC].[DOCID]))\n" +
                    "    Inner Join [K_TD] With (NoLock) On ([PRB_R_ZR].[K_TDID]=[K_TD].[K_TDID]))\n" +
                    "    Inner Join [K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL].[K_ULID]))\n" +
                    "    Inner Join [K_PR] With (NoLock) On ([PRB_R_ZR].[K_PRID]=[K_PR].[K_PRID]))\n" +
                    "    Inner Join [K_CS] With (NoLock) On ([PRB_R_ZR].[K_CSID]=[K_CS].[K_CSID]))\n" +
                    "    Inner Join [K_VR] With (NoLock) On ([PRB_R_ZR].[K_VRID]=[K_VR].[K_VRID]))\n" +
                    "    Inner Join [K_PS] With (NoLock) On ([PRB_R_ZR].[K_PSID]=[K_PS].[K_PSID]))\n" +
                    "    Inner Join [K_UL_K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL_K_UL].[K_ULID] And\n" +
                    "                                             [K_UL_K_UL].[CROLE] In ('1','2') And\n" +
                    "                                             [K_UL_K_UL].[CROLE_PARENT]='4'))\n" +
                    "    Inner Join [Apps_Groups_K_UL_K_UL]\n" +
                    "        With (NoLock) On ([K_UL_K_UL].[K_UL_K_ULID]=[Apps_Groups_K_UL_K_UL].[K_UL_K_ULID]))\n" +
                    "Where [Apps_Groups_K_UL_K_UL].[Apps_GroupsID]=1 And [K_TD].[CTD] In ('B0','95') And (0=0)\n" +
                    "  And ([K_CS].[CCS_FULL]='0920083140') And ([K_PR].[CPR]='0505') And ([K_VR].[CVR]='851') And\n" +
                    "      ([DOC].[DU_R] is not null) And ([K_UL].[CUL]='7809029013')\n" +
                    "Order by 1\n";
            ResultSet ResultNAME = statementNAME.executeQuery(sqlNAME);
            while (ResultNAME.next()) {
                Sum2023 = ResultNAME.getString("1 год (ЗР)");
                RLname.add(Sum2023);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return Float.parseFloat(Sum2023);
    }
    public float CheckStringTotalSumm2024()
    {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnectionBudget22().createStatement();
            String sqlNAME ="Select\n" +
                    "       Sum(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/1) % 2) *\n" +
                    "           Abs(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/2) % 2)-1) * [PRB_R_ZR].[SUMM_2] *\n" +
                    "           Sign(Right([K_TD].[CTD],1)))/1000 As [2 год (ЗР)]\n" +
                    "From ((((((((([PRB_R_ZR] With (NoLock) Inner Join [DOC] With (NoLock) On ([PRB_R_ZR].[DOCID]=[DOC].[DOCID]))\n" +
                    "    Inner Join [K_TD] With (NoLock) On ([PRB_R_ZR].[K_TDID]=[K_TD].[K_TDID]))\n" +
                    "    Inner Join [K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL].[K_ULID]))\n" +
                    "    Inner Join [K_PR] With (NoLock) On ([PRB_R_ZR].[K_PRID]=[K_PR].[K_PRID]))\n" +
                    "    Inner Join [K_CS] With (NoLock) On ([PRB_R_ZR].[K_CSID]=[K_CS].[K_CSID]))\n" +
                    "    Inner Join [K_VR] With (NoLock) On ([PRB_R_ZR].[K_VRID]=[K_VR].[K_VRID]))\n" +
                    "    Inner Join [K_PS] With (NoLock) On ([PRB_R_ZR].[K_PSID]=[K_PS].[K_PSID]))\n" +
                    "    Inner Join [K_UL_K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL_K_UL].[K_ULID] And\n" +
                    "                                             [K_UL_K_UL].[CROLE] In ('1','2') And\n" +
                    "                                             [K_UL_K_UL].[CROLE_PARENT]='4'))\n" +
                    "    Inner Join [Apps_Groups_K_UL_K_UL]\n" +
                    "        With (NoLock) On ([K_UL_K_UL].[K_UL_K_ULID]=[Apps_Groups_K_UL_K_UL].[K_UL_K_ULID]))\n" +
                    "Where [Apps_Groups_K_UL_K_UL].[Apps_GroupsID]=1 And [K_TD].[CTD] In ('B0','95') And (0=0)\n" +
                    "  And ([K_CS].[CCS_FULL]='0920083140') And ([K_PR].[CPR]='0505') And ([K_VR].[CVR]='851') And\n" +
                    "      ([DOC].[DU_R] is not null) And ([K_UL].[CUL]='7809029013')\n" +
                    "Group by [DOC].[DU_R], [K_VR].[CVR], [K_PS].[CPS], [DOC].[CDOC], [K_UL].[CUL], [K_PR].[CPR], [K_CS].[CCS_FULL]\n" +
                    "Order by 1\n";
            ResultSet ResultNAME = statementNAME.executeQuery(sqlNAME);
            while (ResultNAME.next()) {
                Sum2024 = ResultNAME.getString("2 год (ЗР)");
                RLname.add(Sum2024);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return Float.parseFloat(Sum2024);
    }
    public float CheckStringTotalSumm2025()
    {
        List<String> RLname = new ArrayList<>();
        try {
            Statement statementNAME = getConnectionBudget22().createStatement();
            String sqlNAME ="Select\n" +
                    "       Sum(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/1) % 2) *\n" +
                    "           Abs(Sign(Floor(([PRB_R_ZR].[SUMM_TYPE]+1)/2) % 2)-1) * [PRB_R_ZR].[SUMM_2] *\n" +
                    "           Sign(Right([K_TD].[CTD],1)))/1000 As [2 год (ЗР)]\n" +
                    "From ((((((((([PRB_R_ZR] With (NoLock) Inner Join [DOC] With (NoLock) On ([PRB_R_ZR].[DOCID]=[DOC].[DOCID]))\n" +
                    "    Inner Join [K_TD] With (NoLock) On ([PRB_R_ZR].[K_TDID]=[K_TD].[K_TDID]))\n" +
                    "    Inner Join [K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL].[K_ULID]))\n" +
                    "    Inner Join [K_PR] With (NoLock) On ([PRB_R_ZR].[K_PRID]=[K_PR].[K_PRID]))\n" +
                    "    Inner Join [K_CS] With (NoLock) On ([PRB_R_ZR].[K_CSID]=[K_CS].[K_CSID]))\n" +
                    "    Inner Join [K_VR] With (NoLock) On ([PRB_R_ZR].[K_VRID]=[K_VR].[K_VRID]))\n" +
                    "    Inner Join [K_PS] With (NoLock) On ([PRB_R_ZR].[K_PSID]=[K_PS].[K_PSID]))\n" +
                    "    Inner Join [K_UL_K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL_K_UL].[K_ULID] And\n" +
                    "                                             [K_UL_K_UL].[CROLE] In ('1','2') And\n" +
                    "                                             [K_UL_K_UL].[CROLE_PARENT]='4'))\n" +
                    "    Inner Join [Apps_Groups_K_UL_K_UL]\n" +
                    "        With (NoLock) On ([K_UL_K_UL].[K_UL_K_ULID]=[Apps_Groups_K_UL_K_UL].[K_UL_K_ULID]))\n" +
                    "Where [Apps_Groups_K_UL_K_UL].[Apps_GroupsID]=1 And [K_TD].[CTD] In ('B0','95') And (0=0)\n" +
                    "  And ([K_CS].[CCS_FULL]='0920083140') And ([K_PR].[CPR]='0505') And ([K_VR].[CVR]='851') And\n" +
                    "      ([DOC].[DU_R] is not null) And ([K_UL].[CUL]='7809029013')\n" +
                    "Group by [DOC].[DU_R], [K_VR].[CVR], [K_PS].[CPS], [DOC].[CDOC], [K_UL].[CUL], [K_PR].[CPR], [K_CS].[CCS_FULL]\n" +
                    "Order by 1\n";
            ResultSet ResultNAME = statementNAME.executeQuery(sqlNAME);
            System.out.println(sqlNAME);
            while (ResultNAME.next()) {
                Sum2025 = ResultNAME.getString("3 год (ЗР)");
                RLname.add(Sum2025);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return Float.parseFloat(Sum2025);
    }
}

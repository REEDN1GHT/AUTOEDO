package Tests.Form_Rio.Form_Rio_02;

import Tests.BD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static Page.InteractiveDoc.iNNGRBS;
import static Tests.Form_Rio.Form_Rio_02.HeaderRio02.vrFormRio;
import static Tests.Form_Rio.Document_Header_Rio.yearFormRIO;

public class BD_Requests_02formRIO extends BD {
    public String NDOCID02;
    public String CheckRequestGRBS() {
        List<String> RDOCID = new ArrayList<>();
        try {
            Statement statement1 = getConnectionBudget22().createStatement();
            String sql ="Select [DOC].[DU_R] As [Дата утверждения распорядителя],\n" +
                            "       [K_PS].[CPS] As [Код ОСГУ],\n" +
                            "       [DOC].[CDOC] As [Документ],\n" +
                            "       [K_UL].[CUL] As [Распорядитель по заявке],\n" +
                            "       [K_PR].[CPR] As [Подраздел],\n" +
                            "       [K_CS].[CCS_FULL] As [Целевая статья],\n" +
                            "       [K_VR].[CVR] As [Вид расходов]\n" +
                            "From (((((((((([PRB_R_ZR] With (NoLock)\n" +
                            "    Inner Join [DOC] With (NoLock) On ([PRB_R_ZR].[DOCID]=[DOC].[DOCID]))\n" +
                            "    Inner Join [K_TD] With (NoLock) On ([PRB_R_ZR].[K_TDID]=[K_TD].[K_TDID]))\n" +
                            "    Inner Join [K_STD] With (NoLock) On ([PRB_R_ZR].[K_STDID]=[K_STD].[K_STDID]))\n" +
                            "    Inner Join [K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL].[K_ULID]))\n" +
                            "    Inner Join [K_PR] With (NoLock) On ([PRB_R_ZR].[K_PRID]=[K_PR].[K_PRID]))\n" +
                            "    Inner Join [K_CS] With (NoLock) On ([PRB_R_ZR].[K_CSID]=[K_CS].[K_CSID]))\n" +
                            "    Inner Join [K_VR] With (NoLock) On ([PRB_R_ZR].[K_VRID]=[K_VR].[K_VRID]))\n" +
                            "    Inner Join [K_PS] With (NoLock) On ([PRB_R_ZR].[K_PSID]=[K_PS].[K_PSID]))\n" +
                            "    Inner Join [K_UL_K_UL] With (NoLock) On ([PRB_R_ZR].[K_ULID]=[K_UL_K_UL].[K_ULID]\n" +
                            "                                                 And [K_UL_K_UL].[CROLE] In ('1','2')\n" +
                            "                                                 And [K_UL_K_UL].[CROLE_PARENT]='4'))\n" +
                            "    Inner Join [Apps_Groups_K_UL_K_UL]\n" +
                            "        With (NoLock) On ([K_UL_K_UL].[K_UL_K_ULID]=[Apps_Groups_K_UL_K_UL].[K_UL_K_ULID]))\n" +
                            "Where [Apps_Groups_K_UL_K_UL].[Apps_GroupsID]=1 And [K_TD].[CTD] In ('B0','95') And (0=0)\n" +
                            "  And ([K_VR].[CVR]=\'"+vrFormRio+"\') And ([DOC].[DU] is not null)\n" +
                            "  And ([K_STD].[YEAR]=\'"+yearFormRIO+"\') And ([K_UL].[CUL]=\'"+iNNGRBS+"\')\n" +
                            "Group by [DOC].[DU_R], [K_PS].[CPS], [DOC].[CDOC], [K_UL].[CUL], [K_PR].[CPR], [K_CS].[CCS_FULL], [K_VR].[CVR]\n" +
                            "Order by 1\n";

            ResultSet Result2 = statement1.executeQuery(sql);
            while (Result2.next()) {
                String DU_R = Result2.getString("Дата утверждения распорядителя");
                RDOCID.add(String.join(" ", DU_R));
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RDOCID.toString();
    }
    public String CheckNamePokazatelSubform8() {
        List<String> RDOCID = new ArrayList<>();
        try {
            Statement statement1 = getConnectionBudget22().createStatement();
            String sql ="Execute dbo.FO_Doc_List @FieldName='FO_NAME1',\n" +
                    "    @GroupName='7830002430/1599',\n" +
                    "    @DOCID=null,\n" +
                    "    @DOCID_Old=null,\n" +
                    "    @CPR_CCS_FULL_CVR=null,\n" +
                    "    @CUL_PARENT=null,\n" +
                    "    @FO=null,\n" +
                    "    @STAGE=null,\n" +
                    "    @VER_DP=null,\n" +
                    "    @FO_NAME1=null,\n" +
                    "    @FO_NAME3=null,\n" +
                    "    @FO_NAME4=null,\n" +
                    "    @FO_NAME5=null,\n" +
                    "    @CTD_SUB='028',\n" +
                    "    @CPR_CCS_FULL_CVR_Old=Null,\n" +
                    "    @FIO=null,\n" +
                    "    @JOB=null,\n" +
                    "    @PHONE=null,\n" +
                    "    @FIO_CHIEF=null,\n" +
                    "    @JOB_CHIEF=null,\n" +
                    "    @YEAR='2022'";

            ResultSet Result2 = statement1.executeQuery(sql);
            while (Result2.next()) {
                String name = Result2.getString("Наименование");
                RDOCID.add(name);
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return RDOCID.toString();
    }
}

package Tests.Report_form_documents;

import Tests.BD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BD_Request_Monthly_Report_0503117 extends BD {

    public List<String> checkIsDocExist(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Select\n" +
                    "CPR As [Подраздел],\n" +
                    "NPR As [Наименование]\n" +
                    "From K_PR\n" +
                    "Where K_BKID=(Select K_BKID From K_BK Where YEAR=2022 And FLAGS <>0) -- год для формы из CDOC (переменнная)\n" +
                    "Order by 1";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Подраздел");
                String data2 = rs.getString("Наименование");

                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<String> checkADM(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Execute dbo.REP_Doc_List\n" +
                    "@FieldName='ADM',\n" +
                    "@GroupName='7830002430/1599',\n" +
                    "@ThousandSeparator=' ',\n" +
                    "@DecimalSeparator=',',\n" +
                    "@CUL_CHILD='022',\n" +
                    "@CPERIOD='1',\n" +
                    "@CUL_PARENT='7804042349',\n" +
                    "@CTD='YD',\n" +
                    "@NTD_SUB='Отчет об исполнении. Расходы'";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Администратор");
                String data2 = rs.getString("Наименование");

                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<String> viRasxod(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Execute dbo.REP_Doc_List" +
                    " @FieldName='CVRnot000'," +
                    " @GroupName='7801108440/КН'," +
                    " @ThousandSeparator=' '," +
                    " @DecimalSeparator=',', " +
                    "@CUL_CHILD='022'," +
                    " @CPERIOD='01', " +
                    "@CUL_PARENT='7804042349', " +
                    "@CTD='YD', " +
                    "@NTD_SUB='(0503117) Отчет об исполнении. Расходы'";
            ResultSet rs = statement.executeQuery(sql);


            while (rs.next())
            {
                String data = rs.getString("Вид расходов");
                String data2 = rs.getString("Наименование");


                list.add(String.join("  - ",data,data2).trim());
            }
            Collections.sort(list);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<String> TselevaiaMORasxod(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Execute dbo.REP_Doc_List" +
                    " @FieldName='CCS_FULL_MO', " +
                    "@GroupName='7801108440/КН', " +
                    "@ThousandSeparator=' ', " +
                    "@DecimalSeparator=',', " +
                    "@CUL_CHILD='022'," +
                    " @CPERIOD='01'," +
                    " @CUL_PARENT='7804042349', " +
                    "@CTD='YD', " +
                    "@NTD_SUB='(0503117) Отчет об исполнении. Расходы'";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Код");
                String data2 = rs.getString("Наименование");


                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<String> TselevaiaRasxod(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Select CCS_FULL As [Целевая статья],\n" +
                    "NCS As [Наименование],\n" +
                    "K_CSID As [ID]\n" +
                    "From K_CS\n" +
                    "Where K_BKID=Case When (Select NTDS From K_TD Where CTD='YD') Like '01 02 %'\n" +
                    "                  Then (Select K_BKID From K_BK Where CBK=(Select 'MO'+Right(Rtrim(Convert(VarChar(255),2022)),2))) --год\n" +
                    "                  Else (Select K_BKID From K_BK Where YEAR=2022 And FLAGS <>0) End --год\n" +
                    "Order by 1";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Целевая статья");
                String data2 = rs.getString("Наименование");


                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<String> kosgyRasxod(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Select\n" +
                    "K_PS.CPS As [КОСГУ], Max(K_PS.NPS) As [Наименование], Max(K_PS.K_PSID) As [ID]\n" +
                    "From K_PS\n" +
                    "        Left Join K_PS As K_PS_1\n" +
                    "                On (K_PS.K_BKID=K_PS_1.K_BKID And \n" +
                    "                K_PS.CPS=Left(K_PS_1.CPS,2)+'0' And \n" +
                    "                K_PS.CPS<>K_PS_1.CPS And\n" +
                    "                K_PS_1.CPS Not Like '[14]_[1-я]')\n" +
                    "Where ((K_PS.K_BKID=((Select K_BKID From K_BK Where YEAR=2022 And FLAGS <>0)))) --год\n" +
                    "        And (Right(K_PS.CPS,2)<>'00' Or K_PS.CPS='000')\n" +
                    "        And K_PS.CPS Not Like '[14]_[1-я]'\n" +
                    "        And (K_PS_1.K_PSID Is Null Or K_PS.CPS = '340')\n" +
                    "Group By K_PS.CPS\n" +
                    "Order by Case When K_PS.CPS='000' Then 2 Else 1 End, K_PS.CPS";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("КОСГУ");
                String data2 = rs.getString("Наименование");


                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<String> checkIsADMExist(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Select\n" +
                    "Max(K_UL.ADM) As [Администратор],\n" +
                    "Max(K_UL.CUL) As [Учреждение],\n" +
                    "Max(K_UL.NUL) As [Наименование]\n" +
                    "\n" +
                    "From K_UL\n" +
                    "Inner Join K_D_ADM On (K_UL.K_ULID=K_D_ADM.K_ULID)\n" +
                    "Inner Join K_D On (K_D_ADM.K_DID=K_D.K_DID)\n" +
                    "Where K_D.K_D_TYPE=1\n" +
                    "  And K_D.K_BKID=(select K_BKID from K_BK where year = 2022 And FLAGS <>0) -- Год принятия бюджетного классификатора\n" +
                    "  And K_D.FLAGS & dbo.Apps_GetTableFlags('K_D','MO_FLAG')<> 0\n" +
                    "  And K_D_ADM.D_CLOSE Is Null\n" +
                    "Group by K_UL.K_ULID\n" +
                    "Order by Max(K_UL.ADM), Max(K_UL.INN), Max(K_UL.CUL)";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Администратор");
                String data2 = rs.getString("Учреждение");
                String data3 = rs.getString("Наименование");

                list.add(String.join("",data,"   (",data2,")", "  - ",data3).trim());
            }
            Collections.sort(list);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<String> checkIsADMIstochnick(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Execute dbo.REP_Doc_List\n" +
                    "    @FieldName='ADM',\n" +
                    "    @GroupName='7804042349/КН',\n" +
                    "    @ThousandSeparator=' ',\n" +
                    "    @DecimalSeparator=',',\n" +
                    "    @CUL_CHILD='022',\n" +
                    "    @CPERIOD='1',\n" +
                    "    @CUL_PARENT='7804042349',\n" +
                    "    @CTD='YD',\n" +
                    "    @NTD_SUB='(0503117) Отчет об исполнении. Источники'";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Администратор");
                String data2 = rs.getString("Наименование");

                list.add(String.join("  - ",data,data2).trim());
            }
            Collections.sort(list);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<String> checkIsKodIstochnick(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Execute dbo.REP_Doc_List " +
                    "@FieldName='CODE5'," +
                    " @GroupName='7801108440/КН', " +
                    "@ThousandSeparator=' '," +
                    " @DecimalSeparator=','," +
                    " @CUL_CHILD='022', " +
                    "@CPERIOD='01', " +
                    "@CUL_PARENT='7804042349', " +
                    "@CTD='YD'," +
                    " @NTD_SUB='(0503117) Отчет об исполнении. Источники'";
            ResultSet rs = statement.executeQuery(sql);

            //  List<String> myValues = Stream.of()
            //    .map(rss -> rs.get)
            //  .collect(Collectors.toList());

            while (rs.next())
            {
                String data = rs.getString("Код");
                String data2 = rs.getString("Наименование");

                list.add(String.join("  - ",data,data2).trim());
            }
            Collections.sort(list);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }


    public List<String> checkKodDoxodaDoxod(){
        List <String> list = new ArrayList<>();
        try {

            Statement statement = getConnectionBudget22().createStatement();
            String sql = "Select\n" +
                    "Max(K_D.CDS) As [Код дохода],\n" +
                    "Max(K_D.NS) As [Наименование],\n" +
                    "Max(K_D.K_DID) As [ID]\n" +
                    "From K_D\n" +
                    "Inner Join K_D_ADM On (K_D.K_DID=K_D_ADM.K_DID)\n" +
                    "Inner Join K_UL On (K_D_ADM.K_ULID=K_UL.K_ULID)\n" +
                    "Where K_D.K_D_TYPE=1\n" +
                    "  And K_D.K_BKID=(select K_BKID from K_BK where year = 2022 And FLAGS <>0) --год принятия бюджетного классификатора\n" +
                    "  And K_D.FLAGS & dbo.Apps_GetTableFlags('K_D','CLOSE_FLAG') = 0\n" +
                    "  And K_D_ADM.D_CLOSE Is Null\n" +
                    "  And K_D.FLAGS & dbo.Apps_GetTableFlags('K_D','MO_FLAG') <> 0\n" +
                    "  And Coalesce(K_UL.ADM,'')=Coalesce(null,K_UL.ADM,'') --код Администратора\n" +
                    "Group By K_D.K_DID\n" +
                    "Order By 1";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next())
            {
                String data = rs.getString("Код дохода");
                String data2 = rs.getString("Наименование");

                list.add(String.join("  - ",data,data2).trim());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}

package Tests.Form_Rio.Form_Rio_02;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Page.test2;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Form_Rio_02_Subform_7 extends TestBase {
    String nameSubform = "7. Расчет фонда оплаты труда рабочих в органах государственной власти и иных органах Санкт-Петербурга";
    @Test()
    public void interactivePage_CheckNameHederTableSubform2_NameHederTableSuccesful() throws InterruptedException {
        List<String> str = Arrays.asList("Период","ИПЦ","Численность","Оклад","Оклад(нов)","Всего","По должн. окл.","Выпл. комп. х-а","Выпл. стим. х-а","Фонд в год","За сч.ср.ФБ");
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        Assert.assertEquals(interactiveDoc.proverka2(),str.toString(),"Ошибка");
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputPeriodSubform2_NotAvailableManualInputPeriod() throws InterruptedException {
        int numColumn = 1;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputIPCSubform2_NotAvailableManualInputIPC() throws InterruptedException {
        int numColumn = 2;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputSalarySubform2_NotAvailableManualInputSalary() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverkaSalary(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputSalaryNewSubform2_NotAvailableManualInputSalaryNew() throws InterruptedException {
        int numColumn = 5;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputTotalSubform2_NotAvailableManualInputTotal() throws InterruptedException {
        int numColumn = 6;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputByPositionSalarySubform2_NotAvailableManualInputByPositionSalary() throws InterruptedException {
        int numColumn = 7;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputPayoutCompFarmsSubform2_NotAvailableManualInputPayoutCompFarms() throws InterruptedException {
        int numColumn = 8;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputFundInYearSubform2_NotAvailableManualInputFundInYear() throws InterruptedException {
        int numColumn = 10;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckManualInputSalarySubform2_NotAvailableManualInputSalary() throws InterruptedException {
        int numColumn = 4,numString=1;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        Assert.assertFalse(interactiveDoc.hasReadonlyOnString(numString,numColumn),"Ошибка в поле. Строка 2022. Столбец Оклад" );

    }
    @Test()
    public void interactivePage_CheckManualInpurChislennostSubform2_ManualInputTableChislennost() throws InterruptedException {
        int numColumn = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka3(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckManualInpurPayoutStimFarmsSubform2_ManualInputPayoutStimFSuccesful() throws InterruptedException {
        int numColumn = 9;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka3(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckManualInpurExpenseOfFBFundsSubform2_ManualInputSalaryExpenseOfFBFunds() throws InterruptedException {
        int numColumn = 11;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka3(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldSalaryNewSubform2_CalculationFieldSalaryNewSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldSalaryNew(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldTotalSubform2_CalculationFieldTotalSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldTotal(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldByPositionSalarySubform2_CalculationFieldByPositionSalary() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldByPositionSalary(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldFundInYearSubform2_CalculationFieldForFundInYearSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForFundInYearConditions(numColumn);
    }

    @Test()
    public void interactivePage_CheckNumberDecimalPlacesIPCSubform2_NumberDecimalPlacesIPCSuccesful() throws InterruptedException {
        int numColumn = 2;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka6(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesSalarySubform2_NumberDecimalPlacesSalarySuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesSalaryNewSubform2_NumberDecimalPlacesSalaryNewSuccesful() throws InterruptedException {
        int numColumn = 5;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesTotalSubform2_NumberDecimalPlacesTotalSuccesful() throws InterruptedException {
        int numColumn = 6;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesByPositionSalarySubform2_NumberDecimalPlacesByPositionSalarySuccesful() throws InterruptedException {
        int numColumn = 7;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesPayoutCompFarmsSubform2_NumberDecimalPlacesPayoutCompFarmsSuccesful() throws InterruptedException {
        int numColumn = 8;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesPayoutStimFarmsSubform2_NumberDecimalPlacesPayoutStimFarmsSuccesful() throws InterruptedException {
        int numColumn = 9;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesFundInYearSubform2_NumberDecimalPlacesFundInYearSuccesful() throws InterruptedException {
        int numColumn = 10;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka4(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalExpenseOfFBSubform2_NumberDecimalPlacesExpenseOfFBSuccesful() throws InterruptedException {
        int numColumn = 10;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        proverka4(numColumn);
    }


    public void assertFieldForFundInYearConditions(int numColumn) throws InterruptedException {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(10);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);
            interactiveDoc.setFieldSubform2Rio02(9,index);

            double str3= interactiveDoc.getValueField(2,index);
            double str4 = interactiveDoc.getValueField(numColumn,index);
            double str5 = interactiveDoc.getValueField(8,index);
            double str6 = interactiveDoc.getValueField(9,index);
            var raschet = ((str3*str4*12)+str5+str6)/1000;
                aserts.assertEquals(interactiveDoc.getValueField(10,index),interactiveDoc.formulaOkryglenie1(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldByPositionSalary(int numColumn) {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(7);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str3*str4*12;
            aserts.assertEquals(interactiveDoc.getValueField(7,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldTotal(int numColumn)  {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(6);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);
            interactiveDoc.setFieldSubform2Rio02(9,index);

            double str3 = interactiveDoc.getValueField(2,index);
            double str4 = interactiveDoc.getValueField(4,index);

            double str5 = interactiveDoc.getValueField(8,index);
            double str6 = interactiveDoc.getValueField(9,index);

            var raschet = (str3*str4*12)+str5+str6;
            aserts.assertEquals(interactiveDoc.getValueField(6,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldSalaryNew(int numColumn)  {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(5);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);
            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str4*str3;
            aserts.assertEquals(interactiveDoc.getValueField(5,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void proverka6(int numColumn){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);
            aserts.assertEquals(4,interactiveDoc.getScaleFieldSubform2Rio02(numColumn,index),"Ошибка в поле. Строка " + str2 + " Столбец " + str  );
        }
        aserts.assertAll();
    }
    public void proverka5(int numColumn){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);
            aserts.assertEquals(2,interactiveDoc.getScaleFieldSubform2Rio02(numColumn,index),"Ошибка в поле. Строка " + str2 + " Столбец " + str  );
        }
        aserts.assertAll();
    }
    public void proverka4(int numColumn){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);
            aserts.assertEquals(1,interactiveDoc.getScaleFieldSubform2Rio02(numColumn,index),"Ошибка в поле. Строка " + str2 + " Столбец " + str  );
        }
        aserts.assertAll();
    }
    public void proverka3(InteractiveDoc interactiveDoc,int numColumn){
        test2 aserts = new test2();

        for(var j = 1;j<=interactiveDoc.getKolStolbtsov();j++)
        {
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(j);
            aserts.assertFalse(interactiveDoc.hasReadonlyOnString(j,numColumn),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void proverkaSalary(InteractiveDoc interactiveDoc,int numColumn){
        test2 aserts = new test2();

        for(var j = 2;j<=interactiveDoc.getKolStolbtsov();j++)
        {

            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(j);
            aserts.assertTrue(interactiveDoc.hasReadonlyOnString(j,numColumn),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void proverka(InteractiveDoc interactiveDoc,int numColumn){
        test2 aserts = new test2();

        for(var j = 1;j<=interactiveDoc.getKolStolbtsov();j++)
        {

            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(j);
            aserts.assertTrue(interactiveDoc.hasReadonlyOnString(j,numColumn),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void zagruzkaDocumenta(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        String str = interactiveDoc.sozdanieNovDoc.getText();
        if (str.equals("Создание нового документа")){
            interactiveDoc.modalWindowButtonOK.click();
        }
    }

}

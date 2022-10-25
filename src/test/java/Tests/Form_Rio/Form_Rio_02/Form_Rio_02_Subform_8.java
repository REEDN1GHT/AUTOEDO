package Tests.Form_Rio.Form_Rio_02;

import Page.AuthEDO;
import Page.InteractiveDoc;
import Page.test2;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Form_Rio_02_Subform_8 extends TestBase {
    String nameSubform5 = "5. Расчет фонда оплаты труда по государственным гражданским служащим Санкт-Петербурга";
    String nameSubform6 = "6. Расчет фонда оплаты труда по работникам, замещающим должности, не являющиеся должностями государственной гражданской службы";
    String nameSubform7 = "7. Расчет фонда оплаты труда рабочих в органах государственной власти и иных органах Санкт-Петербурга";
    String nameSubform = "8. Расчет фонда оплаты труда по государственным гражданским служащим, работникам, замещающим должности, не являющиеся должностями государственной гражданской службы Санкт-Петербурга и рабочих в органах государственной власти, содержание которых, производится за счет средств федерального бюджета";
    @Test()
    public void interactivePage_CheckNameHederTableSubform8_NameHederTableSuccesful() throws InterruptedException {
        List<String> str = Arrays.asList("Наименования полномочия","Период","Фонд в год");
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        Thread.sleep(1000);
        interactiveDoc.setSubformRio00(nameSubform);
        Assert.assertEquals(interactiveDoc.proverka2(),str.toString(),"Ошибка");
    }
    @Test()
    public void interactivePage_CheckBunntonAddStringPresentTableSubform8_BunntonAddStringPresent() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        Assert.assertTrue(interactiveDoc.buttonAddStringPresented(),"Кнопки добавить строку нет на странице");
    }
    @Test()
    public void interactivePage_CheckGuideNamePokazatelSubform8_GuideNamePokazatelSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        String str =interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.namePokazatelSubform8);
        Assert.assertEquals(str,requests_02formRIO.CheckNamePokazatelSubform8(),"Справочник ЭДО и БД различаются");
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputNamePokazatelSubform8_NotAvailableManualInputNamePokazatelSuccesful() throws InterruptedException {
        test2 aserts = new test2();
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        aserts.assertTrue(interactiveDoc.hasReadonlyOnString(1,2),"Поле доступно для ввода. Столбец - Наименование показателя, строка 2");
        aserts.assertTrue(interactiveDoc.hasReadonlyOnString(1,3),"Поле доступно для ввода. Столбец - Наименование показателя, строка 3");
        aserts.assertAll();
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputPeriodSubform8_NotAvailableManualInputPeriod() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManuaFundInYearSubform8_NotAvailableManualInputFundInYear() throws InterruptedException {
        int numColumn = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesFundInYearSubform8_NumberDecimalPlacesFundInYearSuccesful() throws InterruptedException {
        int numColumn = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        proverka4(numColumn);
    }
    @Test()
    public void interactivePage_CheckNamePeriodTableSubform1_NameHederTableSuccesful() throws InterruptedException {
        List<String> str = Arrays.asList("2023","2024","2025");
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        interactiveDoc.setNamePokazatelSubform8NewRealiz02();
        Assert.assertEquals(interactiveDoc.proverkaColumnZnach(),str.toString(),"Ошибка");

    }
    @Test()
    public void interactivePage_CheckZnachFundInYear2023TableSubform8_ZnachFundInYearSuccesful() throws InterruptedException {
        int numString2023 = 1;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform5);
        float fundInYearSubform5 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform6);
        float fundInYearSubform6 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform7);
        float fundInYearSubform7 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        interactiveDoc.setNamePokazatelSubform8NewRealiz02();
        float sum = fundInYearSubform5+fundInYearSubform6+fundInYearSubform7;
        Assert.assertEquals(interactiveDoc.getLastField(numString2023),interactiveDoc.formulaOkryglenie1(sum),"Данные подтянулись не корректно");
    }
    @Test()
    public void interactivePage_CheckZnachFundInYear2024TableSubform8_ZnachFundInYearSuccesful() throws InterruptedException {
        int numString2023 = 2;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform5);
        float fundInYearSubform5 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform6);
        float fundInYearSubform6 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform7);
        float fundInYearSubform7 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        interactiveDoc.setNamePokazatelSubform8NewRealiz02();
        float sum = fundInYearSubform5+fundInYearSubform6+fundInYearSubform7;
        Assert.assertEquals(interactiveDoc.getLastField(numString2023),interactiveDoc.formulaOkryglenie1(sum),"Данные подтянулись не корректно");
    }
    @Test()
    public void interactivePage_CheckZnachFundInYear2025TableSubform8_ZnachFundInYearSuccesful() throws InterruptedException {
        int numString2023 = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform5);
        float fundInYearSubform5 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform6);
        float fundInYearSubform6 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform7);
        float fundInYearSubform7 = interactiveDoc.setAndGetField(numString2023);
        interactiveDoc.setSubformRio02(nameSubform);
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        interactiveDoc.setNamePokazatelSubform8NewRealiz02();
        float sum = fundInYearSubform5+fundInYearSubform6+fundInYearSubform7;
        Assert.assertEquals(interactiveDoc.getLastField(numString2023),interactiveDoc.formulaOkryglenie1(sum),"Данные подтянулись не корректно");
    }

    public void proverka(InteractiveDoc interactiveDoc,int numColumn){
        test2 aserts = new test2();

        for(var j = 1;j<=interactiveDoc.getKolStolbtsov();j++)
        {

            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(1);
            aserts.assertTrue(interactiveDoc.hasReadonlyOnString(j,numColumn),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void proverka4(int numColumn){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(1);
            aserts.assertEquals(1,interactiveDoc.getScaleFieldSubform2Rio02(numColumn,index),"Ошибка в поле. Строка " + str2 + " Столбец " + str  );
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

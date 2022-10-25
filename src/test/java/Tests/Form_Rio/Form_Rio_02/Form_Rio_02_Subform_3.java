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

public class Form_Rio_02_Subform_3 extends TestBase {
    @Test()
    public void interactivePage_CheckNotAvailableManualInputPeriodSubform3_NotAvailableManualInputPeriod() throws InterruptedException {
        int numColumn = 1;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputCalculatedUnitsSubform3_NotAvailableManualInputCalculatedUnits() throws InterruptedException {
        int numColumn = 2;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputFundSubform3_NotAvailableManualInputFund() throws InterruptedException {
        int numColumn = 5;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputTotalSubform3_NotAvailableManualInputTotal() throws InterruptedException {
        int numColumn = 6;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputForServiceSubform3_NotAvailableManualInputForService() throws InterruptedException {
        int numColumn = 7;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputForSpecialConditionsSubform3_NotAvailableManualInputForSpecialConditions() throws InterruptedException {
        int numColumn = 8;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputForWorkingWithSvedSubform3_NotAvailableManualInputForWorkingWithSved() throws InterruptedException {
        int numColumn = 9;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputEncouragementSubform3_NotAvailableManualInputEncouragement() throws InterruptedException {
        int numColumn = 10;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputOVZSubform3_NotAvailableManualInputOVZ() throws InterruptedException {
        int numColumn = 11;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputVacationSubform3_NotAvailableManualInputVacation() throws InterruptedException {
        int numColumn = 12;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }
    @Test()
    public void interactivePage_CheckNotAvailableManualInputFundInYearSubform3_NotAvailableManualInputFundInYear() throws InterruptedException {
        int numColumn = 13;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("4. Расчет фонда оплаты труда по государственным должностям");
        proverka(interactiveDoc,numColumn);
    }

    @Test()
    public void interactivePage_CheckNameHederTableSubform3_NameHederTableSuccesful() throws InterruptedException {
        List<String> str = Arrays.asList("Период","Расчетн.ед.","Численность","Оклад","Фонд","Всего","За выслугу","За особые усл.","За раб. со свед.","Поощрение","За вып. ОВЗ","Отпуск","Фонд в год");
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        Assert.assertEquals(interactiveDoc.proverka2(),str.toString(),"Ошибка");
    }

    @Test()
    public void interactivePage_CheckManualInpurTableSubform3_ManualInputTableSuccesful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka3(interactiveDoc);
        // Assert.assertEquals(proverka2(interactiveDoc),str.toString(),"Ошибка");
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesSettlementUnitSubform3_NumberDecimalPlacesSettlementUnitSuccesful() throws InterruptedException {
        int numColumn = 2;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka4(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesSalarySubform3_NumberDecimalPlacesSalarySuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
        //  aserts.assertAll();
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesFundSubform3_NumberDecimalPlacesFundSuccesful() throws InterruptedException {
        int numColumn = 5;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka4(numColumn);
        //  aserts.assertAll();
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesTotalSubform3_NumberDecimalPlacesTotalSuccesful() throws InterruptedException {
        int numColumn = 6;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka4(numColumn);
        // aserts.assertAll();

    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesForServiceSubform3_NumberDecimalPlacesForServiceSuccesful() throws InterruptedException {
        int numColumn = 7;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }

    @Test()
    public void interactivePage_CheckNumberDecimalPlacesforSpecialConditionsSubform3_NumberDecimalPlacesforSpecialConditionsSuccesful() throws InterruptedException {
        int numColumn = 8;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesForWorkingWithSvedSubform3_NumberDecimalPlacesForWorkingWithSvedSuccesful() throws InterruptedException {
        int numColumn = 9;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesEncouragementSubform3_NumberDecimalPlacesEncouragementSuccesful() throws InterruptedException {
        int numColumn = 10;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesOVZSubform3_NumberDecimalPlacesOVZSuccesful() throws InterruptedException {
        int numColumn = 11;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesVacationSubform3_NumberDecimalPlacesVacationSuccesful() throws InterruptedException {
        int numColumn = 12;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka5(numColumn);
    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesFundInYearSubform3_NumberDecimalPlacesFundInYearSuccesful() throws InterruptedException {
        int numColumn = 13;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        proverka4(numColumn);
    }

    @Test()
    public void interactivePage_CheckCalculationFieldFundSubform3_CalculationFieldFundSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldFund(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldTotalSubform3_CalculationFieldTotalSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldTotal(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldForServiceSubform3_CalculationFieldForServiceSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForSecrice(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldForSpecialConditionsSubform3_CalculationFieldForSpecialConditionsSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForSpecialConditions(numColumn);
    }

    @Test()
    public void interactivePage_CheckCalculationFieldForWorkingWithSvedSubform3_CalculationFieldForWorkingWithSvedSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForWorkingWithSvedConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldEncouragementSubform3_CalculationFieldForEncouragementSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForEncouragementConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldVacationSubform3_CalculationFieldForVacationSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForVacationConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldFundInYearSubform3_CalculationFieldForFundInYearSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForFundInYearConditions(numColumn);
    }

    @Test()
    public void interactivePage_CheckCalculationFieldOVZSubform3_CalculationFieldForOVZSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        assertFieldForOVZConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckNegativeTestFieldChislennostSubform3_NegativeTestFieldChislennostFundSuccesful() throws InterruptedException {
        int numColumn = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        // interactiveDoc.webElement.sendKeys("ewqdwqf");
        // Assert.assertEquals(interactiveDoc.webElement.getAttribute("value"),"0.00","Ошибка");
        assertFieldNegativeValue(numColumn);
    }
    @Test()
    public void interactivePage_CheckNegativeTestFieldSalarySubform3_NegativeTestFieldSalaryFundSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02("3. Расчет фонда оплаты труда Председателя Законодательного собрания Санкт-Петербурга");
        // interactiveDoc.webElement.sendKeys("ewqdwqf");
        // Assert.assertEquals(interactiveDoc.webElement.getAttribute("value"),"0.00","Ошибка");
        assertFieldNegativeValue(numColumn);
    }

    public void assertFieldForOVZConditions(int numColumn) throws InterruptedException {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(11);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(4,index);
            var raschet = str3*str4*1;
            aserts.assertEquals(interactiveDoc.getValueField(11,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldForFundInYearConditions(int numColumn) throws InterruptedException {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(13);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(5,index);
            double str3 = interactiveDoc.getValueField(6,index);
            var raschet = str3+str4;
            aserts.assertEquals(interactiveDoc.getValueField(13,index),interactiveDoc.formulaOkryglenie1(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldForVacationConditions(int numColumn) throws InterruptedException {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(11);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str3*str4*3;
            aserts.assertEquals(interactiveDoc.getValueField(12,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldForEncouragementConditions(int numColumn)  {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(10);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str3*str4*4;
            aserts.assertEquals(interactiveDoc.getValueField(10,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldForWorkingWithSvedConditions(int numColumn) {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();

        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(9);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str3*str4*9;
            aserts.assertEquals(interactiveDoc.getValueField(9,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }

    public void assertFieldForSpecialConditions(int numColumn) {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++)
        {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(8);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);

            interactiveDoc.setFieldSubform2Rio02(numColumn,index);

            double str4 = interactiveDoc.getValueField(2,index);
            double str3 = interactiveDoc.getValueField(numColumn,index);
            var raschet = str3*str4*10;
            aserts.assertEquals(interactiveDoc.getValueField(8,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }

    public void assertFieldForSecrice(int numColumn)  {
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
            var raschet = str3*str4*2;
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
            double str3 = interactiveDoc.getValueField(7,index);
            double str4 = interactiveDoc.getValueField(8,index);
            double str5 = interactiveDoc.getValueField(9,index);
            double str6 = interactiveDoc.getValueField(10,index);
            double str7 = interactiveDoc.getValueField(11,index);
            double str8 = interactiveDoc.getValueField(12,index);
            var raschet = (str3+str4+str5+str6+str7+str8)/1000;
            aserts.assertEquals(interactiveDoc.getValueField(6,index),interactiveDoc.formulaOkryglenie1(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }

    public void assertFieldFund(int numColumn)  {
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
            var raschet = str4*str3*12/1000;
            aserts.assertEquals(interactiveDoc.getValueField(5,index),interactiveDoc.formulaOkryglenie1(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }

    public void assertFieldNegativeValue(int numColumn){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        test2 aserts = new test2();
        for(var index = 1;index<=interactiveDoc.getKolStolbtsov();index++) {
            //для вывода нормальной ошибки
            String str = interactiveDoc.getNameFieldColumnSubform2Rio02(numColumn);
            String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(index);
            String str3 = interactiveDoc.getFieldNegativeValueSubform2Rio02(numColumn, index);
            interactiveDoc.setFieldNegativeSubform2Rio02(numColumn, index);
            aserts.assertEquals(str3,interactiveDoc.getFieldNegativeValueSubform2Rio02(numColumn, index),"Поле доступно для ввода символов. Строка " + str2 + " Столбец " + str);

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
    public void proverka3(InteractiveDoc interactiveDoc){
        test2 aserts = new test2();
        for (var i=3;i<=4;i++)
        {

            for(var j = 1;j<=interactiveDoc.getKolStolbtsov();j++)
            {
                String str = interactiveDoc.getNameFieldColumnSubform2Rio02(i);
                String str2 = interactiveDoc.getNameFieldStringSubform2Rio02(j);
                aserts.assertFalse(interactiveDoc.hasReadonlyOnString(j,i),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
            }}
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

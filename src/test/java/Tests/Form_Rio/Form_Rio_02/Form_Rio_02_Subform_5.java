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

public class Form_Rio_02_Subform_5 extends TestBase {
    String nameSubform = "5. Расчет фонда оплаты труда по государственным гражданским служащим Санкт-Петербурга";
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
    public void interactivePage_CheckNotAvailableManualInputCalculatedUnitsSubform2_NotAvailableManualInputCalculatedUnits() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManualInputFundSubform2_NotAvailableManualInputFund() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManualInputPerClassRankSubform2_NotAvailableManualInputPerClassRank() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManualInputForServiceSubform2_NotAvailableManualInputForService() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManualInputForSpecialConditionsSubform2_NotAvailableManualInputForSpecialConditions() throws InterruptedException {
        int numColumn = 9;
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
    public void interactivePage_CheckNotAvailableManualInputForWorkingWithSvedSubform2_NotAvailableManualInputForWorkingWithSved() throws InterruptedException {
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
    public void interactivePage_CheckNotAvailableManualInputEncouragementSubform2_NotAvailableManualInputEncouragement() throws InterruptedException {
        int numColumn = 11;
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
    public void interactivePage_CheckNotAvailableManualInputOVZSubform2_NotAvailableManualInputOVZ() throws InterruptedException {
        int numColumn = 12;
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
    public void interactivePage_CheckNotAvailableManualInputVacationSubform2_NotAvailableManualInputVacation() throws InterruptedException {
        int numColumn = 13;
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
        int numColumn = 14;
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
    public void interactivePage_CheckNameHederTableSubform2_NameHederTableSuccesful() throws InterruptedException {
        List<String> str = Arrays.asList("Период","Расчетн.ед.","Численность","Оклад","Фонд","Всего","За выслугу","За особые усл.","За раб. со свед.","Поощрение","За вып. ОВЗ","Отпуск","Фонд в год");
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
    public void interactivePage_CheckManualInpurTableSubform2_ManualInputTableSuccesful() throws InterruptedException {
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
    public void interactivePage_CheckManualInpurSalarySubform2_ManualInputSalarySuccesful() throws InterruptedException {
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
    public void interactivePage_CheckManualInpurExpenseOfFBFundsSubform2_ManualInputSalaryExpenseOfFBFunds() throws InterruptedException {
        int numColumn = 15;
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
    public void interactivePage_CheckNumberDecimalPlacesSettlementUnitSubform2_NumberDecimalPlacesSettlementUnitSuccesful() throws InterruptedException {
        int numColumn = 2;
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
    public void interactivePage_CheckNumberDecimalPlacesFundSubform2_NumberDecimalPlacesFundSuccesful() throws InterruptedException {
        int numColumn = 5;
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
        proverka4(numColumn);

    }
    @Test()
    public void interactivePage_CheckNumberDecimalPlacesPerClassRankSubform2_NumberDecimalPlacesPerClassRankSuccesful() throws InterruptedException {
        int numColumn = 7;
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
    public void interactivePage_CheckNumberDecimalPlacesForServiceSubform2_NumberDecimalPlacesForServiceSuccesful() throws InterruptedException {
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
    public void interactivePage_CheckNumberDecimalPlacesforSpecialConditionsSubform2_NumberDecimalPlacesforSpecialConditionsSuccesful() throws InterruptedException {
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
    public void interactivePage_CheckNumberDecimalPlacesForWorkingWithSvedSubform2_NumberDecimalPlacesForWorkingWithSvedSuccesful() throws InterruptedException {
        int numColumn = 10;
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
    public void interactivePage_CheckNumberDecimalPlacesEncouragementSubform2_NumberDecimalPlacesEncouragementSuccesful() throws InterruptedException {
        int numColumn = 11;
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
    public void interactivePage_CheckNumberDecimalPlacesOVZSubform2_NumberDecimalPlacesOVZSuccesful() throws InterruptedException {
        int numColumn = 12;
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
    public void interactivePage_CheckNumberDecimalPlacesVacationSubform2_NumberDecimalPlacesVacationSuccesful() throws InterruptedException {
        int numColumn = 13;
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
        int numColumn = 14;
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
    public void interactivePage_CheckNumberDecimalPlacesExpenseOfFBFundsSubform2_NumberDecimalPlacesExpenseOfFBFunds() throws InterruptedException {
        int numColumn = 15;
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
    public void interactivePage_CheckNegativeTestFieldChislennostSubform2_NegativeTestFieldChislennostFundSuccesful() throws InterruptedException {
        int numColumn = 3;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldNegativeValue(numColumn);
    }
    @Test()
    public void interactivePage_CheckNegativeTestPlacesExpenseOfFBFundsSubform2_NegativeTestFieldPlacesExpenseOfFBFunds() throws InterruptedException {
        int numColumn = 15;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);

        assertFieldNegativeValue(numColumn);
    }
    @Test()
    public void interactivePage_CheckNegativeTestFieldSalarySubform2_NegativeTestFieldSalaryFundSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldNegativeValue(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldFundSubform2_CalculationFieldFundSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldFund(numColumn);
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
    public void interactivePage_CheckCalculationFieldPerClassRankSubform2_CalculationFieldPerClassRank() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldPerClassRank(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldForServiceSubform2_CalculationFieldForServiceSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForSecrice(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldForSpecialConditionsSubform2_CalculationFieldForSpecialConditionsSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForSpecialConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldForWorkingWithSvedSubform2_CalculationFieldForWorkingWithSvedSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForWorkingWithSvedConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldEncouragementSubform2_CalculationFieldForEncouragementSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForEncouragementConditions(numColumn);
    }
    @Test()
    public void interactivePage_CheckCalculationFieldVacationSubform2_CalculationFieldForVacationSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForVacationConditions(numColumn);
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
    public void interactivePage_CheckCalculationFieldOVZSubform2_CalculationFieldForOVZSuccesful() throws InterruptedException {
        int numColumn = 4;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.setSubformRio02(nameSubform);
        assertFieldForOVZConditions(numColumn);
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
            aserts.assertEquals(interactiveDoc.getValueField(13,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
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
            var raschet = str3*str4*4.25;
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
            var raschet = str3*str4*6;
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
            var raschet = str3*str4*1.5;
            aserts.assertEquals(interactiveDoc.getValueField(9,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
        }
        aserts.assertAll();
    }
    public void assertFieldPerClassRank(int numColumn) {
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
            var raschet = str3*str4*5;
            aserts.assertEquals(interactiveDoc.getValueField(8,index),interactiveDoc.formulaOkruglenie2(raschet),"Ошибка в поле. Строка " + str2 + " Столбец " + str );
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
            var raschet = str3*str4*8;
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
            var raschet = str3*str4*3;
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
            double str9 = interactiveDoc.getValueField(13,index);
            var raschet = (str3+str4+str5+str6+str7+str8+str9)/1000;
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

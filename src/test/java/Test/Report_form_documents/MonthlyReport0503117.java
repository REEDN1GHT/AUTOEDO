package Test.Report_form_documents;

import Page.CabinetPage;
import Page.InteractiveDoc;
import Page.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Test.TestBase;
import org.openqa.selenium.WebElement;

public class MonthlyReport0503117 extends TestBase {
    String message = "Справочник ЭДО не соответствует справочнику в БД";
    //BD con;


    //подотчет (0503117) Отчет об исполнении. Доходы

    //Справочник АДМ
    @Test
    public void interactivePage_CheckGuideAdm_GuideAdmCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
       // mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Доходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.valuesADM(),request.checkIsADMExist(),message);
    }

    //Справочник Код дохода
    @Test
    public void interactivePage_CheckGuideKodDoxod_GuideKodDoxodCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Доходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.kodDoxoda(),request.checkKodDoxodaDoxod(),message);

    }

    //подотчет (0503117) Отчет об исполнении. Расходы

    //Справочник АДМ
    @Test
    public void interactivePage_CheckGuideKodAdmRasxod_GuideKodAdmRasxodCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.valuesADM(),request.checkADM(),message);

        //System.out.println();

    }
    //Справочник Раздел расхода
    @Test
    public void interactivePage_CheckGuideKodRazdelRasxod_GuideKodAdmRazdelCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.RazdelRasxod(),request.checkIsDocExist(),message);


    }
    //Справочник Целевая статья
    @Test
    public void interactivePage_CheckGuideKodTselevaiaRasxod_GuideKodAdmTselevaiaCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.TselevaiaRasxod(),request.TselevaiaRasxod(),message);
        // System.out.println(docPage.TselevaiaRasxod());
    }
    //Справочник Целевая ст. МО
    @Test
    public void interactivePage_CheckGuideKodTselevaiaMORasxod_GuideKodAdmTselevaiaMOCorrect() throws InterruptedException {
            MainPage mainPage = new MainPage(driver, wait);
           mainPage.open();
           mainPage.buttonEnterMainPage.click();
          mainPage.authorization("MO_022", "Сотрудник Администрации МО");
           CabinetPage cabinetPage = new CabinetPage(driver, wait);
           cabinetPage.createDocument();
           cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
           cabinetPage.clickCreate();
           InteractiveDoc docPage = new InteractiveDoc(driver, wait);
           docPage.setPeriod();
           docPage.loaderDoc();
           docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
         docPage.setAddString();
        Assertions.assertEquals(docPage.TselevaiaMORasxod(),request.TselevaiaMORasxod(),message);
       // System.out.println(con.TselevaiaMORasxod());
    }

    //Справочник Вид расходов
    @Test
    public void interactivePage_CheckGuideKodVIRasxod_GuideKodVICorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.VIRasxod(),request.viRasxod(),message);

    }

    //Справочик КОСГУ
    @Test
    public void interactivePage_CheckGuideKosgyRasxod_GuideKodKosgyCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Расходы");
        docPage.setAddString();
        Assertions.assertEquals(docPage.KosgyRasxod(),request.kosgyRasxod(),message);
    }

    //подотчет (0503117) Отчет об исполнении. Источники

    //Справочник АДМ
    @Test
    public void interactivePage_CheckGuideAdmIstochnick_GuideAdmCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Источники");
        docPage.setAddString();
        Assertions.assertEquals(docPage.valuesADM(),request.checkIsADMIstochnick(),message);
    }

    //Справочник Код источника
    @Test
    public void interactivePage_CheckGuideKodIstochnick_GuideAdmCorrect() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.open();
        mainPage.buttonEnterMainPage.click();
        mainPage.authorization("MO_022", "Сотрудник Администрации МО");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Месячный отчет по форме «(0503117) Отчет об исполнении бюджета»");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setPeriod();
        docPage.loaderDoc();
        docPage.setPodotchet_doxod("(0503117) Отчет об исполнении. Источники");
        docPage.setAddString();
        Assertions.assertEquals(docPage.kodDoxoda(),request.checkIsKodIstochnick(),message);
    }

}

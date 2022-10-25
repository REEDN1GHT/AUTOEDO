package Tests.Form_Rio.Form_Rio_02;

import Page.AuthEDO;
import Page.InteractiveDoc;
import Resources.ConfigBuilder;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Form_Rio_02_Subform_1 extends TestBase {
    String nameSubform = "1. Объем бюджетных ассигнований на фонд оплаты труда";
    @Test()
    public void interactivePage_CheckNameHederTableSubform1_NameHederTableSuccesful() {
        List<String> str = Arrays.asList("","Наименование показателя","2021","2022","2023","2024","2025");
        ConfigBuilder.setproperty("yearFormRIO","2023");
        ConfigBuilder.setproperty("stageFormRIO","01");
        ConfigBuilder.setproperty("kbkFormRIO","0113 9910000090 121");
        ConfigBuilder.setproperty("NUMBERFormRIO","01");

        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        Assert.assertEquals(interactiveDoc.proverka2(),str.toString(),"Ошибка");
    }

    @Test
    public void interactivePage_CheckGuideNameIndicatorSubform1_NameIndicatorSuscessful()
    {
        ConfigBuilder.setproperty("yearFormRIO","2023");
        ConfigBuilder.setproperty("stageFormRIO","01");
        ConfigBuilder.setproperty("kbkFormRIO","0113 9910000090 121");
        ConfigBuilder.setproperty("NUMBERFormRIO","01");
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.buttonAddNewStringNewRealiz.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.elementNameIndicator),requests_02formRIO.CheckNamePokazatelSubform1(),"Ошибка");

    }


    public void zagruzkaDocumenta(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        String str = interactiveDoc.sozdanieNovDoc.getText();
        if (str.equals("Создание нового документа")){
            interactiveDoc.modalWindowButtonOK.click();
        }
    }
}

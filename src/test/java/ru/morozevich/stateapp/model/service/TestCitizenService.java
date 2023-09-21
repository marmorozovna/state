package ru.morozevich.stateapp.model.service;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.morozevich.stateapp.model.entity.Citizen;

import java.util.ArrayList;
import java.util.List;

public class TestCitizenService {

    @DataProvider(name = "citizenListDataProvider")
    public static Object [][] createTestDataList (){
        Citizen citizen1 = new Citizen(89, "maichdlsn");
        Citizen citizen2 = new Citizen(45, "ofbwc");
        Citizen citizen3 = new Citizen(20, "wmbjgd");
        Citizen citizen4 = new Citizen(11, "msdfjkdlv");
        Citizen citizen5 = new Citizen(79, "aichd");
        ArrayList<Citizen> stateCitizen = new ArrayList<>(List.of(citizen1,citizen2,citizen3,citizen4,citizen5));
        ArrayList<Citizen> expected = new ArrayList<>(List.of(citizen1,citizen4));
        return new Object[][]{
                {stateCitizen,expected}
        };
    }

    @DataProvider(name = "citizenAvAgeDataProvider")
    public static Object [][] createTestDataAvAge (){
        Citizen citizen1 = new Citizen(89, "maichdlsn");
        Citizen citizen2 = new Citizen(45, "ofbwc");
        Citizen citizen3 = new Citizen(20, "wmbjgd");
        Citizen citizen4 = new Citizen(11, "msdfjkdlv");
        Citizen citizen5 = new Citizen(79, "aichd");
        ArrayList<Citizen> stateCitizen = new ArrayList<>(List.of(citizen1,citizen2,citizen3,citizen4,citizen5));
        return new Object[][]{
                {stateCitizen,48.8}
        };
    }

    @Test(dataProvider = "citizenAvAgeDataProvider")
    public void testGetAverageAge(ArrayList<Citizen> in, double expected) {
        double actual = CitizenService.getAverageAge(in);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "citizenListDataProvider")
    public void TestListCitizenWishedLetterNew(ArrayList<Citizen> in, ArrayList<Citizen> expected) {
        ArrayList<Citizen> actual = CitizenService.listCitizenWishedLetter('m', in);
        Assert.assertEquals(actual, expected);
    }
    @Test(dataProvider = "citizenListDataProvider")
    public void TestListCitizenWishedQuantityLetNew(ArrayList<Citizen> in, ArrayList<Citizen> expected) {
        ArrayList<Citizen> actual = CitizenService.listCitizenWishedQuantityLet(9, in);
        Assert.assertEquals(actual, expected);
    }
}
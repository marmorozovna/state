package ru.morozevich.stateapp.model.service;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.morozevich.stateapp.model.entity.Citizen;

import java.util.ArrayList;


public class TestState {

    @BeforeTest()
    public void testSetup() {
        Citizen citizen1 = new Citizen(89, "maichdlsn");
        Citizen citizen2 = new Citizen(45, "ofbwc");
        Citizen citizen3 = new Citizen(20, "fwmbjgd");
        Citizen citizen4 = new Citizen(11, "msdfjkdlv");
        Citizen citizen5 = new Citizen(79, "aichdlsnpdirgdp");
    }
    @Test()
    public void testGetAverageAge() {
        double actual = CitizenService.getAverageAge();
        double expected = 48.8;
        Assert.assertEquals(actual,expected);
    }
}
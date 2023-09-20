package ru.morozevich.stateapp.model.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.morozevich.stateapp.model.entity.Citizen;
import java.util.HashSet;


public class TestState {

    @Test()
    public void testGetAverageAge() {
        Citizen citizen1 = new Citizen(89, "maichdlsn");
        Citizen citizen2 = new Citizen(45, "ofbwc");
        Citizen citizen3 = new Citizen(20, "fwmbjgd");
        Citizen citizen4 = new Citizen(11, "msdfjkdlv");
        Citizen citizen5 = new Citizen(79, "aichdlsnpdirgdp");
        HashSet<Citizen> stateCitizen = new HashSet<>();
        stateCitizen.add(citizen1);
        stateCitizen.add(citizen2);
        stateCitizen.add(citizen3);
        stateCitizen.add(citizen4);
        stateCitizen.add(citizen5);
        double actual = CitizenService.getAverageAge(stateCitizen);
        double expected = 48.8;
        Assert.assertEquals(actual, expected);
    }
}
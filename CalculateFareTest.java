package com.cabinvoicegenerator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculateFareTest {
    CalculateFare calculateFare = new CalculateFare();
    @Before
    public void printBeforeTestcase(){
        System.out.println("welcome to cab invoice generator");
    }
    @After
    public void printIfEachTestCasePassed(){
        System.out.println("Test case is passed");
    }
    @Test
    public void providedDistanceandTime_return_Fare(){
        double distance = 2.5;
        double time = 5.0;
        double fare = calculateFare.travelExpense(distance,time);
        Assert.assertEquals(30.0,fare,0.0);
    }
    @Test
    public void providedDistanceandTime_return_minFare(){
        double distance = 1;
        double time = 2.0;
        double fare = calculateFare.travelExpense(distance,time);
        Assert.assertEquals(10,fare,0.0);
    }
}

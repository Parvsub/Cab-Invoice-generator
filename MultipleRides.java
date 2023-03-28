package com.cabinvoicegenerator;

import java.util.Scanner;

public class MultipleRides {
    double distance;
    double time;
    private static final double minCostPerKm = 10;
    private static final double costForTime = 1;

    public double RideOne() {
        double distance = 15.3;
        int time = 20;
        double ride1 = distance * minCostPerKm + time * costForTime;
        System.out.println(ride1);
        return ride1;
    }
    public double RideTwo(){
        double distance = 11.0;
        int time = 15;
        double ride2 = distance * minCostPerKm + time * costForTime;
        System.out.println(ride2);
        return ride2;
    }
    public static void main(String[] args) {
        MultipleRides rides = new MultipleRides();
        rides.RideOne();
        rides.RideTwo();
    }
}

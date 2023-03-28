package com.cabinvoicegenerator;

import java.util.HashMap;

public class InvoiceGeneratorCalculation {
    HashMap<Integer, Ride[]> rideRepository = new HashMap<>();
    private static final int COST_PER_TIME = 1;
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        System.out.println(totalFare);
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
            System.out.println(totalFare);
        }
        return totalFare;
    }

    public InvoiceGenerator calculateFare(int userid, Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
            System.out.println(totalFare);
        }
        rideRepository.put(userid, rides);
        return new InvoiceGenerator(userid, rides.length, totalFare);
    }

    public static void main(String[] args) {
        InvoiceGeneratorCalculation invoiceObj = new InvoiceGeneratorCalculation();
        invoiceObj.calculateFare(12, 9);
        invoiceObj.calculateFare(3, 20);
        invoiceObj.calculateFare(12312, 2);
    }
}

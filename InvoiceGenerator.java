package com.cabinvoicegenerator;

public class InvoiceGenerator {
    private final int userId;
    private final int numberOfRides;
    private final double totalFare;
    private double averageFare;

    public InvoiceGenerator(int userId, int numberOfRides, double totalFare) {
        this.userId = userId;
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    public int getUserId() {
        return userId;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFare() {
        return averageFare;
    }

    @Override
    public String toString() {
        return "InvoiceGenerator{" +
                "userId=" + userId +
                ", numberOfRides=" + numberOfRides +
                ", totalFare=" + totalFare +
                ", averageFare=" + averageFare +
                '}';
    }
}





package com.cabinvoicegenerator;

public class CalculateFare {
    private static final double minCostPerKm = 10;
    private static final double costForTime = 1;
    private static final double minAmount = 5;

    public double travelExpense(double distance, double time) {
        double cost = distance * minCostPerKm + time * costForTime;
        if (cost < minAmount) {
            return minAmount;
        }
        System.out.println(minAmount);
        System.out.println(cost);
        return cost;
    }

    public static void main(String[] args) {
        CalculateFare calculateFare = new CalculateFare();
        calculateFare.travelExpense(8,20);
    }
}


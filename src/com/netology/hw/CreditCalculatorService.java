package com.netology.hw;

public class CreditCalculatorService {
    public double calculate (double creditAmount, double periodYears, double percentage){

        return (creditAmount * (percentage / 12) * (Math.pow((1 + percentage / 12), (periodYears * 12)))) / ((Math.pow((1 + percentage / 12), (periodYears * 12))) - 1);
        //double coefficient = (percentage * (Math.pow((1 + percentage), periodYears * 12)) / ((Math.pow((1 + percentage), periodYears * 12)) - 1));
        // return coefficient * creditAmount;
        //return (creditAmount * (percentage / (12 * 100))) / (1 - Math.pow((1 + (percentage / (12 * 100))), -percentage*12));
    }
}

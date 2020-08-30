package com.netology.hw;

public class Main {

    public static void main(String[] args) {

        CreditCalculatorService service = new CreditCalculatorService();
        double payment1 = service.calculate(1_000_000,1, 9.99);
        System.out.println(payment1);

        double payment2 = service.calculate(1_000_000,2, 9.99);
        System.out.println(payment2);

        double payment3 = service.calculate(1_000_000,3, 9.99);
        System.out.println(payment3);
    }
}

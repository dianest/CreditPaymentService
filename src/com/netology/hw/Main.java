package com.netology.hw;

public class Main {

    public static void main(String[] args) {

        CreditCalculatorService service = new CreditCalculatorService();
        double payment1 = service.calculate(1_000_000,1, 0.0999);
        System.out.println(payment1);

        double payment2 = service.calculate(1_000_000,2, 0.0999);
        System.out.println(payment2);

        double payment3 = service.calculate(1_000_000,3, 0.0999);
        System.out.println(payment3);
    }
}

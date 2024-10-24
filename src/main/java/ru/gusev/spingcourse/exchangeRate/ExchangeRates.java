package ru.gusev.spingcourse.exchangeRate;

import java.util.Scanner;

public class ExchangeRates {
    private static final double eurRate = 104.51;
    private static final double usdRate = 96.74;
    private static final double gbpRare = 125.26;
    private static final double cnyRate = 13.53;
    private static final double jpyRate = 0.63;

    public static void main(String[] args) {



        int x = 0;
        while (x != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("В какую валюту конвентируем?");
            System.out.println("1 - в евро.");
            System.out.println("2 - в доллары.");
            System.out.println("3 - в фунты.");
            System.out.println("4 - в китайский юань.");
            System.out.println("5 - в японскую йену.");
            System.out.println("6 - Выход.");

            int sc = scanner.nextInt();
            switch (sc){
                case 1:
                    System.out.print("Введите сумму: ");
                    double moneyEur = scanner.nextDouble();
                    moneyEur /= eurRate;
                    System.out.println("Ваша сумма в евро " + moneyEur);
                    break;
                case 2:
                    System.out.print("Введите сумму: ");
                    double moneyUsd = scanner.nextDouble();
                    moneyUsd /= usdRate;
                    System.out.println("Ваша сумма в долларах " + moneyUsd);
                    break;
                case 3:
                    System.out.print("Введите сумму: ");
                    double moneyGbp = scanner.nextDouble();
                    moneyGbp /= gbpRare;
                    System.out.println("Ваша сумма в фунтах " + moneyGbp);
                    break;
                case 4:
                    System.out.print("Введите сумму: ");
                    double moneyCny = scanner.nextDouble();
                    moneyCny /= cnyRate;
                    System.out.println("Ваша сумма в китайских юанях " + moneyCny);
                    break;
                case 5:
                    System.out.print("Введите сумму: ");
                    double moneyJpy = scanner.nextDouble();
                    moneyJpy /= jpyRate;
                    System.out.println("Ваша сумма в японских йенах " + moneyJpy);
                    break;
                case 6:
                    x = 6;
                    System.out.println("Вы вышли!");
                    break;
                default:
                    System.out.println("Некорректное значение!");
            }



        }

    }
}
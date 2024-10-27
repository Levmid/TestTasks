package exchangeRate;

import java.util.Scanner;

public class ExchangeRates {
    private static final double eurRate = 104.51;
    private static final double usdRate = 96.74;
    private static final double gbpRare = 125.26;
    private static final double cnyRate = 13.53;
    private static final double jpyRate = 0.63;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int x = 0;
        while (x != 7) {
            System.out.println("\nВ какую валюту конвентируем? " +
                    "\n1 - в евро." +
                    "\n2 - в доллары." +
                    "\n3 - в фунты." +
                    "\n4 - в китайский юань." +
                    "\n5 - в японскую йену." +
                    "\n6 - во все вышеперечисленные валюты." +
                    "\n7 - Выход.");

            System.out.print("Введите цифру: ");
            int sc = scanner.nextInt();
            System.out.println();

            switch (sc){
                case 1:
                    maneyTo(eurRate);
                    break;
                case 2:
                    maneyTo(usdRate);
                    break;
                case 3:
                    maneyTo(gbpRare);
                    break;
                case 4:
                    maneyTo(cnyRate);
                    break;
                case 5:
                    maneyTo(jpyRate);
                    break;
                case 6:

                    maneyToAll(eurRate, usdRate, gbpRare, cnyRate, jpyRate);

                    break;
                case 7:
                    x = 7;
                    System.out.println("Вы вышли!");
                    break;
                default:
                    System.out.println("Некорректное значение!");
            }
        }
    }
    static void maneyTo(double rate){
        System.out.print("Введите сумму: ");
        double money = scanner.nextDouble();
        money /= rate;
        System.out.println("Ваша сумма в евро " + money);
    }
    static void maneyToAll(double eur, double usd, double gbp, double cny, double jpy){
        System.out.print("Введите сумму: ");
        double money1, money2, money3, money4, money5;
        money1 = money2 = money3 = money4 = money5  = scanner.nextDouble();
        money1 /= eur;
        money2 /= usd;
        money3 /= gbp;
        money4 /= cny;
        money5 /= jpy;
        System.out.println("Ваша сумма в евро: " + money1
                + "\nВаша сумма в долларах: " + money2
                + "\nВаша сумма в фунтах: " + money3
                + "\nВаша сумма в китайских юанях: " + money4
                + "\nВаша сумма в китайских юанях: " + money4
                + "\nВаша сумма в японских йенах: " + money5);
    }
}
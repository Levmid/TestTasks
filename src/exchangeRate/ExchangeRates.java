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
            System.out.print("Введите сумму: ");
            double money = scanner.nextDouble();

            switch (sc){
                case 1:
                    System.out.println("Ваша сумма в евро: "  + money / eurRate);
                    break;
                case 2:
                    System.out.println("Ваша сумма в доллары: "  + money / usdRate);
                    break;
                case 3:
                    System.out.println("Ваша сумма в фунты: "  + money / gbpRare);
                    break;
                case 4:
                    System.out.println("Ваша сумма в китайский юань: "  + money / cnyRate);
                    break;
                case 5:
                    System.out.println("Ваша сумма в японскую йену: "  + money / jpyRate);
                    break;
                case 6:
                    System.out.println("Ваша сумма в евро: " + money/eurRate
                            + "\nВаша сумма в долларах: " + money/usdRate
                            + "\nВаша сумма в фунтах: " + money/gbpRare
                            + "\nВаша сумма в китайских юанях: " + money/cnyRate
                            + "\nВаша сумма в японских йенах: " + money/jpyRate);
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
}
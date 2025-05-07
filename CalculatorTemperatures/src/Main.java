import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        F = (C * 1,8) + 32 - формула перевода градусов Цельсия в градусы Фаренгейта
//        C = (F — 32) / 1,8 - формула перевода градусов Фаренгейта в градусы Цельсия

        System.out.println();
        System.out.println("Калькулятор перевода температур по шкале Фаренгейта и по шкале Цельсия");
        System.out.println();
        System.out.print("Введите значение температуры по Цельсию: ");
        double tC = new Scanner(System.in).nextDouble();
        System.out.println("Перевод градусов Цельсия в градусы Фаренгейта: " + ((tC * 1.8) + 32));
        System.out.println();
        System.out.print("Введите значение температуры по Фаренгейту: ");
        double tF = new Scanner(System.in).nextDouble();
        System.out.println("Перевод градусов Фаренгейта в градусы Цельсия: " + ((tF - 32) / 1.8));





    }
}

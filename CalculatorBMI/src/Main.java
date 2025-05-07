import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* BMI (ИМТ) индекс массы тела — величина, позволяющая оценить степень соответствия массы человека и его роста
         и тем самым косвенно судить о том, является ли масса недостаточной, нормальной или избыточной */

        System.out.println();
        System.out.println("***** Калькулятор индекса массы тела \"BMI\" *****");
        System.out.println();
        System.out.print("1. Введите ваш вес в килограммах: ");
        double weight = new Scanner(System.in).nextDouble();

        System.out.print("2. Введите ваш рост в метрах: ");
        double height = new Scanner(System.in).nextDouble();

        System.out.println();
        System.out.println("Ваш BMI (индекс массы тела) равен: ");
        System.out.println(weight / (height * height));
        System.out.println("Оценка:\nУ 18–30 (летних) считается нормой индекс 18.5–22.9, у людей старше 30 лет норма 20–24,9.");




    }
}

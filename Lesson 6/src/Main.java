import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        > - строго больше
//        < - строго меньше
//        == - равно (сравнение)
//        >= - больше или равно (не строгая больше)
//        <= - меньше или равно (не строгая меньше)
//        != - не равно

//        System.out.println(5 == 5);
        System.out.print("Введите число: ");

        int a = new Scanner(System.in).nextInt();

        if (a > 5){
            System.out.println("Hello World");
        }
        if (a <  5) {
            System.out.println("Goodbye World");
        }
    }
}

import java.util.Scanner;
public class Monthsbynumber {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца, чтобы получить название месяца");
        int monthName = in.nextInt();
        int mont = monthName;
        if (mont <=0) {
            System.out.println("Введите число от 1 до 12");
        }
        else if (mont >=13) {
            System.out.println("Введите число от 1 до 12");
        }
        else if (mont == 1) {
            System.out.println("Месяц: Январь");
        }
        else if (mont == 2) {
            System.out.println("Месяц: Февраль");
        }
        else if (mont == 3) {
            System.out.println("Месяц: Март");
        }
        else if (mont == 4) {
            System.out.println("Месяц: Апрель");
        }
        else if (mont == 5) {
            System.out.println("Месяц: Май");
        }
        else if (mont == 6) {
            System.out.println("Месяц: Июнь");
        }
        else if (mont == 7) {
            System.out.println("Месяц: Июль");
        }
        else if (mont == 8) {
            System.out.println("Месяц: Август");
        }
        else if (mont == 9) {
            System.out.println("Месяц: Сентябрь");
        }
        else if (mont == 10) {
            System.out.println("Месяц: Октябрь");
        }
        else if (mont == 11) {
            System.out.println("Месяц: Ноябрь");
        }
        else if (mont == 12) {
            System.out.println("Месяц: Декабрь");
        }
    }
}
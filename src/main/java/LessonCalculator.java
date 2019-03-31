import java.util.Scanner;

public class LessonCalculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);
        double num1, num2, num3, result1, result2, result3, result4;

        System.out.println("Введите первое число: ");
        num1 = Calculator.nextDouble();
        System.out.println("Введите второе число: ");
        num2 = Calculator.nextDouble();
        System.out.println("Выберите действие: 1 - сложить, 2 - вычесть, 3 - умножить, 4 - разделить");
        num3 = Calculator.nextDouble();

        result1 = num1 + num2;
        result2 = num1 - num2;
        result3 = num1 * num2;
        result4 = num1 / num2;

        if (num3==1) {
            System.out.println(result1);
        }
        if (num3==2) {
            System.out.println(result2);
        }
        if (num3==3) {
            System.out.println(result3);
        }
        if (num3==4) {
            System.out.println(result4);
        }
    }
}
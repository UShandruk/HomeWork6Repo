//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4)
        {
            System.out.println(i + " год является високосным.");
        }
        System.out.println("");

        System.out.println("Задача 6");

        for (int i = 7; i < 99; i = i + 7)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 7");

        for (int i = 1; i < 513; i = i*2)
        {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Задача 8");

        int monthTotal8 = 12;
        int amountMonth8 = 29000;
        int amountTotal8 = 0;

        for (int month = 1; month <= monthTotal8; month++)
        {
            amountTotal8 = amountTotal8 + amountMonth8;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountTotal8 + " рублей.");
        }
        System.out.println("");

        System.out.println("Задача 9");
        int monthTotal9 = 4; // количество месяцев вклада
        float amountStart9 = 9500; // начальная сумма вклада
        float percent = 1.12f;
        float amountTotal9 = amountStart9;

        for (int month = 1; month <= monthTotal9; month++)
        {
            amountTotal9 = amountTotal9 * percent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountTotal9 + " рублей.");
        }
        System.out.println("");

        System.out.println("Задача 10");
        int result = 0;
        for (int i = 1; i <= 10; i++)
        {
            result = result + 2;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}
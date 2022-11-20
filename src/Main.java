public class Main {

    //Для 1 задачи
    public static int calculationYear(int u) {
        int i = u;
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println("Номер года - " + i + " является високосным годом");
        } else {
            System.out.println("Номер года - " + i + " не я вляется високосным годом");
        }
        return i;
    }

    //Для 2 задачи
    public static int[] phone (int r, int t) {
        int s = r;
        int h = t;
        if (s == 0 && h < 2015) {
            System.out.println("Установите lite-версию для Ios");
        } else if (s ==0 && h >= 2015) {
            System.out.println("Вам не нужно установите lite-версию для Ios");
        }
        if (s == 1 && h < 2015) {
            System.out.println("Установите lite-версию для Android");
        } else if (s == 1 && h >= 2015) {
            System.out.println("Вам не нужно установите lite-версию для Android");
        }
        if (s > 1 || h < 1876 && h > 2022) {
            System.out.println("Проверьте корректность вводимых данных");
        }
        return new int [] {s, h};
    }

    //Для 3 задачи
    public static int delivery(int g) {
        int deliveryTime = g / 40;
        deliveryTime++;
        System.out.println("Потребуется дней - " + deliveryTime);
        return deliveryTime;
    }

    public static void main (String[]args) {

        //Задание 1
        System.out.println("Задание 1");
        int year = 2067;
        calculationYear(year);

        //Задание 2
        System.out.println("Задание 2");
        int typeOc = 1;
        int yearDevice = 2015;
        phone(typeOc, yearDevice);

        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 60;
        delivery(deliveryDistance);
    }
}
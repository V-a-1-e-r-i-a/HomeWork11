public class Main {

    //Для 1 задачи
    public static void calculationYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println("Номер года - " + i + " является високосным годом");
        } else {
            System.out.println("Номер года - " + i + " не я вляется високосным годом");
        }
    }

    //Для 2 задачи
    public static void phone (int s, int h) {
        if (s == 0 && h < 2015) {
            System.out.println("Установите lite-версию для Ios");
        } else if (s == 0 && h >= 2015) {
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
    }


    //Для 3 задачи
    public static void  delivery (int g) {
        int deliveryDistance1 = g;
        int deliveryTime = 0;
        if (deliveryDistance1 >= 20) {
            deliveryTime++;
        }
        if (deliveryDistance1 >= 60) {
            deliveryTime++;
        }
        if (deliveryDistance1 >= 100) {
            deliveryTime++;
        }
        System.out.println("Потребуется дней - " + deliveryTime);
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
public class Main {

    //Для 1 задачи
    public static void calculationYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Номер года - " + year + " является високосным годом");
        } else {
            System.out.println("Номер года - " + year + " не я вляется високосным годом");
        }
    }

    //Для 2 задачи
    public static void phone(int typeOc, int yearDevice) {
        if (typeOc == 0 && yearDevice < 2015) {
            System.out.println("Установите lite-версию для Ios");
        } else if (typeOc == 0 && yearDevice >= 2015) {
            System.out.println("Вам не нужно установите lite-версию для Ios");
        }
        if (typeOc == 1 && yearDevice < 2015) {
            System.out.println("Установите lite-версию для Android");
        } else if (typeOc == 1 && yearDevice >= 2015) {
            System.out.println("Вам не нужно установите lite-версию для Android");
        }
        if (typeOc > 1 || yearDevice < 1876 && yearDevice > 2022) {
            System.out.println("Проверьте корректность вводимых данных");
        }
    }


    //Для 3 задачи
    public static void delivery(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime = 2 + (deliveryDistance - 21) / 40;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
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
        int deliveryDistance = 3000;
        delivery(deliveryDistance);
    }
}
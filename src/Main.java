public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 4.1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else System.out.println("У вас неизвестная система");

        System.out.println("Задача 4.2");
        int clientDeviceYear = 2020;
        if (clientOS == 0){
        if (clientDeviceYear <= 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите приложение для iOS по ссылке");}
        if (clientOS == 1) {
            if (clientDeviceYear <= 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите приложение для Android по ссылке");}
        else System.out.println("У вас неизвестная операционная система");

        System.out.println("Задача 4.3");
        int year = 2036;
        boolean yearLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (yearLeap){
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");

        System.out.println("Задача 4.4");
        int deliveryDistance = 95;
        int timeDelivery = deliveryDistance / 20 + 1;
        System.out.println("Потребуется дней: " + timeDelivery);

        System.out.println("Задача 4.5");
        int monthNumber = 5;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
        }

    }

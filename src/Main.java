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
        }

    }

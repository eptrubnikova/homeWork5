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
    }
}
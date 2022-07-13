public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке ");
        } else {
            System.out.println("Установите версию для Android по ссылке ");
        }
        // Задание 2
        int aClientOS = 0;
        int clientDeviceYear = 2020;
        boolean newDevice = clientDeviceYear >= 2005;
        if (aClientOS == 0 && newDevice) {
            System.out.println("Установите версию для iOS по ссылке ");
        } else if (aClientOS == 0) {
            System.out.println("Установите lite-версию для iOS по ссылке ");
        } else if (aClientOS == 1 && newDevice) {
            System.out.println("Установите версию для Android по ссылке ");
        } else {
            System.out.println("Установите lite-версию для Android по ссылке ");
        }
        // Задание 3
        int year = 2000;
        int gapYear = year % 4;
        int hundgeYear = year % 100;
        int fourHundgeYear = year % 400;
        if (fourHundgeYear == 0) {
            System.out.println("Gap year!");
        } else if (hundgeYear == 0) {
            System.out.println("Not a gap year...");
        } else if (gapYear == 0) {
            System.out.println("Gap year!");
        } else {
            System.out.println("Not a gap year...");
        }
        // Задание 4
        int deliveryDistance = 141;
        int daysToDeliver = ((deliveryDistance - 20) / 40) + 2;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + daysToDeliver + " дня");
        } else {
            System.out.println("К сожалению, мы не доставляем так далеко :(");
        }
        // Задание 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В земном календаре 12 месяцев");
        }
    }
}
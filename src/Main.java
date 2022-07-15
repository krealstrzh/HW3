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
        int year = 1700;
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
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
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
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В земном календаре 12 месяцев");
        }
        // Задание 6
        int age = 20;
        double salary = 90_000;
        double creditLimit;
        if (age >= 23) {
            creditLimit = salary * 3;
        } else {
            creditLimit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            creditLimit = creditLimit * 1.2;
        }else if (salary >= 80_000) {
            creditLimit = creditLimit * 1.5;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + creditLimit + " рублей");
        //Задание 7
        int ageA = 20;
        double salaryA = 150_000;
        double wantedSum = 30_000;
        double creditRate = 10;
        double maxPart = 50;
        if (ageA < 30 && ageA >= 23) {
            creditRate = creditRate + 0.5;
        } else if (ageA < 23) {
            creditRate = creditRate + 1;
        }
        if (salaryA >= 80_000) {
            creditRate = creditRate - 0.7;
        }
        System.out.println("Ставка кредитования -- " + creditRate + "%");
        double sumToPay = (wantedSum * creditRate / 100) + wantedSum;
        double payPerMonth = sumToPay / 12;
        double maxPayPerMonth = salaryA * maxPart / 100;
        System.out.println("Максимальный платеж при з/п " + salaryA + " равен " + maxPayPerMonth + " рублей. Платеж по кредиту -- " + payPerMonth + " рублей." );
        if (payPerMonth <= maxPayPerMonth) {
            System.out.println("Кредит одобрен!");
        } else {
            System.out.println("Заявка отклонена :(");
        }
    }
}
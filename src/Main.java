class Homework {
    public static void task_1 () {
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный год");
        } else {
            System.out.println("не високосный год");
        }
    }

    public static void task_2 ( int clientDeviceYear) {
        if (clientDeviceYear > 2014) {
            System.out.println("установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("установка приложения для Android");
        }
        if (clientDeviceYear > 2016) {
            System.out.println("установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("установка приложения для iOS");
        }
    }
    public static void task_3 (int deliveryDistance) {;
        if (deliveryDistance <= 20) {
            System.out.println("доставка занимает 1 сутки");
        } else if (deliveryDistance < 21 || deliveryDistance <= 60) {
            System.out.println("доставка занимает 2 суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("доставка занимает 3 суток");
        } else {
            System.out.println("расстояние превышает зону покрытия территории банка");
        }
    }
    public static void main(String[] args) {
        task_1();
        System.out.println();

        task_2(2015);
        System.out.println();

        task_3(95);

    }
}

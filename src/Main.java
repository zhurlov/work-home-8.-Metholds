import java.util.zip.ZipOutputStream;

class Homework {
    public static void checkHighYear() {
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный год");
        } else {
            System.out.println("не високосный год");
        }
        System.out.println();
    }


    public static void selectVersion(int deviceOs, int manufacturingYear) {
        int deviceCurrentYear = 2021;
        boolean ds = deviceCurrentYear > manufacturingYear;
        System.out.println("установите");
        if (ds){
            System.out.println("lite");
        }
        System.out.println("версию для:");
        if (deviceOs == 0) {
            System.out.println("ios");
        }else {
            System.out.println("android");
        }
        System.out.println();
    }

    public static int countingDaysFromDistance(int distance) {
        if (distance <= 20) {
            System.out.println("доставка занимает 1 сутки");
        } else if (distance < 21 || distance <= 60) {
            System.out.println("доставка занимает 2 суток");
        } else if (distance <= 100) {
            System.out.println("доставка занимает 3 суток");
        } else {
            System.out.println("расстояние превышает зону покрытия территории банка");

        }
        return distance;
    }

        public static void main (String[]args){
            checkHighYear();
            selectVersion(1,2022);

            countingDaysFromDistance(34);
        }
    }


import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 25;
        System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        System.out.println("");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = -10;
        if (temperature <= 5) {
            System.out.printf("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("");
        System.out.println("Задача 4");
        int age = 17;
        boolean goToKindergarten = age > 2 && age < 6;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        boolean goToSchool = age > 7 && age < 18;
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        boolean goToUniversity = age > 18 && age < 24;
        if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        boolean goToWork = age > 24;
        if (goToWork) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("");
        System.out.println("Задача 5");
        int age = 15;
        boolean youCantRide = age < 5;
        if (youCantRide) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        boolean onlyWithAnAdult = age > 5 && age < 14;
        if (onlyWithAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого." +
                    "Если взрослого нет, то кататься нельзя");
        }
        boolean youCanRide = age > 14;
        if (youCanRide) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("");
        System.out.println("Задача 6");
        int totalSeats = 102;
        int seating = 60;
        int standingPlase = totalSeats - seating;
        int statsOccupiend = 102;
        boolean seatingFree = statsOccupiend < seating;
        if (seatingFree) {
            System.out.println(" В вагоне есть сидячие места");
        }
        boolean standingPlaseFree = statsOccupiend > seating && statsOccupiend < totalSeats;
        if (standingPlaseFree) {
            System.out.println("В вагоне есть стоячие места");
        }
        boolean noAvailableSeats = statsOccupiend == totalSeats;
        if (noAvailableSeats) {
            System.out.println("В вагоне свободных мест нет");
        }
    }

    public static void task7() {
        System.out.println("");
        System.out.println("Задача 7");
        int one = 15305;
        int two = 456000;
        int three = 4567;
        boolean oneMore = one > two && one > three;
        if (oneMore) {
            System.out.println("Число " + one + " наибольшее из чисел");
        }
        boolean twoMowe = two > one && two > three;
        if (twoMowe) {
            System.out.println("Число " + two + " наибольшее из чисел");
        }
        boolean threeMore = three > one && three > two;
        if (threeMore) {
            System.out.println("Число " + three + " наибольшее из чисел");
        }
    }
}
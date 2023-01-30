import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
        }
}
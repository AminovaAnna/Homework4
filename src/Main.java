import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия," +
                    " нужно немного подождать");
        }                       //задача1

        System.out.println();

        int temperatureOutside = -5;
        if (temperatureOutside <= 5) {   //поставила "<=" т.к. в случае если на улице 5 градусов, то ничего не выводится, надеюсь не ошибка
            System.out.println("На улице " + temperatureOutside + " градусов, нужно надеть шапку");
        }
        if (temperatureOutside > 5) {
            System.out.println("На улице " + temperatureOutside + " градусов, можно идти без шапки");
        }                       //задача2

        System.out.println();

        int speedCar = 30;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + ", то придется заплатить штраф");
        }
        if (speedCar <= 60) {
            System.out.println("Если скорость " + speedCar + ", то можно ездить спокойно");
        }                       //задача3

        System.out.println();

        int peopleAge = 20;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в детский сад");
        } else if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу");
        } else if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему пора ходить на работу");
        }                       //задача4

        System.out.println();

        int childYears = 14;
        if (childYears < 5) {
            System.out.println("Если возраст ребенка равен " + childYears + ", то ему нельзя кататься на аттракционе");
        } else if (childYears >= 5 && childYears < 14) {
            System.out.println("Если возраст ребенка равен " + childYears + ", то ему можно кататься в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childYears + ", то ему можно кататься без сопровождения взрослого");
        }                       //задача5

        System.out.println();

        int spot = 102;
        int sitSpot = 60;
        int standSpot = spot - sitSpot; //42

        int sitSpot1 = 60;  //не больше 60
        int standSpot1 = 42;  //не больше 42
        int spot1 = sitSpot1 + standSpot1;  //не больше 102
        if (spot1 >= spot ){
            System.out.println("Свободных мест нет");
        } else if (sitSpot1 >= sitSpot){
            System.out.println("Сидячих мест нет");
        } else if (standSpot1 >= standSpot){
            System.out.println("Стоячих мест нет");
        } else {
            System.out.println("Места есть");
        }                       //задача6

        System.out.println( );

        int one = 9;
        int two = 8;
        int three = 8;
        if (one > two && one > three){
            System.out.println("Число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        } else if (one == two && one > three) {
            System.out.println("Число " + one + " и число " + two + " равны и самые большие");
        } else if (two == three && two > one) {
        System.out.println("Число " + two + " и число " + three + " равны и самые большие");
        } else if (one == three && one > two) {
            System.out.println("Число " + one + " и число " + three + " равны и самые большие");
        } else {
            System.out.println("Числа равны");
        }                       //задача7 (не совсем поняла что применять если числа равны, по условиям ничего не сказано)


    }

}
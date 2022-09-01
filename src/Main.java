public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
        homeWork5();
        homeWork6();
        homeWork7();
        homeWork8();
        homeWork9();
    }
    public static void homeWork1(){
        System.out.println("Задача 1");
        int age = 19;
        if (age >=18) {
            System.out.println("Поздровляем с совершенолетием");
        }
        if (age <18){
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();

    }
    public static void homeWork2(){
        System.out.println("Задача 2");
        int ageChildren = 25;
        if ((ageChildren >=7) && (ageChildren <=18) ) {
            System.out.println("ребенок ходит в школу");
        }
        if ((ageChildren >= 18) && (ageChildren <=24) ) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (ageChildren >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        if (ageChildren <7){
            System.out.println("Для школы еще рано");

        }
        System.out.println();
    }
    public static void homeWork3(){
        System.out.println("Задача 3");
        int trane = 102;
        int seats = 60;
        int standing = trane - seats;
        int peapls = 10;
        if (peapls == 102){
            System.out.println("Все места в вагоне заняты");

        } if (peapls <= 60){
            int peaplsSeats = seats - peapls;

            System.out.println("В вагоне " + peapls + " пасажиров, сидячих свободных мест в вагоне "
                    + peaplsSeats + " ,стоячих свободных мест " + standing );

        }
            if ((peapls >60) && (peapls<=102)){
            int seatsOcupied = peapls - seats;
            int freedom = trane - (seatsOcupied + seats);

            System.out.println("В вагоне " + peapls + " пасажир, сидячих пасажиров в вагоне "
                    + seats + " ,стоячих пасажиров " + seatsOcupied + " ,свободных стоячих мест в поезде " + freedom );

        }
            if (peapls > 102){
            System.out.println("Поезд расчитан на " + trane +" пасажира");
        }
        System.out.println();


    }
    public static void homeWork4(){
        System.out.println("Задача 4");
        int age = 19;
        if (age >=18) {
            System.out.println("Поздровляем с совершенолетием");

        }else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();
    }
    public static void homeWork5(){
        System.out.println("Задача 5");
        int ageChildren = 6;
        if ((ageChildren >=7) && (ageChildren <=18) ) {
            System.out.println("ребенок ходит в школу");
        }else if ((ageChildren >= 18) && (ageChildren <=24) ) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }else if (ageChildren >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Еще слишком рано для школы");
        }
        System.out.println();

    }
    public static void homeWork6(){
        System.out.println("Задача 6");
        int trane = 102;
        int seats = 60;
        int standing = trane - seats;
        int peapls = 1;
        if (peapls == 102){
            System.out.println("Все места в вагоне заняты");
        }else if (peapls <= 60){
            int peaplsSeats = seats - peapls;
            System.out.println("В вагоне " + peapls + " пасажиров, сидячих свободных мест в вагоне "
                    + peaplsSeats + " ,стоячих свободных мест " + standing );
        }else if ((peapls >60) && (peapls<=102)){
            int seatsOcupied = peapls - seats;
            int freedom = trane - (seatsOcupied + seats);

            System.out.println("В вагоне " + peapls + " пасажир, сидячих пасажиров в вагоне "
                    + seats + " ,стоячих пасажиров " + seatsOcupied + " ,свободных стоячих мест в поезде " + freedom );
        } else {
            System.out.println("Поезд расчитан на " + trane +" пасажира");
        }
        System.out.println();
    }
    public static void homeWork7(){
        System.out.println("Задача 7");
        int age =25;
        boolean kindergarten = (age >2 && age <=6);
        boolean goToScool = (age > 7 && age <= 18);
        boolean goToColleg = (age >18 && age <= 24);
        boolean goToWork = age > 24;

        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в садик");
        } else if (goToScool){
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");

        }else if(goToColleg){
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в колледж");
        } else if (goToWork) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }


            System.out.println();
    }
    public static void homeWork8 (){
        System.out.println("Задача 8");
         int age = 4;
         boolean atriction = age < 5;
         boolean atriction1 = age > 5 && age <= 14;
         boolean atriction2 = age > 14;
         if (atriction){
             System.out.println("Ребенок не может кататься на аттракционе");
         } else if (atriction1) {
             System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
         }else if (atriction2){
             System.out.println("Ребенок может кататься без сопровождения взрослого.");
         }
        System.out.println();
    }
    public static void homeWork9 (){
        System.out.println("Задача 9");
        int one = 4;
        int two = 5 ;
        int free = 3;
        if (one > two && one > free) {
            System.out.println(one);
        }else if (two > one && two > free) {
            System.out.println(two);
        }else {
            System.out.println(free);
        }
    }




}


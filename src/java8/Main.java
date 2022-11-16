package java8;

import java8.announcement.Announceement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.tranaport.Airplane;
import java8.tranaport.Car;
import java8.tranaport.Helicopter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Laptop laptop = new Laptop("Asus", "☺", 200, "new", "windows");
        Laptop laptop1 = new Laptop("Lenovo", "☺", 300, "old", "apple");
        Laptop[] laptops = {laptop, laptop1};

        Phone phone = new Phone("Sumsung", "☺", 150, "old", "Android", 64);
        Phone phone1 = new Phone("Iphone 13", "☺", 500, "new", "Apple", 128);
        Phone[] phones = {phone, phone1};

        Home home = new Home("Ihlas", "☺", 35000, "Flat for Living", "Flat", 20);
        Home home1 = new Home("Elite House", "☺", 80000, "Hous for Living", "Hous", 30);
        Home[] homes = {home, home1};


        Car car = new Car("E-600", "☺", 7000, "old", "red", LocalDate.ofYearDay(2019, 3),230);
        Car car1 = new Car("BMW", "☺", 12000, "new", "black", LocalDate.ofYearDay(2021, 1),300);
        Car[] cars = {car, car1};

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        
            Announceement[] announceements = {laptop, laptop1, phone, phone1, home, home1, car, car1};
        System.out.println("""
                1 findByName,2 findByMaxPrice,3 findByPrice,4 getDescription,5 getColor
                """);
            int scannerNumber=scanner1.nextInt();
        switch (scannerNumber) {
            case 1 -> Announceement.findByName(scanner.nextLine(), phones, laptops, homes, cars);
            case 2 -> Announceement.findByMaxPrice(announceements);
            case 3 -> findByPrice(scanner.nextInt(), laptops, phones, homes, cars);
            case 4 -> getDescription(scanner1.nextLine(), announceements);
            case 5 -> getColor(scanner.nextLine(), cars);
            default -> System.out.println("Myndai method jok");
        }
            }
//
//            //Announceement.findByName(scanner.nextLine(), phones, laptops, homes, cars);
//            Announceement.findByMaxPrice(announceements);
//            System.out.println("get price");
//            findByPrice(scanner.nextInt(), laptops, phones, homes, cars);
//           // getSpeed(cars);

          //  getDescription(scanner.nextLine(), announceements);
         //   getColor(scanner.nextLine(), cars);
  //  }
    public static void findByPrice(double price,Laptop[] laptops,Phone[] phones,Home[] homes, Car[] cars) {
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() == price) {
                System.out.println(laptop.toString());
            }

        }
        for (Phone phone : phones) {
            if (phone.getPrice() == price) {
                System.out.println(phone.toString());
            }
        }
        for (Home home : homes) {
            if (home.getPrice() == price) {
                System.out.println(home.toString());

            }
        }
        for (Car car : cars) {
            if (car.getPrice() == price) {
                System.out.println(car);
            }

        }



    }
    public static void getSpeed(Car[] cars){
        if(cars[0].getSpeed() > cars[1].getSpeed()){
            System.out.println("maximum speed of cars: "+ cars[0].getName()+ " "+ cars[0].getSpeed());
        }else {
            System.out.println("maximum speed of cars: "+cars[1].getName() + " " + cars[1].getSpeed());
        }

    }
    public static void getDescription(String description,Announceement[]announceements){
        for (Announceement a: announceements){
            if(a.getDescription().equals(description)){
                System.out.println(a);
            }
        }
    }
    public static void getColor(String colour, Car[] cars){
        for (Car car:cars){
            if(car.getColour().equals(colour)){
                System.out.println(car);
            }
        }
    }


    }
   /* public static Laptop[] getLaptop(){
        return new Laptop[]{
                new Laptop("Asus", "☺", 200, "new ", "windows"),
                 new Laptop("Lenovo", "☺", 300, "old", "apple")
        };


    }

        public static Phone[] getPhons () {
            return new Phone[]{
                    new Phone("Sumsung", "☺", 150, "old", "Android", 64),
                    new Phone("Iphone 13", "☺", 500, "new", "Apple", 128)

            };
        }

        public static Home[] getHome () {
            return new Home[]{
                    new Home("Ihlas", "☺", 35000, "Flat for Living", "Flat", 20),
                    new Home("Elite House", "☺", 80000, "Hous for Living", "Hous", 30)

            };
        }

        public static Airplane[] getAirplane () {
            return new Airplane[]{
                    new Airplane("Airbus", "☺", 20000, "new", "white", LocalDate.ofYearDay(2015, 7)),
                    new Airplane("Boeing", "☺", 15000, "old", "grey", LocalDate.ofYearDay(2009, 13))
            };
        }

        public static Car[] getCar () {
            return new Car[]{
                    new Car("E-600", "☺", 7000, "old", "red", LocalDate.ofYearDay(2019, 3)),
                    new Car("BMW", "☺", 12000, "new", "red", LocalDate.ofYearDay(2021, 1))

            };
        }

}*/





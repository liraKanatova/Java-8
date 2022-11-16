package java8.tranaport;

import java.time.LocalDate;

public class Helicopter extends Car {


    public void getInfo(){
        System.out.println("Helicopter is not inherited");
    }

    public Helicopter(String name, String image, double price, String description, String colour, LocalDate yearOfIssue, int speed) {
        super(name, image, price, description, colour, yearOfIssue, speed);
    }
}

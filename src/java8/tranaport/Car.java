package java8.tranaport;

import java8.announcement.Announceement;

import java.time.LocalDate;

public class Car extends Announceement {
    private String colour;
    private LocalDate yearOfIssue;
     private int speed;

    public Car(String name, String image, double price, String description, String colour, LocalDate yearOfIssue,int speed) {
        super(name, image, price, description);
        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
        this.speed=speed;
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "colour='" + colour + '\'' +
               "speed='" +speed+
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}


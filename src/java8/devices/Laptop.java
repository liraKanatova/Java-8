package java8.devices;

import java8.announcement.Announceement;

public class Laptop extends Announceement {
    private String operatingSystem;

    public Laptop(String name, String image, double price, String description,String operatingSystem) {
        super(name, image, price, description);
        this.operatingSystem=operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" + super.toString() +
                "operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}


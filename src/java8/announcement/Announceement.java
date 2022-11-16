package java8.announcement;

import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.tranaport.Car;

public class Announceement {
    private String name;
    private String image;
    private double price;
    private String description;


    public Announceement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

   public static double findByMaxPrice(Announceement[] announceements) {
       double maxPrice = announceements[0].price;
       for (Announceement announceement : announceements) {
           if (maxPrice < announceement.price) {
               maxPrice = announceement.price;
           }

       }
       for (Announceement announceement : announceements) {
           if (maxPrice == announceement.price) {
               System.out.println(announceement);
           }
       }

return maxPrice;
   }

   public static void findByName(String name, Phone[] phones, Laptop[] laptops, Home[] homes, Car[] cars) {
        for (Phone phone : phones) {
            if (name.contains(phone.getName())) {
                System.out.println(phone.toString());
            }
        }
        for (Laptop laptop : laptops) {
            if (name.contains(laptop.getName())) {
                System.out.println(laptop.toString());
            }
        }
        for (Home home : homes) {
            if (name.contains(home.getName())) {
                System.out.println(home.toString());
            }
        }
        for (Car car : cars) {
            if (name.contains(car.getName())) {
                System.out.println(car.toString());
            }
        }
   }
}
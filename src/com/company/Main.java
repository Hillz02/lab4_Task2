package com.company;

 class Car {

    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;

    }
public void delivery (int n) {
        quantity += n;
}

public void sell (int n){
        quantity -= n;
}
public String getModel() { return model; }
     public void setModel(String model) { this.model = model; }
public String getBrand() { return brand; }
     public void setBrand(String brand) { this.brand = brand; }
public int getYear() { return year; }
     public void setYear(int year) { this.year = year; }
public int getPrice() { return price; }
     public void setPrice(int price) { this.price = price; }
public String getColor() { return color; }
     public void setColor( String color) { this.color = color; }
     public int getQuantity() {return quantity; }
     public void setQuantity(int quantity) { this.quantity = quantity; }

 }

 @Override
  public String tostring() {
     return "car{" +
             "model=" + model + '\'' +
             ",brand='" + brand + '\'' +
             ",year=" + year +
             ",price=" + price +
             ",color='" + color + '\'' +
             ",quantity=" + quantity +
             '}';
 }
 }

 public class carDemo{
    public static void main (String[]args){
        Car car1 = new Car( model: "GLE", brand:"Mercedes", year:2020, price: 350000, color: "white", quantity: 5);
        System.out.println(car1.tostring());
        car1.sell(2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println(car1.tostring());

    }
 }



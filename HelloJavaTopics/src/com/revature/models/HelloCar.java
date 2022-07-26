package com.revature.models;

public class HelloCar {
    public int doors = 5;
    public String color = "Green";
    public String make = "Honda";
    public String model = "Civic";
    public static int cylinders = 12;


    //Boiler plate code
    //No args constructor
    public HelloCar(){
        super();
    }

    //All args constructor
    public HelloCar(int doors, String color, String make, String model, int cylinders) {
        this.doors = doors;
        this.color = color;
        this.make = make;
        this.model = model;
        //this.cylinders = cylinders;
    }

    //Some args constructor
    public HelloCar(int doors) {
        this.doors = doors;
    }


    public static int racing(int speed){
        if(speed > 120){
            System.out.println("I have need for Spppeeeeddd");
            return speed;
        }
        else{
            System.out.println("Car go brrrrt");
            return speed;
        }
    }
    public int speeding(int speed1234){
        if(speed1234 > 120){
            System.out.println("I have need for Spppeeeeddd");
            return speed1234;
        }
        else{
            System.out.println("Car go brrrrt");
            return speed1234;
        }
    }
    protected void honk(){
        System.out.println("Beep beep im a jeep");
    }
    public static void main(String[] args) {
        HelloCar car = new HelloCar();
        HelloCar Bugatti = new HelloCar();
        HelloCar BMW = new HelloCar();
        System.out.println(car.color);

        //This is terrible
        Bugatti.color = "Chartreuse";
        //This is fine, not great, but fine
        BMW.make = "Ford";
        BMW.model = "Mustang";

        HelloCar.cylinders = 10;

        System.out.println(car.make);
        System.out.println(BMW.make);
        System.out.println(car.model);
        System.out.println(BMW.model);
        System.out.println(car.color);
        System.out.println(Bugatti.color);



        System.out.println("This is other stuff we did earlier :)");
        int speed = (int)(Math.random()*200);
        System.out.println(speed);
        System.out.println(racing(speed));
        car.speeding(speed);
        racing(speed);
        car.honk();

    }



}

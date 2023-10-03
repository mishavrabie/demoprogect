package homeWork;

public class VehicleJava {
     class Vehicle{

        private String make;
        private String model;
        private int year;
        private int topSpeed;

        public Vehicle(String make,String model,int year,int topSpeed){
            this.make = make;
            this.model = model;
            this.year = year;
            this.topSpeed = topSpeed;
        }

        public void setMake(String make){
            this.make = make;
        }

        public String getMake(){
            return make;
        }

        public void setModel(String model){
            this.model = model;
        }

        public String getModel(){
            return model;
        }

        public void setYear(int year){
            this.year = year;
        }
        public int getYear(){
            return year;
        }

        public void setTopSpeed(int topSpeed){
            this.topSpeed = topSpeed;
        }

        public int getTopSpeed(){
            return topSpeed;
        }

         void drive(){
            System.out.println("THE " + year + " "+ make + " "+ model + "The vehicle can drive up to " + topSpeed +" mph and is currently driving");
        }

    }

    class Car extends Vehicle{
        private int numDoors;

        public Car(String make,String model,int year,int topSpeed, int numDoors){
            super(make ,model , year , topSpeed);
            this.numDoors = numDoors;
        }

        public int getNumDoors(){
            return numDoors;
        }

        public void setNumDoors(int numDoors){
            this.numDoors = numDoors;
        }

        @Override
        public void drive() {
            super.drive();
            System.out.println("This car has number of doors"+ numDoors);
        }
    }
    class Truck extends Vehicle {
        private int cargoCapacity ;

        public Truck(String make,String model,int year,int topSpeed , int cargoCapacity){
            super(make , model , year , topSpeed);
            this.cargoCapacity = cargoCapacity;
        }

        public void setCargoCapacity(int cargoCapacity){
            this.cargoCapacity = cargoCapacity;
        }
        public int getCargoCapacity(){
            return cargoCapacity;
        }

        public void drive(){
            super.drive();
            System.out.println("The cargo capacity of a truck is: " + cargoCapacity);
        }


    }

}



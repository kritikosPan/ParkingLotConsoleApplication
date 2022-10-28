package com.mycompany.parkinglotservicesapp;


import java.util.ArrayList;
import java.util.List;
    

    public class Driver {
        
        
    // default constuctor
    public Driver(){};    
    
    // fields
    //public Integer driverId = 0;
    public String lastName;
    public List<Vehicle> vehiclesDriver = new ArrayList<>();
    
    // lists
    public List<Driver> Drivers = new ArrayList<>();
    
    //list aggregaton
    public List<Vehicle> getVehiclesDriver() {
        return vehiclesDriver;
    }
    
    // constructor
    public Driver(String lastName) {
        //this.driverId = driverId;
        this.lastName = lastName;
    }
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public void setVehiclesDriver(List<Vehicle> vehiclesDriver) {
        this.vehiclesDriver = vehiclesDriver;
    }

    public List<Driver> getDrivers() {
        return Drivers;
    }

    public void setDrivers(List<Driver> Drivers) {
        this.Drivers = Drivers;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Vehicle> getVehicles() {
        return vehiclesDriver;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehiclesDriver = vehicles;
    }
    
    
    
    
   
   

    
    
    
    
//    public void driverChecker(){
//            
//        
//        
//        }
//    
    
//    public Driver addDriver(){
//        
//        Scanner scanner = new Scanner(System.in);
//        Driver driver = new Driver();
//        Vehicle vehicle = new Vehicle();
//        
//        System.out.println("TYPE FIRST NAME");
//        driver.firstName = scanner.nextLine();
//        //setFirstName(firstName);
//        
//        System.out.println("TYPE LAST NAME");
//        lastName = scanner.nextLine();
//        //setLastName(lastName);
//        
//        System.out.println("TYPE PHONE NUMBER");
//        phoneNumber = Integer.parseInt(scanner.nextLine());
//        //setPhoneNumber(phoneNumber);
//        
//        numberOfVehicles = numberOfVehicles + 1;
//        
//        driver.Vehicles.add(vehicle);
//        
//        Drivers.add(driver);
//        
//        return driver;
//    }

    
    
    
}


package com.mycompany.parkinglotservicesapp;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    // Capacity
    public int capacity = 100;
    public int currentOccupation;

    // Payments
    public double charge;

    public double turnover;

    public long duration;

    public Integer counter =1;
    Driver driver = new Driver();
    Vehicle vehicle = new Vehicle();
    Employee employee = new Employee();

    // Lists
    public List<Driver> Drivers = new ArrayList<>();

    public List<Vehicle> Vehicles = new ArrayList<>();
    
    public List<Employee> employees = new ArrayList<>();
    
    
    
    
    // adding new vecicle-driver
    public void addVehicle(String vehicleId, String vehicleType, String lastName) {
        
        driver.setLastName(lastName);
        vehicle.setVehicleNumber(vehicleType);
        vehicle.setVehicleType(vehicleType);

        
        long startDate = System.currentTimeMillis();
        vehicle.setStartDate(startDate);
        driver.getVehicles().add(vehicle);

        Vehicles.add(vehicle);

        System.out.println("VEHICLE ADDED");
        System.out.println("size of " + Vehicles.size() + " " + driver.vehiclesDriver.size());
        for (Vehicle a : Vehicles) {
            System.out.println("VEHICLE ID  " + a.getVehicleNumber());
        }
    }

    
    
    
    
    // Exit vehicle-payment-turnover
    
    public void removeVehicle(String vehicleId) {


        for (Vehicle ve : Vehicles) {

            if (vehicleId.equalsIgnoreCase(ve.getVehicleNumber())) {

                Vehicles.remove(ve);
                driver.getVehicles().remove(ve);

            }
        }
    }

    public void parkingStop(String vehicleId) {


        for (Vehicle v : Vehicles) {

            if (vehicleId.equalsIgnoreCase(v.getVehicleNumber())) {

                long endDate = System.currentTimeMillis();
                vehicle.setEndDate(endDate);

            }
        }
        duration = (vehicle.getEndDate() - vehicle.getStartDate())/(-1000000);
    }
    
//    public Integer checkForDiscount(String vehicleId) {
//
//        for (Vehicle var : driver.getVehicles()) {
//
//            if (vehicleId.equalsIgnoreCase(var.vehicleId)) {
//                String a = driver.getLastName();
//
//                for (Vehicle v : vehicle.Vehicles) {
//                
//                if (a == driver.lastName) {
//
//                    Garage g = new Garage();
//
//                    counter = counter + 1;
//                }
//                }
//            }
//        }
//        return counter;
//    }
    
    public double chargeCalculation() {

        Integer t1= 200000000;

        Integer t2=100000000;
        

        double seconds = duration / 10000.0;

        charge = seconds * t1;
        

//        if (counter < 1) {
//
//            charge = (t1 * seconds);
//        } else {
//
//            charge = (t2 * seconds);
//        }

        return charge;
    }

    public double currentTurntOver() {
        
        turnover = turnover + charge;
        
        return turnover;
    }

    
    
    //Print methods
    public void printCurrentTurnOver() {
        
        System.out.println("TILL NOW THE TURNOVER IS: " + turnover + "euros");
    }

    public void printReceipt() {

        
        System.out.println("Parking Lot Services Ltd");
        System.out.println("*****Tel.2710-55879*****");
        System.out.println("**** Tax Id.7945478*****");
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("--Owners's Name: " + driver.lastName);
        System.out.println("========================");
        System.out.println("--Vechicle's Plate Number: " + vehicle.vehicleId);
        System.out.println("========================");
        System.out.println("Time Duration within Lot: " + duration + " seconds");
        System.out.println("========================");
        System.out.println("--Total Payment is: " + charge);
        System.out.println("========================");
        System.out.println("--Your Personal Assistant for Today is: Aleksios ");
        System.out.println("******THANK YOU******");
        System.out.println("************************");
    }

    // methods for lot free and occupied spots
    public void vehicleEntrance() {

        capacity = capacity - 1;
    }

    public void VehicleExit() {

       capacity = capacity + 1;
    }

    public void checkerCapacity() {

        if (capacity <= 100) {

            System.out.println(capacity + " FREE SPOTS - YOU CAN PASS");
        } else {
            System.out.println("FULL CAPACITY - NO FREE SPOT - PLEASE COME BACK LATER");
        }
    }

    // List Employee Synthetic data
    
//    public void employeeList(){
//    Employee e1 = new Employee(){};
    //}
    
    
    
}

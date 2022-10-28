package com.mycompany.parkinglotservicesapp;
import java.util.ArrayList;
import java.util.List;



public class Vehicle {

    
    // default constructor             
    public Vehicle(){};
    
    // list
    public List<Vehicle> Vehicles = new ArrayList<>();
    
    // fields
    public String vehicleId;
    public String vehicleType;
    public Driver driver;
    public long startDate;
    public long endDate;

    
    // constructor
    public Vehicle(String vehicleId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }
    
    
    

    
    // getters-setters
    public String getVehicleNumber() {
        return vehicleId;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.vehicleId = VehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    
     public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }
    
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public Vehicle addVehicle(){
//        
//        Scanner scanner = new Scanner(System.in);
//        Vehicle vehicle = new Vehicle();
//        Date inputDate= new Date();
//        
//        System.out.println("TYPE VEHICLE NUMBER");
//        plateChecker(vehicle.VehicleNumber);
//        vehicle.VehicleNumber = scanner.nextLine();
//                
//        vehicle.staff = Staff.values()[new Random().nextInt(Staff.values().length)];
//        
//        vehicle.start = System.nanoTime();
//        
//        Vehicles.add(vehicle);
//     
//        return vehicle;
//    }
    
    
    
    
//    public void removeVehicle(){
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        
//        
//        
//        System.out.println("TYPE VEHICLE NUMBER");
//        String vehicleNumberInput = scanner.nextLine();
//        
//        for (Vehicle vehicle : Vehicles) {
//            if (vehicle.getVehicleNumber().equals(vehicleNumberInput)){
//            
//            vehicle.timerStop(vehicle);
//            
//            Vehicles.remove(vehicle);
//            }  
//        } 
//    }
    
    
    
//    public long timerStop(Vehicle vehicle){
//        
//        vehicle.finish = System.nanoTime();
//        
//        long timeDuration = finish - vehicle.start;
//        
//        return timeDuration;
//    }
        
    
    
//    public long timeDuration(long start, long finish ){
//              
//        long timeElapsed = finish - start;
//        
//        return timeElapsed;
//    }
    
    
//    public Enum staffSelector(int number){
//        
//        Staff selectedStaff = null;
//        
//        System.out.println("TYPE 1 FOR ALEKSIOS");
//        System.out.println("TYPE 2 FOR BOB");
//        System.out.println("TYPE 3 FOR CAMILA");
//        System.out.println("TYPE 4 FOR DANIELA");
//        
//        switch (number) {
//            case 1: selectedStaff = Staff.Aleksios;
//                break;
//            case 2: selectedStaff = Staff.Bob;
//                break;
//            case 3: selectedStaff = Staff.Camila;
//                break;
//            case 4: selectedStaff = Staff.Daniela;
//                break;
//            default:
//                break;
//        }
//        
//        return selectedStaff;
//    }
    
//    public void plateChecker(String newVehicleNumber){
//        
//        for( Vehicle vehicle  : Vehicles ) {
//            
//            if (vehicle.VehicleNumber == newVehicleNumber){
//                
//                System.out.println("SOMETHING WENT WRONG - IDENTICAL PLATE ALREADY EXISTS...");
//                System.out.println("TRY AGAIN...");
//            }
//        }
//    
//    }

   
    
    
    
}

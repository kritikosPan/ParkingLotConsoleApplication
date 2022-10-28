package com.mycompany.parkinglotservicesapp;

import java.util.Scanner;
 


public class Services {

        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);
    
    private static void menu() {
        System.out.println("Hey There, here is Parking Lot Services Ltd");
        System.out.println("*******************************************");
        System.out.println("TYPE -1- FOR AVAILABLE SPOTS***************");
        System.out.println("===========================================");
        System.out.println("TYPE VEHICLE -2- TYPE TO ADD***************");
        System.out.println("===========================================");
        System.out.println("TYPE -3- FOR PAYMENT***********************");
        System.out.println("===========================================");
        System.out.println("TYPE -4- FOR TODAY'S TURNOVER**************");
        System.out.println("===========================================");
        System.out.println("TYPE -R- FOR RESTART***********************");
    }
    

    public boolean Start() {

        
        System.out.println("PRESS ANY KEY TO CONTINUE...");
        menu();
        
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        
            switch (userInput) {
                case "1":
                    garage.checkerCapacity();
                    
                    return true;
                    
                    
                    
                case "2":   // ADD A NEW CAR + OWNER
                    System.out.println("VEHICLE NUMBER");
                    String vehicleId = scanner.nextLine();
                    System.out.println("TYPE VEHICLE TYPE");
                    String vehicleType = scanner.nextLine();
                    System.out.println("TYPE OWNER LAST NAME");
                    String lastName = scanner.nextLine();

                    garage.addVehicle(vehicleId, vehicleType, lastName);
                    garage.vehicleEntrance();
                    
                    return true;

                

                case "3":   // FIND VECICLE-OWNER + CALCULATION PAYMENT  + PRINT RECEIPT 
                    System.out.println("TYPE VEHICLE NUMBER");
                    String vehicleId1 = scanner.nextLine();

                    garage.parkingStop(vehicleId1);
                    garage.removeVehicle(vehicleId1);
                    garage.printReceipt();
                    garage.VehicleExit();
                    
                    return true;
                    
                    
                    case "4":   // PRINT TURNOVER
                    garage.printCurrentTurnOver();
                    
                    return true;
                    
                    
                    
                    case "R":
                    return false;
                case "r":
                    return false;
                    
                    
                    
                default:
                    return true;
            }
    }
}

package com.company;

import java.util.ArrayList; // allows for ArrayLists to be used
import java.util.List;  // allows for the list function
import java.util.Scanner; // allows the program to accept input

public class AutomobileInventory {
    List<Automobile> autos = new ArrayList<>(); // initializing the automobile ArrayList
    Scanner in = new Scanner(System.in); // initializes the Scanner

    // Entry point of the program to manage automobile
    public void MainMenu()
    {
        boolean running = true;
        Scanner in = new Scanner(System.in);

        while (running) {   // Display a menu
            System.out.println("\r\nMAIN MENU");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. List vehicles");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Update a vehicle");
            System.out.println("5. Exit");


            System.out.print("\r\nOption: "); // Select an option
            int option = 0;
            try // catches any illegal input
            {
                option = in.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Invalid Input"); // prints out failure message
                in.nextLine();
            }

            // Execute the appropriate option
            if (option == 1) // Add a new vehicle
            {
                AddVehicle();
            }
            else if (option == 2) // List Vehicles
            {
                ListVehicles();
            }
            else if (option == 3) // Remove a vehicle
            {
                RemoveVehicle();
            }
            else if (option == 4)  // Update a Vehicle
            {
                UpdateVehicle();
            }
            else if (option == 5)  // Exit Program
            {
                running = false;
            }
        }
    }

    public void AddVehicle()
    {   // Adds a vehicle to the list
        System.out.print("\r\nADDING VEHICLE\r\n");

        System.out.print("Make: "); // enter make of vehicle
        String make = in.next();

        System.out.print("Model: ");  // enter model of vehicle
        String model = in.next();

        System.out.print("Color: ");  // enter color of vehicle
        String color = in.next();

        System.out.print("Year: "); // enter year of vehicle
        int year = 0;
        try  // catches illegal input
        {
            year = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input"); // prints failure message
            in.nextLine();
        }

        System.out.print("Mileage: "); // enter mileage of vehicle
        int mileage = 0;
        try  // catches illegal input
        {
            mileage = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input"); // prints failure message
            in.nextLine();
        }

        Automobile NewVehicle = new Automobile(make, model, color, year, mileage);
        autos.add(NewVehicle);
        System.out.print("Vehicle Added");

        ListVehicle(autos.size() -1 );
    }

    public void RemoveVehicle()
    {  // Removes vehicle from list
        System.out.print("\r\nREMOVING VEHICLE\r\n");

        ListVehicles();

        System.out.print("Which vehicle would you like to remove? ");
        int index = 0;
        try  // catches illegal input
        {
            index = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");  // prints failure message
            in.nextLine();
        }

        autos.remove(index - 1);
        System.out.println("Vehicle " + index + " Removed");
    }

    public void UpdateVehicle()
    {  // updates Vehicle in list
        System.out.print("\r\nUPDATING VEHICLE\r\n");

        ListVehicles();

        System.out.print("Which vehicle would you like to update? ");
        int index = 0;
        try  // prevents illegal input
        {
            index = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");  // prints failure message
            in.nextLine();
        }
        index--;

        in.nextLine();
        System.out.print("Make [" + autos.get(index).getMake() + "]: ");
        String make = in.nextLine();

        System.out.print("Model [" + autos.get(index).getModel() + "]: ");
        String model = in.nextLine();

        System.out.print("Color [" + autos.get(index).getColor() + "]: ");
        String color = in.nextLine();

        System.out.print("Year [" + autos.get(index).getYear() + "]: ");
        String year = in.nextLine();

        System.out.print("Mileage [" + autos.get(index).getMileage() + "]: ");
        String mileage = in.nextLine();

        if(make.length() > 0)
            autos.get(index).setMake(make);
        if(model.length() > 0)
            autos.get(index).setModel(model);
        if(color.length() > 0)
            autos.get(index).setColor(color);
        if(year.length() > 0)
            autos.get(index).setYear(Integer.parseInt(year));
        if(mileage.length() > 0)
            autos.get(index).setMileage(Integer.parseInt(mileage));

    }

    public void ListVehicle(int index)
    {  // List vehicles
        System.out.println("\r\n");
        System.out.println("Make: " + autos.get(index).getMake());
        System.out.println("Model: " + autos.get(index).getModel());
        System.out.println("Color: " + autos.get(index).getColor());
        System.out.println("Year: " + autos.get(index).getYear());
        System.out.println("Mileage: " + autos.get(index).getMileage());
    }

    public void ListVehicles()
    {   // List vehicles
        System.out.println("Vehicle List");
        System.out.println("Index, Make, Model, Color, Year, Mileage");
        for (int i = 0; i < autos.size(); i++) {
            System.out.println((i + 1) + ". " + autos.get(i).getMake() + ", " + autos.get(i).getModel() + ", " + autos.get(i).getColor() + ", " + autos.get(i).getYear() + ", " + autos.get(i).getMileage());
        }
    }

}

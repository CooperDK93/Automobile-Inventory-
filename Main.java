/* Create a Vehicle Inventory Program for a car dealership. This program will include
 * Vehicle make, model, color, year, and mileage.   The program will allow a user to
 * add, remove, update, and list vehicles.  The program should include default constructors, parameterized
 * constructor, try..catch error handling with failure or success message. */

package com.company;

public class Main {

    // Entry point of the program to manage automobile
    public static void main(String[] args) {

        AutomobileInventory automobileInventory = new AutomobileInventory();
        automobileInventory.MainMenu();

    }
}

//Final Exam.

import java.util.Stack; //To use stack.

public class StackCreature {
    public static void main(String[] args) {

        //Data for creatures and their power levels.
        String[] creatureNames = {"Dragon", "Griffin", "Unicorn", "Phoenix", "Centaur"};
        int[] powerLevel = {95, 88, 78, 92, 85};


        //Sort power levels (Descending order using Bubble Sort).
        bubbleSortDescending(powerLevel, creatureNames);
        System.out.println("\n*** Bubble Sort: Descending Order by Power Level ***");
        printDataWithPower(creatureNames, powerLevel);

        //Sort power levels (Ascending order using Selection Sort).
        selectionSortAscending(powerLevel, creatureNames);
        System.out.println("\n*** Selection Sort: Ascending Order of Power Level ***");
        printDataWithPower(creatureNames, powerLevel);

        //Use bubble sorted data to push creatures onto a stack.
        Stack<String> creatureStack = new Stack<>();
        for (int i = 0; i < creatureNames.length; i++) {
            creatureStack.push(creatureNames[i] + " - " + powerLevel[i]);
        }

        //Pop and display the creature's data from the stack.
        System.out.println("\n*** Stack Implementation: Popping Creatures ***");
        while (!creatureStack.isEmpty()) {
            System.out.println("Popped: " + creatureStack.pop());
        }
    }

    //Bubble Sort algorithm to sort the array in descending order and sort its names.
    public static void bubbleSortDescending(int[] powerLevel, String[] names) {
        int n = powerLevel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (powerLevel[j] < powerLevel[j + 1]) {
                  
                    //To swap the power levels.
                    int tempPower = powerLevel[j];
                    powerLevel[j] = powerLevel[j + 1];
                    powerLevel[j + 1] = tempPower;

                    //To swap the corresponding names.
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    //Selection Sort algorithm to sort the array in ascending order and sort its names.
    public static void selectionSortAscending(int[] powerLevel, String[] names) {
        int n = powerLevel.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (powerLevel[j] < powerLevel[minIdx]) {
                    minIdx = j;
                }
            }
            //To swap the power levels.
            int tempPower = powerLevel[minIdx];
            powerLevel[minIdx] = powerLevel[i];
            powerLevel[i] = tempPower;

            //To swap the corresponding names.
            String tempName = names[minIdx];
            names[minIdx] = names[i];
            names[i] = tempName;
        }
    }

    //To print the elements of an array with their names.
    public static void printData(String[] names, int[] powerLevels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + powerLevels[i]);
        }
    }

    //To print the names and power levels in a given order.
    public static void printDataWithPower(String[] names, int[] powerLevels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + powerLevels[i]);
        }
    }
}

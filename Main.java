import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calorie counter!");

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Please enter your basal metabolic rate: ");
        Integer userBasalMetabolic = scanner.nextInt();

        User user = new User(userName, userBasalMetabolic);
        System.out.println("Welcome " + user.getName() + "!");

        List<Food> allFoods = new ArrayList<>();

        while (true) {
            printMenu();
            System.out.print("Please enter your a command: ");
            Integer command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {

                System.out.print("Please enter the name of the food: ");
                String foodName = scanner.nextLine();

                System.out.print("Please enter the calories of the food: ");
                Integer foodCalories = scanner.nextInt();
                scanner.nextLine();

                Food food = new Food(foodName, foodCalories);
                allFoods.add(food);
                user.eat(food);
                System.out.println("Food added!");

            } else if (command == 2) {
                System.out.println("The total calories are: " + user.getCurrentCalories());
            } else if (command == 3) {
                System.out.println("Name: " + user.getName());
                System.out.println("Basal Metabolic Calories: " + user.getBasalMetabolic());
                System.out.println("Current Calories: " + user.getCurrentCalories());
            } else if (command == 4) {
                for (Food food : allFoods) {
                    System.out.println("================================================");
                    System.out.println("Food Name: " + food.getName());
                    System.out.println("Food Calories: " + food.getCalories().toString());
                    System.out.println("================================================");
                }
            } else if (command == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Add a food");
        System.out.println("2. Total Calories");
        System.out.println("3. Show Users Information");
        System.out.println("4. Show all foods");
        System.out.println("5. Exit");
    }
}
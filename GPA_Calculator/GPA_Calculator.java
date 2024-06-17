import java.util.Scanner;

public class GPA_Calculator {

    // Function to calculate GPA
    public static double calculateGPA(double[] grades, double[] creditHours) {
        double totalPoints = 0;
        double totalCredits = 0;

        for (int i = 0; i < grades.length; i++) {
            totalPoints += grades[i] * creditHours[i];
            totalCredits += creditHours[i];
        }

        return totalPoints / totalCredits;
    }

    // Function to convert letter grades to points
    public static double gradeToPoints(String letterGrade) {
        switch (letterGrade.toUpperCase()) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return -1; // Invalid grade
        }
    }

    // Function to get valid input from user
    public static double getValidInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value < 0) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of courses from the user
        System.out.print("Enter the number of courses: ");
        int numCourses = Integer.parseInt(scanner.nextLine());

        double[] grades = new double[numCourses];
        double[] creditHours = new double[numCourses];

        // Get grades and credit hours for each course
        for (int i = 0; i < numCourses; i++) {
            while (true) {
                System.out.print("Enter the grade for course " + (i + 1) + " (A, B, C, etc. or a number): ");
                String gradeInput = scanner.nextLine().trim();
                if (gradeInput.matches("-?\\d+(\\.\\d+)?")) { // Check if the input is a number
                    grades[i] = Double.parseDouble(gradeInput);
                    break;
                } else {
                    grades[i] = gradeToPoints(gradeInput);
                    if (grades[i] != -1) {
                        break;
                    } else {
                        System.out.println("Invalid grade. Please enter a valid letter grade or a numeric grade.");
                    }
                }
            }
            creditHours[i] = getValidInput(scanner, "Enter the credit hours for course " + (i + 1) + ": ");
        }

        // Calculate GPA
        double gpa = calculateGPA(grades, creditHours);

        // Print the final GPA
        System.out.printf("The cumulative GPA is: %.2f%n", gpa);
    }
                  }

//1) Make up an algorithm
//If the entered number is greater than 7, then print “Hello”
//If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
//There is a numeric array at the input, it is necessary to output array elements that are multiples of 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = readInt(scanner);
        if (num > 7) {
            System.out.println("Hello");
        }

        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if ("John".equals(name))
        {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        System.out.println("Enter the array's size");
        int size = readInt(scanner);
        while (size <=0 ) {
            System.out.println("Please enter the array's size greater than 0");
            size = readInt(scanner);
        }
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt(scanner);
        }
        System.out.println("Array elements that are multiples of 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i] + " ");
            }
        }
        scanner.close();
    }
    private static int readInt (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

//2) Answer the questions
//Given bracket sequence: [((())()(())]]
//Can this sequence be considered correct? - no
//If the answer to the previous question is “no”, then what needs to be changed in it to make it correct?
// - it's needed to change the circle bracket to the square bracket in the beginning of the sequence: [[(())()(())]]
// or change the square bracket to the circle bracket in the end of the sequence: [((())()(()))]
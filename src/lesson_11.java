import java.util.Scanner;

public class lesson_11 {
    public static void main(String[] args) {

        // FIRST TASK

        int[] taskArray = new int [5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first element: ");

        int firstElement = scanner.nextInt();

        System.out.println("Please enter the last element: ");

        int lastElement = scanner.nextInt();




        taskArray[0] = firstElement;
        taskArray[1] = (int)(Math.random() * 100d);
        taskArray[2] = (int)(Math.random() * 100d);
        taskArray[3] = (int)(Math.random() * 100d);
        taskArray[4] = lastElement;

        System.out.println(taskArray[0]);
        System.out.println(taskArray[1]);
        System.out.println(taskArray[2]);
        System.out.println(taskArray[3]);
        System.out.println(taskArray[4]);

        System.out.println("Array length: " + taskArray.length);

        int arraySum = 0;

        for (int i = 0; i < taskArray.length; i++) {
        arraySum += taskArray[i];
        }
        System.out.println("The sum of all the elements of array is: " + arraySum);


// SECOND TASK

        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int counter = 0;

        for (int i = 0; i < 10; i++) {
           if (numArray[i] % 2!= 0 ){
               System.out.println(numArray[i]);
               counter += numArray[i];
            }
        }

        System.out.println("Sum of all odd numbers: " + counter);







    }
}

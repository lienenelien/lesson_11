import java.util.Scanner;

public class lesson_11 {
    public static void main(String[] args) {

        int[] taskArray = new int [5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter the first element: ");

        int firstElement = scanner.nextInt();
        System.out.println("Please enter the last element: ");

        int lastElement = scanner.nextInt();




        taskArray[0] = firstElement;
        taskArray[1] = (int)(Math.random() * 100d);
        taskArray[2] = (int)(Math.random() * 100d);
        taskArray[3] = (int)(Math.random() * 100d);
        taskArray[4] = (int)(Math.random() * 100d);

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




    }
}

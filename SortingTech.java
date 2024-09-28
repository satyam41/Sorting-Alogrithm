import java.util.Arrays;
import java.util.Scanner;

public class SortingTech {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting Technique");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sorting technique which you want to sort the array: ");
        System.out.println("1.Bubble Sort" +
                "2.Selection Sort" +
                "3.Insertion Sort" +
                "4.Cyclic Sort");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                BubbleSort.bubbleSort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                SelectionSort.selectionSort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 3:
                InsertionSort.insertionSort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 4:
                CyclicSort.cyclicSort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("Please enter correct option.");
        }
    }
}

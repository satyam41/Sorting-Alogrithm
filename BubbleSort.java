public class BubbleSort {
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    SwapMethod.swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }


}

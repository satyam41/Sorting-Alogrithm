public class CyclicSort {
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                SwapMethod.swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
}

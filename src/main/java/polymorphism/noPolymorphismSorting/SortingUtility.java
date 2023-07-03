package polymorphism.noPolymorphismSorting;

public class SortingUtility {

    /**
     * Sort the Array
     * @param arr
     * @param reverseSort if true sort in reverse manner(descending) else increasing order
     *
     * if we note this is not generic and is only able to sort in asc or desc manner other cases may lead to a lot of
     *                    if else condition to handle them
     */
    public static void sort(int[] arr, boolean reverseSort){
        for (int i=0; i<arr.length; i++){
            int j=i;
            while (j > 0){
                boolean swapNeeded = reverseSort ? arr[j-1] < arr[j] : arr[j-1] > arr[j];
                if (swapNeeded){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else {
                    break;
                }
            }
        }
    }
}

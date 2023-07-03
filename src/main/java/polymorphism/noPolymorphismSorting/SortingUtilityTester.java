package polymorphism.noPolymorphismSorting;

import java.util.Arrays;

public class SortingUtilityTester {
    public static void main(String[] args){
        int[] arr = new int[]{3,1,-5,6,2,-4,0};
        SortingUtility.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}

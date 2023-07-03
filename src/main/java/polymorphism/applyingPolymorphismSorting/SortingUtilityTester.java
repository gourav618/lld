package polymorphism.applyingPolymorphismSorting;

import java.util.Arrays;

public class SortingUtilityTester {
    public static void main(String[] args){
        int[] arr = new int[]{3,1,-5,6,2,-4,0};

        SortingUtility.sort(arr, new AscendingComparator());
        System.out.println(Arrays.toString(arr));

        SortingUtility.sort(arr, new DescendingComparator());
        System.out.println(Arrays.toString(arr));

        //data sorted in desc order based on absolute value
        //this thing which we did below is called anonymous class for comparator
        SortingUtility.sort(arr, new Comparator() {
            @Override
            public boolean compare(int a, int b) {
                return Math.abs(a) > Math.abs(b);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

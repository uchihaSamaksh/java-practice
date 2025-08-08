package main.java.com.DSAProblems;

public class FindUnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        int[] union = findUnion(arr1, arr2);
        System.out.println(Arrays.toString(union));
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        return union.toArray(new int[0]);
    }

    public static int[] twoPointerApproach(int[] arr1, int[] arr2) {
        int i=0,j=0, k=0;
        int[] union = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length && union.length > k) {
            if(arr1[i] < arr2[j]) {
                union[k++] = arr1[i++];
            } else if(arr1[i] > arr2[j]) {
                union[k++] = arr2[j++];
            } else {
                union[k++] = arr1[i++];
                j++;
            }
        }
        while(i<arr1.length) {
            union[k++] = arr1[i++];
        }
        while(j<arr2.length) {
            union[k++] = arr2[j++];
        }
    }
    
}

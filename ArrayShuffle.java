import java.util.Random;

public class ArrayShuffle {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        ArrayShuffle(arr);
        for (int number : arr) {
            System.out.println(number + " ");
        }
    }
    static void ArrayShuffle(int[] arr){
        int n = arr.length;
        Random num = new Random();
        for(int i = n-1;i>0;i--){
            int j = num.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 
    }
}

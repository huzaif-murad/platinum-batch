/**
 * SecondLargest
 */
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = { 23, 43, 12, 54, 12, 87, 45, 82 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondLargest);
        }
    }
}
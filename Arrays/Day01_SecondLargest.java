package Arrays; 
public class Day01_SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second-largest element");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}



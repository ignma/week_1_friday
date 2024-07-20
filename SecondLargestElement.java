public class SecondLargestElement {
    
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // return -1 or throw an exception as per requirement
        }
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
            return -1; // return -1 or throw an exception as per requirement
        } else {
            return secondMax;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(array);
        System.out.println("The second largest element is " + result + ".");
    }
}

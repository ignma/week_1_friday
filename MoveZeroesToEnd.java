public class MoveZeroesToEnd {

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;  // Pointer to track non-zero elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // If current element is non-zero, move it to the left pointer position
                nums[left++] = nums[i];
            }
        }

        // Fill the rest of the array with zeroes
        while (left < n) {
            nums[left++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 3, 0, 5, 0};
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        moveZeroes(array);
        
        System.out.println("Array after moving zeroes to end: " + Arrays.toString(array));
    }
}

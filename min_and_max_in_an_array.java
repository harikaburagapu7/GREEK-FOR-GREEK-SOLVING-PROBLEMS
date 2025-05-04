// Given an array arr. Your task is to find the minimum and maximum elements in the array.

// Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

// Examples:

// Input: arr[] = [3, 2, 1, 56, 10000, 167]
// Output: 1 10000
// Explanation: minimum and maximum elements of array are 1 and 10000.
// Input: arr[] = [1, 345, 234, 21, 56789]
// Output: 1 56789
// Explanation: minimum and maximum element of array are 1 and 56789.
// Input: arr[] = [56789]
// Output: 56789 56789
// Explanation: Since the array contains only one element so both min & max are same.
// Constraints:
// 1 <= arr.size() <= 105
// 1 <= arr[i] <=109

class min_and_max_in_an_array {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Initialize small and large with extreme values
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update the minimum and maximum values
            if (arr[i] < small) {
                small = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > large) {
                large = arr[i]; // Update max if a larger element is found
            }
        }

        // Return the pair of min and max
        return new Pair<>(small, large);
    }

}

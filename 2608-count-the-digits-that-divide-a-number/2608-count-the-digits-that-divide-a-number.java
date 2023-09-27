class Solution {
    public int countDigits(int num) {
        int temp = num;     // Create a temporary variable to store the original number
        int count = 0;      // Initialize a counter to keep track of qualifying digits
        
        // Iterate through each digit of the number
        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit of the number
            
            // Check if the digit divides the original number evenly
            if (num % digit == 0) {
                count++;            // Increment the counter if the digit qualifies
            }
            
            temp = temp / 10;       // Move to the next digit by removing the last digit
        }
        
        return count;   // Return the final count of digits that divide the number evenly
    }
}
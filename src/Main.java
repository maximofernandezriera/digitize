public class Main {
    public static int[] digitize(long n) {
        // If the number is 0, return an array with a single element 0
        if (n == 0) return new int[]{0};

        // Count the number of digits in the number
        long temp = n;
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        // Create an array of the same length as the number of digits
        int[] result = new int[length];

        // Fill the array with the digits of the number in reverse order
        for (int i = 0; i < length; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test the digitize function with a number
        long number = 35231;
        int[] digits = digitize(number);

        // Print the digits
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}

public class reverse {

    public static void main(String[] args) {
        // Get the number from the command line
        int number = Integer.parseInt(args[0]);

        // Initialize variables
        int reversedNumber = 0;
        int remainder;

        // Reverse the number using a while loop
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number/10;
        }

        // Print the reversed number
        System.out.println("The reversed number is: " + reversedNumber);
    }
}


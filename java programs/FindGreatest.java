public class FindGreatest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int greatest = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        System.out.println("The greatest value in the array is: " + greatest);
    }
}

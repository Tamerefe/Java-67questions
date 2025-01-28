public class fourtyfour {

    public static void main(String[] args) {
        int[] array = { 5, 8, 12, 20, 15, 7, 10, 18, 25, 30 };

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Print the result
        System.out.println("Average: " + average);
    }

}

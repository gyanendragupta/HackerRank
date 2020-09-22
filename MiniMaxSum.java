import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int min = arr[0], max = arr[0];
        long sum = 0;
        for (int i=0; i < arr.length; i++) {
        	if (arr[i] >= max) {
        		max = arr[i];
        	} if (arr[i] <= min) {
        		min = arr[i];
        	}
        	sum = sum + arr[i];
        }
        long minSum = sum - max;
        long maxSum = sum - min;
        System.out.println(minSum +" " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

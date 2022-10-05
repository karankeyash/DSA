public class FrogJump {
    public static void main(String[] YogeshBabY) {

        int[] arr = {10, 20, 50, 50, 50, 10, 50, 150, 50, 10, 30, 60};

        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);

        System.out.println(f(arr, 0, 0, dp));

    }

    static int f(int[] arr, int index, int ans, int[] dp) {

        if (index > arr.length - 2) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }

        int one = Math.abs(arr[index] - arr[index + 1]) + f(arr, index + 1, ans, dp);
        int two = Integer.MAX_VALUE;
        if (index < arr.length - 2) {
            two = Math.abs(arr[index] - arr[index + 2]) + f(arr, index + 2, ans, dp);
        }
        return dp[index] = ans = Math.min(one, two);
    }
}
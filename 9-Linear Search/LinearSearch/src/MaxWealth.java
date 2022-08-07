public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 4, 5},
                {2, 5, 7},
                {11, 2}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        // person = row
        // account = col
        for (int[] person: accounts) {
            //When you start a new col, take a new sum for that row
            int sum = 0;
            for (int account: person){
                sum += account;
            }
            //Now we have sum of acccounts of person.
            //Check with overall ans.
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

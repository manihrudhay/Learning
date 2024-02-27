import java.util.Arrays;

class Solution {
    int[][] dp;
    boolean[] visited;
    int[] nums;
    int n;
    public boolean canTraverseAllPairs(int[] nums) {
        this.nums = nums;
        n = nums.length;
        visited = new boolean[n];
        dp = new int[n][n];
        for(int i=0;i<n;i++) {
            visited[i] = true;
            if(checkPath(i,1)) return true;
            visited[i] = false;
        }
        return false;
    }

    private boolean checkPath(int k,int v) {
        if(v>=nums.length) return true;
        for(int i=0;i<nums.length;i++) {
            if(!visited[i] && findGCD(k,i)>1) {
                visited[i] = true;
                if(checkPath(i,v+1)) return true;
                visited[i] = false;
            }
        }
        return false;
    }


    private int findGCD(int i, int j) {
        if(dp[i][j]!=0) return dp[i][j];
        int a = nums[i],b = nums[j];
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        dp[i][j] =  Math.abs(a); dp[j][i] =  dp[i][j];
        return dp[i][j];
    }
}
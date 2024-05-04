import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int[] prefixDistCount =  new int[n];
        int[] sufixDistCount =  new int[n];

        Set<Integer> set = new HashSet<>();

        for(int i =0;i<n;i++) {
            set.add(nums[i]);
            prefixDistCount[i] = set.size();
        }
        set.clear();
        for(int i =n-1;i>=0;i--) {
            set.add(nums[i]);
            sufixDistCount[i] = set.size();
        }
        int count =0;

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(Math.abs(prefixDistCount[i] -sufixDistCount[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
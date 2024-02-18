import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); // Use reverseOrder to get the maximum element

        int i = 0;
        while (i < n - 1) {
            int rem = heights[i + 1] - heights[i];
            if (rem <= 0) {
                i++;
            } else if (bricks >= rem) {
                bricks -= rem;
                pq.offer(rem);
                i++;
            } else if (ladders > 0) {
                if (!pq.isEmpty() && pq.peek() > rem) {
                    bricks += pq.poll();
                    pq.offer(rem);
                } else {
                    return i;
                }
                ladders--;
            } else {
                return i;
            }
        }
        return n - 1;
    }
}

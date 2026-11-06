
import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int m = queries.length;
        int[] ans = new int[m];

        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        Integer[] idx = new Integer[m];

        for (int i = 0; i < m; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> queries[a] - queries[b]);

        int[] freq = new int[n + 1];

        int left = 0, right = 0, active = 0;

        for (int i : idx) {

            int q = queries[i];

            while (right < logs.length && logs[right][1] <= q) {
                int id = logs[right][0];

                if (freq[id] == 0) active++;

                freq[id]++;
                right++;
            }

            while (left < right && logs[left][1] < q - x) {
                int id = logs[left][0];

                freq[id]--;

                if (freq[id] == 0) active--;

                left++;
            }

            ans[i] = n - active;
        }

        return ans;
    }
}

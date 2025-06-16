package priya;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = obj.merge(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : merged) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}
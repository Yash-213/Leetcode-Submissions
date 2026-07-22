class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime, Collections.reverseOrder());
        Collections.sort(tasks);
        int n = tasks.size() / processorTime.size();
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < processorTime.size(); i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i * n; j < Math.min((i + 1) * n, tasks.size()); j++)
                max = Math.max(max, processorTime.get(i) + tasks.get(j));
            best = Math.max(best, max);
        }
        return best;
    }
}
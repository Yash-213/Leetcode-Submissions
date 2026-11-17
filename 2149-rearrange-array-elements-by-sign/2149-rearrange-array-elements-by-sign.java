class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positiveElem = new ArrayList<>();
        List<Integer> negativeElem = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) negativeElem.add(num);
            else positiveElem.add(num);
        }

        int n = nums.length;
        int[] answer = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i += 2) {
            answer[i] = positiveElem.get(idx);
            answer[i + 1] = negativeElem.get(idx++);
        }
        
        return answer;
    }
}
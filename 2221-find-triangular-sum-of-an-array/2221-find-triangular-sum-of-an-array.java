class Solution {
    public int triangularSum(int[] nums) {

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        while (list.size() != 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                int sum = (list.get(i) + list.get(i - 1)) % 10;
                temp.add(sum);
            }

            list.clear();
            list.addAll(temp);
        }

        return list.get(0);
    }
}
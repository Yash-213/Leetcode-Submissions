class Solution {
    public int thirdMax(int[] nums) {
        Deque<Integer> que = new ArrayDeque<>();

        for (int n : nums) {
            if (que.contains(n))
                continue;

            if (que.size() < 3)
                insertInOrder(que, n);
            else if (n > que.peekFirst()) {
                que.removeFirst();
                insertInOrder(que, n);
            }
        }
        if (que.size() < 3)
            return que.peekLast();
            
        return que.peekFirst();
    }

    private void insertInOrder(Deque<Integer> que, int num) {
        Deque<Integer> temp = new ArrayDeque<>();
        while (!que.isEmpty() && que.peekLast() > num)
            temp.addFirst(que.removeLast());

        que.addLast(num);

        while (!temp.isEmpty())
            que.addLast(temp.removeFirst());
    }
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
    Queue<int[]> que = new LinkedList<>();

    for (int i = 0; i < tickets.length; i++) 
        que.offer(new int[]{i, tickets[i]});

    int t = 0;

    while (!que.isEmpty()) {
        int[] arr = que.poll();
        arr[1]--;
        t++;

        if (arr[1] == 0) {
            if (arr[0] == k) return t;
        } else que.offer(arr);
    }

    return t;
}
}
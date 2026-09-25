class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        
        Deque<Integer> dqe = new ArrayDeque<>();
        Arrays.sort(deck);

        for (int i = n - 1; i > -1; i--) {
            if (!dqe.isEmpty())
                dqe.addFirst(dqe.removeLast());

            dqe.addFirst(deck[i]);
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = dqe.removeFirst();

        return arr;
    }
}
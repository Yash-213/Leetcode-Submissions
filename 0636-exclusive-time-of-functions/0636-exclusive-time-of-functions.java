class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] arr = new int[n];
        Stack<Integer> sk = new Stack<>();

        int prevTime = 0;

        for (String log : logs) {

            String[] s = log.split(":");

            int id = Integer.parseInt(s[0]);
            String t = s[1];
            int time = Integer.parseInt(s[2]);

            if (t.equals("start")) {

                if (!sk.isEmpty()) {
                    arr[sk.peek()] += time - prevTime;
                }

                sk.push(id);
                prevTime = time;

            } else {

                arr[sk.pop()] += time - prevTime + 1;

                prevTime = time + 1;
            }
        }

        return arr;
    }
}

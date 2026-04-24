class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int dist = 0;
        int a = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    dist--;
                    break;
                case 'R':
                    dist++;
                    break;
                default:
                    a++;
            }
        }
        return Math.abs(dist) + a;
    }
}
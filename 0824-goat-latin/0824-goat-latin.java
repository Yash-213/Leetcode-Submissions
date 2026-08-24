class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (String s : sentence.split(" ")) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(0))))
                sb.append(s)
                        .append("ma")
                        .append(addA(i++))
                        .append(" ");
            else
                sb.append(s.substring(1, s.length()))
                        .append(s.charAt(0))
                        .append("ma")
                        .append(addA(i++))
                        .append(" ");
        }
        return sb.toString().trim();
    }

    private static String addA(int n) {
        StringBuilder sb = new StringBuilder();
        while (n-- > 0)
            sb.append("a");
        return sb.toString();
    }
}
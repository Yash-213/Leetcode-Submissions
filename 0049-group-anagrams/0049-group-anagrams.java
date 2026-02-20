class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outerList = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> innerList = new ArrayList<>();
            innerList.add(strs[i]);
            visited[i] = true;

            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j]) continue;

                if (strs[i].length() == strs[j].length()) {
                    char[] ch2 = strs[j].toCharArray();
                    Arrays.sort(ch2);

                    if (Arrays.equals(ch1, ch2)) {
                        innerList.add(strs[j]);
                        visited[j] = true;
                    }
                }
            }

            outerList.add(innerList);
        }

        return outerList;
    }
}
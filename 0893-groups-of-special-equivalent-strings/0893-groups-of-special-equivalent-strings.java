class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> groups = new HashSet<>();

        for (String word : words) {
            List<Character> even = new ArrayList<>();
            List<Character> odd = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0)
                    even.add(word.charAt(i));
                else
                    odd.add(word.charAt(i));
            }

            Collections.sort(even);
            Collections.sort(odd);

            StringBuilder key = new StringBuilder();

            for (char c : even) key.append(c);
            key.append('|');
            for (char c : odd) key.append(c);

            groups.add(key.toString());
        }

        return groups.size();
    }
}
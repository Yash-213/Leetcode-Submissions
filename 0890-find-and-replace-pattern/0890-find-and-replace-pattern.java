class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            char[] freq = new char[26];
            HashSet<Character> set = new HashSet<>();

            if (words[i].length() != pattern.length())
                continue;

            boolean flag = true;
            for (int j = 0; j < pattern.length(); j++) {
                
                int a = pattern.charAt(j) - 'a';
                char c = words[i].charAt(j);

                if (freq[a] == 0 && !set.contains(words[i].charAt(j))) {
                    freq[a] = c;
                    set.add(c);
                } else if (freq[a] != c) {
                    flag = false;
                    break;
                }
            }

            if (flag) list.add(words[i]);
        }
        return list;
    }
}
class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int[] arr = new int[26];
        for(int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                set.add(word.charAt(i));
        }
        for(int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                char a = Character.toLowerCase(word.charAt(i));
                if (arr[a - 'a'] == 0 && set.contains(a)) {
                    count++;
                    arr[a - 'a']++;
                }
            }
        }
        return count;
    }
}
class Solution {
    public String sortVowels(String s) {

        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) 
            if ("AEIOUaeiou".indexOf(c) != -1) list.add(c);

        Collections.sort(list);

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) 
            sb.append("AEIOUaeiou".indexOf(c) != -1 ? list.get(idx++) : c);
        
        return sb.toString();
    }
}
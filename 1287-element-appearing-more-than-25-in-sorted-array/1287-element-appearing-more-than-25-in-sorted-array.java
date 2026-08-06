class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = arr.length / 4;
        for(int num : arr){
           if(map.get(num) > n) return num;
        }
        return -1;
    }
}
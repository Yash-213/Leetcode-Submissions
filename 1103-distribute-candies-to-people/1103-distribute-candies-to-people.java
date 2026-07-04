class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        int x = 1, sum = 0, i = 0;
        int[] arr = new int[n];

        while(sum < candies){
            if(i == n) i = 0;
            if(x <= candies-sum){
                arr[i++] += x;
                sum += x++;
            }
            else{
                arr[i] += candies - sum;
                sum = candies;
            }
        }
        return arr;
    }
}
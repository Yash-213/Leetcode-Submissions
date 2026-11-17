class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int positive = 0; // point +ve element
        int negative = 0; // point -ve element

        int[] answer = new int[n]; 

        boolean flag = true; // first elem is +ve so flag is true

        for (int i = 0; i < n; i++) {
            if (flag) {
                while (nums[positive] < 0) // find positive element
                    positive++; 

                // assign positive element 
                answer[i] = nums[positive++]; 
            } else {
                while (nums[negative] > 0) // find negative element
                    negative++;

                // assign negative element 
                answer[i] = nums[negative++];
            }

            flag = !flag; // convert +ve to -ve or vice versa
        }
        
        // return modified array after rearranging the element
        return answer;
    }
}
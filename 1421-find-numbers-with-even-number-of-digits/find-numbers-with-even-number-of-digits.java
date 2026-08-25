class Solution {
    public int findNumbers(int[] nums) {

        int answer = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int number = nums[i];
            int digit_count = 0;


            while(number > 0)
            {
                number = number / 10;
                digit_count++;
            }
            

            if(digit_count % 2 == 0)
            {
                answer++;
            }
        

        }
        return answer;
        
    }
}
import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        Arrays.fill(answer,1);
        int current =1;
        for(int i=0;i<len;i++)
        {
            answer[i]=answer[i]*current;
            current= nums[i]*current;
        }
        current =1;

        for(int i=len-1;i>=0;i--)
        {
            answer[i]=answer[i]*current;
            current = nums[i]*current;
        }
        return answer;
    }
}

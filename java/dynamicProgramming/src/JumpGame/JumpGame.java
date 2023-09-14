package JumpGame;

public class JumpGame {
    public static void main(String[] args){
        Solution  test=new Solution();
        int[] q={3,2,1,0,4} ;
        int[] w={2,3,1,1,4};
        System.out.println(test.canJump(w));
    }
}


class Solution {
    public int findMax(int[] nums,int i,int j){
        int k= i+1,result=nums[k]+k;
        for(i=i+1;i<=j;i++){
            if(nums[i] +i >result){
                k=i;
                result=nums[k]+k;
            }
        }
        return k;

    }
    public boolean canJump(int[] nums) {
        if(nums.length==0) return true;
        int i=0,j=nums[0];
        for(;i+j <= nums.length && i<nums.length;){
            if(j==0) return false;
            i=findMax(nums,i,i+j);
            j=nums[i];
        }

        return true;
    }
}
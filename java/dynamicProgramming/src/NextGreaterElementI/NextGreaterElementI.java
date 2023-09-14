package NextGreaterElementI;

import java.util.ArrayList;

public class NextGreaterElementI {
    public static void main(String[] args){
        Solution test=new Solution();
        int[] s1={4,1,2};
        int[] s2={1,3,4,2};

        int[] d1={2,4};
        int[] d2={1,2,3,4};

        int[] q1={1,3,5,2,4};
        int[] q2={6,5,4,3,2,1,7};
        test.nextGreaterElement(q1,q2);
    }
}


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result  =new int[10000];
        for(int i=0;i<4000;i++){
            result[i]= -1;
        }

        ArrayList<Integer> notFound=new ArrayList<>();

        for(int i=0;i<nums2.length-1;i++){
            if(nums2[i] <nums2[i+1]){
                result[nums2[i]] =nums2[i+1];
            }
            else{
                notFound.add(i);
            }
            int temp=nums2[i+1];
            for(int j =0; j<notFound.size();j++){
                if(notFound.get(j)!= -1){
                    if(nums2[notFound.get(j)] <temp){
                        result[nums2[notFound.get(j)]]=temp;
                        notFound.set(j,-1);
                    }
                }
            }
        }
        int[] result999=new int[nums1.length];
        for(int i=0;i<result999.length;i++){
            System.out.println(result[nums1[i]]);
            result999[i] = result[nums1[i]];
        }



        return  result999;

    }
}
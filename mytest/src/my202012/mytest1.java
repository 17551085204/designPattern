/*
 * @Author hdk
 * @QQ:2890241339
 **/
package my202012;

import org.junit.Test;

public class mytest1 {
    @Test
    public void printArray(){
        int[]arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] height={1,2,3,2};
        System.out.println(maxArea(height));


    }

    // 双指针法解决盛最多水的问题
    public static int maxArea(int[]height){
        int left=0;
        int right=height.length-1;
        int max=0;
        while (left<right){
            int temp=Math.min(height[left],height[right])*(right-left);
            max=Math.max(temp,max);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }

        }
        return max;


    }




}

/*
 * @Author hdk
 * @QQ:2890241339
 **/
package my202012;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int max=10;
        int[]nums=new int[max];
        for (int i = 0; i <max ; i++) {
            nums[i]=(int)(Math.random()*max);
        }
        sortArray(nums);
        System.out.println(Arrays.toString(nums));

    }


    //快速排序算法
    public static void sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    public static void quickSort(int[] nums,int left,int right){
        if(nums.length==0 || left>right){ //结束递归的条件
            return;
        }
        int base=nums[left]; //定义一个基准数为最左边的数
        int i=left;
        int j=right;
        while(i!=j){ //每一轮排序的终止条件为左边和右边的指针相遇了
            //先从右边往左边遍历查找比基准数小的数，一旦找到就先停下
            while(nums[j]>=base && i<j){
                j--;
            }
            //再从左边往右边遍历查找比基准数大的数，一旦找到就停下
            while(nums[i]<=base && i<j){
                i++;
            }
            //一旦j和i的位置都停下了，说明目标已经确定了，就交互当前j和i位置上的数
            int temp=0;
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        //如果左边和右边的指针相遇了，就交换基准数和当前相遇位置的数
        nums[left]=nums[i];
        nums[i]=base;
        //继续递归调用本方法
        quickSort(nums,left,i-1); //当前i和j相遇位置的左边的那些数组继续这样的操作
        quickSort(nums,i+1,right); //当前i和j相遇位置的右边的那些数组继续这样的操作


    }

}

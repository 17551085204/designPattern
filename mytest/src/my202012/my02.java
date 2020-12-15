/*
 * @Author hdk
 * @QQ:2890241339
 **/
package my202012;

import java.util.Arrays;

public class my02 {
    public static void main(String[] args) {
        int[]arr={6,5,3,7,4,1,2,8};
//        maopaoSort(arr);
        selectSort(arr);


        System.out.println(Arrays.toString(arr));

    }

    // 排序算法
    // 冒泡排序
    public static void maopaoSort(int[]arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {// 排序的次数
            boolean flag=false; // 判断本轮是否有排序
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){ // 如果没有，代表已经排序完成
                break;
            }

        }
    }

    // 旋转排序
    public static void selectSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            /**
             * 每次找最小值
             */
//            int min=arr[i]; // 假定这一轮中的最小值
//            int minIndex=i; // 假定这轮中最小值的下标
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j]<min){
//                    min=arr[j];
//                    minIndex=j;
//                }
//            } // 循环结束后，就得到了本轮的最小值对应的下标
//            // 将本轮中最小值与arr[i]进行交换
//            // 就是每一轮都会将剩余数组元素中最小的值移动到最前面
//            if(minIndex!=i){
//                int temp=arr[i];
//                arr[i]=arr[minIndex];
//                arr[minIndex]=temp;
//            }

            /**
             * 每次找最大值
             */
            int max=arr[arr.length-i-1]; // 假定这一轮中的最大值
            int maxIndex=arr.length-i-1; // 假定这轮中最大值的下标
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            } // 循环结束后，就得到了本轮的最小值对应的下标
            // 将本轮中最小值与arr[i]进行交换
            // 就是每一轮都会将剩余数组元素中最小的值移动到最前面
            if(maxIndex!=arr.length-i-1){
                int temp=arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[maxIndex];
                arr[maxIndex]=temp;
            }

        }
    }

}

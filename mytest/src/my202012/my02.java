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
//        selectSort(arr);
        quickSort(arr,0,arr.length-1);

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

    // 选择排序
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
            } // 循环结束后，就得到了本轮的最大值对应的下标
            // 将本轮中最大值与arr[arr.length-i-1]进行交换
            // 就是每一轮都会将剩余数组元素中最大的值移动到最后面
            if(maxIndex!=arr.length-i-1){
                int temp=arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[maxIndex];
                arr[maxIndex]=temp;
            }

        }
    }


    // 快速排序
    public static void quickSort(int[] arr,int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        //pivot 中轴值
        int pivot = arr[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比pivot 值小放到左边
        //比pivot 值大放到右边
        while( l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while( arr[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while(arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if( l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot值 相等 r--， 前移
            if(arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值 相等 l++， 后移
            if(arr[r] == pivot) {
                l += 1;
            }
        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if(right > l) {
            quickSort(arr, l, right);
        }


    }






}

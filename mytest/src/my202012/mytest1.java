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
        System.out.println("hello world");
    }
}

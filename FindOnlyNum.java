package com.an;

/**
 * 【题目】 找出落单的那个数
 *
 * 一个数组里面除了一个数字外，其他的数字都出现了两次。
 */
public class FindOnlyNum {
    /**
     * 直接对所有元素求异或，相同的元素异或之后为0，0和任何数异或等于该数本身。
     * @param array 给定的数组
     * @return 
     */
    public static int findOnlyNum(int[] array){
        if (array==null || array.length==0)
            return Integer.MAX_VALUE;
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            res ^= array[i];
        }
        return res;
    }

    public static void input(){
        // 手工指定
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(findOnlyNum(arr));
    }

    public static void main(String[] args) {
        input();
    }
}

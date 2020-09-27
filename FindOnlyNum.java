package 郑未.位运算;

import java.util.Random;

/**
 * 位运算的奇巧淫技
 *      1. 判断奇偶数
 *      2. 获取二进位是1还是0（两种解决方案）
 *      3. 交换两个整数变量
 *      4. 不用判断语句，求整数的绝对值
 *
 * 【题目】 找出唯一成对的数
 */
public class FindOnlyNum {
    private final static int N = 11;

    public static void f(int[] arr){
        // 利用辅助元素即可
        int res = 1;
        for (int i = 2; i < N; i++) {
            res ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            res ^=  arr[i];
        }
        System.out.println(res);
    }

    private static void start() {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1);
        }
        // 随机数，可以指定随机种子，每次生成都是同一个数。
        array[N-1] = new Random().nextInt(N-1)+1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        f(array);
    }


    public static void main(String[] args) {
        start();
    }


}

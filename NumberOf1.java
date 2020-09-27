package 郑未.位运算;

/**
 * 题3：二进制中1的个数
 * 例：9的二进制表示为1001，有2位是1
 */
public class NumberOf1 {

    /**
     * 方案一：通过移位的方式进行统计。
     * @param n 待求得数字
     * @return 返回1的个数
     */
    public static int numberOf1_1(int n){
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (1==((n>>>i)&1)){ // 该位是1，无符号右移
                res ++;
            }
        }
        return res;
    }

    /**
     * 方案二：每一次，消去一个1，从低位开始消除
     * @param n 待求得数字
     * @return 返回1的个数
     */
    public static int numberOf1_2(int n){
        int res = 0;
        while (n!=0){
            n = (n & (n-1));
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1_1(8));
        System.out.println(numberOf1_2(8));
    }
}

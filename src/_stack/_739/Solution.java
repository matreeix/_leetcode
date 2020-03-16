package _stack._739;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description: 等待下一个更高气温的天数（单调栈）
 * @Author: 67ng
 * @Date: 2020/3/16
 */
public class Solution {
    public static int[] dailyTemperatures(int[] T) {
        if (T.length == 1) return new int[]{0};

        int[] res = new int[T.length];
        Stack<int[]> s = new Stack<>();
        int index = 0;
        for (int i = 0; i < T.length; ++i) {
            while (!s.isEmpty() && s.peek()[0] < T[i]) {//构造单调栈
                int[] tmp = s.pop();//{T[index],index}
                res[tmp[1]] = i - tmp[1];
            }
            s.push(new int[]{T[i], index++});
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));

    }

}

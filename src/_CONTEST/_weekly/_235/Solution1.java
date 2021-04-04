package _CONTEST._weekly._235;

/**
 * @Description: 5722. 截断句子
 * 句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
 * 例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
 * 给你一个句子 s​​​​​​ 和一个整数 k​​​​​​ ，请你将 s​​ 截断 ​，​​​使截断后的句子仅含 前 k​​​​​​ 个单词。返回 截断 s​​​​​​ 后得到的句子。
 * @Date: 2021/4/4
 */

public class Solution1 {

    public String truncateSentence(String s, int k) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (k > 0) {
            sb.append(strs[idx++]);
            k--;
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}

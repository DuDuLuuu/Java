package com.JDb.compute;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:JDb
 * @Date:2019/9/3
 */

/**
 * 你有一套活字字模 tiles，其中每个字模上都刻有一个字母 tiles[i]。返回你可以印出的非空字母序列的数目。
 示例 1：
 输入："AAB"
 输出：8
 解释：可能的序列为 "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA"。
 示例 2：
 输入："AAABBC"
 输出：188
 */
public class LeetCode_1079_Java {
    public int numTilePossibilities(String tiles) {
        Set rs = new HashSet();
        loop("", tiles, rs);
        System.out.println(rs);
        return rs.size()-1;
    }
    public void loop(String left,String right,Set rs){
        rs.add(left);
        for (int i = 0; i < right.length(); i++) {
            loop(left+right.charAt(i),right.substring(0, i) + right.substring(i + 1),rs);
        }
    }

    public static void main(String[] args) {
        LeetCode_1079_Java obj = new LeetCode_1079_Java();
        int rs = obj.numTilePossibilities("AAB");
        System.out.println(rs);
    }
}

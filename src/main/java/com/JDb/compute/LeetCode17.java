package com.JDb.compute;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JDb
 * @date 2021/3/30
 * @desc
 * @since app-version : 2.24
 */
public class LeetCode17 {
    public static void main(String[] args) {
        LeetCode17 o = new LeetCode17();
        System.out.println(o.letterCombinations("2"));
    }
    public List<String> letterCombinations(String digits) {
        if ("".equals(digits.trim())) {
            return rs;
        }

        for (char c : digits.toCharArray()) {
            Integer num = Integer.valueOf(String.valueOf(c));
            List<String> temp = new ArrayList<>();
            List<String> choose = list.get(num);

            for (String s : choose) {
                if (rs.size() == 0) {
                    temp.add(s);
                } else {
                    for (String r : rs) {
                        temp.add( r+s);
                    }
                }
            }
            rs = temp;

        }
        return rs;
    }

    List<String> rs = new ArrayList<>();
    List<List<String>> list = new ArrayList<List<String>>() {
        {
            add(new ArrayList<>());
            add(new ArrayList<>());
            add(new ArrayList<String>() {
                {
                    add("a");
                    add("b");
                    add("c");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("d");
                    add("e");
                    add("f");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("g");
                    add("h");
                    add("i");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("j");
                    add("k");
                    add("l");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("m");
                    add("n");
                    add("o");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("p");
                    add("q");
                    add("r");
                    add("s");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("t");
                    add("u");
                    add("v");
                }
            });
            add(new ArrayList<String>() {
                {
                    add("w");
                    add("x");
                    add("y");
                    add("z");
                }
            });
        }
    };
}

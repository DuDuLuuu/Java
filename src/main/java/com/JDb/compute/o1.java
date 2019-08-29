package com.JDb.compute;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class o1 {

    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        hashMapGet();

        long endtime = System.currentTimeMillis();
        System.out.println("运行时间" + (endtime - starttime) + "ms");
    }
    static void hashMapGet(){
        Map map = new HashMap();
        for(int i=0;i<10;i++){
            map.putIfAbsent(i, "val" + i);
        }
        System.out.println(
                map.get(3)
        );
    }
    // 动态规划算法例题
    public void compute(int n) {
        int[] p = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 33, 40, 44, 48, 60};

        int[] r = new int[n + 1];
        int[] s = new int[n + 1];
        r[0] = 0;
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (max < p[j - 1] + r[i - j]) {
                    max = p[j - 1] + r[i - j];
                    s[i] = j;
                }
                r[i] = max;
            }
        }
        for (int k = 1; k <= n; k++) {
            if (r[k] > 9 && k < 10) {
                System.out.print(k + "  ");
            } else {
                System.out.print(k + " ");
            }
        }
        System.out.println(" ");
        for (int k = 1; k <= n; k++) {
            System.out.print(r[k] + " ");
        }
        System.out.println(" ");
        for (int k = 1; k <= n; k++) {
            if (r[k] > 9 && s[k] < 10) {
                System.out.print(s[k] + "  ");
            } else {
                System.out.print(s[k] + " ");
            }
        }
    }

    /**
     * 插入算法 从小到大排序
     *
     * @param arr 待排序数组
     */
    public void insertionSortAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];// 正在排序的项，初始第二项
            int j = i - 1;// 待比较项，初始第一项
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];// 正在排序的项，初始为第二项
            int j = i - 1;// 待排序的项，初始为第一项
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 剑指1
    public boolean Find(int target, int[][] array) {
        // 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
        // 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
        boolean flag = false;
        int x = array.length;
        int y = array[0].length;
        if (x == 0 | y == 0) {
            return flag;
        }

        if (array[0][0] > target | array[x - 1][y - 1] < target) {
            return flag;
        } else {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (array[i][j] - target == 0) {
                        flag = true;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }

    // 剑指2
    public String replaceSpace(StringBuffer str) {
        // 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are
        // Happy.则经过替换之后的字符串为We%20Are%20Happy。
        // 方案1
        // return str.toString().replace(" ", "%20");
        // 方案2
        char[] arr = str.toString().toCharArray();
        StringBuffer returnArr = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {

            if (" ".equals(String.valueOf(arr[i]))) {
                returnArr.append("%20");
            } else {
                returnArr.append(arr[i]);
            }
        }

        return returnArr.toString();
    }

    // 剑指3
    // 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    // 剑指4
    // 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    // 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return null;
    }

    // 剑指5
    // 剑指6
    // 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
    // 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int resultVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < resultVal) {
                resultVal = array[i];
            }
        }
        return resultVal;
    }

    // 剑指7
    // 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
    // n<=39
    public int Fibonacci(int n) {
        // 方案1:递归 存在溢出风险
        // int var=0;
        // if(n==0)
        // return var;
        // if(n==1|n==2)
        // return var=1;
        // var=Fibonacci(n-1)+Fibonacci(n-2);
        // return var;
        // 方案2:
        int[] varArr = new int[n + 1];
        varArr[0] = 0;
        if (n != 0) {
            varArr[1] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            varArr[i] = varArr[i - 1] + varArr[i - 2];
        }
        return varArr[n];
    }

    // 剑指8
    // 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
    public int JumpFloor(int target) {
        // 方案1：递归，target过大存在栈内存溢出风险
        // int var = 0;
        // if (target == 1)
        // return 1;
        // if (target == 2)
        // return 2;
        // var = JumpFloor(target - 1) + JumpFloor(target - 2);
        // return var;
        // 方案2:自底向上 存储计算结果
        int[] varArr = new int[target + 1];
        varArr[1] = 1;
        if (target > 1) {
            varArr[2] = 2;
        }
        for (int i = 3; i < target + 1; i++) {
            varArr[i] = varArr[i - 1] + varArr[i - 2];
        }
        return varArr[target];
    }

    // 剑指9
    // 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    public int JumpFloorII(int target) {
        // 方案1：调用函数库
        // return (int) Math.pow(2, target-1);
        // 方案2：最快
        // return 1<<(target-1);
        // 方案3:递归
        if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }

    }

    // 剑指10
    // 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    public int RectCover(int target) {
        // 方案1：递归
        // int var = 0;
        // if (target == 0)
        // return 0;
        // if (target == 1 || target == 2)
        // return target;
        // var = RectCover(target - 1) + RectCover(target - 2);
        // return var;
        // 方案2:
        int valArr[] = new int[target + 1];
        valArr[0] = 0;
        if (target >= 1) {
            valArr[1] = 1;
        }
        if (target >= 2) {
            valArr[2] = 2;
        }

        for (int i = 3; i < target + 1; i++) {
            valArr[i] = valArr[i - 1] + valArr[i - 2];
        }
        return valArr[target];

    }

    // 剑指11
    // 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    public int NumberOf1(int n) {
        int count = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();
        for (char c : arr) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    // 剑指12
    // 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // 剑指13
    // 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
    // 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public void reOrderArray(int[] array) {
        // List<Integer> n=new ArrayList<>();
        // List<Integer> m=new ArrayList<>();
        //
        // for (int i : array) {
        // if(i%2==1) {
        // n.add(i);
        // }else {
        // m.add(i);
        // }
        // }
        // for (int i = 0; i < n.size(); i++) {
        // array[i]=n.get(i);
        // }
        // for(int j=n.size();j<n.size()+m.size();j++) {
        // array[j]=m.get(j-n.size());
        // }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    // 剑指14
    // 剑指15
    // 剑指16
    // 剑指17
    // 剑指18
    // 剑指19
    // 剑指20
    // 剑指21
    // 剑指22
    // 剑指23
    // 剑指24
    // 剑指25
    // 剑指26
    // 剑指27
    // 剑指28
    // 剑指29
    // 剑指30
    // 剑指31
    // 剑指32
    // 剑指33
    // 剑指34
    // 剑指35
    // 剑指36
    // 剑指37
    // 剑指38
    // 剑指39
    // 剑指40
    // 剑指41
    // 剑指42
    // 剑指43
    // 剑指44
    // 剑指45
    // 剑指46
    // 剑指47
    // 剑指48
    // 剑指49
    // 剑指50
    // 剑指51
    // 剑指52
    // 剑指53
    // 剑指54
    // 剑指55
    // 剑指56
    // 剑指57
    // 剑指58
    // 剑指59

}

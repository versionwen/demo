package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/5/9 22:38
 */
/*
把只包含质因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含质因子7。
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Offer58 {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0){
            return 0;
        }
        int p2=0,p3=0,p5=0;//初始化指针
        int[] result=new int[index];
        result[0]=1;
        for(int i=1;i<index;i++){
            result[i]=Math.min(result[p2]*2,Math.min(result[p3]*3,result[p5]*5));
            if (result[i]==result[p2]*2){
                p2++;
            }
            if(result[i]==result[p3]*3){
                p3++;
            }
            if (result[i]==result[p5]*5){
                p5++;
            }
        }
        return result[index-1];
    }

    public static void main(String[] args) {
        Offer58 result=new Offer58();
        System.out.println(result.GetUglyNumber_Solution(4));
    }
}

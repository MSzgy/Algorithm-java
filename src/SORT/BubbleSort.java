package SORT;

/**
 * ClassName BubbleSort
 * Description 冒泡排序 稳定
 * 平均情况、最好情况、最坏情况：O(n^2)
 * Author zgy
 * Date 2020/3/5 12:30
 * Version 1.8
 **/

public class BubbleSort {
    public static int[] solution(int data[]){
        int len = data.length;
        int temp;
        int flag = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j ++){
                if(data[j] > data[j + 1]){
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    flag += 1;
                }
            }
            if(flag == 0){
                System.out.print("sorted" + " ");
                break;
            }
        }
        return data;
    }
}

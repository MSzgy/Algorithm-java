package SORT;
/**
 * ClassName ShellSort
 * Description 希尔排序 不稳定
 * 最好情况：O(n * log n)
 * 最坏情况：O(n * log^2 n)
 * Author zgy
 * Date 2020/3/5 13:18
 * Version 1.8
 **/

public class ShellSort {
    public static int[] solution(int[] data){
        int len = data.length;
        int temp;
        for(int gap = len / 2; gap > 0; gap /= 2){
            for(int i = gap; i < len; i++){
                int flag = i;
                while(flag >= gap && data[flag] < data[flag-gap]){
                    temp = data[flag - gap];
                    data[flag - gap] = data[flag];
                    data[flag] = temp;
                    flag -= gap;
                }
            }
        }
        return data;
    }


}

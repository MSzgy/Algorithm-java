package SORT;

/**
 * ClassName SelectionSort
 * Description 选择排序 不稳定
 * 平均情况 O（n^2)
 * Author zgy
 * Date 2020/3/5 12:20
 * Version 1.8
 **/

public class SelectionSort {
    public static int[] solution(int[] data){
        int len = data.length;
        int min;
        int temp;
        for(int i = 0; i < len; i++){
            min = i;
            for(int j = i + 1; j < len; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }

        return data;
    }
}

package SORT;
/**
 * ClassName InsertSort
 * Description 插入排序, 稳定
 * 最好情况：O(n)
 * 最坏情况：O(n^2)
 * Author zgy
 * Date 2020/3/5 12:37
 * Version 1.8
 **/

public class InsertSort {
    public static int[] solution(int[] data){
        int len = data.length;
        for(int i = 0; i < len - 1; i++){
            int temp = data[i + 1];
            int j = i + 1;
            while(j > 0 && temp < data[j - 1]){
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;

        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {1, 5, 2, 4, 3, 2, 9, 1, 8, 7};
        for(int d : solution(data)){
            System.out.print(d + " ");
        }
    }
}

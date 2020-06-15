package SORT;

/**
 * ClassName QuickSort
 * Description 快速排序：以第一个元素为哨兵
 * Author zgy
 * Date 2020/3/5 14:16
 * Version 1.8
 **/

public class QuickSort {
    public static void solution(int[] data, int first, int end){
        if(first >= end){
            return;
        }else {
//            int rand = first + (int)((end - first) * Math.random());
//            int change = data[rand]; data[rand] = data[first]; data[first] = change;
            int flag = data[first];
            int i = first, j = end;
            while (i < j) {
                while (j > i && data[j] > flag) {
                    j--;
                }
                while (i < j && data[i] <= flag) {
                    i++;
                }
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
            }
            data[first] = data[j];
            data[j] = flag;
            solution(data, first, i - 1);
            solution(data, i + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        solution(data, 0, 8);
        for(int d : data){
            System.out.print(d + " ");
        }
    }


}

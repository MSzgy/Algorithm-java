package SORT;

/**
 * ClassName MergeSort
 * Description 归并排序
 * Author zgy
 * Date 2020/3/5 18:02
 * Version 1.8
 **/

public class MergeSort {
    public static void solution(int[] data, int left, int right){
        int len = data.length;
        int l = left;
        int r = right;
        if(l >= r){
            return;
        }
        else {
            int m = (l + r) / 2;
//            for(int i = left; i <= right; i++){
//                System.out.print(data[i] + " ");
//            }
//            System.out.println();
//            System.out.println("--------------------------");
            solution(data, l, m);
            solution(data, m + 1, r);

            int[] temp1 = new int[m - l + 1];
            int[] temp2 = new int[r - m];

            for(int i = 0; i < m - l + 1; i++){
                temp1[i] = data[l + i];
            }
            for(int i = 0; i < r - m; i++){
                temp2[i] = data[m + 1 + i];
            }

            int j = 0, k = 0, num = 0;

            while(j < m - l + 1 || k < r - m) {
                num++;
                if (j >= m - l + 1 && k < r - m) {
                    data[l + num - 1] = temp2[k++];

                } else if (j < m - l + 1 && k >= r - m) {
                    data[l + num - 1] = temp1[j++];

                } else if (j < m - l + 1 && k < r - m) {
                    if (temp1[j] <= temp2[k]) {
                        data[l + num - 1] = temp1[j++];
                    }
                    else{
                        data[l + num - 1] = temp2[k++];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 2, 1, 2, 9, 7, 8, 2, 4, 5, 1, 2, 3, 2, 1, 0, 9, 4, 12, 3};
        solution(data, 0, data.length - 1);
        for(int d : data){
            System.out.print(d + " ");
        }
    }
}

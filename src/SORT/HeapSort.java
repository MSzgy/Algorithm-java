package SORT;

/**
 * ClassName
 * Description 堆排序
 * Author zgy
 * Date 2020/3/6 14:23
 * Version 1.8
 **/

public class HeapSort {
    public static int[] solution(int[] data){
        int len = data.length;
        int num = 0; int next;
        //从下向上初始堆
        for (int index = (len - 1) / 2; index >= 0; index--) {
            int temp = buildheap(data, index, num);
            while(temp != 0){
                temp = buildheap(data, temp, num);
            }
        }

        //排序
        while(num < len) {
//            swap(data, 0, len - 1 - num);
            for (int index = 0; index <= (len - 1 - num) / 2; index = next) {
                next = buildheap(data, index, num);
                if(next == 0){
                    break;
                }
            }
            swap(data, 0, len - 1 - num);
            num++;
        }
        return data;
    }

    public static int buildheap(int[] data, int index, int num){
        int len = data.length - num;
        int left_son = 2 * index + 1; int right_son = 2 * index + 2;
        if(left_son > len - 1){
            return 0;
        }
        if(right_son > len - 1){
            if(data[index] < data[left_son]){
                swap(data, index, left_son);
                return left_son;
            }
        }
        else {
            if (data[left_son] > data[right_son] && data[index] < data[left_son]) {
                swap(data, index, left_son);
                return left_son;
            } else if(data[left_son] <= data[right_son] && data[index] < data[right_son]){
                swap(data, index, right_son);
                return right_son;
            }
        }
        return 0;
    }

    public static void swap(int[] data, int index, int i){
        int temp = data[index];
        data[index] = data[i];
        data[i] = temp;
    }

    public static void main(String[] args) {
        int[] data = {1, 100, 87, 2, 30, 9, 6, 54, 60, 78, 23, 30, 23, };
//        solution(data);
        for(int d : solution(data)){
            System.out.print(d + " ");
        }
    }


}

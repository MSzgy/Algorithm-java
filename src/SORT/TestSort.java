package SORT;

import com.sun.javafx.collections.MappingChange;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * ClassName TestSort
 * Description TODO
 * Author zgy
 * Date 2020/3/5 12:37
 * Version 1.8
 **/

public class TestSort {
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
//        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        QuickSort.solution(data, 0, data.length - 1);
//        for(int i: data){
//            System.out.print(i + " ");
//        }
        
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File("F:\\算法java实现\\src\\SORT\\data.txt");
            InputStreamReader input = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(input);
            // 按行读取字符串
            String str;
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int length = arrayList.size();
        length = 10000000;
        System.out.println(length);
        int[] data1 = new int[length];
        int[] data2 = new int[length];
        int[] data3 = new int[length];
        int[] data4 = new int[length];
        int[] data5 = new int[length];
        int[] data6 = new int[length];
        int[] data7 = new int[length];


        for(int i = 0; i < length; i++){
            data1[i] = Integer.parseInt(arrayList.get(i%100000));
            data2[i] = Integer.parseInt(arrayList.get(i%100000));
            data3[i] = Integer.parseInt(arrayList.get(i%100000));
            data4[i] = Integer.parseInt(arrayList.get(i%100000));
            data5[i] = Integer.parseInt(arrayList.get(i%100000));
            data6[i] = Integer.parseInt(arrayList.get(i%100000));
            data7[i] = Integer.parseInt(arrayList.get(i%100000));
        }

        long t9 = System.currentTimeMillis();
        ShellSort.solution(data1);
        long t10 = System.currentTimeMillis();
        System.out.println("希尔排序时间" + (t10 - t9));

        long t1 = System.currentTimeMillis();
        QuickSort.solution(data2, 0, data1.length - 1);
        long t2 = System.currentTimeMillis();
        System.out.println("快速排序时间" + (t2 - t1));

        long t11 = System.currentTimeMillis();
        MergeSort.solution(data3, 0, data1.length - 1);
        long t12 = System.currentTimeMillis();
        System.out.println("归并排序时间" + (t12 - t11));

        long t13 = System.currentTimeMillis();
        HeapSort.solution(data4);
        long t14 = System.currentTimeMillis();
        System.out.println("堆排序时间" + (t14 - t13));

        long t7 = System.currentTimeMillis();
        CountSort.solution(data7);
        Arrays.sort(data7);
        long t8 = System.currentTimeMillis();
        System.out.println("计数排序" + (t8 - t7));

        long t3 = System.currentTimeMillis();
        BubbleSort.solution(data7);
        long t4 = System.currentTimeMillis();
        System.out.println("冒泡排序时间" + (t4 - t3));

        long t5 = System.currentTimeMillis();
        InsertSort.solution(data4);
        long t6 = System.currentTimeMillis();
        System.out.println("插入排序时间" + (t6 - t5));



    }
}

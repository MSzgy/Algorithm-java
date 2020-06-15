package Seacrh.BinarySearch;

/**
 * ClassName 找到第一个等于给定值
 * Description TODO
 * Author zgy
 * Date 2020/5/3 16:03
 * Version 1.8
 **/

public class FindFirstequeal {

    public static int solution(int[] data, int target){
        int left = 0; int right = data.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + ((right - left) >> 1);
            if(data[mid] < target){
                left = mid + 1;
            }
            else if(data[mid] > target){
                right = mid - 1;
            }
            else if(data[mid] == target){
                if(mid == 0 || data[mid - 1] != target){
                    return mid;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 1, 2, 2, 3, 4, 5, 6, 9};
        System.out.println(solution(data, 2));
    }
}

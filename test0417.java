//统计一个数字在排序数组中出现的次数。
package lianxi0417;

public class test0417 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,5,5,5,6,6,6};
        int k = 4;
        int a = s.GetNumberOfK(array,k);
        System.out.println(a);
    }
}

class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int a = binarySearch(array,k);
        int count = 0;
        if(a == -1){
            return 0;
        }
        for(int i = a; i > -1;i--){
            if(array[i] == k){
                count ++;
            }else{
                break;
            }
        }
        for(int i = a + 1,len = array.length;i<len;i++){
            if(array[i] == k){
                count ++;
            }else{
                break;
            }
        }
        return count;
    }
    public static int binarySearch(int[] a ,int k){
        int f = 0;
        int l = a.length - 1;
        while(f <= l){
            int mid = ( f + l) / 2;
            if(a[mid] == k){
                return mid;
            }else if(a[mid] > k){
                l = mid - 1 ;
            }else{
                f = mid + 1;
            }
        }
        return -1;
    }
}
//package BasicsOfJava;
public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int low = 0;
        int high =arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid+1;
            }else if(arr[mid]> target){
                high = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,7};
        int target = 1;
        System.out.println(binarySearch(arr,target));
    }
}

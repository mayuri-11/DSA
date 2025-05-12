package Recursion;
class test{
    public static void main(String[] args) {
        int arr[] = {2,0,1};
        insertionSort(arr);
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int key = arr[i];
            for(int j= i-1;(j>=0 && key<arr[j]);j--){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;

            }

            
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

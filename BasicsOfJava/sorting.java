//package BasicsOfJava;
public class sorting {
    public static void main(String[] args) {
        selectionSort();

    }

    public static void selectionSort(){
        int[] arr = {64, 25, 12, 22, 11};
        int minElement = arr[0];

        for(int i =0;i<arr.length; i++){
            for(int j=0; j<arr.length-1;j++){
                if(minElement > arr[j]){
                    minElement = arr[j];
                }
                System.out.print(minElement + " ");

            }
        }

        printArr(arr);
    }

    public static void bubbleSort(){
        // Time complexity = O(n^2)
        int arr[] = {2,5,10,7,1};

        int temp = 0;
        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArr(arr);

    }

    public static void printArr(int arr[]){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class Sorting{
//Bubble Sort---(n^2)
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

//Selection Sort---(n^2)
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos]>arr[j]){
                    min_pos=j;
                }
            }
            //swap
            int temp=arr[min_pos];
            arr[min_pos]=arr[i];
            arr[i]=temp;
        }
    }
//insertion sort---(n^2)
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int sorted=i-1;
            //finding the right position
            for(sorted=i-1;sorted>=0 && arr[sorted]>temp;sorted--){
                    arr[sorted+1]=arr[sorted];
            }
            arr[sorted+1]=temp;
        }
    }
//printing the sorted array
public static void SortedArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
}
System.out.println();
}
    public static void main(String args[]){
        int arr[]={4,5,2,1,3};
        //bubblesort(arr);
        //SelectionSort(arr);
        InsertionSort(arr);
        SortedArray(arr);
    }
}
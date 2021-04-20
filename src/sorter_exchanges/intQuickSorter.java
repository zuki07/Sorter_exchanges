



package sorter_exchanges;


public class intQuickSorter {
    
    private int counter=0;
    public int quickSort(int[] array){
        doQuickSort(array,0,array.length-1);
        return counter;
    }
    
    public int doQuickSort(int[] array, int start, int end){
        int pivot_point;
        if (start<end){
            pivot_point=partition(array, start, end);
            doQuickSort(array, start, pivot_point-1);
            doQuickSort(array, pivot_point+1, end);
        }
        return counter;
    }
    
    private int partition(int[] array, int start, int end){
        int pivot_value, end_of_left_list, mid;
        
        mid=(start+end)/2;
        swap(array, start, mid);
        pivot_value=array[start];
        end_of_left_list=start;
        
        for (int scan=start+1; scan<=end; scan++){
            if (array[scan]<pivot_value){
                end_of_left_list++;
                swap(array, end_of_left_list, scan);
            }
        }
        swap(array, start, end_of_left_list);
        return end_of_left_list;
    }
    
    private void swap(int[] array, int a, int b){
        int temp;
        
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
        counter++;
    }

}

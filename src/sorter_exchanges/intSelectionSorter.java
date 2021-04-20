



package sorter_exchanges;


public class intSelectionSorter {
    
    public static int selectionSort(int[] array, int counter){
        int start_scan, index, min_index, min_value;
        
        for (start_scan=0; start_scan<(array.length-1); start_scan++){
            min_index=start_scan;
            min_value=array[start_scan];
            
            for (index=start_scan+1; index<array.length; index++){
                if (array[index]<min_value){
                    min_value=array[index];
                    min_index=index;
                    counter++;
                }
            }
            array[min_index]=array[start_scan];
            array[start_scan]=min_value;
        }
        
        return counter;
    }

}

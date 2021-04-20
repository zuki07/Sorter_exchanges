



package sorter_exchanges;


public class intInsertionSorter {
    
    public static int insertionSort(int[] array, int counter){
        int unsorted_value, scan;
        
        for (int index=1; index<array.length; index++){
            unsorted_value=array[index];
            scan=index;
            while (scan>0 && array[scan-1]>unsorted_value){
                array[scan]=array[scan-1];
                scan--;
                counter++;
            }
            array[scan]=unsorted_value;
        }
        return counter;
    }

}

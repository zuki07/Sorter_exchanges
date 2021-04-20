



package sorter_exchanges;


public class intBubbleSorter {
    
    public static int bubbleSort(int[] array, int counter){
        int last_position, index, temp;
        
        for (last_position=array.length-1; last_position>=0; last_position--){
            for (index=0; index<=last_position-1; index++){
                if (array[index]>array[index+1]){
                    temp=array[index];
                    array[index]=array[index+1];
                    array[index+1]=temp;
                    counter++;
                }
            }
        }
        return counter;
    }

}

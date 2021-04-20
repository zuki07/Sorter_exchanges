



package sorter_exchanges;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;


public class Sorter_exchanges extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    private int bubble_benchmark=0;
    private int selection_benchmark=0;
    private int insertion_benchmark=0;
    private int quick_sort_benchmark=0;

    @Override
    public void start(Stage primaryStage) {
        int padding_value=8;
        
//                                SETUP BUTTONS
        Button bubble_sort_btn = new Button("Bubble Sort");
        Button selection_sort_btn = new Button("Selection Sort");
        Button insertion_sort_btn = new Button("Insertion Sort");
        Button qiuck_sort_btn = new Button("Quick Sort");
        
//                                SETUP LABELS
        Label bubble_sort_label=new Label();
        Label selection_sort_label=new Label();
        Label insertion_sort_label=new Label();
        Label quick_sort_label=new Label();
        
//                                SETUP ARRAYS
        int[] bubble_array={5,7,8,3,4,12,15,20,54,1,65,21,45,26,18,49,74,81,2,11,38,99};
        int[] selection_array={5,7,8,3,4,12,15,20,54,1,65,21,45,26,18,49,74,81,2,11,38,99};
        int[] insertion_array={5,7,8,3,4,12,15,20,54,1,65,21,45,26,18,49,74,81,2,11,38,99};
        int[] quick_sort_array={5,7,8,3,4,12,15,20,54,1,65,21,45,26,18,49,74,81,2,11,38,99};

//                                BUBBLE SORT BUTTON LAMBDA EVENT
        bubble_sort_btn.setOnAction(event ->{
            bubble_benchmark=intBubbleSorter.bubbleSort(bubble_array, bubble_benchmark);
            bubble_sort_label.setText("Bubble Exchanges: "+bubble_benchmark);
            bubble_sort_label.setPadding(new Insets(padding_value));
        });
        
//                                SELECTION SORT BUTTON LAMBDA EVENT
        selection_sort_btn.setOnAction(event ->{
           selection_benchmark=intSelectionSorter.selectionSort(selection_array, selection_benchmark);
           selection_sort_label.setText("Selection Exchanges: "+selection_benchmark);
           selection_sort_label.setPadding(new Insets(padding_value));
        });
        
//                                INSERTION SORT BUTTON LAMBDA EVENT
        insertion_sort_btn.setOnAction(event ->{
            insertion_benchmark=intInsertionSorter.insertionSort(insertion_array, insertion_benchmark);
            insertion_sort_label.setText("Insertion Exchanges: "+insertion_benchmark);
            insertion_sort_label.setPadding(new Insets(padding_value));
        });
        
//                                QUICK SORT BUTTON LAMBDA EVENT
        qiuck_sort_btn.setOnAction(event ->{
            intQuickSorter QuickSorter=new intQuickSorter();
            quick_sort_benchmark=QuickSorter.quickSort(quick_sort_array);
            quick_sort_label.setText("Quick Sort Exchanges: "+quick_sort_benchmark);
            quick_sort_label.setPadding(new Insets(padding_value));
        });

//                                SETUP VBOX
        VBox vbox=new VBox(bubble_sort_btn, bubble_sort_label,
                            selection_sort_btn, selection_sort_label,
                            insertion_sort_btn, insertion_sort_label,
                            qiuck_sort_btn, quick_sort_label);
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(18);
//                                SETUP SCENE
        Scene scene = new Scene(vbox, 550, 550);
        scene.getStylesheets().add("styles.css");

        primaryStage.setTitle("Sort Exchanges");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

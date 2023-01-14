package views;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FieldsPane extends Pane {
    private TextField salesField, revenueField, saleField;

    public TextField getSalesField(){return salesField;}
    public TextField getSaleField(){return saleField;}
    public TextField getRevenueField(){return revenueField;}

    public FieldsPane(){
        Pane innerPane = new Pane();
        salesField = new TextField("0");
        salesField.setPrefSize(90,10);
        salesField.relocate(0,0);

        revenueField = new TextField("0.00");
        revenueField.setPrefSize(90,10);
        revenueField.relocate(0,30);

        saleField = new TextField("N/A");
        saleField.setPrefSize(90,10);
        saleField.relocate(0,60);


        innerPane.getChildren().addAll(salesField,revenueField,saleField);
        getChildren().addAll(innerPane);
    }
}

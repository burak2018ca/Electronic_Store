package views;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class FieldsLabelPane extends Pane {
    private Label salesLabelField, revenueLabelField, saleLabelField;

    public FieldsLabelPane(){
        Pane innerPane = new Pane();
        salesLabelField = new Label("# Sales: ");
        salesLabelField.relocate(9,0);

        revenueLabelField = new Label("Revenue: ");
        revenueLabelField.relocate(0,30);

        saleLabelField = new Label("$/Sale:");
        saleLabelField.relocate(11,60);

        innerPane.getChildren().addAll(salesLabelField, revenueLabelField, saleLabelField);
        getChildren().addAll(innerPane);
    }
}
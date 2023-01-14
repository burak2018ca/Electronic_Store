package views;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.*;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import models.ElectronicStore;


public class ElectronicStoreView extends Pane {
    private FieldsPane fieldsPane;
    private FieldsLabelPane fieldsLabelPane;
    private TitleLabelsPane titleLabelsPane;
    private ListsPane listsPane;
    private ButtonsPane buttonsPane;

    public ListsPane getListsPane(){return listsPane;}
    public FieldsPane getFieldsPane(){return fieldsPane;}
    public ButtonsPane getButtonsPane(){return buttonsPane;}

    public ElectronicStoreView(){
        fieldsPane = new FieldsPane();
        fieldsPane.relocate(80,40);

        fieldsLabelPane = new FieldsLabelPane();
        fieldsLabelPane.relocate(20,40);

        titleLabelsPane = new TitleLabelsPane();
        titleLabelsPane.relocate(20,10);

        listsPane = new ListsPane();
        listsPane.relocate(10,10);

        buttonsPane = new ButtonsPane();
        buttonsPane.relocate(25,330);

        getChildren().addAll(fieldsPane, fieldsLabelPane, titleLabelsPane, listsPane, buttonsPane);
        setPrefSize(800, 400);
    }


}

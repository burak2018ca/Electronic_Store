package views;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class TitleLabelsPane extends Pane {
    private Label storeSummary, storeStock, currentCart, mostPopularItems;

    public TitleLabelsPane(){
        Pane innerPane = new Pane();
        storeSummary = new Label("Store Summary: ");
        storeSummary.relocate(20,10);

        storeStock = new Label("Store Stock: ");
        storeStock.relocate(275,10);

        currentCart = new Label("Current Cart ($0.00):");
        currentCart.relocate(580,10);

        mostPopularItems = new Label("Most Popular Items: ");
        mostPopularItems.relocate(11,130);

        innerPane.getChildren().addAll(storeSummary, storeStock, currentCart, mostPopularItems);
        getChildren().addAll(innerPane);
    }
}
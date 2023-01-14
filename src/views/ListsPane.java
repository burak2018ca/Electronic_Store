package views;

import controllers.ElectronicStoreApp;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import models.ElectronicStore;

public class ListsPane extends Pane {
    private ListView<String> mostPopularItemList, storeStockList, currentCartList;

    public ListView<String> getStoreStockList(){return storeStockList;}
    public ListView<String> getCurrentCartList(){return  currentCartList;}
    public ListView<String> getMostPopularItemList(){return mostPopularItemList;}

    public ListsPane(){
        Pane innerPane = new Pane();

        mostPopularItemList = new ListView<>(ElectronicStore.createStore().getPopularItemsList());
        mostPopularItemList.setPrefSize(150,150);
        mostPopularItemList.relocate(5,160);

        storeStockList = new ListView<>();
        storeStockList.setPrefSize(300,280);
        storeStockList.relocate(170,30);
        storeStockList.setItems(ElectronicStore.createStore().getStockList());

        currentCartList = new ListView<>();
        currentCartList.setPrefSize(300,280);
        currentCartList.relocate(480,30);


        innerPane.getChildren().addAll(mostPopularItemList, storeStockList, currentCartList);
        getChildren().addAll(innerPane);
    }
}
package controllers;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.ElectronicStore;
import views.ElectronicStoreView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.collections.FXCollections;
import javafx.event.*;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

public class ElectronicStoreApp extends Application {
    ElectronicStore model;
    Pane aPane;

    public  ElectronicStoreApp(){model = ElectronicStore.createStore();}

    public void start(Stage primaryStage){
        aPane = new Pane();
        ElectronicStoreView view = new ElectronicStoreView();
        aPane.getChildren().add(view);

        primaryStage.setTitle("Electronic Store Application - " + ElectronicStore.createStore().getName());
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane));
        primaryStage.show();

        view.getListsPane().getStoreStockList().setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int selectedItemIndex = view.getListsPane().getStoreStockList().getSelectionModel().getSelectedIndex();
                view.getListsPane().getStoreStockList().getSelectionModel().select(selectedItemIndex);
                view.getButtonsPane().getAddToCartButton().setDisable(false);
            }
        });

        view.getButtonsPane().getAddToCartButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int selectedItemIndex = view.getListsPane().getStoreStockList().getSelectionModel().getSelectedIndex();
                String item  = view.getListsPane().getStoreStockList().getSelectionModel().getSelectedItem();

            }
        });
    }
}

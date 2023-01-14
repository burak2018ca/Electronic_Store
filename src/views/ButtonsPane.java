package views;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonsPane extends Pane {
    private Button resetStore, addToCart, removeFromCart, completeSale;

    public Button getResetButton(){ return resetStore;}
    public Button getAddToCartButton(){ return addToCart;}
    public Button getRemoveFromCartButton(){ return removeFromCart;}
    public Button getCompleteSaleButton(){ return completeSale;}

    public ButtonsPane(){
        Pane innerPane = new Pane();

        resetStore = new Button("Reset Store");
        resetStore.setStyle("-fx-font: 12 arial;");
        resetStore.setPrefSize(120,40);
        resetStore.relocate(0,0);

        addToCart = new Button("Add to Cart");
        addToCart.setStyle("-fx-font: 12 arial;");
        addToCart.setPrefSize(120,40);
        addToCart.relocate(260,0);
        addToCart.setDisable(true);

        removeFromCart = new Button("Remove from Cart");
        removeFromCart.setStyle("-fx-font: 12 arial;");
        removeFromCart.setPrefSize(150,40);
        removeFromCart.relocate(465,0);
        removeFromCart.setDisable(true);

        completeSale = new Button("Complete Sale");
        completeSale.setStyle("-fx-font: 12 arial;");
        completeSale.setPrefSize(150,40);
        completeSale.relocate(615,0);
        completeSale.setDisable(true);

        innerPane.getChildren().addAll(resetStore, addToCart, removeFromCart, completeSale);
        getChildren().addAll(innerPane);

    }

}

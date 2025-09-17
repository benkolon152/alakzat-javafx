package com.example.javafxalakzat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class AlakzatController {
    @FXML
    public ListView<String> list_view_rand;
    public ToggleGroup shape_group;
    public ToggleGroup color_group;
    public ImageView imgview_alakzat;
    public Pane pane_alakzat;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onPirosSelect(ActionEvent actionEvent) {
        pane_alakzat.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
    }

    public void onKekSelect(ActionEvent actionEvent) {
        pane_alakzat.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
    }

    public void onZoldSelect(ActionEvent actionEvent) {
        pane_alakzat.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
    }
}
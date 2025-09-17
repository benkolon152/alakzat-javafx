package com.example.javafxalakzat;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AlakzatController {
    @FXML
    public ListView<String> list_view_rand;
    public ToggleGroup shape_group;
    public ToggleGroup color_group;
    public ImageView imgview_alakzat;
    public Pane pane_alakzat;
    public RadioButton red_button;
    public RadioButton blue_button;
    public RadioButton green_button;
    public RadioButton square_button;
    public RadioButton circle_button;
    public RadioButton triangle_button;
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

    public void onNegyzetSelect(ActionEvent actionEvent) throws FileNotFoundException {
        imgview_alakzat.setImage(new Image("file:icons/negyzet.png"));
    }

    public void onKorSelect(ActionEvent actionEvent) {
        imgview_alakzat.setImage(new Image("file:icons/kor.png"));
    }

    public void onHaromSelect(ActionEvent actionEvent) {
        imgview_alakzat.setImage(new Image("file:icons/haromszog.png"));
    }

    public void onHozaadClick(ActionEvent actionEvent) {
        ObservableList<String> listviewLines = list_view_rand.getItems();

        String newLine = "";

        if (red_button.isSelected()){
            newLine += "Piros, ";
        }
        if (green_button.isSelected()){
            newLine += "Zöld, ";
        }
        if (blue_button.isSelected()){
            newLine += "Kék, ";
        }

        if (square_button.isSelected()){
            newLine += "Négyzet";
        }
        if (circle_button.isSelected()){
            newLine += "Kör";
        }
        if (triangle_button.isSelected()){
            newLine += "Háromszög";
        }

        if(!newLine.isEmpty()) listviewLines.add(newLine);

        //listviewLines.add("Piros, kör");
        list_view_rand.setItems(listviewLines);
        list_view_rand.getSelectionModel().selectLast();
    }
}
package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;


public class Scene15Controller {
    @FXML private boolean isReceiptPressed = false;
    @FXML private boolean isATMPressed = false;
    @FXML private Text text;
    @FXML private Button one;

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = (Stage) one.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();
            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    private void cardSlotPressed(){
        isATMPressed = true;

        if (isATMPressed && isReceiptPressed)
            text.setText("Have a nice day!");
    }

    @FXML
    private void receiptPressed(){
        isReceiptPressed = true;

        if (isATMPressed && isReceiptPressed)
            text.setText("Have a nice day!");
    }
}

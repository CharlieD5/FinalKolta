package com.KoltaATM;

import javafx.fxml.FXML;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Scene4Controller {

    @FXML private Button one;

    @FXML
    public void toScreenOne() throws IOException {

            try {
                Stage newStage = (Stage) one.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root, 500, 500);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException io){
                io.printStackTrace();
            }
    }

}

package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

//WELCOME SCREEN WITH CARD NUMBER
public class Scene1Controller {

    @FXML private String cardFromButton = "";
    @FXML private Button one;
    @FXML private Text text;

    private void loadPage(String page, int scenePage){
        try
        {
            Stage newStage = (Stage) one.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage)
            {
                case 2:
                    Scene2Controller controller2 = loader.getController();
                    controller2.cardNumberFromScene1(cardFromButton);
                    break;
            }

            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    private void clearEntry() {
        cardFromButton = "";
        text.setText("Account Number: " + cardFromButton);
    }

    @FXML
    public void toPinEntry() throws IOException {

        if (cardFromButton.equals("123456") || cardFromButton.equals("654321"))
            loadPage("scene2.fxml", 2); //pin page
        else
            loadPage("scene4.fxml", 4); //card is kept page

    }


    @FXML
    private void oneButtonMethod(){

        cardFromButton = cardFromButton + "1";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void twoButtonMethod(){
        cardFromButton = cardFromButton + "2";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void threeButtonMethod(){
        cardFromButton = cardFromButton + "3";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void fourButtonMethod(){
        cardFromButton = cardFromButton + "4";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void fiveButtonMethod(){
        cardFromButton = cardFromButton + "5";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void sixButtonMethod(){
        cardFromButton = cardFromButton + "6";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void sevenButtonMethod(){
        cardFromButton = cardFromButton + "7";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void eightButtonMethod(){
        cardFromButton = cardFromButton + "8";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void nineButtonMethod(){
        cardFromButton = cardFromButton + "9";
        text.setText("Account Number: " + cardFromButton);
    }
    @FXML
    private void zeroButtonMethod(){
        cardFromButton = cardFromButton + "0";
        text.setText("Account Number: " + cardFromButton);
    }
}

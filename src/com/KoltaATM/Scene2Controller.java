package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

//SCREEN WITH PIN ENTRY
public class Scene2Controller {

    @FXML private String pinFromButton = "";
    @FXML private String cardNumber = "";
    @FXML private Button one;
    @FXML private Text text;

    @FXML //clear pin entry
    private void clearEntry() {
        pinFromButton = "";
        text.setText("PIN: " + pinFromButton);
    }

    @FXML
    public void cardNumberFromScene1(String card) {
        cardNumber = card;
    }

    @FXML //cancel was clicked
    private void toScreenOne() throws IOException {
        loadPage("scene1.fxml", 1);
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = (Stage) one.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 3:
                    Scene3Controller controller3 = loader.getController();
                    controller3.pinEntryToIncorrectPin(cardNumber);
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
    private void toTransactionType() throws IOException {
        if ((cardNumber.equals("123456") && pinFromButton.equals("1234")) || (cardNumber.equals("654321") && pinFromButton.equals("4321")))
            loadPage("scene5.fxml", 5); //pin page
        else
            loadPage("scene3.fxml", 3); //card is kept page
    }


    @FXML
    private void oneButtonMethod(){
        pinFromButton = pinFromButton + "1";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void twoButtonMethod(){
        pinFromButton = pinFromButton + "2";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void threeButtonMethod(){
        pinFromButton = pinFromButton + "3";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void fourButtonMethod(){
        pinFromButton = pinFromButton + "4";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void fiveButtonMethod(){
        pinFromButton = pinFromButton + "5";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void sixButtonMethod(){
        pinFromButton = pinFromButton + "6";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void sevenButtonMethod(){
        pinFromButton = pinFromButton + "7";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void eightButtonMethod(){
        pinFromButton = pinFromButton + "8";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void nineButtonMethod(){
        pinFromButton = pinFromButton + "9";
        text.setText("PIN: " + pinFromButton);
    }
    @FXML
    private void zeroButtonMethod(){
        pinFromButton = pinFromButton + "0";
        text.setText("PIN: " + pinFromButton);
    }

}

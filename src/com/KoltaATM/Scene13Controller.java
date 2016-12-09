package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

//INSERT DEPOSIT PAGE
public class Scene13Controller {

    @FXML private double balanceTot = 0;
    @FXML private String dFromButton = "";
    @FXML private Text text;
    @FXML private Button one;
    private int decimalCount = 0;

    public void balanceFromOthers(double balance){
        balanceTot = balance;
    }

    @FXML
    private void toScreenOne(){
        loadPage("scene1.fxml", 1);
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = (Stage) one.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 12:
                    Scene12Controller controller12 = loader.getController();
                    controller12.balanceFromOthers(balanceTot);
                    break;
                case 14:
                    Scene14Controller controller14 = loader.getController();
                    controller14.balanceFromOthers(balanceTot);
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
    private void clearButtons(){
        dFromButton = "";
        text.setText("Deposit Amount: " + dFromButton);
    }

    @FXML private void depositSlotSelected(){
        double deposit = 0;
        Random r = new Random();
        int rand = r.nextInt(10 - 1) + 1;

        if (rand == 5)
            loadPage("scene12.fxml", 12);
        else {
            try{
                deposit = Double.parseDouble(dFromButton);
                balanceTot += deposit;
            } catch (NumberFormatException n){
                n.printStackTrace();
            }
            loadPage("scene14.fxml", 14);
        }
    }

    private boolean isTwoDecimalPlaces(String depositEntered){
        int check = depositEntered.indexOf('.');
        if (check == -1) { //no decimal
            return false;
        }
        else { //decimal entered
            if (decimalCount < 2)
            {
                decimalCount++;
                return false;
            }
            else
                return true;
        }

    }
    @FXML
    private void decimalButtonMethod(){
        int check = dFromButton.indexOf('.');
        if (check == -1) {
            dFromButton = dFromButton + ".";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void oneButtonMethod(){

        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "1";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void twoButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "2";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void threeButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "3";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void fourButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "4";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void fiveButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "5";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void sixButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "6";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void sevenButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton))
        {
        dFromButton = dFromButton + "7";
        text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void eightButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "8";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void nineButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "9";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
    @FXML
    private void zeroButtonMethod(){
        if (!isTwoDecimalPlaces(dFromButton)) {
            dFromButton = dFromButton + "0";
            text.setText("Deposit Amount: " + dFromButton);
        }
    }
}

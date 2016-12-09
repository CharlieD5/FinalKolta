package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

//SELECT TRANSACTION BALANCE,DEPOSIT,WITHDRAWAL
public class Scene5Controller {

    @FXML private double balanceTot = 1000;
    @FXML private Text text;
    @FXML private Button one;

    public void balanceFromOthers(double balance){
        balanceTot = balance;
    }

    @FXML
    private void toBalanceScreen(){
        loadPage("scene6.fxml", 6);
    }
    @FXML
    private void toWithdrawalScreen(){
        loadPage("scene7.fxml", 7);
    }
    @FXML
    private void toDepositScreen(){
        loadPage("scene13.fxml", 13);
    }

    @FXML //cancel clicked
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
                case 6:
                    Scene6Controller controller6 = loader.getController();
                    controller6.balanceFromOthers(balanceTot);
                    break;
                case 7:
                    Scene7Controller controller7 = loader.getController();
                    controller7.balanceFromOthers(balanceTot);
                    break;
                case 13:
                    Scene13Controller controller13 = loader.getController();
                    controller13.balanceFromOthers(balanceTot);
                    break;
            }

            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

}

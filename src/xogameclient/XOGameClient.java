/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameclient;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Raiaan
 */
public class XOGameClient extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = new WelcomeXOScreen(stage);
        // Parent root = new RegisterBase() ;
        //Parent root = new playerProfileBase();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

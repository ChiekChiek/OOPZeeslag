package Zeeslag;
/*

 */

import Zeeslag.GuiZeeslag;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        new GuiZeeslag(root);
        primaryStage.setTitle("Zeeslag");
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



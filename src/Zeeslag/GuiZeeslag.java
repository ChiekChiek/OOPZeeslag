package Zeeslag;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;



public class GuiZeeslag
{
    private final Button buttonHostGame, buttonJoinGame;

    public GuiZeeslag(GridPane root)
    {
        buttonHostGame = new Button("host game");
        buttonJoinGame = new Button("join Game");

        buttonJoinGame.setOnAction(event ->
        {
            new GuiJoin(root);
            buttonJoinGame.setDisable(true);
            buttonHostGame.setDisable(false);
            buttonHostGame.setVisible(false);
            buttonJoinGame.setVisible(false);



        });

        buttonHostGame.setOnAction(event ->
        {
            new GuiHost(root);
            buttonHostGame.setDisable(true);
            buttonJoinGame.setDisable(false);
            buttonHostGame.setVisible(false);
            buttonJoinGame.setVisible(false);
        });

        root.add(buttonHostGame, 3, 1);
        root.add(buttonJoinGame, 3, 2);


    }

    public void goJoin(Stage primaryStage)
    {
        GridPane root = new GridPane();
        new GuiJoin(root);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
    }

    public void goHost(Stage primaryStage)
    {
        GridPane root = new GridPane();
        new GuiHost(root);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
    }
}

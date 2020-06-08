package Zeeslag;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GuiZeeslag
{
    private final Button buttonHostGame,buttonJoinGame;

    public GuiZeeslag(GridPane root)
    {
        buttonHostGame = new Button("host game");
        buttonJoinGame = new Button("join Game");

        buttonJoinGame.setOnAction(event ->{



        });

        buttonHostGame.setOnAction(event -> {


        });


        root.add(buttonHostGame,3,1);
        root.add(buttonJoinGame,3,2);

    }
}

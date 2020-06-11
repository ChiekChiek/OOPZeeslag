package Zeeslag;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.xml.soap.Text;


public class GuiJoin
{
    private final Button buttonConnectGame ;
    private Label lblDbPassword,lblDbName,lblGamename;
    private TextField txbDbPassword,txbDbName,txbGameName;



    public GuiJoin(GridPane root){
        Label lblDbPassword = new Label("Paswword :");
        Label lblDbName = new Label("Database :");
        Label lblDbGamename = new Label("Game name:");
        TextField txtbDbPassword = new TextField();
        TextField txtbDbName = new TextField();
        TextField txtbDbGameName = new TextField();
        buttonConnectGame = new Button("Connect Game");


        buttonConnectGame.setOnAction(event ->{
        });

        root.add(buttonConnectGame,3,5);
        root.add(lblDbPassword,3,2);
        root.add(lblDbName,3,3);
        root.add(lblDbGamename,3,4);
        root.add(txtbDbPassword,4,2);
        root.add(txtbDbName,4,3);
        root.add(txtbDbGameName,4,4);
    }
}

package Zeeslag;

import java.awt.*;

public class GuiJoin
{
    private final Button btnConnect;
    private final Label lblDbPassword,lblDbName,lblGamename;
    private final TextField txbDbPassword,txbDbName,txbGameName;



    public GuiJoin(Button connect, Label password, Label name, Button btnConnect, Label lblPassword, Label lblName, TextField txbPassword, TextField txbName, Label lblDbPassword, Label lblDbName, Label lblGamename, TextField txbDbPassword, TextField txbDbName, TextField txbGameName)
    {
        this.btnConnect = btnConnect;
        this.lblDbPassword = lblDbPassword;
        this.lblDbName = lblDbName;
        this.lblGamename = lblGamename;
        this.txbDbPassword = txbDbPassword;
        this.txbDbName = txbDbName;

        this.txbGameName = txbGameName;
    }
}

package Zeeslag;

import java.util.ArrayList;

public class Bord
{
    ArrayList<Schip2> Schips;

//    Constructor
    public Bord(ArrayList<Schip2> Schips)
    {
        this.Schips = Schips;
    }

//    get-set arraylist schip
    public ArrayList<Schip2> getSchips()
    {
        return Schips;
    }

    public void setSchips(ArrayList<Schip2> Schips)
    {
        this.Schips = Schips;
    }


}

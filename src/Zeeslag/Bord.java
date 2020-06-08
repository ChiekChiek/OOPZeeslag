package Zeeslag;

import java.util.ArrayList;

public class Bord
{
    ArrayList<Schip> Schips;

//    Constructor
    public Bord(ArrayList<Schip> Schips)
    {
        this.Schips = Schips;
    }

//    get-set arraylist schip
    public ArrayList<Schip> getSchips()
    {
        return Schips;
    }

    public void setSchips(ArrayList<Schip> Schips)
    {
        this.Schips = Schips;
    }


}

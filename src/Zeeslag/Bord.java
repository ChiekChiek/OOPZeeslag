package Zeeslag;

import java.util.ArrayList;

public class Bord
{
    ArrayList<schip> schips;

//    Constructor
    public Bord(ArrayList<schip> schips)
    {
        this.schips = schips;
    }

//    get-set arraylist schip
    public ArrayList<schip> getSchips()
    {
        return schips;
    }

    public void setSchips(ArrayList<schip> schips)
    {
        this.schips = schips;
    }


}

package Zeeslag;

import java.util.ArrayList;

public class Schip
{
    String name;
    ArrayList<Position> posities;
    Boolean allhit = false;

//    Constructor

    public Schip(String name, ArrayList<Position> posities, Boolean allhit)
    {
        this.name = name;
        this.posities = posities;
        this.allhit = allhit;
    }

//    get-set Name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

//    get-set position
    public ArrayList<Position> getPosities()
    {
        return posities;
    }

    public void setPosities(ArrayList<Position> posities)
    {
        this.posities = posities;
    }

//    get-set all_hit
    public Boolean getAllhit()
    {
        return allhit;
    }

    public void setAllhit(Boolean allhit)
    {
        this.allhit = allhit;
    }
}

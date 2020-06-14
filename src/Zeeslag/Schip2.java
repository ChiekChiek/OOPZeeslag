package Zeeslag;

import java.util.ArrayList;

public class Schip2
{

    private String name;
    private ArrayList<Position> positieslist;
    private Boolean allhit = false;

//    Constructor

    public Schip2(String name)
    {
        this.name = name;
        positieslist = new ArrayList<>();

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
        return positieslist;
    }

    public void setPosities(ArrayList<Position> posities)
    {
        this.positieslist = posities;
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

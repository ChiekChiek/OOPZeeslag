package Zeeslag;

public class Position
{

    String Xcord;
    String Ycord;
    Boolean hit;

//    Constructor
    public Position(String xcord, String ycord, Boolean hit)
    {
        Xcord = xcord;
        Ycord = ycord;
        this.hit = hit;
    }

//    get-set xcord
    public String getXcord()
    {
        return Xcord;
    }

    public void setXcord(String xcord)
    {
        Xcord = xcord;
    }

//    get-set ycord
    public String getYcord()
    {
        return Ycord;
    }

    public void setYcord(String ycord)
    {
        Ycord = ycord;
    }

//    get-set hit(boolean)
    public Boolean getHit()
    {
        return hit;
    }

    public void setHit(Boolean hit)
    {
        this.hit = hit;
    }


}

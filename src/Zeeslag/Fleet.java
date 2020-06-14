package Zeeslag;

public class Fleet
{
    private Schip2 aircraftcarrier,destroyer1,destroyer2,submarine,hunter;
    public Fleet()
    {
        aircraftcarrier = new Schip2("Donager");
        //aircraftcarrier.setPosities(10,10,10,11,10,12,10,13,10,14);
        destroyer1 = new Schip2("10original");
        //destroyer1.setPosities(10);
        destroyer2 = new Schip2("11original");
       //destroyer2.setPosities();
        submarine = new Schip2("silintfox");
       //submarine.setPosities();
        hunter = new Schip2("silintfox");
       //hunter.setPosities();
    }
}

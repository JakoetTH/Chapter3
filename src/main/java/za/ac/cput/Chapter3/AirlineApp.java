package za.ac.cput.Chapter3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class AirlineApp
{
    private ArrayList aList = new ArrayList();
    private HashSet hSet = new HashSet();
    private HashMap hMap = new HashMap();
    public AirlineApp()
    {
        aList.add("Mango 103");
        hSet.add("Thawhir Jakoet");
        hMap.put("0","London");
    }
    public ArrayList<String> getList()
    {
        return aList;
    }
    public HashSet<String> getSet()
    {

        return hSet;
    }
    public HashMap<String,String> getMap()
    {
        return hMap;
    }
    public static void main( String[] args )
    {
        AirlineApp Airline = new AirlineApp();
        int index = 0;
        System.out.println("Current passenger details\n\nAeroplane name: " + Airline.aList.get(0)
        + "\nPassenger name: " + Airline.hSet.toString()
        + "\nLocation: " + Airline.hMap.get(Integer.toString(index)));

    }
}

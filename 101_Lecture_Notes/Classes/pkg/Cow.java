/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    //Global Variables.
    int numberSpots;
    int moosPerHour;
    String flavor;
    boolean isBeef;
    //constructors
    public Cow(){
        numberSpots=17;
        flavor = "Wagyu";
        isBeef=false;
        if(isBeef){
            moosPerHour=0;
        }
        else{
            moosPerHour=87;
        }
    }
    public Cow(int n, String f, boolean b){
        numberSpots=n;
        flavor=f;
        isBeef=b;
        if(isBeef){
            moosPerHour=0;
            
        }
        else{
            moosPerHour=87;
        }
    }
    public String getFlavor(){
        return flavor;
    }
    public void moo(){
        if(!isBeef){
            int c = 0;
            while (c<moosPerHour){
                System.out.print("MOOOOOOOOO");
                c++;
            }
            
        }
        else{
            System.out.println("Your "+flavor+" cow is beef.");
        }
    }
}
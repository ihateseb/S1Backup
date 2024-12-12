/*
   * Author: Sebastian Blunt
   * Date: 12/8
   * Collaborator(s):
*/
import java.util.*;

class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a message: ");
String m = sc.nextLine();
System.out.println(pigLatin(m));


}

public static String pigLatin(String m){
String pigLatin = "";
String e = "";
for(int i=0; i<m.length(); i++){
String c = m.substring(i,i+1);
if(i==0){
if(c.equals("b")||c.equals("c")||c.equals("d")||c.equals("f")||c.equals("g")||c.equals("h")||c.equals("j")||c.equals("k")||c.equals("l")||c.equals("m")||c.equals("n")||c.equals("p")||c.equals("q")||c.equals("r")||c.equals("s")||c.equals("t")||c.equals("v")||c.equals("w")||c.equals("x")||c.equals("y")||c.equals("z")||c.equals("B")||c.equals("C")||c.equals("D")||c.equals("F")||c.equals("G")||c.equals("H")||c.equals("J")||c.equals("K")||c.equals("L")||c.equals("M")||c.equals("N")||c.equals("P")||c.equals("Q")||c.equals("R")||c.equals("S")||c.equals("T")||c.equals("V")||c.equals("W")||c.equals("X")||c.equals("Y")||c.equals("Z")){
String d = m.substring(i+1,i+2);
if(d.equals("b")||d.equals("c")||d.equals("d")||d.equals("f")||d.equals("g")||d.equals("h")||d.equals("j")||d.equals("k")||d.equals("l")||d.equals("m")||d.equals("n")||d.equals("p")||d.equals("q")||d.equals("r")||d.equals("s")||d.equals("t")||d.equals("v")||d.equals("w")||d.equals("x")||d.equals("y")||d.equals("z")||d.equals("B")||d.equals("C")||d.equals("D")||d.equals("F")||d.equals("G")||d.equals("H")||d.equals("J")||d.equals("K")||d.equals("L")||d.equals("M")||d.equals("N")||d.equals("P")||d.equals("Q")||d.equals("R")||d.equals("S")||d.equals("T")||d.equals("V")||d.equals("W")||d.equals("X")||d.equals("Y")||d.equals("Z")){
e = c+d;
m=m.substring(i+2);
pigLatin = m + "-" + e + "ay";
}
else{
e=c;
m=m.substring(i+1);
pigLatin = m + "-" + e + "ay";
}
}
else{
pigLatin = m + "-" + "way";
}
}
}
return pigLatin;
}
}
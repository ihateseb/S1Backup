/* 
    Lecture note example - If Statements
*/
import java.util.scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        boolean alive = true;
        while(alive = true){
        System.out.println("You've joined an alien exchange program!");
        System.out.println("Pick an Alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating.");
        System.out.println("2. Bob, a blue alien who loves trees.");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies.");
        int answer1 = sc.nextInt();
        sc.nextLine();
        String chpick=new String();
        if(answer1 == 1){
            System.out.println("You picked Joe!");
            chpick = "Joe";
        }
        else if(answer1 == 2){
            System.out.println("You picked Bob!");
            chpick = "Bob";
        }
        else if(answer1==3){
            System.out.println("You picked Barney!");
            chpick = "Barney";
        }
        else{
            System.out.println("You get Jerry.");
            chpick = "Jerry";
        }
        System.out.println("You are getting food with "+chpick+".");
        System.out.println("Where would you like to go?");
        System.out.println("1. Outback Steakhouse.");
        System.out.println("2. Casa Cordoba.");
        System.out.println("3. Jersey Mike's.");
        int answer2 = sc.nextInt();
        sc.nextLine();
        if(answer2==1){
            System.out.println(chpick+" dies from choking on a well done steak");
            alive = false;
        }
        else if(answer2==2){
            System.out.println(chpick+" learns about spanish culture and obtains a wierd obsession with spain");
            alive = true;
        }
        else if(answer2==3){
            System.out.println(chpick+ " dies due to ingesting horrific ultra-processed Jersey Mike's cheese and meat.");
            alive = false;
        }
        if(alive==false){
            System.out.println("Your lack of care for your companion has led to it's death. Try Again!");
            break;
        }
        System.out.println("Your alien convinces you to visit spain, how do you get there?");
        System.out.println("1. By boat.");
        System.out.println("2. By Plane.");
        }    
	}
}
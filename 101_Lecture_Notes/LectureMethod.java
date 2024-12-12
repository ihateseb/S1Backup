/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("LOGAN");
        greeting("HENRY");
        
        double num = raise(73.69, 35);

        num=raise(num, 5);
        num=raise(num, 5);
        num=raise(num, 5);
        num=raise(num, 5);
        num=raise(num, 5);
        num=raise(num, 5);
        num=raise(num, 5);
        System.out.println(num);

        
	}
	public static void greeting(String name){
	    System.out.println("Hi "+name);
	}
	
	public static void printAnimal(){
	    System.out.println("             ,");
	    System.out.println("           __)\\_  ");
	    System.out.println("     (\\_.-'    a`-.");
	    System.out.println("jgs  (/~~````(/~^^`");
	}
	public static double raise(double salary, int percent){
	    double percentAge = percent/100;
	    double afterRaise = salary+(salary*percentAge);
	    return afterRaise;
	    
	}
}
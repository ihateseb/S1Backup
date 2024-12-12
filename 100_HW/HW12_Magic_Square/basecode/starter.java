// SEBASTIAN BLUNT

import java.util.Scanner;
class starter {
    public static void main(String args[]) {
        // CVMath.specialSquare(5);
        //System.out.println(CVMath.findMid(2,3,1));
        //CVMath.specialSquare(5);
        boolean check1 = false;
        boolean check2 = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many perfect squares would you like: ");
        int e = sc.nextInt();
        double c = 0;
        int count = 0;
        double num = 1.0;
        while(count < num){
            c++;
            double sqrt = Math.sqrt(c);
            System.out.println(sqrt);
            int sqrt2 = (int)Math.sqrt(c);
            System.out.println(sqrt2);
            if(sqrt2 == sqrt){
                check1 = true;
                System.out.println(check1);
            }
            int a = 0;
            for(int i = 0; i < c; i++){
                a++;
                if(a == c){
                    check2 = true;
                    System.out.println("True 2");
                }
            }

            if(check1 == true && check2 == true){
                System.out.println(c);
                count++;
            }
            check1 = false;
            check2 = false;
        }
        }

}
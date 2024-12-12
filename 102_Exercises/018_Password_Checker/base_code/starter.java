import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int level1=0;
        int level2=0;
        int level3=0;
        for(int eye=0;eye<passwords.length;eye++){
            if(passwords[eye].length()>=8){
                level1 = level1+1;
            }
            
        }
        for(int eye=0;eye<passwords.length;eye++){
            if(passwords[eye].contains("!")||passwords[eye].contains("@")||passwords[eye].contains("#")||passwords[eye].contains("$")||passwords[eye].contains("%")||passwords[eye].contains("^")||passwords[eye].contains("&")||passwords[eye].contains("*")){
                level2 = level2+1;
            }
            
            
        }
        for(int eye=0;eye<passwords.length;eye++){
            if(passwords[eye].length()>=8 && passwords[eye].contains("!")||passwords[eye].contains("@")||passwords[eye].contains("#")||passwords[eye].contains("$")||passwords[eye].contains("%")||passwords[eye].contains("^")||passwords[eye].contains("&")||passwords[eye].contains("*") ){
                level3 = level3+1;
            }
        }
		System.out.println("Level 1 passcodes: "+level1);
		System.out.println("Level 2 passcodes: "+level2);
		System.out.println("Level 3 passcodes: "+level3);
	}
}

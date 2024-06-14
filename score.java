import java.util.Scanner;
import java.lang.System;

class score{
    public static void main(String args[]){
          Scanner score = new Scanner(System.in);
           String name = score.nextLine();
           double scor = score.nextDouble();
           score.nextLine();
           String depart = score.nextLine();


           System.out.println("my name is "+ name);
           System.out.println("my score is "+ scor/10);
           System.out.println("my department is "+ depart);
          
    }
}

import java.util.Scanner;

class ifelse3{

    public static void main(String args[])
    {
        Scanner ifels3 = new Scanner(System.in);
        String meghna =ifels3.nextLine();

        if(meghna.equals("dead"))
        {
            System.out.print("meghna cant meet suriya");
        }

        else{
            System.out.print("meghna meets suriya");
        }
    }
}
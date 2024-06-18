import java.util.Scanner;

class forprac{
    public static void main(String args[])
    {
        Scanner res=new Scanner(System.in);

        int a=res.nextInt();
        int b=res.nextInt();

        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
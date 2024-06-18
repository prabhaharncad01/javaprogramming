class odd{
    public static void main(String args[])
    {
       int oddcount=0;
        for(int i=1;i<52;i++)
        {
            if(i%2!=0)
            {
                oddcount = oddcount+1;
            }
        }
        System.out.println(oddcount);
    }
}
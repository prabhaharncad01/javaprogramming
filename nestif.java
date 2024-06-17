class nestif{
    public static void main(String args[])
    {
        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = true;
        if(kfc){
            System.out.print("enter into kfc");
            if(chicken)
            {
                System.out.print("eat chicken");

                if(pepsi){
                    System.out.print("drink pepsi");
                }
            }
        }
    }
}
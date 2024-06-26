public class pattern10 {
    public static void main(String[] args) {
        for(int  i=1; i<=5; i++)
        {
            for(int j =1; j<=i; j++)
            {
                if((i==2 || i==4) && j==1 || (i==3 || i==5) && j==2 || (i==4 && j==3) || (i==5 && j==4))
                {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

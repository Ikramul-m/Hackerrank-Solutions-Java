import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();  
                String temp = "";
                
                for(int j=s1.length() ; j<15 ; j++)
                {
                    s1 = s1 + " ";
                }   
                
                if(x/100 == 0)
                {
                    if(x/10 == 0)
                    {
                        temp = "00";
                    }
                    else
                    {
                        temp = "0";
                    }
                }
                System.out.println(s1 + temp + x);            
            }
            System.out.println("================================");

    }
}




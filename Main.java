import java.util.*;
class raj{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        float n = sc.nextFloat();
        if(n<=100){
            System.out.println("Free");

        
        
        }else if(n>100 && n<=200){
            System.out.println("amount" + (n*0.8));
                
        }
        else if(n>200 && n<=300){
            System.out.println("amount" + (n*1.6));
        }



        }   
    }

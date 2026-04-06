import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units");
        int a = sc.nextInt();
        if(a<100){
            System.out.println("Free");
        }
        else if (a>101 && a<200){
            System.out.println(a*0.8);
        }
        else if (a>201 && a<300){
            System.out.println(a*15);
        }
    }
}


import java.util.*;
class Main{
    public static void main(String[] args){
        int a= 20;
        float b =10.2f;
        char c='c';
        double d =a;
        boolean e=true;
        String h="Hello";
        System.out.println(d);
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+"16"+"="+i*16);
        }



    }
}


public class even {
public static String checkEven(int num) {
    if (num % 2 == 0) {
        return num + " is an even number.";
    } else {
        return num + " is not an even number.";
   
    }

    public static void main(String[] args) {
        int num=7;
        String result = checkEven(num);
        System.out.println(result);
        
    }
}

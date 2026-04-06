public class operators {
        public void arithmetic(){
        int a = 10;
        int b = 5;
        // Arithmetic Operators
        System.out.println(a + b); 
        System.out.println(a - b); 
        System.out.println(a * b); 
        System.out.println(a / b); 
        System.out.println(a % b); 
       }
    public void relational(){
        int a = 10;
        int b = 5;
        // Relational Operators
        System.out.println(a > b); 
        System.out.println(a < b); 
        System.out.println(a >= b); 
        System.out.println(a <= b); 
        System.out.println(a == b); 
        System.out.println(a != b); 
    }
    public void logical(){
        boolean e=true;
        boolean f=false;

    }
    public static void main(String[] args) {
        operators op = new operators();
        op.arithmetic();
        op.relational();
        op.logical();
    }
}

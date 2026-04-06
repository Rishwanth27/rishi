public class grade {
    public static void main(String[] args) {
        float marks = 7.2f;
        char grade;

        if (marks >= 9.0f) {
            grade = 'A';
        } else if (marks >= 8.0f) {
            grade = 'B';
        } else if (marks >= 7.0f) {
            grade = 'C';
        } else if (marks >= 6.0f) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}

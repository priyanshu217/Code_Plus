package pwskills;

public class IfElse {
    public static void main(String[] args) {

        // School marks program

        int result =40;
        char grade;
        if (result >= 90)
        {
            grade = 'A';
        }
        else if (result >= 80)
        {
            grade = 'B';
        }
        else if (result >= 70)
        {
            grade = 'c';
        }
        else if (result >= 60)
        {
            grade = 'D';
        }
        else if (result >=50)
        {
            grade ='F';
        }
        else
        {
            grade ='G';
        }
        System.out.print("Grade of the student is "  +  grade);
    }
}
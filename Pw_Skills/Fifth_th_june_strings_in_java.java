package pwskills;

public class Fifth_th_june_strings_in_java {
    public static void main(String[]args){
        // Strings in Java

//        String s1 = "pwskills";
//        String s2 = "pwskills";
//        String s3 = new String("pwskills");
//        String s4 = new String("pwskill");
//        System.out.println(s1==s2);  // [true] because Refrence value is same
//        System.out.println(s2==s3);  // [false] because Reference value is different
//        System.out.println(s3==s4);  // [false] because Reference value is not same
//        System.out.println(s1.equals(s2));  // [true] because both are same
//        System.out.println(s2.equals(s4));  // [false] because both are different

        //Concatenation Operator
//        String s1 = new String("priyanshu");
//        s1=s1.concat(" saxena");
//        System.out.println(s1);

//        String s1 = "pwjava";
//        String s2 = s1.concat("skill");
//        String s3 = new String("pwjava");
//        s3=s3.concat("skill");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        // + Operator
//        String s1 = "pw";
//        String s2 = "pw"+"java"+"skill";
//        String s3 = "pw"+"java"+"hello"+"skill";
//        String s4 = s1 + s2 ;
//        System.out.println(s4);

        // Important methods of Strings

//        String str = "PW Skills Java";
//        System.out.println(str);
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        int length = str.length();
//        System.out.println(str.substring(3));
//        System.out.println(str.lastIndexOf("a"));

        //  Mutable strings StringBuffer and StringBuilder

//        StringBuffer sb = new StringBuffer("Virat ");
//        System.out.println(sb);
        // StringBuffer sb="" [invalid]
//        sb.append("kholi");
//        System.out.println(sb);

//        StringBuilder s1=new StringBuilder("Priyanshu");
//        System.out.println(s1);
//        s1.append(" Saxena");
//        System.out.println(s1);

        // Final vs Immutability
//         int a= 10;
//         a=20;
//         a=30;
//        System.out.println(a);

//       final String s1= "Priyanshu";
//       s1=s1.concat(" saxena");
//        System.out.println(s1);

        StringBuffer sb=new StringBuffer("Priyanshu");
        sb.append(" Saxena");
       // System.out.println(sb);
        sb =new StringBuffer("virat");
        System.out.println(sb);



    }
}

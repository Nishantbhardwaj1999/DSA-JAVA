package getting_Started.if_else_based_question;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char cv=scn.next().charAt(0);
        if(cv=='a'|| cv=='e'|| cv=='i'||cv=='o'|| cv=='u'||cv=='A'|| cv=='E'|| cv=='I'||cv=='O'|| cv=='U'){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercice1 {
    public static void main (String[] args) {
	String tmp,tmp2=" ";
	int i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrée une phrase : ");
	tmp = sc.nextLine();
	StringTokenizer st = new StringTokenizer(tmp);
	while (st.hasMoreTokens()) {
	    if (i%2 == 0)
		tmp2 += st.nextToken().toUpperCase() + " ";
	    else
		tmp2 += st.nextToken().toLowerCase() + " ";
	    i++;
	}
	System.out.println("Votre phrase : " + tmp2);	
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;

public class Exercice2 {
    public static void main (String[] args) {
	String tmp;
        ArrayList list = new ArrayList();
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrée une phrase : ");
	tmp = sc.nextLine();
	StringTokenizer st = new StringTokenizer(tmp);
	while (st.hasMoreTokens()) {
	    list.add(st.nextToken());
	}
	Collections.sort(list);
	System.out.println("Votre phrase : " + list.toString() );	
    }
}

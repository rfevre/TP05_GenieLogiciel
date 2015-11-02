import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Stack;

public class Exercice3 {
    public static void main (String[] args) {
	String tmp,tmp2="";
        ArrayList list = new ArrayList();
	ArrayList list2 = new ArrayList();
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrée une phrase : ");
	tmp = sc.nextLine();
	for ( int i =0; i<tmp.length();i++) {
	    if (Character.isLetter(tmp.charAt(i)))
		tmp2 +=tmp.charAt(i);
	}

        StringTokenizer st = new StringTokenizer(tmp2);
	Stack stack = new Stack();
	while (st.hasMoreTokens()) {
	    String token = st.nextToken().toUpperCase();
	    for (int i=0;i<token.length();i++) {
		list.add(token.charAt(i));
		stack.push(token.charAt(i));
	    }
	}
		
	while ( !stack.empty() ) {
	    list2.add(stack.pop());
	}
	    
	System.out.println("phrase normal  : " + list.toString() );
	System.out.println("phrase inverse : " + list2.toString() );

    }
}

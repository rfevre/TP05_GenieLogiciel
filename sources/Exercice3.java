import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Stack;

public class Exercice3 {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	char rep='1';
	while (rep != 'q' || rep != '1' || rep != '2' || rep != '3') {
	    System.out.println("\n\n-- Exercice 3 : Renversements --");
	    System.out.println(" 1. Palindrome ");
	    System.out.println(" 2. Phrase en Inverse ");
	    System.out.println(" 3. Mot en Inverse ");
	    System.out.println("Votre choix ? ('q' pour quitter) ");
	    rep = sc.nextLine().charAt(0);
	    switch (rep) {
	    case '1' :
		palindrome();
		break;
	    case '2' :
		inversePhrase();
		break;
	    case '3' :
		inverseMot();
		break;
	    case 'q' :
		System.exit(0) ;
	    default :
		System.out.println(" Mauvaise touche ");
	    }
	}
	System.out.println(" Aurevoir ! ");	    
    }

    public static void palindrome () {
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

        if (list.equals(list2))
	    System.out.println("La phrase est un palindrome " );
	else
	    System.out.println("La phrase n'est pas un palindrome " );
    }

    public static void inversePhrase() {
	String tmp;
        ArrayList list = new ArrayList();
	ArrayList list2 = new ArrayList();
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrée une phrase : ");
	tmp = sc.nextLine();

	StringTokenizer st = new StringTokenizer(tmp);
	Stack stack = new Stack();
	while (st.hasMoreTokens()) {
	    String token = st.nextToken();
	    list.add(token);
	    stack.push(token);
	}

	while ( !stack.empty() ) {
	    list2.add(stack.pop());
	}

	System.out.println("phrase normal  : " + list.toString() );
	System.out.println("phrase inverse : " + list2.toString() );		
    }

     public static void inverseMot() {
	String tmp,tmp2="";
        ArrayList list = new ArrayList();
	ArrayList list2 = new ArrayList();
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrée une phrase : ");
	tmp = sc.nextLine();

	StringTokenizer st = new StringTokenizer(tmp);
	Stack stack = new Stack();
	while (st.hasMoreTokens()) {
	    String token = st.nextToken();
	    list.add(token);
	    for (int i=0;i<token.length();i++) {
		stack.push(token.charAt(i));
	    }
	    while ( !stack.empty() ) {
		list2.add(stack.pop());
	    }
	}

	System.out.println("phrase normal  : " + list.toString() );
	System.out.println("phrase inverse : " + list2.toString() );		
    }
}

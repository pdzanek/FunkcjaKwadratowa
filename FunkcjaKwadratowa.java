import static java.lang.Math.*;

public class FunkcjaKwadratowa{
public static void main(String[] args)
	{
		int a[] = new int[3];
		for(int i=0;i<3;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("A=" +a[0]);
		System.out.println("B=" +a[1]);
		System.out.println("C=" +a[2]); 		
		double x,x1,x2;

		if(a[0]==0){
			x=-a[2]/a[1];
			System.out.println("Funkcja liniowa: miejsce zerowe=" +x);
		}
		else{
			double delta=a[1]*a[1]-4*a[0]*a[2];
			System.out.println("Delta=" +delta);
			if(delta==0){
				x=-a[1]/2*a[0];
			}
			else if(delta>0){
				x1=(sqrt(delta)+a[1])/(2*a[0]);
				x2=(sqrt(delta)-a[1])/(2*a[0]);
				System.out.println("x1=" +x1);
				System.out.println("x1=" +x2);
			}
			else{
				System.out.println("Rownanie nie ma rozwiazania w dziedzinie rzeczywistej.");
				//TODO 2 - obliczyc w dziedzinie zespolonej
			}
		}
	}
}


/*Napisz program czytajacy argumenty wywolania programu i konwertujacy je do Integer. Zmodyfikuj program w ten sposob, aby kolejne argumenty byly wspolczynikami wielomianu postaci Ax2+Bx+C=0. Policz pierwiastki tego wielomianu. */

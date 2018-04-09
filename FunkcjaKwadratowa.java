import static java.lang.Math.*;

public class FunkcjaKwadratowa{
public static void main(String[] args)
	{
		if(args.length == 0){
			System.out.println("Input Error - usage: java FunkcjaKwadratowa a b c");
			System.exit(1);
		}
		if(args.length <3){
			System.out.println("Error: a, b, c are required");
			System.exit(1);
		}else if(args.length > 3){
			System.out.println("Error: Too much arguments");
			System.exit(1);
		}
		double a[] = new double[3];
		try{
				for(int i = 0; i<3; i++){
       			a[i] = Double.parseDouble(args[i]);
				System.out.println("Argument " + (i+1) + " = " + a[i]);
				}
			}
		catch(NumberFormatException c){
			System.out.println("Podany argument nie jest liczbą");
			System.exit(1);
		}
		miejscaZerowe(a);
	}
public static void 	miejscaZerowe(double a[])
{
	double rozwiazanie[] = new double[2];
		if(a[0]==0){
			rozwiazanie[0]=-a[2]/a[1];
			System.out.println("Funkcja liniowa: miejsce zerowe=" +rozwiazanie[0]);
			}
		else{
			double delta=a[1]*a[1]-4*a[0]*a[2];
			System.out.println("Delta=" +delta);
			if(delta==0){
				rozwiazanie[0]=-a[1]/2*a[0];
				System.out.println("x=" +rozwiazanie[0]);
			}
			else if(delta>0){
				rozwiazanie[0]=(sqrt(delta)+a[1])/(2*a[0]);
				rozwiazanie[1]=(sqrt(delta)-a[1])/(2*a[0]);
				System.out.println("x1=" +rozwiazanie[0]);
				System.out.println("x2=" +rozwiazanie[1]);
			}
			else{
				System.out.println("Rownanie nie ma rozwiazania w dziedzinie rzeczywistej.");
				delta=-delta;
				rozwiazanie[0] = (-a[1]) / (2*a[0]);
				rozwiazanie[1] = sqrt(delta) / (2*a[0]);
				System.out.println("Bieguny:");
				System.out.printf("x1 = %.2f + %.2fi\n", rozwiazanie[0], rozwiazanie[1]); 
				System.out.printf("x2 = %.2f + %.2fi\n", rozwiazanie[0], -rozwiazanie[1]);
				}
			}
}
}

/*Napisz program czytajacy argumenty wywolania programu i konwertujacy je do Integer. Zmodyfikuj program w ten sposob, aby kolejne argumenty byly wspolczynikami wielomianu postaci Ax2+Bx+C=0. Policz pierwiastki tego wielomianu. */

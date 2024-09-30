
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
		int a = -9;
		int b = 21;
		int c = -35;
		int d = 51;
		int e = 33;
		int f = (a + b) * e;
		
		System.out.println("Suma de a + b * e : " + (f));
		System.out.println("Division d / c : " + (d / c));
		
		System.out.println("-----------------------------------------");
		// EJERCICIO 2
		System.out.println(a < b || c != d);
			
		System.out.println("-----------------------------------------");
		//EJERCICIO 3
		int year = 1988;
		int mod = year % 4;
		
		System.out.println(mod == 0);
		System.out.println("-----------------------------------------");

		//EJERCICIO 4
		
		if(mod == 0) {
			System.out.println("Año bisiesto");
			}
		System.out.println("-----------------------------------------");
		//EJERCICIO 5
		int x = 2;
		int y = 2;
		int z = 3;
		double elevado = Math.pow(x, y); 
		int convertido = (int)elevado ; // De double a int
		
		System.out.println(Math.multiplyExact(z, convertido));
	}
}


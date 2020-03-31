import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase AreaPrisma1
 * Esta clase da unos valores aleatorios de tres prismas y nos dice cual es prisma mas grande
 * @author Usuario
 *
 */



public class AreaPrisma1 {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner (System.in);
		ArrayList<Prisma> prisma = new ArrayList<>();
		
		
		
		
		
		int base=0;
		int altura=0;
		int areabase = 0;
		int pisolateral=0;
		int lado=0;
		int arealateral = 0;
		int perimetro = 0;
		int areatotal=0;
		Random r = new Random();
		
		
		System.out.println("Introduce si para calcular un prisma y no para salir");
		String palabra = teclado.next();
	
		while (palabra.equalsIgnoreCase("si")) {
		

		Prisma pris = new Prisma(base, altura, areabase,  pisolateral,  lado, arealateral, perimetro,
			 areatotal);
			
		System.out.println("Area del primer prisma triangular");
		System.out.println("El area del triangulo: ");
		
		System.out.println("Introduce la base: ");
		 base= teclado.nextInt();
		 System.out.println("La base " + base);
		 pris.setBase(base);
		 
		 System.out.println("Introduce la altura: ");
		altura= teclado.nextInt();
		 System.out.println("La altura " + altura);
		 pris.setAltura(altura);
	
      areabase = base + altura;
	pris.setAreabase(areabase);
	
	System.out.println("Introduce la superficie: ");
	 pisolateral= teclado.nextInt();
	
	 pris.setPisolateral(pisolateral);
	 
	 System.out.println("Introduce el lado: ");
	 lado= teclado.nextInt();
	
	 pris.setLado(lado);
	
	arealateral = pisolateral + lado;
	pris.setArealateral(arealateral);
	
	perimetro = pisolateral + base;
	pris.setPerimetro(perimetro);
	
	areatotal= areabase+pisolateral+perimetro;
	System.out.println("El area total es:" + areatotal);
	pris.setAreatotal(areatotal);

	
prisma.add(pris);


System.out.println("Si quieres continuar pulsa de nuevo si y para salir no");
palabra = teclado.next();


		}
System.out.println("ordenados:");	
		for(int i=0;i<prisma.size();i++) {

			System.out.println(prisma.get(i).areatotal);
			
			
		}
		
		
	}
	
	
}
		
		
	


		
	



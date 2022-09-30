import java.util.Scanner;

public class NaranjasMangos {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		 
        System.out.println("Dame el numero de mangos");
        int num1 = sn.nextInt();
 
        System.out.println("Dame el numero de naranjas");
        int num2 = sn.nextInt();
 
        int res = mcd(num1, num2);
        
        int tmangos = ttlmangos (num1, res);
        
        int tnaranjas = ttlnaranjas (num2, res);
         
        System.out.println("El numero de cajas es: " + res);
        System.out.println("El total de mangos es: " + tmangos);
        System.out.println("El total de naranjas es: " + tnaranjas);
    }
 
    public static int mcd(int num1, int num2) {
 
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
 
        return resultado;
         
    }
    
    public static int ttlmangos(int num1, int mcd) {
    	 
        int mg = num1;
        int caja = mcd;
        int tlcaja = 0;

        for (int i = 0; i < 1; i++) {
			tlcaja = mg/caja;
		}
         return tlcaja;
    }
		      

public static int ttlnaranjas(int num2, int mcd) {
	 
    int nan = num2;
    int caja2 = mcd;
    int tlcaja2 = 0;

    for (int i = 0; i < 1; i++) {
		tlcaja2 = nan/caja2;
	}
     return tlcaja2;
}
	      
}

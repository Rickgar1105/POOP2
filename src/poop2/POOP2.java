package poop2;

/**
 *
 * @author Ricardo Emmanuel Galicia Tequianes
 */
public class POOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¡Hola mundo!");
        
        int a = 5;
        int b = 3;
        
        System.out.println("########## if #########");
        /*if (a<b) {
            System.out.println("b es mayor que a");
            
        } else {
            System.out.println("a es mayor que b");
        }*/
        if (menor(a,b)) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("b es menor que a");
        }
        
        System.out.println("######## switch ######");
        int dia = 8;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
                
            default -> System.out.println("No es un día de la semana");
        }
        
        System.out.println("###### switch (abecedario) #####");
        char vocal = 'j';
        switch (vocal) {
            case 'a' -> System.out.println("La vocal es _a_");
            case 'e' -> System.out.println("La vocal es _e_");
            case 'i' -> System.out.println("La vocal es _i_");
            case 'o' -> System.out.println("La vocal es _o_");
            case 'u' -> System.out.println("La vocal es _u_");
            default -> System.out.println("No es una vocal");
        }
        
        System.out.println("########## While ##########");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
    
        System.out.println("############## For ##############");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }
    private static boolean menor(int a, int b) {
        return (a<b);
      }
    
}
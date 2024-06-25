package soprasteria_test;

/**
 *
 * @author Javier Fernandez
 */
public class SopraSteria_test {
    
    
    public static void par_impar(int num){
    int lim = num%2;
        while(num != lim){
            System.out.println(num);
            num -= 2;
        }
    System.out.println(num);
    }
    
    public static void stats_personas(int[][] personas){
        int menores = 0;
        int mayores = 0;
        int ho18 = 0;
        int mu18 = 0;
        for(int i = 0; i < personas.length; i++){
            if(personas[i][0]>= 18){
            mayores++;
                if(personas[i][1] == 0){ho18++;}
            }
            else{
            menores++;
                if(personas[i][1] == 1){mu18++;}
            
            }
        
        }
        float porcentajeMayores= mayores * 100/50;
        float porcentajeMujeres = (mayores - ho18 + mu18) *100/50;
        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);
        System.out.println("Hombres mayores de edad: " + ho18);
        System.out.println("Mujeres menores de edad: " + mu18);
        
        System.out.println("Porcentaje de mayores de edad: " + porcentajeMayores);
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres);
        
    
    }
    
    
    public static void salario(int horas_trabajadas, float tarifa){
        float salsem = 0;
        
        if(horas_trabajadas <= tarifa){
            salsem = horas_trabajadas * tarifa;
        }
        else{ salsem = (float)((40 * tarifa) + (horas_trabajadas - 40) * (tarifa*1.5));}
        
        
        System.out.println("Salario semanal del trabajador: " + salsem);
    }
    
    public static int LEER_NUMERO(int numero){
        return numero;
    }
    
    public static int[][] LEER_PERSONAS(int[][] persona){
        return persona;
    }
    
    public static int LEER_HORASTRABAJADAS(int horas){
        return horas;
    }
    
    public static float LEER_TARIFA(float tarifa){
        return tarifa;
    }
    
    
    
    public static void main(String[] args) {
        
        
        int numero = LEER_NUMERO(2);
        par_impar(numero);
        
        
        int[][] personas = new int[][] {{}};
                
        
        //Primer elemento edad, segundo sexo.
        //El sexo se representa con 0 en hombre; 1 en mujer.
        //Ejemplo de test
        int[][] personasej = new int[][]{{25, 0}, {34, 1}, {18, 0}, {22, 1}, {45, 0}, {30, 1}, {17, 0}, {19, 1}, {20, 0}, {33, 1},
                {40, 0}, {21, 1}, {60, 0}, {29, 1}, {15, 0}, {50, 1}, {16, 0}, {28, 1}, {23, 0}, {27, 1},
                {19, 0}, {32, 1}, {44, 0}, {25, 1}, {38, 0}, {31, 1}, {20, 0}, {18, 1}, {21, 0}, {35, 1},
                {36, 0}, {24, 1}, {43, 0}, {26, 1}, {22, 0}, {37, 1}, {48, 0}, {34, 1}, {25, 0}, {29, 1},
                {17, 0}, {33, 1}, {39, 0}, {31, 1}, {18, 0}, {27, 1}, {45, 0}, {23, 1}, {50, 0}, {19, 1}
                };
        
        personas = LEER_PERSONAS(personasej);
        stats_personas(personas);
        
        int HORASTRABAJADAS = LEER_HORASTRABAJADAS(50);
        float TARIFA = LEER_TARIFA(10);
        salario(HORASTRABAJADAS, TARIFA);
    }
    
}

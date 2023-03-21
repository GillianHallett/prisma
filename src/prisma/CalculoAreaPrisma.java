package prisma;
import java.util.Scanner;

public class CalculoAreaPrisma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer la base del triángulo de la base del prisma
        float baseTriangulo = leerValor(sc, "Introduce la base del triángulo de la base del prisma: ");
        
        // Calcular la altura del triángulo de la base del prisma
        float alturaTriangulo = alturaTriangulo(baseTriangulo);
        
        // Calcular el área de la base del prisma
        float areaBase = areaBase(baseTriangulo, alturaTriangulo);
        
        // Calcular el perímetro del prisma
        float perimetro = perimetro(baseTriangulo);
        
        // Leer la altura del prisma
        float alturaPrisma = leerValor(sc, "Introduce la altura del prisma: ");
        
        // Calcular el área lateral del prisma
        float areaLateral = areaLateral(perimetro, alturaPrisma);
        
        // Calcular el área total del prisma
        float areaTotal = areaTotal(areaBase, areaLateral);
        
        // Imprimir el resultado
        imprimirValor("El área total del prisma es: " + areaTotal);
    }
    
    public static float leerValor(Scanner sc, String mensaje) {
        float valor = 0;
        boolean esValido = false;
        do {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            if (esNumero(entrada)) {
                valor = Float.parseFloat(entrada);
                esValido = true;
            } else {
                imprimirValor("El valor introducido no es válido. Introduce un número.");
            }
        } while (!esValido);
        return valor;
    }
    
    public static void imprimirValor(String valor) {
        System.out.println(valor);
    }
    
    public static boolean esNumero(String valor) {
        try {
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static float alturaTriangulo(float baseTriangulo) {
        return (float) (Math.sqrt(3) / 2 * baseTriangulo);
    }
    
    public static float areaBase(float baseTriangulo, float alturaTriangulo) {
        return baseTriangulo * alturaTriangulo /2;
    }
    
    public static float perimetro(float baseTriangulo) {
        return 3 * baseTriangulo;
    }
    
    public static float areaLateral(float perimetro, float alturaPrisma) {
        return perimetro * alturaPrisma;
    }
    
    public static float areaTotal(float areaBase, float areaLateral) {
        return 2 * areaBase + areaLateral;
    }
}

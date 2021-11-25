import java.util.Scanner;

class Mayormenor{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int z, x, y;

        System.out.println("Introduce el primer numero: ");
        z = entrada.nextInt();
        System.out.println("introduce el segundo numero: ");
        x = entrada.nextInt();
        System.out.println("introduce el tercer numero: ");
        y = entrada.nextInt();

        if (z == x || x == y || z == y)
        {
        System.out.println("No deben ser numeros iguales");
        }
        else
        {
            if (z>x && z>y)
            {
            System.out.println("el numero " + z + " es el mayor");
            }
            else
                {
                if (x>z && x>y)
                {
                System.out.println("el numero " + x + " es el mayor");
                }
                else 
                {   
                    System.out.println("el numero " + y + " es el mayor");
                }
                }
        }
                
    }
}
import java.util.Scanner;

class CuadroMovimiento{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

          boolean m=false;
        int n;
        char continuar;
        do{
            System.out.println("¿Introduce el numero de lados para tu cuadrado, debe ser positivo y menor a cien");
            n = entrada.nextInt();
            if( n<0 || n>100){
               m = true;
                System.out.println("Debe ser positivo menor de cien");
            }else{
                
                for(int i = 1; i<=n; i++){
                    for (int j = 1; j<=n; j++){
                        if(i % 2 != 0){
                            System.out.print("/ ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                System.out.println(" ");
                }
            }
            System.out.println("¿Quieres hacer otro cuadrado?, presiona 's' para si");
            continuar = entrada.next().charAt(0);
            if (continuar == 's' || continuar == 'S'){

            }else{
                m = true;
            }    
                
            
        }while(!m); 

        

    }    
}
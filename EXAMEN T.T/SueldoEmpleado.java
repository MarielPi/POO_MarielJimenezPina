
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;


class SueldoEmpleado{


    int choice;
        String text_menu;
        
        

    public static void main(String[] args){
        String text;
        int opciones=0;

    
        SueldoEmpleado mainp = new SueldoEmpleado();

        
        do{
            mainp.MenuP();
            text = JOptionPane.showInputDialog("En caso de que desee regresar al menu principal digite 1");
            opciones = Integer.parseInt(text);

        }while(opciones == 1);



    }

    public void MenuP(){
        String text;
        int opciones =0;
        
        try{
            
            text = JOptionPane.showInputDialog("Selecciona la opcion deseada:"
                                        + "\n 1.- Agregar nuevo empleado"
                                        + "\n 2.- Consultar empleado por ID"
                                        + "\n 3.- Consultar todos los empleados"
                                        + "\n 4.- Pagar al empleado por ID");
                    opciones = Integer.parseInt(text);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se puede ingresar los numeros del 1 al 4");
       
            JOptionPane.showMessageDialog(null, " "+e.getMessage());
           
            System.out.println("El erro es: " + e.getMessage());

        } 

        

        switch (opciones) {
            case 1:
             Estructura lista = null;
             Scanner leer = new Scanner(System.in);
             String nombres;

            
                if(lista==null){
                  System.out.printIn("No se puede ingresar");

                }
                else{
                    System.out.printIn("Ingrese nombres de empleado");
                    nombres = Leer.nextString();
                    Estructura aux=lista;
                    Estructura nombres = new Estructura();
                    nombres.nombres=nombres;
                    while(aux.anterior!=null);{
                    aux=aux.anterior;
            
                }
                if(aux.anterior==null){
                    aux.anterior=nombres;
                    System.out.printIn("Ingrese nombres de empleado");
                }

            }
            
             

             //metodo
                break;

            case 2:

                int ID;

                    text=JOptionPane.showInputDialog("Cual es tu ID?");


                    //metodo
                break;
            
            case 3:

                    text=JOptionPane.showInputDialog("Empleados:"
                                        + "\n 1.- Susana Mercado Rangel"
                                        + "\n 2.- Jaime Ramirez Elias"
                                        + "\n 3.- Elias Bermeo Aguilar"
                                        + "\n 4.- Esmeralda Navarro Guzman"
                                        + "\n 5.- Tomas Romero Villa"
                                        + "\n Pulsa F para salir");

                    //metodo
                break;
            
            
            case 4:

               

                

            
                
                


                

            


                //metodo
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Vuelva pronto");
                break;
        }   
         
              
           
    }   
}

/*
21 - 40

Obtener los pagos correspondientes a los trabajadores

ingresar el nombre del trabajador
sueldo
tipo de trabajador

*/ 


import javax.swing.*;
import java.util.*;

class holi {
    public int id;
    public String nombre;
    public double num_horas,sueldo_hora;
    
    Empleado(int id, int num_horas,String nombre, double sueldo_hora)
    {
        this.id = id;
        this.num_horas = num_horas;
        this.nombre = nombre;
        this.sueldo_hora = sueldo_hora;
    }
    
    public void verEmpleado()
    {
        System.out.println("ID: "+ id + " -- NOMBRE: "+ nombre + " -- SUELDO HR: "+ sueldo_hora + " -- NUMERO HRs: "+ num_horas+"\n");
        System.out.println();
    }
    
    
}

class Empleados{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int captura_id, captura_num_horas,captura_opcion,posicion_empleados;
        String captura_nombre;
        double captura_sueldo_hora;
        boolean ciclo = true;
        Empleado[] arregloEmpleados;
        arregloEmpleados = new Empleado[5];
        Scanner leer=new Scanner(System.in);
        posicion_empleados = 0;
        while(ciclo){
            System.out.print("Selecciona la opcion deseada:"
            + "\n 1.- Agregar nuevo empleado"
            + "\n 2.- Consultar empleado por ID"
            + "\n 3.- Consultar todos los empleados"
            + "\n 4.- Pagar al empleado por ID"
            + "\n 5.- Salir\nOpcion:");
            captura_opcion = leer.nextInt();
            
            switch(captura_opcion) {
                    case 1:
                            if(posicion_empleados < 5){
                                System.out.println("Agregar nuevo Empleado\n");
                                System.out.print("Introduce el identificador del empleado:");
                                captura_id = leer.nextInt();
                                System.out.print("Introduce el numero de horas del empleado:");
                                captura_num_horas = leer.nextInt();
                                System.out.print("Introduce el nombre del empleado:");
                                captura_nombre = leer.next();
                                System.out.print("Introduce el sueldo por hora del empleado:");
                                captura_sueldo_hora = leer.nextDouble();

                                arregloEmpleados[posicion_empleados] = new Empleado(captura_id,captura_num_horas,captura_nombre,captura_sueldo_hora);
                                posicion_empleados++;
                            }
                            else{
                                System.out.print("Se llego al numero maximo de empleados.");
                            }
                            break;
                    case 2:
                    
                            System.out.println("Buscar empleado por ID\n ");
                            System.out.print("Introduce el ID del empleado: ");
                            captura_id = leer.nextInt();
                            buscarIdEmpleado(captura_id,arregloEmpleados);
                            break;
                    case 3:
                            System.out.println("Mostrar informacion  de todos los empleados\n ");
                            for(int i = 0; i < 5; i++){
                                 arregloEmpleados[i].verEmpleado();
                            }
                            break;
                    case 4:
                            System.out.println("Mostrar pago");
                            System.out.print("Selecciona la opcion deseada:"
                            + "\n 1.- Pago quincenal"
                            + "\n 2.- Pago mensual\nOpcion: ");
                            captura_opcion = leer.nextInt();
                            if(captura_opcion == 1){
                                for(int i = 0; i < 5; i++){
                                    double sueldo_quincenal = (arregloEmpleados[i].sueldo_hora * arregloEmpleados[i].num_horas) * 15.0;
                                    System.out.println("El pago quincenal de "+ arregloEmpleados[i].nombre + " es de: $ "+ sueldo_quincenal + "\n");
                                }
                                
                            }
                            else{
                                for(int i = 0; i < 5; i++){
                                    double sueldo_mensual = (arregloEmpleados[i].sueldo_hora * arregloEmpleados[i].num_horas) * 30.0;
                                    System.out.println("El pago mensual de "+ arregloEmpleados[i].nombre + " es de: $ "+ sueldo_mensual + "\n");
                                }
                            }
                            
                            break;
                    case 5:
                            ciclo = false;
                            break;
		}

        }
        
    }
    
    public static int buscarIdEmpleado(int id,Empleado[] empleados){
        for(int i = 0; i < 5; i++){
            if(empleados[i].id == id){
                System.out.println("El empleado es: \n ");
                empleados[i].verEmpleado();
            }
        }
        return 0;
    }

}
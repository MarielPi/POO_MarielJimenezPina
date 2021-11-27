/*
Vamos a crear un programa que se encargue de realizar las siguientes operaciones
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas celcius, kelvine y rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir
*/ 

import java.util.Scanner;

class EstructuraDeDatos{

    //Programa 1
    /*
    EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
    AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. 
    SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
    variable edad
    condiciones
    */ 

    public static void main(String[] args){

        //objetos
        Scanner entrada = new Scanner(System.in);
        //Scanner letras = new Scanner(System.in);


        //variables
        int edad, opcion, socio, numbinario, total, numtotal, Num, n, grados, grados2, operacion, fig, calculo;
        int cantidad = 0;
        int suma=0;
        int positivos = 0;
        int negativos = 0;
        float costo = 0;
        float resultado = 0;
        double pi = 3.1416;
        float a,b;
        double precio, bono, celcius, kelvine, rankine, a1, resul, c, d, e;
        char letras;
        String binario = "";


        //cuerpo del programa

        //menu de las opciones de arriba

        do{

        System.out.println("Bienvenido a tu primer programa de estructuras.");
        System.out.println("Por favor elija la opcion deseada:");
        System.out.println("1.- Descuento por edad");
        System.out.println("2.- Convertir numero decimal a binario");
        System.out.println("3.- Conversiones de temperatura");
        System.out.println("4.- Numeros positivos y negativos");
        System.out.println("5.- Tienda");
        System.out.println("6.- Area y Perimetros");
        System.out.println("7.- Tabla");
        System.out.println("8.- Factorial");
        System.out.println("9.- Dibujos de codigo");
        System.out.println("10.- Figura Hueca");
        System.out.println("11.- Patrones de codigo");
        System.out.println("12.- Diamente");
        System.out.println("13.- Calculadora");
        System.out.println("14.- Salir");

        //condicion switch para el menu

        opcion = entrada.nextInt();


        switch(opcion){

            case 1: //problema 1
                System.out.println("Ingresa el Bono A cobrar");
                bono = entrada.nextDouble();
                System.out.println("Ingresa la edad");
                edad = entrada.nextInt();
                //la estructura de condiciones
                // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%.
                if(edad >= 65){
                    //proceso
                    bono = bono*.6;
                    System.out.println("Su descuento es de 40%");
                    System.out.println("El total a pagar es de: " + bono);
                }
                /*
                SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
                 SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
                45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
                */ 
                if(edad <= 21){
                    System.out.println("Si tus padres son socios ingresa 1, sino lo son ingresa 2");
                    socio = entrada.nextInt();

                    switch(socio){
                        case 1: 
                            bono = bono*.55;
                            System.out.println("Su descuento fue del 45%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        case 2: 
                            bono = bono*.75;
                            System.out.println("Su descuento fue del 25%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        default:
                        //es el caso por defecto osea los demas casos
                            System.out.println("Opcion no valida");

                    }
                }
                System.out.println("Tu edad es de: " + edad);
                System.out.println("El total a pagar es: " + bono);
                break;

                case 2:

                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    /*
                    Tengo que comprobar que sea positivo?
                    condicion donde numbinario > 0
                    entonces aplico el algoritmo de convertir a binario
                    sino no se puede convertir
                    */ 

                    if(numbinario > 0){
                        /*
                        Como el algoritmo para convertir un numero decimal en binario
                        aplicar al numbinario mod 2
                        */
                        while(numbinario > 0){
                            if(numbinario % 2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario / 2;
                        }
                    }else if (numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos.";
                    }
                    System.out.println("El numero convertirdo a binario es: " + binario);
                    break;


                case 3:
                    System.out.println("insterte 1 si los grados son celcius, 2 si es kelvine o 3 si son rankine");
                    grados = entrada.nextInt();
                    if (grados == 1){
                        System.out.println("inserte los grados celcius");
                        celcius = entrada.nextDouble();
                        System.out.println("inserte 1 si quiere convertir a kelvine o 2 si quiere convertir a rankine");
                        grados2 = entrada.nextInt();
                        if (grados2 == 1){
                            kelvine = celcius + 273.15;
                            System.out.println("Los grados celcius convertidos son: "+ kelvine);
                        }else{
                            if (grados2 == 2){
                                rankine = (celcius * 1.8) + 491.67;
                                System.out.println("Los grados celcius convertidos son: "+ rankine);
                            }else{
                                System.out.println("su respuesta no es valida");
                            }
                        }
                    }else{
                        if (grados == 2){
                            System.out.println("inserte los grados kelvine");
                            kelvine = entrada.nextDouble();
                            System.out.println("inserte 1 si quiere convertir a celcius o 2 si quiere convertir a rankine");
                            grados2 = entrada.nextInt();
                            if (grados2 == 1){
                                celcius = kelvine - 273.15;
                                System.out.println("Los grados kelvine convertidos son: "+ celcius);
                            }else{
                                rankine = kelvine * 1.8;
                                System.out.println("Los grados kelvine convertidos son: "+ rankine);
                            }                            
                        }else{
                            if (grados == 3){
                                System.out.println("Inserte los grados rankine");
                                rankine = entrada.nextDouble();
                                System.out.println("inserte 1 si quiere convertir a celcius o 2 si quiere convertir a kelvine");
                                grados2 = entrada.nextInt();
                                
                                if(grados2 == 1){
                                    celcius = (rankine - 491.67) * 1.8;
                                    System.out.println("los grados rankine convertidos son: " + celcius);
                                }else{
                                    kelvine = rankine / 1.8;
                                    System.out.println("los grados rankine convertidos son: " + kelvine);
                                }

                            }else{
                                System.out.println("su respuesta no fue comprendida intente de nuevo");
                            }

                        }
                    }
                    break;                
    
                case 4:
                /*trabajo*/

                System.out.println("inserte ¿cuantos numeros va a ingresar?");
                total = entrada.nextInt();

                do{
                    System.out.println("inserte el numero");
                    numtotal=entrada.nextInt();
                    if(numtotal == 0){
                        //contar cuantos positivos hay
                        positivos = positivos + 0;
                    }else{
                        if(numtotal > 0){
                            positivos = positivos + 1;

                        }else{
                            negativos = negativos + 1;

                        }
                    }
                //saber el total
                total = total - 1;


                }while(total !=0);
                System.out.println("total de positivos es: "+ positivos);
                System.out.println("total de negativos es: "+ negativos);
                break;

                case 5:
                    System.out.println("¿Cuántos productos?");
                    total = entrada.nextInt();
                    for(int i = 1; i <= total; i++){
                        System.out.println("ingresa el primer producto");
                        costo = entrada.nextInt();
                        System.out.println("ingresa la cantidad del producto");
                        cantidad = entrada.nextInt();
                        resultado = costo * cantidad;
                    }
                    break;
                case 6:
                    //tarea
                    System.out.println("Ingrese 1 para cuadrado. 2 para triangulo. 3 para rectangulo. 4 para circulo: ");
                    fig = entrada.nextInt();
                    switch(fig){
                        case 1 :
                            System.out.println("¿Cuánto mide un lado del cuadrado?");
                            c = entrada.nextFloat();
                            System.out.println("Ingrese el numero 1 para perimetro. 2 area");
                            calculo = entrada.nextInt();
                            switch(calculo){
                                case 1 :
                                    resul = c * 4;
                                    System.out.println("El perimetro del cuadrado es: " + resul);
                                    break;
                                case 2 :
                                    resul = c * c;
                                    System.out.println("El area del cuadrado es: " + resul);
                                    break;
                                default :
                                    System.out.println("Intente de nuevo");                            
                            }
                                break;
                        case 2 :
                            System.out.println("Inserte 1 para perimetro. 2 para area");
                            calculo = entrada.nextInt();
                            switch(calculo){
                                case 1 :
                                    System.out.println("¿Cuanto mide el lado A del triangulo?");
                                    c = entrada.nextFloat();
                                    System.out.println("¿cuanto mide el lado B del triangulo?");
                                    d = entrada.nextFloat();
                                    System.out.println("¿Cuanto mide el lado C del triangulo?");
                                    e = entrada.nextFloat();
                                    resul = c + d + e;
                                    System.out.println("El perimetro del triangulo es de: " + resul);
                                    break;                                                                         
                                case 2 :
                                    System.out.println("¿Cuanto mide la base del triangulo?");
                                    c = entrada.nextFloat();
                                    System.out.println("inserte cuanto mide la altura del triangulo");
                                    d = entrada.nextFloat();                            
                                    resul = (c*d) / 2;
                                    System.out.println("el area del triangulo es: " + resul);
                                    break;
                                default :    
                                    System.out.println("La respuesta no es correcta intente de nuevo");
                                
                            }   
                                break;                         
                        case 3 :
                            System.out.println("¿Cuanto mide el lado A del Rectangulo?");
                            c = entrada.nextFloat();
                            System.out.println("¿Cuanto mide el lado B del Rectangulo?");
                            d = entrada.nextFloat();
                            System.out.println("Inserte 1 para calcular perimetro 2 para calcular area");
                            calculo = entrada.nextInt();
                            switch(calculo){
                                case 1 : 
                                    resul = (2*c + 2*d);
                                    System.out.println("El perimetro del rectangulo es de: " + resul);
                                    break;
                                case 2 : 
                                    resul = c * d;
                                    System.out.println("El area del rectangulo es de: " + resul);
                                    break;
                                default :
                                    System.out.println("Intente de nuevo");
                                
                            }
                                break;  
                        case 4 :
                            System.out.println("¿Cuanto mide el radio del circulo?");
                            c = entrada.nextFloat();
                            System.out.println("Ingrese 1 para calcular perimetro. 2 para area");
                            calculo = entrada.nextInt();
                            switch(calculo){
                                case 1 :
                                    resul = 2*c*pi;
                                    System.out.println("El perimetro de el circulo es de: " + resul);
                                    break;
                                case 2 :
                                    a1 = Math.pow(c, 2);
                                    resul = pi*a1;
                                    System.out.println("El area del circulo es de: "+ resul);
                                    break;
                                default :
                                    System.out.println("Intente de nuevo");
                            }                            
                    
                    }
                    break;
                case 7: 
                    for (n = 1; n<=10; n++){
                        System.out.println(n + " " + (n*10) + " " + (n*100) +  " " + (n*1000));

                    }
                    break;

                case 8:
                   System.out.println("Numeros factoriales ");
                System.out.println("Ingresa numero para obtener factorial: ");
                int num=entrada.nextInt();
                int r=1;
                if(num!= 0){
                    for(int i=1;i<=num;i++){
                        r=r*i;
                    }
                    System.out.println("El factorial de " +num+" es igual a "+r);
                }else{
                    System.out.println("El factorial de cero es 1");
                }
                break;

                case 9:
                    System.out.println("inserta el numero de lados: ");
                    n = entrada.nextInt();
                    if ( n >= 1 && n <= 20){
                        for(int i = 1; i<=n; i++){
                            for (int j = 1; j<=n; j++){
                                System.out.print("* ");
                            }
                        System.out.println(" ");
                        }
                    }else{
                        System.out.println("El rango debe ser entre 1 y 20, intente nuevamente");
                    }
                    break;
                case 10:
                    System.out.println("inserta el numero de lados: ");
                    n = entrada.nextInt();
                    if (n >= 1 && n <=20){
                        for (int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                        for(int i = 0; i < n-2; i++){
                            System.out.print(" * ");
                            for(int j = 0 ; j< n-2 ; j++){
                                System.out.print("");
                            }
                        System.out.println("    * ");                            
                        }
                        for (int i = 0; i < n; i++){
                            System.out.print(" * ");                        
                        }
                        System.out.println();
                    }
                    break;

                case 11:
                    //tarea

                case 12:
                    //tarea
                case 13:
                    System.out.println("ingresa un numero: ");
                    a = entrada.nextFloat();
                    System.out.println("ingresa otro numero: ");
                    b = entrada.nextFloat();
                    System.out.println("ingresa que operación se va a realizar: (+, -, *, /)");
                    operacion = entrada.next().charAt(0);
                    switch(operacion){
                        case '+':
                            resultado = a+b;
                            System.out.println("la suma es de: "+ resultado);
                            break;
                        case '-':
                            resultado = a-b;
                            System.out.println("la resta es de: "+ resultado);
                            break;
                        case '*':
                            resultado = a*b;
                            System.out.println("la multiplicacion es de: "+ resultado);
                            break;
                        case '/' :
                            if(b !=0){
                                resultado = a/b;
                                System.out.println("la división es de: " + resultado);
                            }else{
                                System.out.println("no se puede dividir entre cero (0)");
                            }
                            break;                 
                        default :
                            System.out.println("operacion no valida");
                    }


                default:
                    System.out.println("Gracias por ver este hermoso programa :3");



        }
    
        System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
        /*
            para recibir la respuesta debo de obtener un caracter s
            para cuando se reciben char se utiliza ''
            para cuando se reciben String se utiliza ""
        */ 
    
        letras = entrada.next().charAt(0);
    
        //si el usuario ingresa si  solo detecto la s  es la posicion del caracter que queremos lee
    
    
    
    
    }while(letras == 's');
    //aqui se cierra el do
    /*exepciones de errores, formato de */

   

    }

}

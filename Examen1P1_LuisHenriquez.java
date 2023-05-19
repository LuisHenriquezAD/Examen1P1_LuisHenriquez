
package examen1p1_luishenriquez;

import java.util.Scanner;

public class Examen1P1_LuisHenriquez {

   
    public static void main(String[] args) {
       Scanner lea = new Scanner (System.in);
       Scanner leer = new Scanner (System.in);
       int num =1;
       while (num==1){
           
            System.out.println("Ingrese una opcion");
            System.out.println("1.Sumador Binario ");
            System.out.println("2.Estrella de David");
            System.out.println("3.Salir");
            int opcion = lea.nextInt();
            
          switch (opcion){
              
            case 1:
                

                int numero = 0;//PARA VER CUANTOS NUMEROS HAY EN UNA CADENA
                String nume= "";//PARA VER QUE TODOS SEAN 1 Y 0 
                int numero2= 0;
                String nume2= "";
                
     
          
                
               int ok = 1;

               
                while(ok ==1 ){
                     ok = 2;
                     numero = 0;//PARA VER CUANTOS NUMEROS HAY EN UNA CADENA
                     nume= "";//PARA VER QUE TODOS SEAN 1 Y 0 
                     String cadena = "";
                     lea = new Scanner (System.in);
                     System.out.println("Introduzca un numero Binario");
                     cadena = lea.nextLine();
                     
                      for (int i = 0; i<cadena.length();i++){
                          if (Character.isDigit(cadena.charAt(i))){//ver si son numeros 
                        numero++;
                        nume += cadena.charAt(i);
                            }
                          else{
                              System.out.println("Numero invalido");
                              System.out.println();
                              ok =1;
                          }//FIN ELSE
                      }
                      
                      for (int i= 0; i<cadena.length();i++){
                          if (cadena.charAt(i)=='1' || cadena.charAt(i)=='0'){
                               System.out.print(cadena.charAt(i));
                          }
                          else{
                               System.out.print(cadena.charAt(i));
                               ok = 1; 
                          }
                      }//for para ver si son 1 y ceros

                }     
                   

               int ok2= 1;
               while(ok2 ==1){
                ok2 = 2;
                numero2= 0;
                nume2= "";   
                String cadena1 = "";
                System.out.println(); 
                System.out.println("La cantidad de numeros en la primera cadena es: "+numero);
                System.out.println("Asegurarse de escribir la misma cantidad aqui"); 
                
                
                
                
                leer = new Scanner (System.in);
                System.out.println("Introduzca un segundo numero Binario");
                cadena1 = leer.nextLine();
                
                 
                 
                      for (int a = 0; a<cadena1.length();a++){//TODOS NUMEROS
                          if (Character.isDigit(cadena1.charAt(a))){
                              numero2++;
                              nume2 += cadena1.charAt(a);
                        }
                          else {
                              System.out.println("Numero invalido");
                              System.out.println();
                              ok2 = 1;
                          }//FIN ELSE
                      }
                      
                       if (numero2==numero){
                           System.out.println("Bien tienen el mismo rango");
                      }
                      else{
                          System.out.println("1. CADENA:"+numero);
                          System.out.println("2. CADENA:"+numero2); 
                          System.out.println("Cantidad del 2 invalida"); 
                          ok2 = 1; 
                      }
                      
                      for (int i= 0; i<cadena1.length();i++){
                          if (cadena1.charAt(i)=='1' || cadena1.charAt(i)=='0'){
                               System.out.print(cadena1.charAt(i));
                          }
                          else{
                               System.out.print(cadena1.charAt(i));
                               ok2 = 1; 
                          }
                      }//for para ver si son 1 y ceros
                      
                      
                     
               }      
                      System.out.println(); 
            String vueltaf= "";
            String vuelta= "";  
            String vuelta2= ""; 
            String binario= ""; 
            char adicional = ' ';
            System.out.println();      
            System.out.println("Cantidad de numeros en la primera cadena: "+numero+" y son: "  +  nume);
            System.out.println("Cantidad de numeros en la segunda cadena: "+numero2+" y son: "  +  nume2);
              
             
            vuelta = nume;
            vuelta2 = nume2;
            System.out.println(vuelta);
            System.out.println(vuelta2);
            
            
            
            
            
            
            for (int f = numero-1; f>=0; f--){
                
                if (adicional== '1' && vuelta.charAt(f) == '1' && vuelta2.charAt(f) == '0'){
                    binario= '0'+binario;
                    adicional= '1';
                }
                else{
                    if (adicional== '1' && vuelta.charAt(f) == '0' && vuelta2.charAt(f) == '1'){
                         binario=  '0'+binario;
                         adicional= '1';
                    }
                    else {
                        if(adicional== '1' && vuelta.charAt(f) == '0' && vuelta2.charAt(f) == '0'){
                            binario = '1'+binario;
                            adicional= ' ';
                        }
                        else {
                            if(adicional== '1' && vuelta.charAt(f) == '1' && vuelta2.charAt(f) == '1'){
                            binario = '1'+binario;
                            adicional= '1';
                        }
                            else{
                                if(vuelta.charAt(f) == '1' && vuelta2.charAt(f) == '0'){
                            binario = '1'+binario;
                            adicional= ' ';
                        }
                                else {
                                    if (vuelta.charAt(f) == '0' && vuelta2.charAt(f) == '1'){
                                            binario =  '1'+binario;
                                            adicional= ' ';
                                         }
                                    else {
                                        if (vuelta.charAt(f) == '1' && vuelta2.charAt(f) == '1'){
                                            binario = '0'+binario;
                                            adicional= '1';
                                         }
                                        else {
                                            if (adicional == '1' && vuelta.charAt(0)== '1' && vuelta2.charAt(0)== '0' ){
                                                binario  = "10"+binario;
                                            }
                                            else {
                                                if (adicional == '1' && vuelta.charAt(0)== '0' && vuelta2.charAt(0)== '1' ){
                                                     binario  = "10"+binario;
                                                 }
                                                else {
                                                    if (adicional == '1' && vuelta.charAt(0)== '0' && vuelta2.charAt(0)== '0' ){
                                                             binario  = "10"+binario;
                                                        }
                                                    else {
                                                        if (vuelta.charAt(0)== '1' && vuelta2.charAt(0)== '0' ){
                                                                 binario  = '1'+binario;
                                                            }
                                                        else {
                                                            if (vuelta.charAt(0)== '0' && vuelta2.charAt(0)== '1' ){
                                                                 binario  = '1'+binario;
                                                            }
                                                            else{
                                                                if (vuelta.charAt(0)== '0' && vuelta2.charAt(0)== '0' ){
                                                                 binario  = '0'+binario;
                                                            }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                                
                                        }
                                    }
                                }
                                
                            }
                        }
                    }//todas estas son las validaciones
                }//fin else
                 
            }//fin for para la suma
            
            if (adicional == '1'){
                binario = '1'+binario;
            }
            
      
            
            System.out.println("La suma es: "+binario);
            
                
            break;
            
            case 2:
                
                
                
                int salir = 1; 
                while(salir == 1){
                     System.out.println(" ");
                   leer = new Scanner (System.in);  
                 System.out.println("Ingrese cual quiere: ");
                 System.out.println("1.TRIANGULO DE + ");
                 System.out.println("2.TRIANGULO DE *");
                 System.out.println("3.Salir");
                 int OPC = leer.nextInt();
                 
                    switch (OPC){
                       
                        case 1:
                        
                 leer = new Scanner (System.in);  
                 System.out.println("Ingrese un numero");
                 int nu = leer.nextInt();
              
                    for (int i=0;i<nu;i++){
                        for (int k=nu-i;k>0;k--){
                            System.out.print(" ");
                        }
                        for (int k=0;k<=i;k++){
                            if (k==0 || k== i || i == nu -1 ){
                                System.out.print("+");
                            }
                            else{
                                System.out.print(" ");
                            }
                             System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    break;
                    
                    case 2:
                        
                        leer = new Scanner (System.in);  
                 System.out.println("Ingrese un numero");
                 int numer = leer.nextInt();
              
                    for (int i=0;i<numer;i++){
                        for (int k=numer-i;k>0;k--){
                            System.out.print(" ");
                        }
                        for (int k=0;k<=i;k++){
                            if (k==0 || k== i || i == numer -1 ){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                             System.out.print(" ");
                        }
                        System.out.println("");
                    }
                 
                 
                        break;
                        
                    case 3:
                        salir = 2; 
                        break;
                        
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                     }//fin sub menu 
                    
                    }
                
                    
                 
                break;
                
            case 3:
                num = 2; 
                break;
                
            default:
                System.out.println("OPCION INVALIDA");
                break;
          }//FIN SWITCH
       
            
       }//FIN WHILE DE ENTRADA Y SALIDA
    }
    
}


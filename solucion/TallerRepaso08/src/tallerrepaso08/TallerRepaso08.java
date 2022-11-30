/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrepaso08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class TallerRepaso08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorCancelar;
        int numeroEmpleados;
        String salida;
        String nombreEmpleado;
        int cedulaEmpleado;
        int horasMatutinas;
        int horasNocturnas;
        String ciudadEmpresa;
        int valorAdicional = 10;
        int horaMatutina = 10;
        int horaNocturna = 15;
        int contador = 0;
        boolean bandera = true;
        double seguroSocial = 18;
        double subTotal;
        String serie;
        
        do{
            
        System.out.println("Ingrese su nombre por favor");
        nombreEmpleado = entrada.nextLine();
        
        System.out.println("Ingrese su número de cédula por favor");
        cedulaEmpleado = entrada.nextInt();
        
        System.out.println("Ingrese sus horas matutinas trabajadas por favor");
        horasMatutinas = entrada.nextInt();
        
        System.out.println("Ingrese sus horas nocturnas trabajadas por favor");
        horasNocturnas = entrada.nextInt();
        
        System.out.println("Ingrese la ciudad de la empresa donde trabaja por favor");
        ciudadEmpresa = entrada.nextLine();
        
        
           if ( horasNocturnas >= 10 ) {
               horaMatutina = horasMatutinas * horaMatutina;
               valorAdicional = (horaNocturna * valorAdicional) / 100;
               horaNocturna = horasNocturnas * horaNocturna + valorAdicional;
               subTotal = horaMatutina + horaNocturna;
               seguroSocial = (subTotal * seguroSocial) / 100;
               valorCancelar = subTotal - seguroSocial;
               serie = String.format("Rol del trabajador de nombre %s y cédula %d."
                       + "\nHoras matutinas trabajadas: %d.\nHoras nocturnas "
                       + "trabajadas: %d.\nSubtotal %.2f\nSeguro Social %.2f\n"
                       + "Total a cancelar %.2f", 
                       nombreEmpleado, cedulaEmpleado, horasMatutinas, 
                       horasNocturnas, subTotal, seguroSocial, valorCancelar);
               entrada.nextLine();
               }else{
               horaMatutina = horasMatutinas * horaMatutina;
               horaNocturna = horasNocturnas * horaNocturna;
               subTotal = horaMatutina + horaNocturna;
               seguroSocial = (subTotal * seguroSocial) / 100;
               valorCancelar = subTotal - seguroSocial;
               serie = String.format("Rol del trabajador de nombre %s y cédula %d."
                       + "\nHoras matutinas trabajadas: %d\nHoras nocturnas "
                       + "trabajadas: %d.\nSubtotal %.2f\nSeguro Social %.2f\n"
                       + "Total a cancelar %.2f", 
                       nombreEmpleado, cedulaEmpleado, horasMatutinas, 
                       horasNocturnas, subTotal, seguroSocial, valorCancelar);
               entrada.nextLine();
               }
        contador = contador + 1;
        
        System.out.println("Ingrese (s) si desea salir del ciclo ");
        salida = entrada.nextLine();
   
           if (salida.equals("s")){
               bandera = false;
           }
           
        }while(bandera);
        
        System.out.printf("Nómina de trabajadores:\n%s\nNumero de empleados %d" , serie, contador);
        
    }
    
}

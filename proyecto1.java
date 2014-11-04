import java.io.*;
import javax.swing.*;
public class proyecto1{
public static void main (String [] args) throws IOException{
	BufferedReader leer= new BufferedReader( new InputStreamReader(System.in));
	////////////////////////////////////////////////////////////IE semestre 1
	
int SS=30;
int cont1,cont2;
	int opcion1=0;
	int opcion_altas=0;
	String nombresie[]=new String [SS];
	int numero_controlie[]=new int[SS];
	String nombresisc[]=new String[SS];
	int numero_controlisc[]=new int[SS];
	////////////////////////////////////////////////////IE SEMESTRE 1
	int ie1[]=new int[SS];
	int ie2[]=new int[SS];
	int ie3[]=new int [SS];
	int ie4[]= new int[SS];
	int ie5[]= new int[SS];
	int ie6[]=new int[SS];
	////////////////////////////////////////// IE SEMESTRE 2
	int iel7[]=new int[SS];
   int iel8[]=new int[SS];
   	int iel9[]=new int[SS];
   	int iel10[]=new int[SS];
   	int iel11[]=new int[SS];
   	int iel12[]=new int[SS];
   	/////////////////////////////////////////ISC SEMESTRE 1
   	int isc1[]=new int[SS];
    int isc2[]=new int[SS];
    int isc3[]=new int[SS];
    int isc4[]=new int[SS];
    int isc5[]=new int[SS];
    int isc6[]=new int[SS];
    ////////////////////////////////////////ISC SEMESTRE 2
    	int is7[]=new int[SS];
    	int is8[]=new int[SS];
    	int is9[]=new int[SS];
    	int is10[]=new int[SS];
    	int is11[]=new int[SS];
    	int is12[]=new int[SS];
    	//////////////////////////////////////actividades extraescolares
     String actividadesie[]=new String [SS];
     String actividadesisc[]=new String [SS];
	proyecto2 altas=new proyecto2();
	
	                
	
	do{
		do{
             opcion1=0;                             try{      
opcion1=Integer.parseInt(JOptionPane.showInputDialog("*MENU*\n[1].....Altas\n[2].....Bajas\n[3].....Cambios\n[4].....Imprimir datos\n[5]....salir\n¡¡ELIJA UNA OPCION!!"));
      }
   catch(NumberFormatException po){ JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(opcion1<1)
   {
  	JOptionPane.showMessageDialog(null,
                    "SOLO OPCIONES DEL MENU",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcion1<1);
      
      	 switch(opcion1)
     {//abre el switch pricipal
     case 1:///case de altas
     do{///while para sali del switch
     
     System.out.println("\nSECCION DE ALTAS \n");
     do{
     try{
     opcion_altas=0;
    opcion_altas=Integer.parseInt(JOptionPane.showInputDialog("*MENU*\n[1].....Alumnos\n[2].....Calificaciones\n[3].....Actividades extraescolares\n[4].....Regresar al menu anterior\n¡¡ELIJA UNA OPCION!!"));
       }
   catch(NumberFormatException po){ JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(opcion_altas<1)
   {
   	JOptionPane.showMessageDialog(null,
                    "SOLO OPCIONES DEL MENU",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcion_altas<1);
     switch(opcion_altas)
     {//switch abierto
     	case 1:
    altas.pedir_nombres(numero_controlie,nombresie,numero_controlisc,nombresisc);//metodo para pedir nombres
     	break;
     	
     
     	case 2:
     	
     	altas.calificaciones(numero_controlie,nombresie,numero_controlisc,nombresisc,isc1,isc2,isc3,isc4,isc5,isc6,is7,is8,is9,is10,is11,is12,ie1,ie2,ie3,ie4,ie5,ie6,iel7,iel8,iel9,iel10,iel11,iel12);;//metodo para pedir califiocaciones
     	break;
     	case 3:
     	altas.activo(numero_controlie,nombresie,numero_controlisc,nombresisc,actividadesie,actividadesisc);
     	break;
     	

     }//switch serrado
     }while(opcion_altas!=4);//while para salir del switch
     break;//aqui termina el case de altas
     /////////////////////////////////////////////////////////////////////////////////////////
     case 2:////case de bajas
     System.out.println("SECCION DE BAJAS");
    altas.bajas(numero_controlie,nombresie,numero_controlisc,nombresisc,isc1,isc2,isc3,isc4,isc5,isc6,is7,is8,is9,is10,is11,is12,ie1,ie2,ie3,ie4,ie5,ie6,iel7,iel8,iel9,iel10,iel11,iel12,actividadesie,actividadesisc);;
     break;
     case 3://///case de cambios
     System.out.println("SECCION DE CAMBIOS");
       altas.cambios(numero_controlie,nombresie,numero_controlisc,nombresisc,isc1,isc2,isc3,isc4,isc5,isc6,is7,is8,is9,is10,is11,is12,ie1,ie2,ie3,ie4,ie5,ie6,iel7,iel8,iel9,iel10,iel11,iel12);
     break;	
     case 4:
     altas.imprimir(numero_controlie,nombresie,numero_controlisc,nombresisc,isc1,isc2,isc3,isc4,isc5,isc6,is7,is8,is9,is10,is11,is12,ie1,ie2,ie3,ie4,ie5,ie6,iel7,iel8,iel9,iel10,iel11,iel12,actividadesie,actividadesisc);;//metodo para pedir califiocaciones
    
     break;
     		 
	}//cierra el switch principal
}while(opcion1!=5);
	
	}
	}
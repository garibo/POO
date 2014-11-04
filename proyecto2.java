import java.io.*;
import javax.swing.*;
public class proyecto2{
public static void main (String [] args) throws IOException{}
	BufferedReader leer= new BufferedReader( new InputStreamReader(System.in));
	Boolean aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9,aa10,aa11,aa12,gate200;
String gate1,gate2,gate3,gate4,gate5,gate6,gate7,gate8,gate9,gate10,gate11,gate12,caca,fast;
Boolean bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,gate100,gate101;
String go1,go2,go3,go4,go5,go6,go7,go8,go9,go10,go11,go12,scruu;
	int cont1=0;
int cont2=0;
	int x,nn1=0,nn2=0,nn3;
	int opcion_otro,ing;
	int l=0,m=0,o=0;
	int nom1=0,nom2=0,nom15=0,nom13=0;
	int opcionnn1=0,opcionnn2=0,opcionnn12=0,opcionnn13=0;
	int Q=0,R=0;
	int nop1=0,nop2=0,nop3;
	int cc1,cc2,cc3;
	int opp145=0,opp146=0;
	int co1,co2,co3;
	int ska1,ska2,ska3;
int nik,snup1=0,snup2=0,snup3;
int koko,controlx,controlx1,controlx2,controlx3;
int ja1,ja2,ja3,fall1=0,fall2=0,fall3;
int sasa;
	public void pedir_nombres(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc)throws IOException{//inicio del metodo para pedir nombres
	
	do{
     try{
     	l=0;
     	
	System.out.println("[1].....Ingenieria en sistemas computacionales\n[2]......Ingenieria electronica");
      l=Integer.parseInt(leer.readLine());
      	}
   catch(NumberFormatException po){ JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(l<1)
   {
   	JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);

   }
   }while(l<1);
   ///////
switch(l)
{
	case 1:
	System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES\n");
	
	do{
		////////////////
		do{
     try{

	m=Integer.parseInt(JOptionPane.showInputDialog("\nA cuantos alumnos desea dar de alta"));
      	}
   catch(NumberFormatException po){ JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(m<1)
   {
   	JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(m<1);
   /////////////
      
	for(x=Q;x<(m+Q);x++)
	{
		System.out.println("Ingrese el nombre");
		nombresisc[x]=leer.readLine();
////////
	do{
     try{
		System.out.println("Ingrese el numero de control");
		numero_controlisc[x]=Integer.parseInt(leer.readLine());
			}
   catch(NumberFormatException po){JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(numero_controlisc[x]<1)
   {
   	 	  JOptionPane.showMessageDialog(null,  "NUMERO DE CONTROL NO VALIDO",  "Inane warning", JOptionPane.WARNING_MESSAGE);
   }
   }while(numero_controlisc[x]<1);
   /////////////////////////
		
		cont1++;		
	}
	Q=Q+m;
	do{
     try{
nik=Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otro alumno\n[1].....SI\n[2].....NO"));
		}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(nik<1)
   {
   		JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nik<1);
   ////////////////////
	}while(nik==1);

	break;
	
	case 2:
	System.out.println("INGENIERIA ELECTRONICA\n");
	
	do
	{
		
	
	do{
     try{
     	o=0;
     	
	o=Integer.parseInt(JOptionPane.showInputDialog("\nA cuantos alumnos desea dar de alta"));
      
      
      }
   catch(NumberFormatException po){   	JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(o<1)
   {
  	JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(o<1);
   //////////////////////
      
      	for(x=R;x<(o+R);x++)
	{
		
				System.out.println("Ingrese el nombre");
		nombresie[x]=leer.readLine();

	do{
     try{
		System.out.println("Ingrese el numero de control");
		numero_controlie[x]=Integer.parseInt(leer.readLine());
			}
   catch(NumberFormatException po){JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(numero_controlie[x]<1)
   {
   		JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(numero_controlie[x]<1);
   //////////////
		
		cont2++;
		
	}
	R=R+o;
	do{
     try{
	

koko=Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otro alumno\n[1].....SI\n[2].....NO"));
	}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(koko<1)
   {
  JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(koko<1);
	}while(koko==1);
	break;
	
	
}
System.out.println(cont1);
System.out.println(cont2);
		

		}//fin del metodo para pedir nombres
		
	
	
	
	
	public void calificaciones(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc,int[]isc1, int[]isc2,int[]isc3,int[]isc4, int[]isc5, int[]isc6,int[]is7,int[]is8,int[]is9,int[]is10,int[]is11,int[]is12,int[]ie1,int[]ie2,int[]ie3,int[]ie4,int[]ie5,int[]ie6,int[]iel7,int[]iel8,int[]iel9,int[]iel10,int[]iel11,int[]iel12)throws IOException{//metodo para pedir calificaciones

System.out.println("**********************************************************************");   
	do{
     try{              
         nom1=0;                                                                                                                                                                                 
System.out.print("Ingrese el numero de control del alumno:   ");
     nom1=Integer.parseInt(leer.readLine());
     }
   catch(NumberFormatException po){JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(nom1<1)
   {
    JOptionPane.showMessageDialog(null,
                    "NUMERO DE CONTROL NO VALIDO",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nom1<1);
    	nn1=0;
		nn2=0;
	
	 for( x=0;x<cont1;x++)
		 			 {
		 			 
		 			 	if(numero_controlisc[x]==nom1)
		 			 	{
		 			 		nn1=1;
		 			 		System.out.println("------------------------------------------------------------");
		 			 		System.out.println("Su nombre es: "+nombresisc[x]);
		 			 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 			 		System.out.println("Su carrera es: ingenieria en sistemas computacionales");
		 			 		do{
                            try{
                            	opcionnn1=0;
		 			 		System.out.print("\nDe que semestre desea subir calificaciones\n[1].....Semestre 1\n[2].....Semestre 2  ");
		 			 		  opcionnn1=Integer.parseInt(leer.readLine());
		 			 		  }
   catch(NumberFormatException po){JOptionPane.showMessageDialog(null,
                                             "ERROR EN SU ELECCION",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);}
   
   if(opcionnn1<1)
   {
  JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcionnn1<1);
		 			 		  if(opcionnn1==1)
		 			 		  {
		 			 		  	System.out.println("******PRIMER SEMESTRE DE INGENIERIA EN SISTEMAS COMPUTACIONALES******");
		 		        	 	  //////////////////////////
		 		        	 	  do{
		 		        	 	  
		 			 		  	System.out.print("Ingrese su calificacion en calculo diferencial:  ");
		 			 		  	gate1=leer.readLine();
		 			 		  aa1=isNumeric(gate1);
		 			 		  if(aa1==true)
		 			 		  {
		 			 		  		isc1[x]=Integer.parseInt(gate1);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc1[x]>100)||(isc1[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		  if(aa1==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa1==false)||(isc1[x]<0)||(isc1[x]>100));
		 			 		  		
		 			 		
		 			 		  	/////////////////////////
		 			 		  	do{
		 			 		  	
		 			 		 System.out.print("Ingrese su calificacion en taller de etica:  ");
                              gate2=leer.readLine();
                          	  aa2=isNumeric(gate2);
                               if(aa2==true)
		 			 		  {
		 			 		  		isc2[x]=Integer.parseInt(gate2);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc2[x]>100)||(isc2[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		  	  if(aa2==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa2==false)||(isc2[x]<0)||(isc2[x]>100));

		 			 		
		 			 		  /////////////////////////
		 			 		  do{
		 			 		  
		 			 		  System.out.print("Ingrese su calificacion en matematicas discretas:  ");
		 			 		     gate3=leer.readLine();
		 			 		     aa3=isNumeric(gate3);
		 			 		      if(aa3==true)
		 			 		  {
		 			 		  		isc3[x]=Integer.parseInt(gate3);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc3[x]>100)||(isc3[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		    if(aa3==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa3==false)||(isc3[x]<0)||(isc3[x]>100));
		 			 		     
		 			 		     
		 			 		  
		 			 		  	//////////////////////
		 			 		  	do{
		 			 		  	System.out.print("ingrese su calificacion en fundamentos de programacion:  ");
		 			 		  	gate4=leer.readLine();
		 			 		  	  aa4=isNumeric(gate4);
		 			 		  	  if(aa4==true)
		 			 		  	  {
		 			 		  	  	isc4[x]=Integer.parseInt(gate4);
		 			 		  	  	  if((isc4[x]>100)||(isc4[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	  }
		 			 		  	  if(aa4==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa4==false)||(isc4[x]<0)||(isc4[x]>100));
		 			 		  	
		 			 
		 			 		  	///////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en taller de administracion:  ");
		 			 		  	gate5=leer.readLine();
		 			 		  	aa5=isNumeric(gate5);
		 			 		  	if(aa5==true)
		 			 		  	{
		 			 		  		 	isc5[x]=Integer.parseInt(gate5);
		 			 		  		 if((isc5[x]>100)||(isc5[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  	  if(aa5==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa5==false)||(isc5[x]<0)||(isc5[x]>100));
		 			 	
		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en fundamentos de investigacion:  ");
		 			 		  	 	gate6=leer.readLine();
		 			 		  	 	aa6=isNumeric(gate6);
		 			 		  	 	if(aa6==true)
		 			 		  	 		{
		 			 		  		 	isc6[x]=Integer.parseInt(gate6);
		 			 		  		 if((isc6[x]>100)||(isc6[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  if(aa6==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa6==false)||(isc6[x]<0)||(isc6[x]>100));	/////////////////////////////////////////////////////////////////////////////////////////////////////
		 			 		  	 	
		 			 		  
		 			 		  	
		 			 		  }
		 			 	      if(opcionnn1==2)
		 			 		  {System.out.println("******SEGUNDO SEMESTRE DE INGENIERIA EN SISTEMAS COMPUTACIONALES******");
		 			 		
		 			 		 	//////////////////
		 			 		 	do{
		 			 		 	
		 			 		  	System.out.print("Ingrese su calificacion en calculo integral:  ");
		 			 		  gate7=leer.readLine();
		 			 		  aa7=isNumeric(gate7);
		 			 		  if(aa7==true)
		 			 		 	{
		 			 		  	is7[x]=Integer.parseInt(gate7);
		 			 		  if((is7[x]>100)||(is7[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  	 if(aa7==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa7==false)||(is7[x]<0)||(is7[x]>100));	
		 			 		  	///////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en algebra lineal");
		 			 		   gate8=leer.readLine();
		 			 		   aa8=isNumeric(gate8);
		 			 		   if(aa8==true)
		 			 		   {
		 			 		   		is8[x]=Integer.parseInt(gate8);
		 			 		  if((is8[x]>100)||(is8[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   	 if(aa8==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa8==false)||(is8[x]<0)||(is8[x]>100));	

		 			 		  	//////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en probabilidad y estadisticas:  ");
		 			 		   gate9=leer.readLine();
		 			 		   aa9=isNumeric(gate9);
		 			 		   if(aa9==true)
		 			 		   {
		 			 		   		is9[x]=Integer.parseInt(gate9);
		 			 		  if((is9[x]>100)||(is9[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     	 if(aa9==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa9==false)||(is9[x]<0)||(is9[x]>100));	

		 			 		  	//////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en contabilidad financiera:  ");
		 			 		  	gate10=leer.readLine();
		 			 		  	aa10=isNumeric(gate10);
		 			 		  	if(aa10==true)
		 			 		 	   {
		 			 		   		is10[x]=Integer.parseInt(gate10);
		 			 		  if((is10[x]>100)||(is10[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		    if(aa10==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa10==false)||(is10[x]<0)||(is10[x]>100));	

		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su calificacion en programacion orientada a objetos:  ");
		 			 		  gate11=leer.readLine();
		 			 		  aa11=isNumeric(gate11);
		 			 		  if(aa11==true)
		 			 		   {
		 			 		   		is11[x]=Integer.parseInt(gate11);
		 			 		  if((is11[x]>100)||(is11[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		    if(aa11==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa11==false)||(is11[x]<0)||(is11[x]>100));	

		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su  calificacion en quimica:  ");
		 			 		  	gate12=leer.readLine();
		 			 		  	aa12=isNumeric(gate12);
		 			 		  	if(aa12==true)
		 			 		  	{
		 			 		   		is12[x]=Integer.parseInt(gate12);
		 			 		  if((is12[x]>100)||(is12[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(aa12==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa12==false)||(is12[x]<0)||(is12[x]>100));	
		 			 		  	
		 			 		 
		 			 		  	
		 			 		  }
		 			 		System.out.println("------------------------------------------------------------");
		 			 		
		 			 		nn1=1;
		 			 		}
		 			 		}
		 			 		
		 			 		
	 for( x=0;x<cont2;x++)
		 			 {
		 			 
		 			 	if(numero_controlie[x]==nom1)
		 			 	{
		 			 		nn2=1; 
		 			 		System.out.println("------------------------------------------------------------");
		 			 		System.out.println("Su nombre es: "+nombresie[x]);
		 			 		System.out.println("su numero de control es:  "+numero_controlie[x]);
		 			 		System.out.println("Su carrera es: ingenieria electronica");
		 			    	do{
                            try{
                            	opcionnn2=0;
		 			    	System.out.print("\nDe que semestre desea subir calificaciones\n[1].....Semestre 1\n[2].....Semestre 2  \n");
		 			    	opcionnn2=Integer.parseInt(leer.readLine());
		 			    			  	}
   catch(NumberFormatException po){
   	   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
   	}
   
   if(opcionnn2<1)
   {
     	JOptionPane.showMessageDialog(null,
                    "SOLO NUMEROS POSITIVOS Y MENORES A 100",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcionnn2<1);
		 			 		  
		 			 		  if(opcionnn2==1)
		 			 		  {
		 			 		  
		 			 		System.out.println("******PRIMER SEMESTRE INGENIERIA ELECTRONICA******");
		 	               /////////////////////////////
		 	               do{////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 	               
		 			 		System.out.print("ingrese su calificacion en calculo diferencial:  ");
		 			    	go1=leer.readLine();
		 			    	bb1=isNumeric(go1);
		 			    	if(bb1==true)
		 			   	  	{
		 			   		ie1[x]=Integer.parseInt(go1);
		 			 		  if((ie1[x]>100)||(ie1[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb1==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb1==false)||(ie1[x]<0)||(ie1[x]>100));	
		 			 		////////////////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su calificacion en mecanica clasica:  ");
		 			     	go2=leer.readLine();
		 			     	bb2=isNumeric(go2);
		 			     	if(bb2==true)
		 			     		{
		 			   		ie2[x]=Integer.parseInt(go2);
		 			 		  if((ie2[x]>100)||(ie2[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb2==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb2==false)||(ie2[x]<0)||(ie2[x]>100));	
		 			 		//////////////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su calificacion en quimica:  ");
		 			 		go3=leer.readLine();
		 			 		bb3=isNumeric(go3);
		 			 		if(bb3==true)
		 			     		{
		 			   		ie3[x]=Integer.parseInt(go3);
		 			 		  if((ie3[x]>100)||(ie3[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb3==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb3==false)||(ie3[x]<0)||(ie3[x]>100));	
		 			 		////////////////////////////
		 			 		do{
		 			 		System.out.print("ingrese su calificacion en taller de etica:  ");
		 			 		go4=leer.readLine();
		 			 		bb4=isNumeric(go4);
		 			 		if(bb4==true)
		 			 		{
		 			   		ie4[x]=Integer.parseInt(go4);
		 			 		  if((ie4[x]>100)||(ie4[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb4==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb4==false)||(ie4[x]<0)||(ie4[x]>100));	
		 			 	
		 			 		//////////////////////
		 			 		do{
		 			 		System.out.print("ingrese su calificacion en fundamentos de investigacion: ");
		 			 		go5=leer.readLine();
		 			 		bb5=isNumeric(go5);
		 			 		if(bb5==true)
		 			 			{
		 			   		ie5[x]=Integer.parseInt(go5);
		 			 		  if((ie5[x]>100)||(ie5[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb5==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb5==false)||(ie5[x]<0)||(ie5[x]>100));	
		 			 	    //////////////////
		 			 	    do{
		 			 	    
		 			 	    System.out.print("ingrese su calificacion en comunicacion humana:  ");
		 			 	   go6=leer.readLine();
		 			 	   bb6=isNumeric(go6);
		 			 	   if(bb6==true)
		 			 	   	{
		 			   		ie6[x]=Integer.parseInt(go6);
		 			 		  if((ie6[x]>100)||(ie6[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb6==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb6==false)||(ie6[x]<0)||(ie6[x]>100));	//////////////////////////////////////////////////////////////////////////////////////////////
		 			 	
		 			 		//////////////////////////////////////////////////
		 	
		 			 		}
		 			 		
		 			 			  if(opcionnn2==2)
		 			 		  {
		 			 		System.out.print("\n******SEGUNDO SEMESTRE INGENIERIA ELECTRONICA******");
		 			 		////////////////////////
		 			 		do{
		 			 		
		 			 		System.out.println("\ningrese su calificacion en calculo integral:  ");
		 			 		go7=leer.readLine();
		 			 		bb7=isNumeric(go7);
		 			 		if(bb7==true)
		 			 		{
		 			   		iel7[x]=Integer.parseInt(go7);
		 			 		  if((iel7[x]>100)||(iel7[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb7==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb7==false)||(iel7[x]<0)||(iel7[x]>100));		
		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		 System.out.print("ingrese su calificacion en probabilidad y estadisticas:  ");
		 			 		 go8=leer.readLine();
		 			 		 bb8=isNumeric(go8);
		 			 		 if(bb8==true)
		 			 		 	{
		 			   		iel8[x]=Integer.parseInt(go8);
		 			 		  if((iel8[x]>100)||(iel8[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb8==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb8==false)||(iel8[x]<0)||(iel8[x]>100));		

		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		 System.out.print("ingrese su calificacion en desarrollo sustentable:  ");
		 			 		 go9=leer.readLine();
		 			 		 bb9=isNumeric(go9);
		 			 		 if(bb9==true)
		 			 		 	{
		 			   		iel9[x]=Integer.parseInt(go9);
		 			 		  if((iel9[x]>100)||(iel9[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb9==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb9==false)||(iel9[x]<0)||(iel9[x]>100));		

		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		System.out.print("ingrese su calificacion en mediciones electricas:  ");
		 			 		go10=leer.readLine();
		 			 		bb10=isNumeric(go10);
		 			 		if(bb10==true)
		 			 			{
		 			   		iel10[x]=Integer.parseInt(go10);
		 			 		  if((iel10[x]>100)||(iel10[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		      if(bb10==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb10==false)||(iel10[x]<0)||(iel10[x]>100));	
		 			 		//////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su calificacion en topicos selectos de fisica:  ");
		 			 		go11=leer.readLine();
		 			 		bb11=isNumeric(go11);
		 			 		if(bb11==true)
		 			 			{
		 			   		iel11[x]=Integer.parseInt(go11);
		 			 		  if((iel11[x]>100)||(iel11[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb11==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb11==false)||(iel11[x]<0)||(iel11[x]>100));	
		 			    	
		 			    	////////////////////
		 			    	do{
		 			    	
		 			    	System.out.print("ingrese su calificacion en desarrollo humano:  ");
		 			    	go12=leer.readLine();
		 			    	bb12=isNumeric(go12);
		 			    	if(bb12==true)
		 			    		{
		 			   		iel12[x]=Integer.parseInt(go12);
		 			 		  if((iel12[x]>100)||(iel12[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 	       	  if(bb12==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb12==false)||(iel12[x]<0)||(iel12[x]>100));	
		 
		 			    	}
		 			    		System.out.println("------------------------------------------------------------");
		 			 		nn2=1;
		 			 		}
		 			 		}


nn3=nn1+nn2;
if(nn3==0)
{

System.out.println("ESE NOMBRE NO SE ENCUENTRA REGISTRADO");
}
	}//fin del metodo para pedir calificaciones
	
	
		
	public void imprimir(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc,int[]isc1, int[]isc2,int[]isc3,int[]isc4, int[]isc5, int[]isc6,int[]is7,int[]is8,int[]is9,int[]is10,int[]is11,int[]is12,int[]ie1,int[]ie2,int[]ie3,int[]ie4,int[]ie5,int[]ie6,int[]iel7,int[]iel8,int[]iel9,int[]iel10,int[]iel11,int[]iel12,String[]actividadesie,String[]actividadesisc)throws IOException{//metodo para pedir calificaciones
		
			System.out.println("**********************************************************************");      
			do{
            try{                
            nom2=0;                                                                                                                                                                                
System.out.print("Ingrese el numero de control del alumno:   ");
     nom2=Integer.parseInt(leer.readLine());
     		}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(nom2<1)
   {
  JOptionPane.showMessageDialog(null,
                    "NUMERO DE CONTROL NO VALIDO",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nom2<1);
	 nop1=0;
	nop2=0;
	
	 for( x=0;x<cont1;x++)
		 			 {
		 			
		 			 	if(numero_controlisc[x]==nom2)
		 			 	{
		 			 		nop1=1;
		 	    System.out.println("------------------------------------------------------------");
		 		System.out.println("Su nombre es: "+nombresisc[x]);
		 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 		System.out.println("Su actividad extraescolar es:  "+actividadesisc[x]);
		 		System.out.println("Su carrera es: ingenieria en sistemas computacionales ");
            	System.out.println("------------------------------------------------------------");
		 		
            System.out.println("********SEMESTRE 1*********");
            System.out.println("\ncalculo diferencial: "+isc1[x]);
            System.out.println("\n taller de etica: "+isc2[x]);
            System.out.println("\nmatematicas discretas:  "+isc3[x]);
            System.out.println("\nfundamentos de programacion :  "+isc4[x]);
            System.out.println("\ntaller de administracion:  "+isc5[x]);
            System.out.println("\nfundamentos de investigacion:  "+isc6[x]);
            System.out.println("\n********SEMESTRE 2********");
    	     System.out.println("\ncalculo integral:  "+is7[x]);
    	     System.out.println("\nalgebra lineal:  "+is8[x]);
    	     System.out.println("\nprobabilidad y estadisticas:  "+is9[x]);
    	     System.out.println("\ncontabilidad financiera:  "+is10[x]);
    	     System.out.println("\nprogramacion orientada a objetos:  "+is11[x]);
    	     System.out.println("\nquimica:  "+is12[x]);
		 	System.out.println("------------------------------------------------------------");
		 			 		}
		 			 		}
		 
			 for( x=0;x<cont2;x++)
		 			 {
		 	
		 			 	if(numero_controlie[x]==nom2)
		 			 	{
		 			 		nop2=1;
		 	System.out.println("------------------------------------------------------------");
		 	System.out.println("Su nombre es: "+nombresie[x]);
		 	System.out.println("su numero de control es:  "+numero_controlie[x]);
            System.out.println("Su actividad extraescolar es:  "+actividadesie[x]);
		 	System.out.println("Su carrera es: ingenieria electronica");
		 	System.out.println("------------------------------------------------------------");
		    
		    System.out.println("********SEMESTRE 1*********");
		    System.out.println("\ncalculo diferencial: "+ie1[x]);
	        System.out.println("\nmecanica clasica:  "+ie2[x]);
	        System.out.println("\nquimica:  "+ie3[x]);
          	System.out.println("\ntaller de etica:  "+ie4[x]);
	        System.out.println("fundamentos de investigacion:  "+ie5[x]);
	        System.out.println("\ncomunicacion humana:  "+ie6[x]);	
	         System.out.println("\n********SEMESTRE 2*********");
	         System.out.println("\ncalculo integral:  "+iel7[x]);
	         System.out.println("\nprobabilidad y estadisticas:  "+iel8[x]);
	         System.out.println("\ndesarrollo sustentable:  "+iel9[x]);
	         System.out.println("\nmediciones electricas:  "+iel10[x]);
	         System.out.println("\ntopicos selectos de fisica:  "+iel11[x]);
	         System.out.println("\ndesarrollo humano:  "+iel12[x]);
		 			 		}
		 			 		}
		
		nop3=nop1+nop2;
		if(nop3==0)
		{
			System.out.println("\n******ESE NOMBRE NO SE ENCUENTRA REGISTRADO******\n ");
		}
		}//sierra el metodo de impresiones
		
	
	
	
	
	public void activo(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc,String[]actividadesie,String[]actividadesisc)throws IOException{//metodo para pedir calificaciones
		
			
System.out.println("**********************************************************************"); 
		do{
            try{        
            nom15=0;                                                                                                                                                                                                    
System.out.print("Ingrese el numero de control del alumno:   ");
     nom15=Integer.parseInt(leer.readLine());
     	}
   catch(NumberFormatException po){
   	
   		JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(nom15<1)
   {
   	  JOptionPane.showMessageDialog(null,
                    "NUMERO DE CONTROL NO VALIDO",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nom15<1);
       cc1=0;
     cc2=0;
					 for( x=0;x<cont2;x++)
		 			 { 

		 			 	if(numero_controlie[x]==nom15)
		 			 	{
		 			cc1=1;
		 	System.out.println("------------------------------------------------------------");
		 	System.out.println("Su nombre es: "+nombresie[x]);
		 	System.out.println("su numero de control es:  "+numero_controlie[x]);
		 	System.out.println("Su carrera es: ingenieria electronica");	
		 	System.out.println("------------------------------------------------------------\n");
		 	System.out.println("**********ACTIVIDADES EXTRAESCOLARES**********: ");
		 	System.out.println("[1].....Ajedrez");
		 	System.out.println("[2].....Futboll");
		 	System.out.println("[3].....Gimnacio");
		 	System.out.println("[4].....Bolleyboll");
		 	System.out.println("[5].....Dansa");
		 	System.out.println("[6].....Banda de guerra");
		 		do{
            try{
            	opp145=0;   
		 	System.out.println("Escoja una actividad:   ");
		 	opp145=Integer.parseInt(leer.readLine());
		 	 	}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(opp145<1)
   {
   	 JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opp145<1);
   ///////////////////
		 	if(opp145==1)
		 	{
		 	actividadesie[x]="Ajedrez";
		   JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
		 	}
			
		if(opp145==2)
		 	{
		 	actividadesie[x]="Futboll";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
		 	}
		 	
		 	if(opp145==3)
		 	{
		 	actividadesie[x]="Gimnacio";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
		 	}
			
					 	if(opp145==4)
		 	{
		 	actividadesie[x]="Bolleyboll";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
			}
			
				if(opp145==5)
		 	{
		 	actividadesie[x]="Dansa";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
			}
			
					if(opp145==6)
		 	{
		 	actividadesie[x]="Banda de guerra";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");
			}
			}
			}
		
		
			 for( x=0;x<cont1;x++)
		 			 {
		 			
		 			 	if(numero_controlisc[x]==nom15)
		 			 	{
		 			 	cc2=1;
		 System.out.println("------------------------------------------------------------");
		 System.out.println("Su nombre es: "+nombresisc[x]);
		 System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 System.out.println("Su carrera es: ingenieria en sistemas computacionales ");
		 System.out.println("------------------------------------------------------------");
		 System.out.println("**********ACTIVIDADES EXTRAESCOLARES**********: ");
		 	System.out.println("[1].....Ajedrez");
		 	System.out.println("[2].....Futboll");
		 	System.out.println("[3].....Gimnacio");
		 	System.out.println("[4].....Bolleyboll");
		 	System.out.println("[5].....Dansa");
		 	System.out.println("[6].....Banda de guerra");
		 			do{
            try{
            	opp146=0;
		 	System.out.println("Escoja una actividad:   ");
		 	opp146=Integer.parseInt(leer.readLine());
		 		}
   catch(NumberFormatException po){
   	 	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(opp146<1)
   {
   	  	 JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opp146<1);
   /////////////////////////////////////
		 		if(opp146==1)
		 	{
		 	actividadesisc[x]="Ajedrez";
		   JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

		 	}
			
		if(opp146==2)
		 	{
		 	actividadesisc[x]="Futboll";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

		 	}
		 	
		 	if(opp146==3)
		 	{
		 	actividadesisc[x]="Gimnacio";
		   JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

		 	}
			
					 	if(opp146==4)
		 	{
		 	actividadesisc[x]="Bolleyboll";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

			}
			
				if(opp146==5)
		 	{
		 	actividadesisc[x]="Dansa";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

			}
			
					if(opp146==6)
		 	{
		 	actividadesisc[x]="Banda de guerra";
		 	  JOptionPane.showMessageDialog(null,"ACTIVIDAD ALMACENADA ");

			}		 		
		 			 		}
		 			 		}
		
		
		cc3=cc1+cc2;
		if(cc3==0)
		{
				System.out.println("\n******ESE NOMBRE NO SE ENCUENTRA REGISTRADO******\n ");
			
		}
		
		
		
		
			
		}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void cambios(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc,int[]isc1, int[]isc2,int[]isc3,int[]isc4, int[]isc5, int[]isc6,int[]is7,int[]is8,int[]is9,int[]is10,int[]is11,int[]is12,int[]ie1,int[]ie2,int[]ie3,int[]ie4,int[]ie5,int[]ie6,int[]iel7,int[]iel8,int[]iel9,int[]iel10,int[]iel11,int[]iel12)throws IOException{//metodo para pedir calificaciones

System.out.println("**********************************************************************");              
do{
            try{                           
            nom13=0;                                                                                                                                                                      
System.out.print("Ingrese el numero de control del alumno:   ");
     nom13=Integer.parseInt(leer.readLine());
     	}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(nom13<1)
   {
   	 	   JOptionPane.showMessageDialog(null,
                    "NUMERO DE CONTROL NO VALIDO",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nom13<1);
	co1=0;
	co2=0;
	 for( x=0;x<cont1;x++)
		 			 {
		 			 	
		 			 	if(numero_controlisc[x]==nom13)
		 			 	{
		 			 		co1=1;
		 			 		System.out.println("------------------------------------------------------------");
		 			 		System.out.println("Su nombre es: "+nombresisc[x]);
		 			 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 			 		System.out.println("Su carrera es: ingenieria en sistemas computacionales");
		 			 		do{
            try{     
            opcionnn13=0;
		 			 		System.out.print("\nEN QUE SEMESTRE DESEA REALIZAR CAMBIOS\n[1].....Semestre 1\n[2].....Semestre 2  ");
		 			 		  opcionnn13=Integer.parseInt(leer.readLine());
		 			 		     	}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(opcionnn13<1)
   {
   	 JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcionnn13<1);
		 			 		  if(opcionnn13==1)
		 			 		  {System.out.println("******PRIMER SEMESTRE DE INGENIERIA EN SISTEMAS COMPUTACIONALES******");
		  //////////////////////////
		 		        	 	  do{
		 		        	 	  
		 			 		  	System.out.print("Ingrese su nueva calificacion en calculo diferencial:  ");
		 			 		  	gate1=leer.readLine();
		 			 		  aa1=isNumeric(gate1);
		 			 		  if(aa1==true)
		 			 		  {
		 			 		  		isc1[x]=Integer.parseInt(gate1);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc1[x]>100)||(isc1[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		  if(aa1==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa1==false)||(isc1[x]<0)||(isc1[x]>100));
		 			 		  		
		 			 		
		 			 		  	/////////////////////////
		 			 		  	do{
		 			 		  	
		 			 		 System.out.print("Ingrese su nueva calificacion en taller de etica:  ");
                              gate2=leer.readLine();
                          	  aa2=isNumeric(gate2);
                               if(aa2==true)
		 			 		  {
		 			 		  		isc2[x]=Integer.parseInt(gate2);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc2[x]>100)||(isc2[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		  	  if(aa2==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa2==false)||(isc2[x]<0)||(isc2[x]>100));

		 			 		
		 			 		  /////////////////////////
		 			 		  do{
		 			 		  
		 			 		  System.out.print("Ingrese su nueva calificacion en matematicas discretas:  ");
		 			 		     gate3=leer.readLine();
		 			 		     aa3=isNumeric(gate3);
		 			 		      if(aa3==true)
		 			 		  {
		 			 		  		isc3[x]=Integer.parseInt(gate3);
		 			 		  		
		 			 		  		
		 			 		  		  if((isc3[x]>100)||(isc3[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  
		 			 		  
		 			 		  }
		 			 		    if(aa3==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa3==false)||(isc3[x]<0)||(isc3[x]>100));
		 			 		     
		 			 		     
		 			 		  
		 			 		  	//////////////////////
		 			 		  	do{
		 			 		  	System.out.print("ingrese su nueva calificacion en fundamentos de programacion:  ");
		 			 		  	gate4=leer.readLine();
		 			 		  	  aa4=isNumeric(gate4);
		 			 		  	  if(aa4==true)
		 			 		  	  {
		 			 		  	  	isc4[x]=Integer.parseInt(gate4);
		 			 		  	  	  if((isc4[x]>100)||(isc4[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	  }
		 			 		  	  if(aa4==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa4==false)||(isc4[x]<0)||(isc4[x]>100));
		 			 		  	
		 			 
		 			 		  	///////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en taller de administracion:  ");
		 			 		  	gate5=leer.readLine();
		 			 		  	aa5=isNumeric(gate5);
		 			 		  	if(aa5==true)
		 			 		  	{
		 			 		  		 	isc5[x]=Integer.parseInt(gate5);
		 			 		  		 if((isc5[x]>100)||(isc5[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  	  if(aa5==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa5==false)||(isc5[x]<0)||(isc5[x]>100));
		 			 	
		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en fundamentos de investigacion:  ");
		 			 		  	 	gate6=leer.readLine();
		 			 		  	 	aa6=isNumeric(gate6);
		 			 		  	 	if(aa6==true)
		 			 		  	 		{
		 			 		  		 	isc6[x]=Integer.parseInt(gate6);
		 			 		  		 if((isc6[x]>100)||(isc6[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  if(aa6==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa6==false)||(isc6[x]<0)||(isc6[x]>100));	/////////////////////////////////////////////////////////////////////////////////////////////////////
		 			 		  	
		 			 		  }
		 			 	      if(opcionnn13==2)
		 			 		  {System.out.println("******SEGUNDO SEMESTRE DE INGENIERIA EN SISTEMAS COMPUTACIONALES******");
	do{
		 			 		 	
		 			 		  	System.out.print("Ingrese su nueva calificacion en calculo integral:  ");
		 			 		  gate7=leer.readLine();
		 			 		  aa7=isNumeric(gate7);
		 			 		  if(aa7==true)
		 			 		 	{
		 			 		  	is7[x]=Integer.parseInt(gate7);
		 			 		  if((is7[x]>100)||(is7[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		  	}
		 			 		  	 if(aa7==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa7==false)||(is7[x]<0)||(is7[x]>100));	
		 			 		  	///////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en algebra lineal");
		 			 		   gate8=leer.readLine();
		 			 		   aa8=isNumeric(gate8);
		 			 		   if(aa8==true)
		 			 		   {
		 			 		   		is8[x]=Integer.parseInt(gate8);
		 			 		  if((is8[x]>100)||(is8[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   	 if(aa8==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa8==false)||(is8[x]<0)||(is8[x]>100));	

		 			 		  	//////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en probabilidad y estadisticas:  ");
		 			 		   gate9=leer.readLine();
		 			 		   aa9=isNumeric(gate9);
		 			 		   if(aa9==true)
		 			 		   {
		 			 		   		is9[x]=Integer.parseInt(gate9);
		 			 		  if((is9[x]>100)||(is9[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     	 if(aa9==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa9==false)||(is9[x]<0)||(is9[x]>100));	

		 			 		  	//////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en contabilidad financiera:  ");
		 			 		  	gate10=leer.readLine();
		 			 		  	aa10=isNumeric(gate10);
		 			 		  	if(aa10==true)
		 			 		 	   {
		 			 		   		is10[x]=Integer.parseInt(gate10);
		 			 		  if((is10[x]>100)||(is10[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		    if(aa10==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa10==false)||(is10[x]<0)||(is10[x]>100));	

		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su nueva calificacion en programacion orientada a objetos:  ");
		 			 		  gate11=leer.readLine();
		 			 		  aa11=isNumeric(gate11);
		 			 		  if(aa11==true)
		 			 		   {
		 			 		   		is11[x]=Integer.parseInt(gate11);
		 			 		  if((is11[x]>100)||(is11[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		    if(aa11==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa11==false)||(is11[x]<0)||(is11[x]>100));	

		 			 		  	////////////////
		 			 		  	do{
		 			 		  	
		 			 		  	System.out.print("Ingrese su  nueva calificacion en quimica:  ");
		 			 		  	gate12=leer.readLine();
		 			 		  	aa12=isNumeric(gate12);
		 			 		  	if(aa12==true)
		 			 		  	{
		 			 		   		is12[x]=Integer.parseInt(gate12);
		 			 		  if((is12[x]>100)||(is12[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(aa12==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((aa12==false)||(is12[x]<0)||(is12[x]>100));	
		 			 		  	
		 			 		  }
		 			 		System.out.println("------------------------------------------------------------");
		 			 		
		 			 	
		 			 		}
		 			 		}
		 			 		
		 			 		
	 for( x=0;x<cont2;x++)
		 			 {
		 			 	
		 			 	if(numero_controlie[x]==nom13)
		 			 	{
		 			 		co2=1;
		 			 		System.out.println("------------------------------------------------------------");
		 			 		System.out.println("Su nombre es: "+nombresie[x]);
		 			 		System.out.println("su numero de control es:  "+numero_controlie[x]);
		 			 		System.out.println("Su carrera es: ingenieria electronica");
		 			 				 		do{
                                          try{     
                                          opcionnn12=0;
		 			    	System.out.print("\nEN QUE SEMESTRE DESEA REALIZAR CAMBIOS\n[1].....Semestre 1\n[2].....Semestre 2  ");
		 			 		  opcionnn12=Integer.parseInt(leer.readLine());
		 			 		  	}
   catch(NumberFormatException po){
   	 JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
   
   if(opcionnn12<1)
   {
  	JOptionPane.showMessageDialog(null,
                    "OPCION NO VALIDA",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(opcionnn12<1);
		 			 		  
		 			 		  if(opcionnn12==1)
		 			 		  {
		 			 		  
		 			 		System.out.println("******PRIMER SEMESTRE INGENIERIA ELECTRONICA******");
   do{////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 	               
		 			 		System.out.print("ingrese su nueva calificacion en calculo diferencial:  ");
		 			    	go1=leer.readLine();
		 			    	bb1=isNumeric(go1);
		 			    	if(bb1==true)
		 			   	  	{
		 			   		ie1[x]=Integer.parseInt(go1);
		 			 		  if((ie1[x]>100)||(ie1[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb1==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb1==false)||(ie1[x]<0)||(ie1[x]>100));	
		 			 		////////////////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su nueva calificacion en mecanica clasica:  ");
		 			     	go2=leer.readLine();
		 			     	bb2=isNumeric(go2);
		 			     	if(bb2==true)
		 			     		{
		 			   		ie2[x]=Integer.parseInt(go2);
		 			 		  if((ie2[x]>100)||(ie2[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb2==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb2==false)||(ie2[x]<0)||(ie2[x]>100));	
		 			 		//////////////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su nueva calificacion en quimica:  ");
		 			 		go3=leer.readLine();
		 			 		bb3=isNumeric(go3);
		 			 		if(bb3==true)
		 			     		{
		 			   		ie3[x]=Integer.parseInt(go3);
		 			 		  if((ie3[x]>100)||(ie3[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb3==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb3==false)||(ie3[x]<0)||(ie3[x]>100));	
		 			 		////////////////////////////
		 			 		do{
		 			 		System.out.print("ingrese su nueva calificacion en taller de etica:  ");
		 			 		go4=leer.readLine();
		 			 		bb4=isNumeric(go4);
		 			 		if(bb4==true)
		 			 		{
		 			   		ie4[x]=Integer.parseInt(go4);
		 			 		  if((ie4[x]>100)||(ie4[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb4==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb4==false)||(ie4[x]<0)||(ie4[x]>100));	
		 			 	
		 			 		//////////////////////
		 			 		do{
		 			 		System.out.print("ingrese su nueva calificacion en fundamentos de investigacion: ");
		 			 		go5=leer.readLine();
		 			 		bb5=isNumeric(go5);
		 			 		if(bb5==true)
		 			 			{
		 			   		ie5[x]=Integer.parseInt(go5);
		 			 		  if((ie5[x]>100)||(ie5[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb5==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb5==false)||(ie5[x]<0)||(ie5[x]>100));	
		 			 	    //////////////////
		 			 	    do{
		 			 	    
		 			 	    System.out.print("ingrese su nueva calificacion en comunicacion humana:  ");
		 			 	   go6=leer.readLine();
		 			 	   bb6=isNumeric(go6);
		 			 	   if(bb6==true)
		 			 	   	{
		 			   		ie6[x]=Integer.parseInt(go6);
		 			 		  if((ie6[x]>100)||(ie6[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb6==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb6==false)||(ie6[x]<0)||(ie6[x]>100));	//////////////////////////////////////////////////////////////////////////////////////////////
		 			 	

		 			 		}
		 			 		
		 			 			  if(opcionnn12==2)
		 			 		  {
		 			 		System.out.print("\n******SEGUNDO SEMESTRE INGENIERIA ELECTRONICA******");
		 			 		////////////////////////
	do{
		 			 		
		 			 		System.out.println("\ningrese su nueva calificacion en calculo integral:  ");
		 			 		go7=leer.readLine();
		 			 		bb7=isNumeric(go7);
		 			 		if(bb7==true)
		 			 		{
		 			   		iel7[x]=Integer.parseInt(go7);
		 			 		  if((iel7[x]>100)||(iel7[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb7==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb7==false)||(iel7[x]<0)||(iel7[x]>100));		
		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		 System.out.print("ingrese su nueva calificacion en probabilidad y estadisticas:  ");
		 			 		 go8=leer.readLine();
		 			 		 bb8=isNumeric(go8);
		 			 		 if(bb8==true)
		 			 		 	{
		 			   		iel8[x]=Integer.parseInt(go8);
		 			 		  if((iel8[x]>100)||(iel8[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		   if(bb8==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb8==false)||(iel8[x]<0)||(iel8[x]>100));		

		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		 System.out.print("ingrese su nueva calificacion en desarrollo sustentable:  ");
		 			 		 go9=leer.readLine();
		 			 		 bb9=isNumeric(go9);
		 			 		 if(bb9==true)
		 			 		 	{
		 			   		iel9[x]=Integer.parseInt(go9);
		 			 		  if((iel9[x]>100)||(iel9[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb9==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb9==false)||(iel9[x]<0)||(iel9[x]>100));		

		 			 		 //////////////////////
		 			 		 do{
		 			 		 
		 			 		System.out.print("ingrese su nueva calificacion en mediciones electricas:  ");
		 			 		go10=leer.readLine();
		 			 		bb10=isNumeric(go10);
		 			 		if(bb10==true)
		 			 			{
		 			   		iel10[x]=Integer.parseInt(go10);
		 			 		  if((iel10[x]>100)||(iel10[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		      if(bb10==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb10==false)||(iel10[x]<0)||(iel10[x]>100));	
		 			 		//////////////////
		 			 		do{
		 			 		
		 			 		System.out.print("ingrese su nueva calificacion en topicos selectos de fisica:  ");
		 			 		go11=leer.readLine();
		 			 		bb11=isNumeric(go11);
		 			 		if(bb11==true)
		 			 			{
		 			   		iel11[x]=Integer.parseInt(go11);
		 			 		  if((iel11[x]>100)||(iel11[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 			 		     if(bb11==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb11==false)||(iel11[x]<0)||(iel11[x]>100));	
		 			    	
		 			    	////////////////////
		 			    	do{
		 			    	
		 			    	System.out.print("ingrese su nueva calificacion en desarrollo humano:  ");
		 			    	go12=leer.readLine();
		 			    	bb12=isNumeric(go12);
		 			    	if(bb12==true)
		 			    		{
		 			   		iel12[x]=Integer.parseInt(go12);
		 			 		  if((iel12[x]>100)||(iel12[x]<0))
		 			 		  {
		 			 		  		JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  }
		 			 		   }
		 	       	  if(bb12==false)
		 			 		  {
		 			 		  	JOptionPane.showMessageDialog(null,"ERROR",  "Inane error",  JOptionPane.ERROR_MESSAGE);
		 			 		  	JOptionPane.showMessageDialog(null,"SOLO NUMEROS POSITIVOS Y MENORES A 100", "Inane warning",  JOptionPane.WARNING_MESSAGE);
		 			 		  	
		 			 		  }
		 			 		
		 			 		  }while((bb12==false)||(iel12[x]<0)||(iel12[x]>100));	
		 			    	}
		 			    		System.out.println("------------------------------------------------------------");
		 			 		
		 			 		}
		 			 		}


co3=co1+co2;
if(co3==0)
{

System.out.println("ESE NOMBRE NO SE ENCUENTRA REGISTRADO");
}
	}//fin del metodo para hacer CAMBIOS
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			public void bajas(int[]numero_controlie, String[] nombresie,int[]numero_controlisc, String[] nombresisc,int[]isc1, int[]isc2,int[]isc3,int[]isc4, int[]isc5, int[]isc6,int[]is7,int[]is8,int[]is9,int[]is10,int[]is11,int[]is12,int[]ie1,int[]ie2,int[]ie3,int[]ie4,int[]ie5,int[]ie6,int[]iel7,int[]iel8,int[]iel9,int[]iel10,int[]iel11,int[]iel12,String[]actividadesie,String[]actividadesisc)throws IOException{//metodo para pedir calificaciones
//////////////////////////////////////////////////////////////////////////////////////////		



do{
do{
 fast=JOptionPane.showInputDialog("\n[1].....Alumnos\n[2].....Calificaciones\n[3].....Actividades\n[4].....Regresar al menuu anterior");


gate200=isNumeric(fast);
if(gate200==true)
{
	sasa=Integer.parseInt(fast);

}	
if(gate200==false)
{
		 JOptionPane.showMessageDialog(null,  "SOLO OPCIONES DEL MENU",  "Inane warning", JOptionPane.WARNING_MESSAGE);
}
 }while((gate200==false)||(sasa<0));
switch(sasa)
{
case 1:
System.out.println("    Alumnos   ");
			System.out.println("**********************************************************************");  
				do{
                                          try{               
                             nom2=0;                                                                                                                                                                                                     
System.out.print("Ingrese el numero de control del alumno:   ");
     nom2=Integer.parseInt(leer.readLine());
     		}
   catch(NumberFormatException po){
   	JOptionPane.showMessageDialog(null,
                                             "ERROR",
                                                "Inane error",
                                          JOptionPane.ERROR_MESSAGE);
                                          }
                                          ska1=0;
                                          ska2=0;
                                          ja1=0;
                                          ja2=0;
   
   if(nom2<1)
   {
    JOptionPane.showMessageDialog(null,
                    "NUMERO DE CONTROL NO VALIDO",
                    "Inane warning",
                        JOptionPane.WARNING_MESSAGE);
   }
   }while(nom2<1);
	
	
	 for( x=0;x<cont1;x++)
		 			 {
		 	 
		 			 	if(numero_controlisc[x]==nom2)
		 			 	{
		 			 		
		 			 		if((isc1[x]==0)&&(is7[x]==0))
		 			 		{
		 			 			System.out.println("NO SE PUEDE ELIMINAR ESE DATO ");
		 			 		ska1=1;
		 			 		}
		 			 		
		 			 			if((isc1[x]>1)||(is7[x]>1))
		 			 			{
		 			 			
		 			ska1=1;
		 	    System.out.println("------------------------------------------------------------");
		 		System.out.println("Su nombre es: "+nombresisc[x]);
		 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 		System.out.println("Su actividad extraescolar es:  "+actividadesisc[x]);
		 		System.out.println("Su carrera es: ingenieria en sistemas computacionales ");
            	System.out.println("------------------------------------------------------------");
		 		
     nombresisc[x]="";
     numero_controlisc[x]=0;
     actividadesisc[x]="";
    	     isc1[x]=0;
    	     isc2[x]=0;
    	     isc3[x]=0;
    	     isc4[x]=0;
    	     isc5[x]=0;
    	     isc6[x]=0;
    	     is7[x]=0;
    	     is8[x]=0;
    	     is9[x]=0;
    	     is10[x]=0;
    	     is11[x]=0;
    	     is12[x]=0;
    	     System.out.println("********************DATO ELIMINADO********************");
		 	System.out.println("------------------------------------------------------------");
		 			 		}
		 			 		}
		 			 		}
		 
			 for( x=0;x<cont2;x++)
		 			 {
		 			 	
	
		 			 	if(numero_controlie[x]==nom2)
		 			 	{
		 			 		
		 			 		if((ie1[x]==0)&&(iel7[x]==0))
		 			 		{
		 			 			System.out.println("NO SE PUEDE ELIMINAR ESE DATO ");
		 			 		ska2=1;
		 			 		}
		 				if((ie1[x]>1)||(iel7[x]>1))
		 			 {
		 			 
		 		ska2=1;
		 	System.out.println("------------------------------------------------------------");
		 	System.out.println("Su nombre es: "+nombresie[x]);
		 	System.out.println("su numero de control es:  "+numero_controlie[x]);
            System.out.println("Su actividad extraescolar es:  "+actividadesie[x]);
		 	System.out.println("Su carrera es: ingenieria electronica");
		 	System.out.println("------------------------------------------------------------");

	     nombresie[x]="";    
	     numero_controlie[x]=0;
	     actividadesie[x]="";
	     ie1[x]=0;
	     ie2[x]=0;
	     ie3[x]=0;
	     ie4[x]=0;
	     ie5[x]=0;
	     ie6[x]=0;
	     ie6[x]=0;
	     iel7[x]=0;
	     iel8[x]=0;
	     iel9[x]=0;
	     iel10[x]=0;
	     iel11[x]=0;
	     iel12[x]=0;
	      System.out.println("********************DATO ELIMINADO********************");
		 			 		}
		 			 		}
		 			 		}
		
		ska3=ska1+ska2;
		if(ska3==0)
		{
			System.out.println("\n******ESE NOMBRE NO SE ENCUENTRA REGISTRADO******\n ");
		}

break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
case 2:
System.out.println("****************************************************************************");
System.out.println("    Calificaciones   ");

do{

System.out.print("Ingrese el numero de control del alumno:   ");
	scruu=leer.readLine();
gate100=isNumeric(scruu);
if(gate100==true)
{
	controlx=Integer.parseInt(scruu);

}	
if(gate100==false)
{
		 JOptionPane.showMessageDialog(null,  "NUMERO DE CONTROL NO VALIDO",  "Inane warning", JOptionPane.WARNING_MESSAGE);
}
	
  }while((gate100==false)||(controlx<0)); 
     
     snup1=0;
     snup2=0;
      for( x=0;x<cont1;x++)
		 			 {
		 	 
		 			 	if(numero_controlisc[x]==controlx)
		 			 	{
		 			 		snup1=1;
		 	   System.out.println("------------------------------------------------------------");
		 		System.out.println("Su nombre es: "+nombresisc[x]);
		 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 		System.out.println("Su actividad extraescolar es:  "+actividadesisc[x]);
		 		System.out.println("Su carrera es: ingenieria en sistemas computacionales ");
            	System.out.println("------------------------------------------------------------");	
      
            
            	System.out.println("DE QUE SEMESTRE DESEA DAR DE BAJA");
            	System.out.println("[1]......semestre 1");
            	System.out.println("[2].....semestre 2");
            	System.out.println("[3]....Regresar");
		 	controlx1=Integer.parseInt(leer.readLine());

           if(controlx1==1)
           {
           
             isc1[x]=0;
    	     isc2[x]=0;
    	     isc3[x]=0;
    	     isc4[x]=0;
    	     isc5[x]=0;
    	     isc6[x]=0;
    	 JOptionPane.showMessageDialog(null,"MATERIAS RETIRADAS ");
    	 }
     if(controlx1==2)
           {
    	   
    	     is7[x]=0;
    	     is8[x]=0;
    	     is9[x]=0;
    	     is10[x]=0;
    	     is11[x]=0;
    	     is12[x]=0;
    JOptionPane.showMessageDialog(null,"MATERIAS RETIRADAS ");
    }
  
    	     }
    	     }
    	     	 for( x=0;x<cont2;x++)
		 			 {
		 			 	if(numero_controlie[x]==controlx)
	                              {
	                              	snup2=1;
	                              	
	           	System.out.println("------------------------------------------------------------");
		 	System.out.println("Su nombre es: "+nombresie[x]);
		 	System.out.println("su numero de control es:  "+numero_controlie[x]);
            System.out.println("Su actividad extraescolar es:  "+actividadesie[x]);
		 	System.out.println("Su carrera es: ingenieria electronica");
		 	System.out.println("------------------------------------------------------------");
		 	
            
            	System.out.println("DE QUE SEMESTRE DESEA DAR DE BAJA");
            	System.out.println("[1]......semestre 1");
            	System.out.println("[2].....semestre 2");
            	System.out.println("[3]....Regresar");
		 	controlx2=Integer.parseInt(leer.readLine());

    if(controlx2==1)
        {
        
	      ie1[x]=0;
	     ie2[x]=0;
	     ie3[x]=0;
	     ie4[x]=0;
	     ie5[x]=0;
	     ie6[x]=0;
	     ie6[x]=0;
	     JOptionPane.showMessageDialog(null,"MATERIAS RETIRADAS ");
	     }
	     
	      if(controlx2==1)
        {
	     iel7[x]=0;
	     iel8[x]=0;
	     iel9[x]=0;
	     iel10[x]=0;
	     iel11[x]=0;
	     iel12[x]=0;
	     JOptionPane.showMessageDialog(null,"MATERIAS RETIRADAS ");
	   }
	     

	     
	     }
	     }
		 snup3=snup1+snup2;
	     if(snup3==0)
	     {
	     	System.out.println("\n************ESE NOMBRE NO SE ENCUENTRA REGISTRADO*************\n");
	     }			 	
break;
////////////////////////////////////////////////////////////////////////////////////////////
case 3:
System.out.println("****************************************************************************");
System.out.println("    Actividades     ");

fall1=0;
fall2=0;
do{

System.out.print("Ingrese el numero de control del alumno:   ");
caca=leer.readLine();
gate101=isNumeric(caca);
if(gate101==true)
{
		controlx3=Integer.parseInt(caca);
}
if(gate101==false)
{
		 JOptionPane.showMessageDialog(null,  "NUMERO DE CONTROL NO VALIDO",  "Inane warning", JOptionPane.WARNING_MESSAGE);
}
}while((gate101==false)||(controlx3<0));
  
  	
	 for( x=0;x<cont1;x++)
		 			 {
		 	 
		 			 	if(numero_controlisc[x]==controlx3)
		 			 	{
		 			 		  System.out.println("------------------------------------------------------------");
		 		System.out.println("Su nombre es: "+nombresisc[x]);
		 		System.out.println("su numero de control es:  "+numero_controlisc[x]);
		 		System.out.println("Su actividad extraescolar es:  "+actividadesisc[x]);
		 		System.out.println("Su carrera es: ingenieria en sistemas computacionales ");
            	System.out.println("------------------------------------------------------------");	
		 			 		fall1=1;
		 			 		actividadesisc[x]="";
		 			 		JOptionPane.showMessageDialog(null,"ACTIVIDAD RETIRADA ");
		 			 		}
		 			 		}
		 			 		
		 			 		 for( x=0;x<cont2;x++)
		 			 {
		 			 	if(numero_controlie[x]==controlx3)
	                              {
	                              	     	System.out.println("------------------------------------------------------------");
		 	System.out.println("Su nombre es: "+nombresie[x]);
		 	System.out.println("su numero de control es:  "+numero_controlie[x]);
            System.out.println("Su actividad extraescolar es:  "+actividadesie[x]);
		 	System.out.println("Su carrera es: ingenieria electronica");
		 	System.out.println("------------------------------------------------------------");
	                              	fall2=1;
	                              	 actividadesie[x]="";
	                              		  JOptionPane.showMessageDialog(null,"ACTIVIDAD RETIRADA ");
	                              	}
	                              	}	
		 			 		
		 			 		
		 			 		fall3=fall1+fall2;
		 			 		if(fall3==0)
		 			 		{
		 			 			System.out.println("\n********ESE NOMBRE NO SE ENCUENTRA REGISTRADO*******");
		 			 		}
		 			 		
		 			 		
		 			 		
		 			 		
break;
}







}while(sasa!=4);



















/////////////////////////////////////////////////////////////////////////////////////////
		}//sierra el metodo de bajas
					public static boolean isNumeric(String a)
 	{
        try
        {
            Integer.parseInt(a);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }
		
	}//////fin de esta hoja
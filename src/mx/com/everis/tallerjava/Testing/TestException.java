package mx.com.everis.tallerjava.Testing;

import mx.com.everis.tallerjava.exceptions.MiException;

public class TestException {

	public static void main(String[] args){
		//int valores []={1,2,3,4,5,6};
		int valores2 []={10,2,3,4,9,7,-1};
		//String respuesta="";

		try{
			negativos(valores2);					
		}catch(MiException tam){
			tam.printStackTrace();
		}
		try{			
			mayor(valores2);									
		}catch(MiException tam){
			tam.printStackTrace();
		}
		try{			
			tama�o(valores2);						
		}catch(MiException tam){
			tam.printStackTrace();
		}		

	}
	
	
	static void tama�o(int valores[]) throws MiException{
		if(valores.length>5)
			throw new MiException("El arreglo contiene m�s de 5 elementos");
	}
	static void negativos(int valores[]) throws MiException{
		for(int i : valores){
			if(i<0)
				throw new MiException("No se permiten n�mero negativos");			
		}
	}
	static void mayor(int valores[])throws MiException{
		for(int i: valores){
			if(i>9)
				throw new MiException("No se permiten valores mayores a 9");
		}		
	}

}

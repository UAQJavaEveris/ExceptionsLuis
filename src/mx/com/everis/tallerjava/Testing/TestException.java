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
			tamaño(valores2);						
		}catch(MiException tam){
			tam.printStackTrace();
		}		

	}
	
	
	static void tamaño(int valores[]) throws MiException{
		if(valores.length>5)
			throw new MiException("El arreglo contiene más de 5 elementos");
	}
	static void negativos(int valores[]) throws MiException{
		for(int i : valores){
			if(i<0)
				throw new MiException("No se permiten número negativos");			
		}
	}
	static void mayor(int valores[])throws MiException{
		for(int i: valores){
			if(i>9)
				throw new MiException("No se permiten valores mayores a 9");
		}		
	}

}

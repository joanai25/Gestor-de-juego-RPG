
public class Comprobacion {

	
	//Metodos
	public boolean validarDNI(String dni)
	{
		boolean salida = false;
		if(dni.length() == 9 && letra_correcta(dni)) {
				
				salida = true;			
		}
			
	
		return salida;
	}
	
	public boolean soloInt (String cadena)
	{
		boolean salida = true;
		for(int i = 0; i < cadena.length(); i++)
		{
			
			if(cadena.charAt(i) < '0' || cadena.charAt(i) > '9'  )
			{
				salida = false;
				
			}	
			
		}
		
		return salida;
		
	}
	
	public boolean letra_correcta (String cadena)
	{
		boolean salida = false;
		String numero = cadena.substring(0,8);
		if(soloInt(numero))
			if(cadena.charAt(8) == calcular_letra(numero))
			{
				salida = true;
			}
		
		return salida;
	}
	
	public char calcular_letra (String numero)
	{
		
		
		int num = Integer.parseInt(numero);
				
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
	    int modulo= num % 23;
	    char letra = juegoCaracteres.charAt(modulo);
	    return letra;
	}
	
	
	
}

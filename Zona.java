
public class Zona {

	//Atributos
	private String nombre;
	private int nivel;
	private Personaje npcs [] = new Personaje [10];
	
	
	
	private int num_npcs = 0;
	
	//Metodos
	
	//Constructor por defecto
	public Zona()
	{
		nombre = "ninguno";
		nivel = 0;
		for(int i = 0; i < npcs.length; i++)
		{
			if(npcs[i] != null)
			{
				npcs[i] = new Personaje();
				num_npcs++;
			}
			
		}
	}
	
	//Constructor sobrecargado
	public Zona(String nombre, int nivel, Personaje npcs[])
	{
		this.nombre = nombre;
		this.nivel = nivel;
		for(int i = 0; i < this.npcs.length; i++)
		{
			if(npcs[i] != null)
			{
				this.npcs[i] = npcs[i];
				num_npcs++;
			}
			
		}
	}
	
	//Constructor de copia
	public Zona(Zona zona)
	{
		this.nombre = zona.nombre;
		this.nivel = zona.nivel;
		for(int i = 0; i < this.npcs.length; i++)
		{
			if(npcs[i] != null)
			{
				this.npcs[i] = zona.npcs[i];
				num_npcs++;
			}
			
		}
	}
	
	//gets y sets
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Personaje[] getNpcs() {
		return npcs;
	}

	public void setNpcs(Personaje[] npcs) {
		this.npcs = npcs;
	}
	
	//Metodo para comparar
	public boolean esIgual (Zona zona)
	{
		boolean salida = false;
		if(this.nombre.equals(zona.nombre))
		{
			salida = true;
		}
		return salida;
	}
	
	//Metodo para mostrar
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Nivel: "+nivel);
		/*
		for(int i = 0; i < this.npcs.length; i++)
		{
			if(this.npcs[i] != null)
			{
				System.out.println();
				System.out.print("Personajes: "+(i));
				npcs[i].visualizar();
				
			}
			
		}
		*/
		System.out.println();
		
	}
	
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Nivel: "+nivel);
		
		for(int i = 0; i < this.npcs.length; i++)
		{
			if(this.npcs[i] != null)
			{
				System.out.println();
				System.out.print("Personajes: "+(i));
				npcs[i].visualizar();
				
			}
			
		}
		
		System.out.println();
	}
	
	public boolean addPersonaje(Personaje personaje)
	{
		boolean salida = false;
		boolean encontrado = false;
		for(int i = 0; i < this.npcs.length; i++)
		{
			if(this.npcs[i] != null && this.npcs[i].esIgual(personaje))
			{
				encontrado = true;
				i = this.npcs.length;
			}
		}
		
		if(!encontrado)
		{
			if(this.num_npcs < this.npcs.length)
			{
				this.npcs[num_npcs] = personaje;
				this.num_npcs++;
				salida = true;
			}
		}
		
		
		
		return salida;
	}
	
	public boolean eliminarPersonaje(Personaje personaje)
	{
		boolean salida = false;
		int pos = 0;
		boolean encontrado = false;
		for(int i = 0; i < this.num_npcs; i++)
		{
			if(this.npcs[i] != null && this.npcs[i].esIgual(personaje))
			{
				encontrado = true;
				pos = i;
			}
		}
		
		Personaje aux[] = new Personaje[10];
		int count = 0;
		if(encontrado)
		{
			for(int i = 0; i < this.npcs.length; i++)
			{
				if(this.npcs[i] != this.npcs[pos])
				{
					aux[count] = this.npcs[i];
					count++;
				}
			}
			this.npcs = aux;
			salida = true;
		}
		
		return salida;
	}
	
	
	
}

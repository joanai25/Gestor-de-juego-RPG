
public class Personaje {

	
	//Atributos
	private String nombre;
	private String clase;
	private int vida_max;
	private int energia_max;
	private int vida_actual;
	private int energia_actual;
	private int monedas;
	private Habilidad habilidades[] = new Habilidad [5];
	private Item equipo [] = new Item [5];
	private boolean npc;
	private boolean hostil;
	
	private int numequipo = 0;
	private int numhab = 0;
	
	//Metodos
	
	//Constructor por defecto
	public  Personaje()
	{
		nombre = "ninguno";
		clase = "ninguna";
		vida_max = 0;
		energia_max = 0;
		vida_actual = 0; 
		energia_actual = 0;
		monedas = 0;
		for(int i = 0; i < habilidades.length; i++) {
			if(habilidades[i]!= null )
			{
				habilidades[i] = new Habilidad();
				numhab++;
			}
			
		}
		for(int i = 0; i < equipo.length; i++) {
			if(equipo[i]!=null)
			{
				equipo[i] = null;
				numequipo++;
				
			}
		}
		npc = false;
		hostil = false;
		
	}
	
	//Constructor sobrecargado
	public Personaje(String nombre, String clase, int vida_max, int energia_max, int vida_actual, int energia_actual,
			int monedas, Habilidad habilidades[], Item equipo[], boolean npc, boolean hostil )
	{
		this.nombre = nombre;
		this.clase = clase;
		this.vida_max = vida_max;
		this.energia_max = energia_max;
		this.vida_actual = vida_actual;
		this.energia_actual = energia_actual;
		this.monedas = monedas;
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(habilidades[i]!=null)
			{
				this.habilidades[i] = habilidades[i];
				numhab++;
				
			}
			
		}
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(equipo[i]!=null)
			{
				this.equipo[i] =equipo[i];
				numequipo++;
			}
			
			
		}
		this.npc = npc;
		this.hostil = hostil;
	}
	
	//Constructor de copia
	public Personaje(Personaje personaje)
	{
		this.nombre = personaje.nombre;
		this.clase = personaje.clase;
		this.vida_max = personaje.vida_max;
		this.energia_max = personaje.energia_max;
		this.vida_actual = personaje.vida_actual;
		this.energia_actual = personaje.energia_actual;
		this.monedas = personaje.monedas;
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(habilidades[i] != null)
			{
				this.habilidades[i] = personaje.habilidades[i];
				numhab++;
			}
			
		}
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(equipo[i] != null)
			{
				this.equipo[i] = personaje.equipo[i];
				numequipo++;
			}
			
		}
		this.npc = personaje.npc;
		this.hostil = personaje.hostil;
	}
	
	//gets y sets
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getVida_max() {
		return vida_max;
	}

	public void setVida_max(int vida_max) {
		this.vida_max = vida_max;
	}

	public int getEnergia_max() {
		return energia_max;
	}

	public void setEnergia_max(int energia_max) {
		this.energia_max = energia_max;
	}

	public int getVida_actual() {
		return vida_actual;
	}

	public void setVida_actual(int vida_actual) {
		this.vida_actual = vida_actual;
	}

	public int getEnergia_actual() {
		return energia_actual;
	}

	public void setEnergia_actual(int energia_actual) {
		this.energia_actual = energia_actual;
	}

	public int getMonedas() {
		return monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}

	public Habilidad[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades) {
		this.habilidades = habilidades;
	}

	public Item[] getEquipo() {
		return equipo;
	}

	public void setEquipo(Item[] equipo) {
		this.equipo = equipo;
	}

	public boolean isNpc() {
		return npc;
	}

	public void setNpc(boolean npc) {
		this.npc = npc;
	}

	public boolean isHostil() {
		return hostil;
	}

	public void setHostil(boolean hostil) {
		this.hostil = hostil;
	}
	
	//Metodo para comparar
	
	public boolean esIgual(Personaje personaje)
	{
		boolean salida = false;
		
		if(this.nombre.equals(personaje.nombre))
		{
			salida = true;
			
		}
		
		return salida;
	}
	
	@Override
	public boolean equals(Object per_entrada)
	{
		boolean salida = false;
		
		Personaje personaje = (Personaje) per_entrada;
		
		if(this.nombre.equals(personaje.nombre))
		{
			salida = true;
		}
		
		return salida;
	}
	
	//Metodo para mostrar
	
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Clase: "+clase);
		System.out.println("Vida_max: "+vida_max);
		System.out.println("Energia_max: "+energia_max);
		System.out.println("Vida_actual: "+vida_actual);
		System.out.println("Energia_actual: "+energia_actual);
		System.out.println("Monedas: "+monedas);
		
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(habilidades[i]!=null)
			{
				System.out.println();
				System.out.println("habilidad"+(i));
				habilidades[i].visualizar();
			}
		}
		System.out.println();
		
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(equipo[i]!=null)
			{
				System.out.println();
				System.out.println("equipo"+(i));
				equipo[i].visualizarBasico();
			}
		}
		
		System.out.println();
		System.out.print("NPC: ");
		if(npc == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		System.out.println();
		System.out.print("Hostil: ");
		if(hostil == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		
		System.out.println();
		
	
	}
	
	
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Clase: "+clase);
		System.out.println("Vida_max: "+vida_max);
		System.out.println("Energia_max: "+energia_max);
		System.out.println("Vida_actual: "+vida_actual);
		System.out.println("Energia_actual: "+energia_actual);
		System.out.println("Monedas: "+monedas);
		/*
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(habilidades[i]!=null)
			{
				System.out.println();
				System.out.println("habilidad"+(i));
				habilidades[i].visualizar();
			}
		}
		System.out.println();
		
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(equipo[i]!=null)
			{
				System.out.println();
				System.out.println("equipo"+(i));
				equipo[i].visualizarBasico();
			}
		}
		*/
		System.out.println();
		System.out.print("NPC: ");
		if(npc == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		System.out.println();
		System.out.print("Hostil: ");
		if(hostil == true)
		{
			System.out.print("si");
		}
		else
		{
			System.out.print("no");
		}
		
		System.out.println();
		
	}
	
	//Metodo tiene
	public boolean tiene_habilidad(Habilidad habilidad)
	{
		boolean salida = false;
		for(int i = 0; i < this.habilidades.length;i++)
		{
			if(this.habilidades[i]!=null && this.habilidades[i].esIgual(habilidad))
			{
				salida = true;
			}
		}
			
		return salida;
	}
	
	public boolean tiene_item(Item equipo)
	{
		boolean salida = false;
		
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(this.equipo[i]!=null && this.equipo[i].esIgual(equipo))
			{
				salida = true;
			}
		}
		return salida;
	}
	
	public boolean addEquipo(Item equipo)
	{
		boolean salida = false;
		boolean encontrado = false;
		for(int i = 0; i < this.equipo.length; i++)
		{
			if(this.equipo[i]!= null && this.equipo[i].esIgual(equipo))
			{
				encontrado = true;
				i = this.equipo.length;
			}
		}
		
		if(!encontrado)
		{
			if(this.numequipo < this.equipo.length)
			{
				this.equipo[numequipo] = equipo;
				this.numequipo++;
				salida = true;
			}
		}
		return salida;
	}
	
	public boolean eliminarEquipo(Item equipo)
	{
		boolean salida = false;
		int pos = 0;
		boolean encontrado = false;
		for(int i = 0; i < this.numequipo; i++)
		{
			if(this.equipo[i]!= null && this.equipo[i].esIgual(equipo))
			{
				pos = i;
				encontrado = true;
			}
		}
		Item aux[] = new Item[5];
		int cont = 0;
		if(encontrado)
		{
			for(int i = 0; i < this.equipo.length; i++)
			{
				if(this.equipo[i] != this.equipo[pos])
				{
					aux[cont] = this.equipo[i];
					cont++;
					
				}
			}
			this.equipo = aux;
			salida = true;
		}
		
		return salida;
	}
	
	public boolean addHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		boolean encontrado = false;
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(this.habilidades[i]!= null && this.habilidades[i].esIgual(habilidad))
			{
				encontrado = true;
				i = this.habilidades.length;
			}
		}
		
		if(!encontrado)
		{
			if(this.numhab < this.habilidades.length)
			{
				this.habilidades[numhab] = habilidad;
				this.numhab++;
				salida = true;
			}
		}
		return salida;
	}
	
	public boolean eliminarHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		boolean encontrado = false;
		int pos = 0;
		for(int i = 0; i < this.numhab; i++)
		{
			if(this.habilidades[i]!= null && this.habilidades[i].esIgual(habilidad))
			{
				encontrado = true;
				pos = i;
				
			}
		}
		
		if(encontrado)
		{
			Habilidad aux[] = new Habilidad[5];
			int count = 0;
			for(int i = 0; i < this.habilidades.length; i++)
			{
				if(this.habilidades[i] != this.habilidades[pos])
				{
					aux[count] = this.habilidades[i];
					count++;
				}
			}
			this.habilidades = aux;
			salida = true;
		}
		
		return salida;
	}
	
	
	public String toString()
	{
		String cad;
		String hab = "";
		boolean primero = false;
		
		for(int i = 0; i < this.habilidades.length; i++)
		{
			if(habilidades[i] != null  && !primero)
			{
				hab = hab+this.habilidades[i].getNombre();
				primero = true;
			}else {
				if(habilidades[i] != null)
				{
					hab = hab+", "+this.habilidades[i].getNombre();
				}
			}
			
			
				
				
			
		}
			
		cad = this.nombre+";"+this.clase+";"+this.vida_max+";"+this.energia_max+";"+this.vida_actual+";"
				+this.energia_actual+";"+this.monedas+";"+this.npc+";"+this.hostil+";"+hab;
		
		return cad;
	}
	
}

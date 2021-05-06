
public abstract class Item {

	//Atributos
	protected String nombre;
	protected int valor;
	protected Habilidad acciones [] = new Habilidad [5];
	
	
	int num_habi = 0;
	
	//Metodos
	
	//Constructor por defecto
	public Item()
	{
		nombre = "ninguno";
		valor = 0;
		for(int i = 0; i < acciones.length; i++)
		{
			if(acciones[i]!=null)
			{
				acciones[i] = new Habilidad();
				this.num_habi++;
			}
			
		}
	}
	
	//Constructor sobrecargado
	public Item(String nombre, int valor, Habilidad[] acciones)
	{
		this.nombre = nombre;
		this.valor = valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(acciones[i] != null)
			{
				this.acciones[i] = acciones[i];
				this.num_habi++;
			}
			
		}
			
		
	}
	
	
	
	
	//Constructor de copia
	public Item(Item objeto)
	{
		this.nombre = objeto.nombre;
		this.valor = objeto.valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(acciones[i]!=null)
			{
				this.acciones[i] = objeto.acciones[i];
				this.num_habi++;
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Habilidad[] getAcciones() {
		return acciones;
	}

	public void setAcciones(Habilidad[] acciones) {
		this.acciones = acciones;
	}
	
	
	//Metodo para comparar
	public boolean esIgual(Item objeto)
	{
		boolean salida = true;
		
		
		if(this.nombre.equals(objeto.nombre))
		{
			if(this.num_habi == objeto.num_habi)
			{
				for(int i = 0; i < this.num_habi; i++)
				{
					if(!this.tiene(objeto.acciones[i]))
					{
						salida = false;
					}
				}
			}
			else
			{
				salida = false;
			}
		}
		else
		{
			salida = false;
		}
				
		
		return salida;
	}
	
	@Override
	public boolean equals(Object item_entrada)
	{
		boolean salida = true;
		
		Item item = (Item) item_entrada;
		
		if(this.nombre.equals(item.nombre))
		{
			if(this.num_habi == item.num_habi)
			{
				for(int i = 0; i < this.num_habi; i++)
				{
					if(!this.tiene(item.acciones[i]))
					{
						salida = false;
					}
				}
			}else {
				salida = false;
			}
		}else {
			salida = false;
		}
		
		return salida;
	}
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Valor: "+valor);
		
		System.out.println();
	}
	
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Valor: "+valor);
		for(int i = 0; i < acciones.length; i++)
		{
			if(acciones[i] != null)
			{
				System.out.println();
				System.out.println("Accion: "+(i));
				this.acciones[i].visualizar();
			}
		}
	}
	
	public boolean tiene (Habilidad habilidad)
	{
		boolean salida = false;
		for(int i = 0; i < this.acciones.length;i++)
		{
			if(this.acciones[i]!=null && this.acciones[i].esIgual(habilidad))
			{
				salida = true;
			}
		}
			
		return salida;
	}
	
	public boolean addHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		boolean encontrado = false;
		
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i]!= null && this.acciones[i].esIgual(habilidad))
			{
				encontrado = true;
				i = this.acciones.length;
			}
				
		}
			
			
		if(!encontrado)
		{
			if(this.num_habi < this.acciones.length)
			{
				this.acciones[num_habi] = habilidad;
				this.num_habi++;
				salida = true;
			}
		}
			
			
			
		
		return salida;
	}
	
	public boolean eliminarHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		int pos = 0;
		boolean encontrado = false;
		for(int i = 0; i < this.num_habi; i++)
		{
			if(this.acciones[i] != null && this.acciones[i].esIgual(habilidad))
			{
				pos = i;
				encontrado = true;
			}
		}
		Habilidad aux[] = new Habilidad [5];
		int cont = 0;
		if(encontrado)
		{
			for(int i = 0; i < this.acciones.length; i++)
			{
				if(this.acciones[i] != this.acciones[pos])
				{
					aux[cont] = this.acciones[i];
					cont++;
					
				}
			}
			this.acciones = aux;
			salida = true;
		}
		
		return salida;
	}
	
}

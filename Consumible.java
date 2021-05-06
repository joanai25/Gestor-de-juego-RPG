
public class Consumible extends Item {

	private int cantidad;
	
	

	private int numhab = 0;
	
	
	public Consumible()
	{
		this.nombre = "ninguno";
		this.valor = 0;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = new Habilidad();
				numhab++;
			}
		}
		cantidad = 0;
	}
	
	public Consumible(Consumible consumible)
	
	{
		this.nombre = consumible.nombre;
		this.valor = consumible.valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = consumible.acciones[i];
			}
		}
		this.cantidad = consumible.cantidad;
	}
	
	public Consumible(String nombre, int valor, Habilidad[] acciones, int cantidad)
	{
		this.nombre = nombre;
		this.valor = valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(acciones[i] != null)
			{
				this.acciones[i] = acciones[i];
				numhab++;
			}
		}
		this.cantidad = cantidad;
	}
	
	
	//gets y sets
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//visualizar
	public void visualizar()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Valor: "+this.valor);
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				System.out.println();
				System.out.println("Accion: "+i);
				this.acciones[i].visualizarBasico();
			}
		}
		System.out.println("Cantidad: "+cantidad);
		System.out.println();
	}
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Valor: "+this.valor);
		System.out.println("Cantidad: "+cantidad);
		System.out.println();
	}
}

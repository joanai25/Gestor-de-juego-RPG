
public class Armadura extends Item {
	
	private int armadura;
	private int peso;
	
	

	private int numhab = 0;
	
	public Armadura()
	{
		this.nombre = "ninguno";
		this.valor = 0;
		for(int i = 0;i <  this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = new Habilidad();
				numhab++;
			}
		}
		armadura = 0;
		peso = 0;
		
	}
	
	public Armadura(Armadura armadura)
	{
		this.nombre = armadura.nombre;
		this.valor = armadura.valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = armadura.acciones[i];
			}
		}
		
		this.armadura = armadura.armadura;
		this.peso = armadura.peso;
	}
	
	
	
	
	public Armadura(String nombre, int valor, Habilidad[] acciones, int armadura, int peso )
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
		
		this.armadura = armadura;
		this.peso = peso;
	}
	
	//gets y sets
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	//Visualizar
	public void visualizar()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Valor: "+this.valor);
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				System.out.println();
				System.out.println("Accion: "+(i));
				this.acciones[i].visualizarBasico();
			}
		}
		System.out.println("Armadura: "+armadura);
		System.out.println("Peso: "+peso);
		System.out.println();
	}
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Valor: "+this.valor);
		System.out.println("Armadura: "+armadura);
		System.out.println("Peso: "+peso);
		System.out.println();
	}
	
	
	
	 
	
}

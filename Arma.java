
public class Arma extends Item{
	
	private int agravio;
	private int peso;
	
	



	private int numhab = 0;
	
	public Arma()
	{
		this.nombre = "Ninguno";
		this.valor = 0;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = new Habilidad();
				numhab++;
			}
		}
		agravio = 0;
		peso = 0;
	}
	
	
	public Arma(Arma arma)
	{
		this.nombre = arma.nombre;
		this.valor = arma.valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(this.acciones[i] != null)
			{
				this.acciones[i] = arma.acciones[i];
			}
		}
		
		this.agravio = arma.agravio;
		this.peso = arma.peso;
	}
	
	public Arma(String nombre, int valor, Habilidad[] acciones, int agravio, int peso)
	{
		this.nombre= nombre;
		this.valor = valor;
		for(int i = 0; i < this.acciones.length; i++)
		{
			if(acciones[i] != null)
			{
				this.acciones[i] = acciones[i];
				numhab++;
			}
		}
		this.agravio = agravio;
		this.peso = peso;
	}
	
	//gets y sets
	public int getAgravio() {
		return agravio;
	}

	public void setAgravio(int agravio) {
		this.agravio = agravio;
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
				System.out.println("Accion: "+i);
				this.acciones[i].visualizarBasico();
			}
		}
		System.out.println("Agravio: "+agravio);
		System.out.println("Peso: "+peso);
		System.out.println();
	}
	
	public void visualizarBasico()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Valor: "+this.valor);
		System.out.println("Agravio: "+agravio);
		System.out.println("Peso: "+peso);
		System.out.println();
	}
	
	
}


public class Mision {

	//Atributos
	private String nombre;
	private int nivel;
	private Personaje objetivo;
	private Zona zona;
	private Item recompensa;
	private int monedas;
	
	//Metodos
	
	//Constructor por defecto
	public Mision()
	{
		nombre = "ninguno";
		nivel = 0;
		objetivo = new Personaje();
		zona = new Zona ();
		recompensa = null;
		monedas = 0;
	}
	
	//Constructor sobrecargado
	public Mision(String nombre, int nivel, Personaje objetivo, Zona zona, Item recompensa, int monedas)
	{
		this.nombre = nombre;
		this.nivel = nivel;
		this.objetivo = objetivo;
		this.zona = zona;
		this.recompensa = recompensa;
		this.monedas = monedas;
		 
	}
	
	//Constructor de copia
	public Mision(Mision mision)
	{
		this.nombre = mision.nombre;
		this.nivel = mision.nivel;
		this.objetivo = mision.objetivo;
		this.zona = mision.zona;
		this.recompensa = mision.recompensa;
		this.monedas = mision.monedas;
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

	public Personaje getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Personaje objetivo) {
		this.objetivo = objetivo;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Item getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(Item recompensa) {
		this.recompensa = recompensa;
	}

	public int getMonedas() {
		return monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	//Metodo para comparar
	
	public boolean esIgual(Mision mision)
	{
		boolean salida = false;
		if(this.nombre.equals(mision.nombre) && this.nivel == mision.nivel
				&& this.objetivo == mision.objetivo)
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
		
		
		System.out.println("Monedas: "+monedas);
	}
	
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Nivel: "+nivel);
		System.out.println("Objetivo: ");
		if(objetivo != null)
		{
			objetivo.visualizarBasico();
		}
		
		System.out.println("Zona: ");
		if(zona != null)
		{
			zona.visualizarBasico();
		}
		System.out.println("Recompensa: ");
		if(recompensa != null)
		{
			recompensa.visualizarBasico();
		}
		
		System.out.println("Monedas: "+monedas);
	}
	
	
}

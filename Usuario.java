
public class Usuario {

	//atributos
	private String nombre;
	private String nick;
	private String email;
	private String dni;
	private String pass;
	private String tipo;
	
	//Metodos
	//Constructor por defecto
	
	public Usuario()
	{
		nombre = "ninguno";
		nick = "ninguno";
		email = "ninguno";
		dni = "ninguno";
		pass = "ninguno";
		tipo = "ninguno";
	}
	
	//Constructor sobrecargardo
	public Usuario(String nombre, String nick, String email, String dni, String pass, String tipo)
	{
		this.nombre = nombre;
		this.nick = nick;
		this.email = email;
		this.dni = dni;
		this.pass = pass;
		this.tipo = tipo;

	}
	
	//Constructor de copia
	public Usuario(Usuario usuario)
	{
		this.nombre = usuario.nombre;
		this.nick = usuario.nick;
		this.email = usuario.email;
		this.dni = usuario.dni;
		this.pass = usuario.pass;
		this.tipo = usuario.tipo;
	}
	
	//gets y sets
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodo para comparar
	
	public boolean esIgual(Usuario usuario)
	{
		boolean salida = false;
		if(this.nombre.equals(usuario.nombre) && this.nick.equals(usuario.nick)
				&& this.email.equals(usuario.email) && this.dni.equals(usuario.dni)
				&& this.pass.equals(usuario.pass) && this.tipo.equals(usuario.tipo))
		{
			salida = true;
		}
		
		return salida;
	}
	
	//Metodo para mostrar
	public void visualizar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Nick: "+nick);
		System.out.println("email: "+email);
		System.out.println("DNI: "+dni);
		System.out.println("Pass: "+pass);
		System.out.println("Tipo: "+tipo);
	}
	
}

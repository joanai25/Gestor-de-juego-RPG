import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Gestor {
	//atributos
	//private Habilidad habilidades [];
	public ArrayList<Habilidad> habilidades;
	//private Item items [];
	public ArrayList<Item> items;
	public Zona zonas [];
	//public Personaje personajes [];
	public ArrayList<Personaje> personajes;
	public Mision misiones [];
	public Usuario users[];
	
	private int numhab;
	private int numitem;
	private int numzonas;
	private int numper;
	private int num_mis;
	private int num_users;
	private int num_hab_item;
	private Scanner teclado = new Scanner (System.in);	
	
	//Metodos
	//Constructor por defecto
	public Gestor() {
		//habilidades = new Habilidad [50];
		habilidades = new ArrayList<Habilidad>();
		//items = new Item[50];
		items = new ArrayList<Item>();
		zonas = new Zona[50];
		//personajes = new Personaje[50];
		personajes = new ArrayList<Personaje>();
		misiones = new Mision [50];
		users = new Usuario [50];
		numhab = 0;
		numitem = 0;
		numzonas = 0;
		numper = 0;
		num_mis = 0;
		num_users = 0;
		num_hab_item = 0;
		
		leerDeFichero();

	}
	
	//Pruebas
	public  void inicializarPruebas()
	{
		//////////////////////
		//Inicializacion de pruebas:
		/////////////////////
		
		/*
		for(int i = 0; i<10;i++)
		{
			habilidades[i]= new Habilidad("hab"+i,i,i,"tipo"+i);
		}
		numhab=10;
		Habilidad habiaux[] = new Habilidad[10];
		items[0]=new Armadura("item 0",0,habiaux,0,0);
		items[1]=new Consumible("item 1",0,habiaux,0);
		items[2]=new Arma("item 2",0,habiaux,0,0);
		habiaux[0] = habilidades[3];
		items[3]=new Armadura("item 3",0,habiaux,0,0);
		
		numitem = 4;
		*/
		
		
	}
	
	
	//Menu
	private void menu_anyadir()
	{
		int opcion;
		System.out.println("Apartado de añadir");
		do {
			System.out.println("Opcion 0: Volver");
			System.out.println("Opcion 1: Añadir Habilidad");
			System.out.println("Opcion 2: Añadir Item");
			System.out.println("Opcion 3: Añadir Personaje");
			System.out.println("Opcion 4: Añadir Zona");
			System.out.println("Opcion 5: Añadir Mision");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion)
			{
			case 1:
				anyadirHabilidad();
				break;
			case 2:
				anyadirItem();
				break;
			case 3:
				anyadirPersonaje();
				break;
			case 4:
				anyadirZona();
				break;
			case 5: 
				anyadirMision();
				break;
			case 0:
				System.out.println();
				break;
				default: 
					System.out.println("No es una opcion valida");
					break;
			}
		}while(opcion != 0);
	}
	
	private void menu_eliminar()
	{
		int opcion;
		System.out.println("Apartado eliminar");
		do {
			System.out.println("Opcion 0: Volver");
			System.out.println("Opcion 1: Eliminar Habilidad");
			System.out.println("Opcion 2: Eliminar Item");
			System.out.println("Opcion 3: Eliminar Personaje");
			System.out.println("Opcion 4: Eliminar Zona");
			System.out.println("Opcion 5: Eliminar Mision");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion)
			{
			case 1:
				eliminarHabilidad();
				break;
			case 2:
				eliminarItem();
				break;
			case 3:
				eliminarPersonaje();
				break;
			case 4:
				eliminarZona();
				break;
			case 5:
				eliminarMision();
				break;
			case 0:
				System.out.println();
				break;
				default:
					System.out.println("No es una opcion valida");
					break;
			}
			
			
		}while(opcion != 0);
	}
	
	private void menu_modificar()
	{
		int opcion;
		System.out.println("Apartado modificar");
		do {
			System.out.println("Opcion 0: Volver");
			System.out.println("Opcion 1: Asignar Habilidad a Item");
			System.out.println("Opcion 2: Añadir Personaje a Zona");
			System.out.println("Opcion 3: Modificar Equipo en Personaje");
			System.out.println("Opcion 4: Modificiar Habilidad en Personaje");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion)
			{
			case 1:
				asigHabItem();
				break;
			case 2:
				addPersonajeAZona();
				break;
			case 3:
				modEquipo();
				break;
			case 4:
				modHabPer();
				break;
			case 0:
				System.out.println();
				break;
				default:
					System.out.println("No es una opcion valida");
					break;
			}
		}while(opcion != 0);
	}
	
	private void menu_mostrar()
	{
		int opcion;
		System.out.println("Apartado de mostrar");
		do {
			System.out.println("Opcion 0: volver");
			System.out.println("Opcion 1: Mostrar Habilidades");
			System.out.println("Opcion 2: Mostrar Items");
			System.out.println("Opcion 3: Mostrar Personajes");
			System.out.println("Opcion 4: Mostrar Zonas");
			System.out.println("Opcion 5: Mostrar Misiones");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion)
			{
			case 1:
				mostrarHabilidades();
				break;
			case 2:
				mostrarItems();
				break;
			case 3:
				mostrarPersonajes();
				break;
			case 4:
				mostrarZonas();
				break;
			case 5:
				mostrarMisiones();
				break;
			case 0:
				System.out.println();
				break;
				default:
					System.out.println("No es una opcion valida");
					break;
			}
		}while(opcion != 0);
	}
	
	
	private void menu_ficheros()
	{
		int opcion;
		System.out.println("Apartado de Ficheros:");
		
		do {
			System.out.println("0. Volver");
			System.out.println("1. Leer de fichero");
			System.out.println("2. Guardar en fichero");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcion)
			{
			case 1:
				leerDeFichero();
				break;
			case 2:
				guardarEnFichero();
				break;
			case 0:
				System.out.println();
				break;
			default:
				System.out.println("No es una opcion valida");
				break;
			}
			
		}while(opcion != 0);
	}
	
	
	public void menu()
	{
		int opcion;
		
		System.out.println("Bienvenido al gestor del videojuego: \"Todos suspensos\"");
		do {
			System.out.println("Selecciona la opcion deseada");
			
			System.out.println("Opcion 0: Salir");
			System.out.println("Opcion 1: Añadir");
			System.out.println("Opcion 2: Eliminar");
			System.out.println("Opcion 3: Modificar");
			System.out.println("Opcion 4: Mostrar");
			System.out.println("Opcion 5: Leer y Guardar");
			opcion= teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion)
			{
			case 1: 
				menu_anyadir();
				break;
			case 2:
				menu_eliminar();
				break;
			case 3:
				menu_modificar();
				break;
			case 4:
				menu_mostrar();
				break;
			case 5:
				menu_ficheros();
				break;
			case 0:
				System.out.println("saliendo...");
				break;
				default:
					System.out.println("No es una opción admitida");
					break;
			}
		}while(opcion!=0);
	}
	
	
	
	
	//anyadir Habilidad
	public boolean anyadirHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		
		//Habilidad aux = new Habilidad(habilidad);
		
		boolean encontrado = false;
		
			if(habilidades.indexOf(habilidad) > -1)
			{
				encontrado =true;
				
			}
		
		
		if(!encontrado)
		{
			
				//habilidades[numhab]=habilidad;
				salida = habilidades.add(habilidad);
			
		}
		
		
		
		
		return salida;
	}
	
	
	
	
	
	public boolean anyadirHabilidad()
	{
		boolean salida=false;
		
		System.out.println("Introduce del nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la vida");
		int vida = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la energia");
		int energia = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el tipo");
		String tipo = teclado.nextLine();
		
		Habilidad aux = new Habilidad(nombre, vida, energia, tipo);
		boolean encontrado = false;
		
		
		if(habilidades.indexOf(aux) > -1)
		{
			encontrado = true;
		}
		
		if(!encontrado)
		{
			
				salida = habilidades.add(aux);
			
		}
		else
		{
			System.out.println("Error ya existe");
		}
		return salida;
	}
		
	
	
	public void mostrarHabilidades()
	{
		
		for(int i = 0; i < habilidades.size(); i++)
		{
			habilidades.get(i).visualizarBasico();
		}
		
	}
	
	
	//Items
	public boolean anyadirItem()
	{
		boolean salida = false;
		System.out.println("Introduce del nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el valor");
		int valor = teclado.nextInt();
		teclado.nextLine();
		
		
		Habilidad acciones[] = new Habilidad[10];
		
		
		System.out.println("Elige el tipo de item que vas a añadir:");
		System.out.println("1. Armadura");
		System.out.println("2. Consumible");
		System.out.println("3. Arma");
		int tipo = teclado.nextInt();
		teclado.nextLine();
		
		switch(tipo)
		{
		case 1:
			//salida = anyadirArmadura(nombre, valor, acciones);
			
			System.out.println("Introduce la defensa de la armadura:");
			int armadura = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce el peso");
			int peso = teclado.nextInt();
			teclado.nextLine();
			
			Armadura aux_arm = new Armadura(nombre, peso, acciones, armadura, peso);
			
			salida = anyadirItem(aux_arm);
			
			int numhabenitem=0; //numero de habilidades que se han a�adido al item
			
			String nombrehab;
			do {
				System.out.println("Elige la habilidad a introducir");
				
				for(int i = 0; i < habilidades.size(); i++)
				{
					habilidades.get(i).visualizarBasico();
				}
				System.out.println("Introduce el nombre de la habilidad, \"\" para no a�adir ninguna");
				nombrehab = teclado.nextLine();
				if(!nombrehab.equals(""))
				{
					int pos = obtenerPosHabilidad(nombrehab);
					if(pos!=-1)
					{
						
						
						//acciones[numhabenitem]=habilidades.get(pos);
						asigHabItem(habilidades.get(pos), aux_arm);
						numhabenitem++;
					}
				}
			}while(!nombrehab.equals("") && numhabenitem<10);
			
			
			
			
			break;
		case 2:
			//salida = anyadirConsumible(nombre, valor, acciones);
			System.out.println("Introduce la cantidad");
			int cantidad = teclado.nextInt();
			teclado.nextLine();
			
			Consumible aux_cons = new Consumible(nombre, valor, acciones, cantidad);
			
			
			
			salida = anyadirItem(aux_cons);
			numhabenitem=0; //numero de habilidades que se han a�adido al item
			
			
			
			do {
				System.out.println("Elige la habilidad a introducir");
				
				for(int i = 0; i < habilidades.size(); i++)
				{
					habilidades.get(i).visualizarBasico();
				}
				System.out.println("Introduce el nombre de la habilidad, \"\" para no a�adir ninguna");
				nombrehab = teclado.nextLine();
				if(!nombrehab.equals(""))
				{
					int pos = obtenerPosHabilidad(nombrehab);
					if(pos!=-1)
					{
						
						
						//acciones[numhabenitem]=habilidades.get(pos);
						asigHabItem(habilidades.get(pos), aux_cons);
						numhabenitem++;
					}
				}
			}while(!nombrehab.equals("") && numhabenitem<10);
			
			break;
		case 3:
			//salida = anyadirArma(nombre, valor, acciones);
			System.out.println("Introduce el agravio");
			int agravio = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce el peso");
			peso = teclado.nextInt();
			teclado.nextLine();
			
			Arma aux_arma = new Arma(nombre, valor, acciones, agravio, peso);
			
			salida = anyadirItem(aux_arma);
			numhabenitem = 0;
			do {
				System.out.println("Elige la habilidad a introducir");
				
				for(int i = 0; i < habilidades.size(); i++)
				{
					habilidades.get(i).visualizarBasico();
				}
				System.out.println("Introduce el nombre de la habilidad, \"\" para no a�adir ninguna");
				nombrehab = teclado.nextLine();
				if(!nombrehab.equals(""))
				{
					int pos = obtenerPosHabilidad(nombrehab);
					if(pos!=-1)
					{
						
						
						//acciones[numhabenitem]=habilidades.get(pos);
						asigHabItem(habilidades.get(pos), aux_arma);
						numhabenitem++;
					}
				}
			}while(!nombrehab.equals("") && numhabenitem<10);
			
			break;
		default:
			System.out.println("No existe este tipo de item");
			break;
		}
		
		//Item aux = new Item(nombre,peso,tipo,valor, agravio, armadura, acciones);
		
		return salida;
	}
	
	
	
	
	//Anyadir item por parametro
	public boolean anyadirItem(Item item)
	{
		boolean salida = false;
		
		
		
		boolean encontrado = false;
		if(items.indexOf(item) > -1)
		{
			encontrado = true;
		}
		
		if(!encontrado)
		{
			
				salida = items.add(item);
			
		}
		
		
		
		return salida;
		
		
	}
	
	public boolean asigHabItem()
	{
		boolean salida = false;
		for(int i = 0; i < items.size();i++)
		{
			System.out.println("Items"+i);
			items.get(i).visualizarBasico();
		}
		System.out.println("Que item quieres usar?");
		int it = teclado.nextInt();
		teclado.nextLine();
		for(int i = 0; i < habilidades.size();i++)
		{
			System.out.println("Habilidades"+i);
			items.get(i).visualizarBasico();
		}
		System.out.println("Que habilidad quieres añadir?");
		int hab = teclado.nextInt();
		teclado.nextLine();
		
		if(it < items.size() && hab < habilidades.size())
		{
			salida = items.get(it).addHabilidad(habilidades.get(hab));

		}else
		{
			System.out.println("Error no exite");
		}
		
		return salida;
	}
	
	public boolean asigHabItem(Habilidad habilidad, Item item)
	{
		boolean salida = false;
		int pos_item = 0;
		
		
		pos_item = items.indexOf(item);
		
		if(pos_item > -1)
		{
			salida  = items.get(pos_item).addHabilidad(habilidad);
		}
		
		return salida;
	}
	
	
	private int obtenerPosHabilidad(String nombre)
	{
		int salida = -1;
		Habilidad aux = new Habilidad(nombre,0,0,"");
		
		
		salida = habilidades.indexOf(aux);
		

		return salida;
	}
	
	public void mostrarItems()
	{
		
		for(int i = 0; i < items.size(); i++)
		{
			items.get(i).visualizarBasico();
		}
	}
	
	public boolean anyadirPersonaje()
	{
		boolean salida = false;
		
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la clase");
		String clase = teclado.nextLine();
		System.out.println("Introduce la vida maxima");
		int vida_max = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la energia maxima");
		int ener_max = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la vida actual");
		int vida_actual = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce la energia actual");
		int ener_actual = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce las monedas");
		int monedas = teclado.nextInt();
		teclado.nextLine();
		
		
		Habilidad habilidad[] = new Habilidad[10];
		
		
		
		Item equipo [] = new Item[10];
		
		
		boolean npcs = false;
		boolean hostil = false;
		System.out.println("es un npc?");
		String hay_npcs = teclado.nextLine();
		if(hay_npcs.equals("si"))
		{
			npcs = true;
			System.out.println("Es hostil?");
			String es_hostil = teclado.nextLine();
			if(es_hostil.equals("si"))
			{
				hostil = true;
			}
		}
		
		
		Personaje aux = new Personaje(nombre,clase,vida_max,ener_max,vida_actual,ener_actual,monedas,habilidad,equipo,npcs,hostil);
		
		salida = anyadirPersonaje(aux);
		
		int numhabenper=0; //numero de habilidades que se han a�adido al personaje
		
		String nombrehab;
		do {
			System.out.println("Elige la habilidad a introducir");
			for(int i = 0; i<habilidades.size();i++)
			{
				habilidades.get(i).visualizarBasico();
			}
			System.out.println("Introduce el nombre de la habilidad, \"\" para no a�adir ninguna");
			nombrehab = teclado.nextLine();
			if(!nombrehab.equals(""))
			{
				int pos = obtenerPosHabilidad(nombrehab);
				if(pos!=-1)
				{
					//habilidad[numhabenper]=habilidades[pos];
					//salida = asigHabItem(habilidades.get(pos), aux_arm);
					modHabPer(aux, habilidades.get(pos), true);
					numhabenper++;
				}
			}
		}while(!nombrehab.equals("") && numhabenper<10);
		
		
		
		int numitemenper = 0;//numero de items que se han añadido al personaje
		String respuesta;
		
		
		
		do {
			
			System.out.println("Quieres añadir un item si/no ?");
			respuesta = teclado.nextLine();
			if(respuesta.equals("si"))
			{
				System.out.println("Elige el item a introducir");
				for(int i = 0; i < items.size(); i++)
				{
					System.out.println("Item: "+i);
					items.get(i).visualizarBasico();
					
				}
				System.out.println("Introduce el numero del item");
				int posit  = teclado.nextInt();
				teclado.nextLine();
				
					if(posit < items.size())
					{
						//equipo[numitemenper] = items[posit];
						modEquipo(aux, items.get(posit),true);
						numitemenper++;
					}
				
				
				
			}
			
			
		}while(!respuesta.equals("no") && numitemenper < 10);
		
		
		
		return salida;
	}
	
	public void mostrarPersonajes()
	{
		for(int i =0; i<personajes.size(); i++)
		{
			personajes.get(i).visualizar();
			
		}
	}
	
	
	
	
	public boolean anyadirPersonaje(Personaje personaje)
	{
		boolean salida = false;
		boolean encontrado = false;
		
		if(personajes.indexOf(personaje) > -1)
		{
			encontrado = true;
		}
		
		if(!encontrado)
		{
			
			salida = personajes.add(personaje);		
		}

		return salida;
	}
	
	
	
	
	public int modEquipo()
	{
		int salida = -1;
		boolean anyadir = false;
		boolean salida2 = false;
		for(int i = 0; i < personajes.size(); i++)
		{
			System.out.println("Personaje: "+i);
			personajes.get(i).visualizarBasico();
		}
		System.out.println("Elige el personaje que quieres utilizar");
		int per = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Si quieres anyadir pon si, sino iras a eliminar");
		String respuesta = teclado.nextLine();
		if(respuesta.equals("si"))
		{
			anyadir = true;
		}
		
		if(anyadir == true)
		{
			for(int i = 0; i < items.size();i++)
			{
				System.out.println("Items: "+i);
				items.get(i).visualizarBasico();
			}
			System.out.println("Elige el equipo que quieres anyadir");
			int it = teclado.nextInt();
			teclado.nextLine();
			if(it < items.size() && per < personajes.size())
			{
				salida2 = personajes.get(per).addEquipo(items.get(it));
				if(salida2)
				{
					salida = 1;
				}
				
			}else {
				System.out.println("El equipo ya existe");
			}
			
		}else {
			personajes.get(per).visualizarBasico();
			System.out.println("Elige el equipo que quieres eliminar");
			int it = teclado.nextInt();
			teclado.nextLine();
			if(it < items.size() && per < personajes.size())
			{
				salida2 = personajes.get(per).eliminarEquipo(items.get(it));
				if(salida2)
				{
					salida = 1;
				}
				
			}else {
				System.out.println("error no existe");
			}
		}
		
		return salida;
	}
	
	public int modEquipo(Personaje personaje, Item item, boolean anyadir)
	{
		int salida = -1;
		int pos_per = 0;
		boolean salida2 = false;
		
		
		
		pos_per = personajes.indexOf(personaje);
		if(pos_per > -1)
		{
			if(anyadir)
			{
				if(pos_per < personajes.size())
				{
					salida2 = personaje.addEquipo(item);
					if(salida2)
					{
						salida = 1;
					}
				}
			}else {
				if(pos_per < personajes.size())
				{
					salida2 = personaje.eliminarEquipo(item);
					if(salida2)
					{
						salida = 1;
					}
				}
			}
		}
		
		
		return salida;
	}
	
	public int modHabPer()
	{
		boolean salida2 = false;
		int salida = -1;
		boolean anyadir = false;
		for(int i = 0; i < personajes.size(); i++)
		{
			System.out.println("Personaje: "+i);
			personajes.get(i).visualizarBasico();
		}
		System.out.println("Elige el personaje que quieres utilizar");
		int per = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Si quieres anyadir pon si, sino iras a eliminar");
		String respuesta = teclado.nextLine();
		if(respuesta.equals("si"))
		{
			anyadir = true;
		}
		
		if(anyadir == true)
		{
			for(int i = 0; i < habilidades.size(); i++)
			{
				System.out.println("Habilidades: "+i);
				habilidades.get(i).visualizarBasico();
			}
			System.out.println("Elige la habilidad que quieres añadir");
			int hab = teclado.nextInt();
			teclado.nextLine();
			if(hab < habilidades.size() && per < habilidades.size())
			{
				salida2 = personajes.get(per).addHabilidad(habilidades.get(hab));
				if(salida2)
				{
					salida = 1;
				}
				
			}else
			{
				System.out.println("Error ya existe");
			}
			
		}else {
			personajes.get(per).visualizarBasico();
			System.out.println("Elige la habilidad que quieres eliminar");
			int hab = teclado.nextInt();
			teclado.nextLine();
			if(hab < habilidades.size() && per < personajes.size())
			{
				salida2 = personajes.get(per).addHabilidad(habilidades.get(hab));
				if(salida2)
				{
					salida = 1;
				}
			}else {
				System.out.println("Error no existe");
			}
		}
		return salida;
	}
	
	public int modHabPer(Personaje personaje, Habilidad habilidad, boolean anyadir)
	{
		int salida = -1;
		int pos_per = 0;
		boolean salida2 = false;
		
		
		pos_per = personajes.indexOf(personaje);
		if(pos_per > -1)
		{
			if(anyadir)
			{
				if(pos_per < personajes.size())
				{
					salida2 = personaje.addHabilidad(habilidad);
					if(salida2)
					{
						salida = 1; 
					}
				}
			}else {
				if(pos_per < personajes.size())
				{
					salida2= personaje.eliminarHabilidad(habilidad);
					if(salida2)
					{
						salida = 1;
					}
				}
			}
		}
		
		
		return salida;
	}
	
	
	
	
	public boolean anyadirZona()
	{
		boolean salida = false;
		System.out.println("Introduce el nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el nivel");
		int nivel = teclado.nextInt();
		teclado.nextLine();
		Personaje per[] = new Personaje[10];
		
		
		
		Zona aux = new Zona(nombre,nivel,per);
		
		boolean encontrado = false;
		for(int i=0;i<50;i++)
		{
			if(zonas[i]!=null && zonas[i].esIgual(aux))
			{
				encontrado =true;
				i=50;
			}
		}
		
		if(!encontrado)
		{
			if(numzonas<50)
			{
				zonas[numzonas]=aux;
				numzonas++;
				salida = true;
			}
			else
			{
				System.out.println("El array est� lleno");
			}
		}
		else
		{
			System.out.println("Error ya existe");
		}
		
		
		String respuesta;
		int numperenzona = 0;
		do {
			System.out.println("Quieres añadir un personaje si/no ? ");
			respuesta = teclado.nextLine();
			if(respuesta.equals("si"))
			{
				System.out.println("Elige el personaje a introducir");
				for(int i = 0; i < personajes.size(); i++)
				{
					System.out.print(i+".-");
					System.out.println(personajes.get(i).getNombre());
				}
				System.out.println("Introduce el numero del personaje");
				int pos = teclado.nextInt();
				teclado.nextLine();
				if(pos < personajes.size())
				{
					//per[numperenzona] = personajes[pos];
					addPersonajeAZona(personajes.get(pos), aux);
					numperenzona++;
				}
			}
			
		}while(!respuesta.equals("no") && numperenzona < 10);
		
		
		
		return salida;
	}
	
	public void mostrarZonas()
	{
		for(int i = 0; i < numzonas; i++)
		{
			if(zonas[i] != null)
			{
				zonas[i].visualizarBasico();
			}
			
		}
	}
	
	public boolean anyadirZona(Zona zona)
	{
		boolean salida = false;
		
		boolean encontrado = false;
		for(int i=0;i<50;i++)
		{
			if(zonas[i]!=null && zonas[i].esIgual(zona))
			{
				encontrado =true;
				i=50;
			}
		}
		
		if(!encontrado)
		{
			if(numzonas<50)
			{
				zonas[numzonas]=zona;
				numzonas++;
				salida = true;
			}
			
		}
		
		
		return salida;
	}
	
	public int addPersonajeAZona()
	{
		int salida = -1;
		boolean salida2 = false;
		for(int i = 0; i < numzonas;i++)
		{
			System.out.println("zonas"+i);
			zonas[i].visualizarBasico();
		}
		System.out.println("Elige la zona que vas a utilizar");
		int zo = teclado.nextInt();
		teclado.nextLine();
		for(int i = 0; i < personajes.size();i++)
		{
			System.out.println("Personaje: "+i);
			personajes.get(i).visualizarBasico();
		}
		System.out.println("Elige el personaje que quieres añadir");
		int per = teclado.nextInt();
		teclado.nextLine();
		
		if(zo < numzonas && per < personajes.size())
		{
			salida2 = zonas[zo].addPersonaje(personajes.get(per));
			if(salida2)
			{
				salida = 1;
			}
		}else {
			System.out.println("Error ya existe");
		}
		
		return salida;
	}
	
	public int addPersonajeAZona(Personaje personaje, Zona zona)
	{
		int salida = -1;
		int pos_zona = 0;
		boolean salida2 = false;
		for(int i = 0; i < numzonas; i++)
		{
			if(zonas[i].esIgual(zona))
			{
				pos_zona = i;
				if(pos_zona < numzonas)
				{
					salida2 = zonas[pos_zona].addPersonaje(personaje);
					if(salida2)
					{
						salida = 1;
					}
					
				}
				i = numzonas;
			}
		}
		
		
		
		return salida;
	}
	
	public boolean anyadirMision()
	{
		boolean salida = false;
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el nivel");
		int nivel = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduce el numero del  objetivo");
		Personaje objetivo = new Personaje();
		for(int i = 0; i < personajes.size();i++)
		{
			System.out.print(i+".-");
			System.out.println(personajes.get(i).getNombre());
		}
		int per = teclado.nextInt();
		teclado.nextLine();
		if(per <= personajes.size())
		{
			objetivo = personajes.get(per);
		}
		System.out.println("Introduce el numero de  zona");
		Zona zona = new Zona();
		for(int i = 0;i < numzonas; i++)
		{
			System.out.print(i+".-");
			System.out.println(zonas[i].getNombre());
		}
		int n_zona = teclado.nextInt();
		teclado.nextLine();
		if(n_zona <= numzonas)
		{
			zona = zonas[n_zona];
		}
		
		
		//Item recompensa = new Item();
		boolean existe = false;
		int it_bueno = 0;
		while(existe == false)
		{
			System.out.println("Introduce el numero de  recompensa");
			
			for(int i = 0; i < items.size(); i++)
			{
				System.out.print(i+".-");
				System.out.println(items.get(i).getNombre());
				
			}
			int it = teclado.nextInt();
			teclado.nextLine();
			
			
			if(it < items.size())
			{
				
				it_bueno = it;
				existe = true;
			}else {
				System.out.println("ese item no existe");
			}
		}
		
		System.out.println("Introduce las monedas");
		int monedas = teclado.nextInt();
		teclado.nextLine();
		
		Mision aux = new Mision(nombre,nivel,objetivo,zona,items.get(it_bueno),monedas);
		boolean encontrado = false;
		for(int i = 0; i < 50; i++)
		{
			if(misiones[i]!=null && misiones[i].esIgual(aux))
			{
				encontrado =true;
				i=50;
			}
		}
		
		if(!encontrado)
		{
			if(num_mis<50)
			{
				misiones[num_mis] = aux;
				num_mis++;
				salida = true;
			}else {
				System.out.println("el array esta lleno");
			}
		}else
		{
			System.out.println("Error ya existe");
		}
		
		return salida;
	}
	
	public boolean anyadirMision(Mision mision)
	{
		boolean salida = false;
		boolean encontrado = false;
		for(int i = 0 ; i < 50; i++)
		{
			if(misiones[i]!= null && misiones[i].esIgual(mision))
			{
				encontrado = true;
				i = 50;
			}
		}
		
		if(!encontrado)
		{
			if(num_mis < 50)
			{
				misiones[num_mis] = mision;
				num_mis++;
				salida = true;
			}
		}
		return salida;
	}
	
	public void mostrarMisiones()
	{
		for(int i = 0; i < num_mis; i++)
		{
			if(misiones[i] != null)
			{
				misiones[i].visualizarBasico();
			}
		}
	}
	
	public boolean eliminarHabilidad()
	{
		boolean salida = false;
		
		

		String nombrehab;
		do {
			System.out.println("Elige la habilidad a introducir");
			
			for(int i = 0; i < habilidades.size(); i++)
			{
				habilidades.get(i).visualizarBasico();
			}
			System.out.println("Introduce el nombre de la habilidad, \"\" para no eliminar ninguna");
			nombrehab = teclado.nextLine();
			if(!nombrehab.equals(""))
			{
				int pos = obtenerPosHabilidad(nombrehab);
				if(pos!=-1)
				{
					habilidades.remove(pos);
					salida = true;
				}
			}
		}while(!nombrehab.equals(""));
		
		
		return salida;
	}
	

	
	public boolean eliminarHabilidad(Habilidad habilidad)
	{
		boolean salida = false;
		
		if(habilidades.indexOf(habilidad) > -1)
		{
			salida = habilidades.remove(habilidad);
		}

		return salida;
	}
	
	
	
	public boolean eliminarItem()
	{
		boolean salida = false;
		for(int i = 0; i < items.size();i++)
		{
			System.out.println("Item: "+i);
			items.get(i).visualizarBasico();
			
		}
		System.out.println("Introduce el numero del item que quieres eliminar:");
		int item = teclado.nextInt();
		teclado.nextLine();
		
		if(items.indexOf(items.get(item)) > -1)
		{
			items.remove(item);
			salida = true;
		}
		
		
		return salida;
	}
	
	public boolean eliminarItem(Item item)
	{
		boolean salida = false;
		
		
		if(items.indexOf(item) > -1)
		{
			salida = items.remove(item);
			
		}
		
		return salida;
	}
	
	private void eliminar_zo(int pos)
	{
		Zona aux[] = new Zona[50];
		int cont = 0;
		for(int i = 0; i < zonas.length; i++)
		{
			if(zonas[i] != zonas[pos])
			{
				aux[cont] = zonas[i];
				cont++;
			}
		}
		zonas = aux;
		
		/*
		for(int i = pos; i < zonas.length -1; i++)
		{
			zonas[i] = zonas[i+1];
		}
		zonas[pos] = null;
		
		
		
		zonas[pos] = null;
		for(int i = pos; i < numzonas; i++)
		{
			zonas[i] = zonas[i+1];
		}
		
		zonas[numzonas] = null;
		*/
		
	}
	
	public boolean eliminarZona()
	{
		boolean salida = false;
		for(int i = 0; i < numzonas; i++)
		{
			System.out.println("zona"+i);
			zonas[i].visualizarBasico();
		}
		System.out.println("Introduce la zona que quieres eliminar");
		int zona = teclado.nextInt();
		teclado.nextLine();
		if(zona <= numzonas)
		{
			eliminar_zo(zona);
			salida = true;
		}else {
			System.out.println("No se encuentra la zona");
		}
		
		
		return salida;
	}
	
	public boolean eliminarZona(Zona zona)
	{
		boolean salida = false;
		String nombrezona = "";
		int zo = 0;
		boolean eliminado = false;
		for(int i = 0; i < numzonas; i++)
		{
			if(zonas[i] != null && zonas[i].esIgual(zona))
			{
				zo = i;
				if(zo <= numzonas)
				{
					eliminar_zo(zo);
					salida = true;
				}
				
				i = numzonas;
			}
		}
		
		
		
		
		return salida;
	}
	
	
	
	public boolean eliminarPersonaje()
	{
		boolean salida = false;
		for(int i = 0; i < personajes.size(); i++)
		{
			System.out.println("Personaje"+i);
			System.out.println(personajes.get(i).getNombre());
		}
		System.out.println("Introduce el numero de personaje a eliminar");
		int personaje = teclado.nextInt();
		teclado.nextLine();
		
		if(personajes.indexOf(personajes.get(personaje)) > -1)
		{
			personajes.remove(personaje);
			salida = true;
		}
		

		return salida;
	}
	
	public boolean eliminarPersonaje(Personaje personaje)
	{
		boolean salida = false;
		
		int per = 0;

		per = personajes.indexOf(personaje);
		if(per > -1)
		{
			salida = personajes.remove(personaje);
		}
		
		return salida;
	}
	
	private void eliminar_mis(int pos)
	{
		Mision aux[] = new Mision [50];
		int cont = 0;
		for(int i = 0; i < misiones.length; i++)
		{
			if(misiones[i] != misiones[pos])
			{
				aux[cont] = misiones[i];
				cont++;
			}
		}
		misiones = aux;		
		
		/*
		for(int i = pos; i < misiones.length -1; i++)
		{
			misiones[i] = misiones[i+1];
		}
		misiones[pos] = null;
		
		
		misiones[pos] = null;
		for(int i = pos; i < num_mis; i++)
		{
			misiones[i] = misiones[i+1];
		}
		misiones[num_mis] = null;
		*/
	}
	
	public boolean eliminarMision()
	{
		boolean salida = false;
		for(int i = 0; i < num_mis; i++)
		{
			System.out.println("Mision"+i);
			misiones[i].visualizarBasico();
		}
		System.out.println("elige el numero de mision a eliminar");
		int mision = teclado.nextInt();
		teclado.nextLine();
		if(mision <= num_mis)
		{
			eliminar_mis(mision);
			salida = true;
		}else {
			System.out.println("no es ha encontradao la mision");
		}
		return salida;
	}
	
	public boolean eliminarMision(Mision mision)
	{
		boolean salida = false;
		String nombre_mis = "";
		int mis = 0;
		
		for(int i = 0; i < num_mis; i++)
		{
			if(misiones[i] != null && misiones[i].esIgual(mision))
			{
				mis = i;
				if(mis <= num_mis)
				{
					eliminar_mis(mis);
					salida = true;
				}
				i = num_mis;
			}
		}
		
		
		
		return salida;
	}
	
	public boolean eliminarHabItem()
	{
		boolean salida = false;
		for(int i = 0; i < items.size(); i++)
		{
			System.out.println("items: "+i);
			items.get(i).visualizarBasico();
		}
		System.out.println("Introduce el item a usar");
		int it = teclado.nextInt();
		teclado.nextLine();
		/*
		for(int i = 0; i < habilidades.size(); i++)
		{
			System.out.println("habilidad"+i);
			habilidades.get(i).visualizarBasico();
			
		}
		*/
		items.get(it).visualizarBasico();
		System.out.println("Que habilidad quieres eliminar?");
		int hab = teclado.nextInt();
		teclado.nextLine();
		if(it < items.size() && hab < habilidades.size())
		{
			salida = items.get(it).eliminarHabilidad(habilidades.get(hab));
			
		}else
		{
			System.out.println("Error no exite");
		}
		
		return salida;
	}
	
	public boolean eliminarHabItem(Habilidad habilidad, Item item)
	{
		boolean salida = false;
		
		if(items.indexOf(item) > -1)
		{
			salida = item.eliminarHabilidad(habilidad);
		}
		
		
		return salida;
	}
	
	public int eliminarPersonajeAZona()
	{
		int salida = -1;
		boolean salida2 = false;
		for(int i = 0; i < numzonas;i++)
		{
			System.out.println("zonas: "+i);
			zonas[i].visualizarBasico();
		}
		System.out.println("Elige la zonas que vas a utilizar");
		int zo = teclado.nextInt();
		teclado.nextLine();
		/*
		for(int i = 0; i < numper; i++)
		{
			System.out.println("Personajes: "+i);
			personajes[i].visualizar();
		}
		*/
		zonas[zo].visualizarBasico();
		System.out.println("Elige el personaje que vas a eliminar");
		int per = teclado.nextInt();
		teclado.nextLine();
		
		if(zo < numzonas && per < personajes.size())
		{
			salida2 = zonas[zo].eliminarPersonaje(personajes.get(per));
			if(salida2)
			{
				salida = 1;
			}
			
		}else {
			System.out.println("Error no existe");
		}
		
		return salida;
	
	}
	
	public int eliminarPersonajeAZona(Personaje personaje, Zona zona)
	{
		int salida = -1;
		int pos_zona = 0;
		boolean salida2 = false;
		for(int i = 0; i < numzonas; i++)
		{
			if(zonas[i].esIgual(zona))
			{
				pos_zona = i;
				if(pos_zona < numzonas)
				{
					salida2 = zonas[pos_zona].eliminarPersonaje(personaje);
					if(salida2)
					{
						salida = 1;
					}
					
				}
				i = numzonas;
			}
		}
		
		
			
			
		return salida;
	}
	
	
	public void leerDeFichero()
	{
		FileReader file;
		String texto_hab = "";
		String texto_per = "";
		int contador = 0; 
		try
		{
			String nombre = "";
			int vida = 0;
			int energia = 0; 
			String tipo = "";
			file = new FileReader("C:\\DAM\\habilidades.txt");
			texto_hab = "";
			
			int c = file.read();
			while(c!= -1)
			{
				if(c == ';')
				{
					switch(contador)
					{
					case 0:
						
						contador++;
						nombre = texto_hab;
						break;
					case 1:
						
						contador++;
						vida = Integer.parseInt(texto_hab);
						break;
					case 2:
						
						contador++;
						energia = Integer.parseInt(texto_hab);
						break;
					case 3:
						
						contador= 0;
						tipo = texto_hab;
						Habilidad aux = new Habilidad(nombre, vida, energia, tipo);
						anyadirHabilidad(aux);
						break;
					}
					texto_hab = "";
					
				}
				else {
					if(c!=10 && c!=13)
					{
						texto_hab = texto_hab + (char) c;
					}
					
				}
				
				
				c=file.read();
				
			}
			
			file.close();
			
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		try
		{
			String nombre = "";
			String clase = "";
			int vida_max = 0;
			int energia_max = 0; 
			int vida_actual = 0;
			int energia_actual = 0;
			int monedas = 0;
			Habilidad habilidad[] = new Habilidad[10];
			Item equipo [] = new Item[10];
			boolean npc = false;
			boolean hostil = false;
			
			
			
			file = new FileReader("C:\\DAM\\personajes.txt");
			BufferedReader in = new BufferedReader(file);
			
			texto_per = "";
			String c = "";
			File archivo = new File("C:\\DAM\\personajes.txt");
			
			while((c = in.readLine())!=null )
			{
				
				
				
				
				boolean vacio = false;
				
				
				
				
				if(c.length() == 0)
				{
					vacio = true;
					
				}
				
				if(!vacio)
				{
					String separador = Pattern.quote(";");
					String[] parts = c.split(separador);
					
					
					
					nombre = parts[0];
					
					
					clase = parts[1];
					vida_max = Integer.parseInt(parts[2]);
					energia_max = Integer.parseInt(parts[3]);
					vida_actual = Integer.parseInt(parts[4]);
					energia_actual = Integer.parseInt(parts[5]);
					monedas = Integer.parseInt(parts[6]);
					if(parts[7].equals("true"))
					{
						npc = true;
					}
					
					if(parts[8].equals("true"))
					{
						hostil = true;
					}
					
					
					
					Personaje aux = new Personaje(nombre, clase, vida_max, energia_max, vida_actual, energia_actual, 
							monedas, habilidad, equipo, npc, hostil);
					anyadirPersonaje(aux);
					String separador2 = Pattern.quote(", ");
					String [] name_habs = parts[9].split(separador2);
					
					for(int i = 0; i < name_habs.length; i++)
					{
						String name_bueno = "";
						int pos = 0;
						
						if(i == name_habs.length -1)
						{
							name_bueno = name_habs[i].trim();
							pos = obtenerPosHabilidad(name_bueno);
							
							if(pos > -1)
							{
								modHabPer(aux, habilidades.get(pos), true);
							}
							
						}else {
							pos = obtenerPosHabilidad(name_habs[i]);
							
							if(pos > -1)
							{
								modHabPer(aux, habilidades.get(pos), true);
							}
						}
						

					}
				
				

				}
				c = "";
			
			}
				
			
			
			
			in.close();
			file.close();
			
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	
	
	public void guardarEnFichero()
	{
		FileWriter file;
		System.out.println("Quieres guardar un 'Personaje' o una 'Habilidad' ");
		System.out.println("Introduce 1 para Habilidad");
		System.out.println("Introduce 2 para Personaje");
		int res = teclado.nextInt();
		teclado.nextLine();
		if(res == 1)
		{
			for(int i = 0; i < habilidades.size(); i++)
			{
				System.out.println("Habilidad:"+ i);
				System.out.println(habilidades.get(i).getNombre());
			}
			System.out.println("Eliege el numero de Habilidad");
			int hab = teclado.nextInt();
			teclado.nextLine();
			
			if(hab < habilidades.size())
			{
				try {
					file = new FileWriter("C:\\DAM\\habilidades.txt", true);
					BufferedWriter out = new BufferedWriter(file);
					
					
					String texto = habilidades.get(hab).toString();
					
					out.write(texto);
					out.newLine();
					out.close();
					
				}catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			

		}
		
		
		if(res == 2)
		{

			for(int i = 0; i < personajes.size(); i++)
			{
				System.out.println("Personaje:"+ i);
				System.out.println(personajes.get(i).getNombre());
			}
			System.out.println("Eliege el numero de Personaje");
			int per = teclado.nextInt();
			teclado.nextLine();
			
			if(per < personajes.size())
			{
				try {
					file = new FileWriter("C:\\DAM\\personajes.txt", true);
					BufferedWriter out = new BufferedWriter(file);
					
					
					String texto = personajes.get(per).toString();
					
					out.write(texto);
					out.newLine();
					out.close();
					
				}catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
		}
		
		
	}
	
}

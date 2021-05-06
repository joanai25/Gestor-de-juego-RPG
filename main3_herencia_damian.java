import java.util.Scanner;

public class main3_herencia_damian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//CREACIÓN ARRAYS AUXILIARES
		//Gestor
		Habilidad habilidades[] = new Habilidad[55];
		Item items[] = new Item[60];
		Personaje personajes[] = new Personaje[55];
		Zona zonas[] = new Zona[55];
		Mision misiones[] = new Mision[55];
		
		//HABILIDADES
		for(int i=0; i<55;i++)
			habilidades[i] = new Habilidad("Habilidad"+ i,i+1,i+1,"tipo" + 1);
		
		
		
		//Prueba visualización Habilidad	
		System.out.println("visualizar Basico  Habilidad");
		habilidades[1].visualizarBasico();
		teclado.nextLine();
		
		
		Habilidad auxhabilidad[] = new Habilidad[5];
		auxhabilidad[0] = habilidades[0];
		auxhabilidad[1] = habilidades[1];
		auxhabilidad[2] = habilidades[2];
		
		//ITEM
		for(int i=0;i<20;i++)
			items[i] = new Armadura("Armadura " + i, i, auxhabilidad, i, i);
		for(int i=20;i<40;i++)
			items[i] = new Consumible("Consumible " + i, i, auxhabilidad, i);
		for(int i=40;i<60;i++)
			items[i] = new Arma("Arma " + i, i, auxhabilidad, i, i);
		Item auxitems []  = new Item[5];
		auxitems[0] = items[0];
		auxitems[1] = items[20];
		auxitems[2] = items[40];
		
		
		//Prueba visualización ITEM	
		System.out.println("visualizar Básico ITem");
		System.out.println("ARMADURA---------------------------------------");
		items[1].visualizarBasico();
		System.out.println("--------------------------------FIN ARMADURA");
		System.out.println("CONSUMIBLE-------------------------------------");
		items[22].visualizarBasico();
		System.out.println("-------------------------------------FIN CONSUMIBLE");
		System.out.println("ARMA-------------------------------------");
		items[41].visualizarBasico();
		System.out.println("-------------------------------------FIN ARMA");
		
		teclado.nextLine();
		
		//Personaje
		for(int i=0;i<55;i++)
		{
			personajes[i] = new Personaje("nombre "+i, "clase "+i, 200,200,200,200,0,auxhabilidad,auxitems, false, false );
		}
		
		Personaje[] auxpersonajes = new Personaje[55];
		auxpersonajes[0] = personajes[0];
		auxpersonajes[1] = personajes[1];
		auxpersonajes[2] = personajes[2];
		
		
		//Prueba visualización Personaje	
		System.out.println("visualizar Basico personaje");
		personajes[1].visualizarBasico();
		teclado.nextLine();
		
		
		//Zona
		for(int i=0;i<55;i++)
		{
			zonas[i] = new Zona("zona "+i, i,auxpersonajes);
		}
		
		
		//Prueba visualización Zona	
		System.out.println("visualizar Basico zona");
		zonas[1].visualizarBasico();
		teclado.nextLine();
		
		
		
		//Misiones
		for(int i=0;i<55;i++)
		{
			misiones[i] = new Mision("nombre "+i, i, personajes[i], zonas[i], items[i], i);
		}
		
		//Prueba visualización Mision
		System.out.println("visualizar Basico Mision");
		misiones[1].visualizarBasico();
		teclado.nextLine();
		
		
		
		
	
		//GESTOR
		//Anyadir
		Gestor pruebagestor = new Gestor();
		
		//mostrar arrays vacios
		System.out.println("-------------HABILIDADES Vacias-----------");
		pruebagestor.mostrarHabilidades();
		teclado.nextLine();
		System.out.println("-------------ITEMS Vacias-----------");
		pruebagestor.mostrarItems();
		teclado.nextLine();
		System.out.println("-------------PERSONAJES Vacias-----------");
		pruebagestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-------------ZONAS Vacias-----------");
		pruebagestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-------------MISIONES Vacias-----------");
		pruebagestor.mostrarMisiones();
		teclado.nextLine();
		
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.anyadirHabilidad(habilidades[i]);
		}
		
		pruebagestor.anyadirItem(items[0]);
		pruebagestor.anyadirItem(items[20]);
		pruebagestor.anyadirItem(items[40]);
		System.out.println("Mostramos 3 items de los 3 tipos");
		pruebagestor.mostrarItems();
		
		System.out.println("Fin de los items");
		teclado.nextLine();
		for(int i =0;i<20; i++)
		{
			pruebagestor.anyadirItem(items[i]);
		}
		for(int i =20;i<40; i++)
		{
			pruebagestor.anyadirItem(items[i]);
		}
		for(int i =40;i<60; i++)
		{
			pruebagestor.anyadirItem(items[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.anyadirPersonaje(personajes[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.anyadirZona(zonas[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.anyadirMision(misiones[i]);
		}
		
		System.out.println("Finalizado los anyadir");
		teclado.nextLine();
		
		//Visualización datos
		System.out.println("-------------HABILIDADES 2-----------");
		pruebagestor.mostrarHabilidades();
		teclado.nextLine();
		System.out.println("-------------ITEMS 2-----------");
		pruebagestor.mostrarItems();
		teclado.nextLine();
		System.out.println("-------------PERSONAJES 2-----------");
		pruebagestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-------------ZONAS 2-----------");
		pruebagestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-------------MISIONES 2-----------");
		pruebagestor.mostrarMisiones();
		teclado.nextLine();
		
		//eliminar
		
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarHabilidad(habilidades[i]);
		}
		
		
		
		for(int i =0;i<20; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		for(int i =20;i<40; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		for(int i =40;i<60; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarPersonaje(personajes[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarZona(zonas[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarMision(misiones[i]);
		}
		
		
		
		
		
		
		//visualizar
		System.out.println("-----------Habilidadades vacios 1-------------");
		pruebagestor.mostrarHabilidades();
		teclado.nextLine();
		System.out.println("-------------ITEMS vacios 1-----------");
		pruebagestor.mostrarItems();
		teclado.nextLine();
		System.out.println("-------------PERSONAJES vacios 1-----------");
		pruebagestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-------------ZONAS vacios 1-----------");
		pruebagestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-------------MISIONES vacios 1-----------");
		pruebagestor.mostrarMisiones();
		teclado.nextLine();
		
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarHabilidad(habilidades[i]);
		}
		
		
		
		for(int i =0;i<20; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		for(int i =20;i<40; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		for(int i =40;i<60; i++)
		{
			pruebagestor.eliminarItem(items[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarPersonaje(personajes[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarZona(zonas[i]);
		}
		
		for(int i =0;i<55; i++)
		{
			pruebagestor.eliminarMision(misiones[i]);
		}
		System.out.println("-----------Habilidadades vacios 2-------------");
		pruebagestor.mostrarHabilidades();
		teclado.nextLine();
		System.out.println("-------------ITEMS vacios 2-----------");
		pruebagestor.mostrarItems();
		teclado.nextLine();
		System.out.println("-------------PERSONAJES vacios 2-----------");
		pruebagestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-------------ZONAS vacios 2-----------");
		pruebagestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-------------MISIONES vacios 2-----------");
		pruebagestor.mostrarMisiones();
		teclado.nextLine();
		
		
		
	}

}

import java.util.Scanner;

public class main_herencia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner teclado = new Scanner(System.in);
		
		//CREACI�N ARRAYS AUXILIARES
		Habilidad habilidades[] = new Habilidad[10];
		Item items[] = new Item[30];
		Personaje personajes[] = new Personaje[10];
		Zona zonas[] = new Zona[10];
		Mision misiones[] = new Mision[10];
		
		//HABILIDADES
		for(int i=0; i<10;i++)
			habilidades[i] = new Habilidad("Habilidad"+ i,i+1,i+1,"tipo" + 1);
		
		
		
		//Prueba visualizaci�n Habilidad	
		System.out.println("visualizar Habilidad");
		habilidades[1].visualizar();
		teclado.nextLine();
		Habilidad auxhabilidad[] = new Habilidad[5];
		auxhabilidad[0] = habilidades[3];
		auxhabilidad[1] = habilidades[6];
		auxhabilidad[2] = habilidades[9];
		
		//ITEM
		for(int i=0;i<10;i++)
			items[i] = new Armadura("Armadura " + i, i, auxhabilidad, i, i);
		for(int i=10;i<20;i++)
			items[i] = new Consumible("Consumible " + i, i, auxhabilidad, i);
		for(int i=20;i<30;i++)
			items[i] = new Arma("Arma " + i, i, auxhabilidad, i, i);
		Item auxitems []  = new Item[5];
		auxitems[0] = items[0];
		auxitems[1] = items[14];
		auxitems[2] = items[27];
		
		
		//Prueba visualizaci�n ITEM	
		System.out.println("visualizar ITem");
		items[1].visualizarBasico();
		teclado.nextLine();
		
		//Personaje
		for(int i=0;i<10;i++)
		{
			personajes[i] = new Personaje("nombre "+i, "clase "+i, 200,200,200,200,0,auxhabilidad,auxitems, false, false );
		}
		
		Personaje[] auxpersonajes = new Personaje[10];
		auxpersonajes[0] = personajes[0];
		auxpersonajes[1] = personajes[8];
		auxpersonajes[2] = personajes[9];
		
		
		//Prueba visualizaci�n Personaje	
		System.out.println("visualizar personaje");
		personajes[1].visualizar();
		teclado.nextLine();
		
		
		//Zona
		for(int i=0;i<10;i++)
		{
			zonas[i] = new Zona("zona "+i, i,auxpersonajes);
		}
		
		
		//Prueba visualizaci�n Zona	
		System.out.println("visualizar zona");
		zonas[1].visualizar();
		teclado.nextLine();
		
		
		
		//Misiones
		for(int i=0;i<10;i++)
		{
			misiones[i] = new Mision("nombre "+i, i, personajes[i], zonas[i], items[i], i);
		}
		
		//Prueba visualizaci�n Mision
		System.out.println("visualizar Mision");
		misiones[1].visualizar();
		teclado.nextLine();
		
		
		//Usuario
		Usuario usu1 = new Usuario();
		Usuario usu2 = new Usuario("nombre", "nick", "email", "dni", "pass","tipo");
		
		//Prueba visualizaci�n Usuario
		System.out.println("visualizar usuario");
		usu1.visualizar();
		teclado.nextLine();
		
		
		//Comprobacion
		Comprobacion compro = new Comprobacion();
		
		//Pruebas DNI
		if(compro.validarDNI("00000000T"))
			System.out.println("Comprobar DNI ok 1");
		else
			System.out.println("Error Comprobar DNI 1");
		
		if(!compro.validarDNI("00000000J"))
			System.out.println("Comprobar DNI ok 2");
		else
			System.out.println("Error Comprobar DNI 2");
		
		if(!compro.validarDNI("00000"))
			System.out.println("Comprobar DNI ok 3");
		else
			System.out.println("Error Comprobar DNI 3");
		
		if(!compro.validarDNI("000h0000K"))
			System.out.println("Comprobar DNI ok 4");
		else
			System.out.println("Error Comprobar DNI 4");
		
		teclado.nextLine();
		
		
		//pruebas esIgual
		if(habilidades[0].esIgual(habilidades[0]))
			System.out.println("Correcto esIgual habilidad1");
		else
			System.out.println("Error esIgual habilidad1");
			
		if(!habilidades[0].esIgual(habilidades[1]))
			System.out.println("Correcto esIgual habilidad2");
		else
			System.out.println("Error esIgual habilidad2");
		
		if(items[0].esIgual(items[0]))
			System.out.println("Correcto esIgual item1");
		else
			System.out.println("Error esIgual item1");
			
		if(!items[0].esIgual(items[1]))
			System.out.println("Correcto esIgual item2");
		else
			System.out.println("Error esIgual item2");
		
		if(personajes[0].esIgual(personajes[0]))
			System.out.println("Correcto esIgual personajes1");
		else
			System.out.println("Error esIgual personajes1");
		
		if(!personajes[0].esIgual(personajes[1]))
			System.out.println("Correcto esIgual personajes2");
		else
			System.out.println("Error esIgual personajes2");
		
		
		if(zonas[0].esIgual(zonas[0]))
			System.out.println("Correcto esIgual zonas1");
		else
			System.out.println("Error esIgual zonas1");
		
		if(!zonas[0].esIgual(zonas[1]))
			System.out.println("Correcto esIgual zonas2");
		else
			System.out.println("Error esIgual zonas2");
		
		if(misiones[0].esIgual(misiones[0]))
			System.out.println("Correcto esIgual misiones 1");
		else
			System.out.println("Error esIgual misiones 1");
		if(!misiones[0].esIgual(misiones[1]))
			System.out.println("Correcto esIgual misiones 2");
		else
			System.out.println("Error esIgual misiones 2");
		System.out.println("visualizar");
		
		//GESTOR
		//Anyadir
		Gestor pruebagestor = new Gestor();
		if(pruebagestor.anyadirHabilidad(habilidades[2]))
			System.out.println("Correcto anyadirHabilidad 1");
		else
			System.out.println("Error anyadirHabilidad 1");
		
		if(pruebagestor.anyadirHabilidad(habilidades[2]))
			System.out.println("Error anyadirHabilidad 2");
		else
			System.out.println("Correcto anyadirHabilidad 2");
		
		if(pruebagestor.anyadirHabilidad(habilidades[5]))
			System.out.println("Correcto anyadirHabilidad 3");
		else
			System.out.println("Error anyadirHabilidad 3");
		
		
		if(pruebagestor.anyadirItem(items[2]))
			System.out.println("Correcto anyadirItem 1");
		else
			System.out.println("Error anyadirItem 1");
		if(pruebagestor.anyadirItem(items[2]))
			System.out.println("Error anyadirItem 2");
		else
			System.out.println("Correcto anyadirItem 2");
		if(pruebagestor.anyadirItem(items[23]))
			System.out.println("Correcto anyadirItem 3");
		else
			System.out.println("Error anyadirItem 3");
		
		
		if(pruebagestor.anyadirPersonaje(personajes[2]))
			System.out.println("Correcto anyadirPersonaje 1");
		else
			System.out.println("Error anyadirPersonaje 1");
		if(pruebagestor.anyadirPersonaje(personajes[2]))
			System.out.println("Error anyadirPersonaje 2");
		else
			System.out.println("Correcto anyadirPersonaje 2");
		if(pruebagestor.anyadirPersonaje(personajes[5]))
			System.out.println("Correcto anyadirPersonaje 3");
		else
			System.out.println("Error anyadirPersonaje 3");
		
		if(pruebagestor.anyadirZona(zonas[2]))
			System.out.println("Correcto anyadirZona 1");
		else
			System.out.println("Error anyadirZona 1");
		if(pruebagestor.anyadirZona(zonas[2]))
			System.out.println("Error anyadirZona 2");
		else
			System.out.println("Correcto anyadirZona 2");
		if(pruebagestor.anyadirZona(zonas[5]))
			System.out.println("Correcto anyadirZona 3");
		else
			System.out.println("Error anyadirZona 3");
		
		
		if(pruebagestor.anyadirMision(misiones[2]))
			System.out.println("Correcto anyadirMision 1");
		else
			System.out.println("Error anyadirMision 1");
		if(pruebagestor.anyadirMision(misiones[2]))
			System.out.println("Error anyadirMision 2");
		else
			System.out.println("Correcto anyadirMision 2");
		if(pruebagestor.anyadirMision(misiones[5]))
			System.out.println("Correcto anyadirMision 3");
		else
			System.out.println("Error anyadirMision 3");
		
		teclado.nextLine();
		
		//Visualizaci�n datos
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
		
		
		if(pruebagestor.eliminarHabilidad(habilidades[2]))
			System.out.println("Correcto eliminarHabilidad 1");
		else
			System.out.println("Error eliminarHabilidad 1");
		
		if(pruebagestor.eliminarHabilidad(habilidades[2]))
			System.out.println("Error eliminarHabilidad 2");
		else
			System.out.println("Correcto eliminarHabilidad 2");
		
		if(pruebagestor.eliminarHabilidad(habilidades[6]))
			System.out.println("Error eliminarHabilidad 3");
		else
			System.out.println("Correcto eliminarHabilidad 3");
		
		
		if(pruebagestor.eliminarItem(items[2]))
			System.out.println("Correcto eliminarItem 1");
		else
			System.out.println("Error eliminarItem 1");
		if(pruebagestor.eliminarItem(items[2]))
			System.out.println("Error eliminarItem 2");
		else
			System.out.println("Correcto eliminarItem 2");
		if(pruebagestor.eliminarItem(items[15]))
			System.out.println("Error eliminarItem 3");
		else
			System.out.println("Correct eliminarItem 3");
		
		
		if(pruebagestor.eliminarPersonaje(personajes[2]))
			System.out.println("Correcto eliminarPersonaje 1");
		else
			System.out.println("Error eliminarPersonaje 1");
		if(pruebagestor.eliminarPersonaje(personajes[2]))
			System.out.println("Error eliminarPersonaje 2");
		else
			System.out.println("Correcto eliminarPersonaje 2");
		if(pruebagestor.eliminarPersonaje(personajes[3]))
			System.out.println("Error eliminarPersonaje 3");
		else
			System.out.println("Correcto eliminarPersonaje 3");
		
		if(pruebagestor.eliminarZona(zonas[2]))
			System.out.println("Correcto eliminarZona 1");
		else
			System.out.println("Error eliminarZona 1");
		if(pruebagestor.eliminarZona(zonas[2]))
			System.out.println("Error eliminarZona 2");
		else
			System.out.println("Correcto eliminarZona 2");
		if(pruebagestor.eliminarZona(zonas[3]))
			System.out.println("Error eliminarZona 3");
		else
			System.out.println("Correcto eliminarZona 3");
		
		
		if(pruebagestor.eliminarMision(misiones[2]))
			System.out.println("Correcto eliminarMision 1");
		else
			System.out.println("Error eliminarMision 1");
		if(pruebagestor.eliminarMision(misiones[2]))
			System.out.println("Error eliminarMision 2");
		else
			System.out.println("Correcto eliminarMision 2");
		if(pruebagestor.eliminarMision(misiones[4]))
			System.out.println("Error eliminarMision 3");
		else
			System.out.println("Correcto eliminarMision 3");
		
		teclado.nextLine();
		
		//visualizar
		System.out.println("-------------HABILIDADES 1-----------");
		pruebagestor.mostrarHabilidades();
		teclado.nextLine();
		System.out.println("-------------ITEMS 1-----------");
		pruebagestor.mostrarItems();
		teclado.nextLine();
		System.out.println("-------------PERSONAJES 1-----------");
		pruebagestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-------------ZONAS 1-----------");
		pruebagestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-------------MISIONES 1-----------");
		pruebagestor.mostrarMisiones();
		teclado.nextLine();
	}

}

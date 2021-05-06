import java.util.Scanner;

public class main_herencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//CREACI�N ARRAYS AUXILIARES
		Habilidad habilidades[] = new Habilidad[51];
		Item items[] = new Item[61];
		Personaje personajes[] = new Personaje[51];
		Zona zonas[] = new Zona[51];
		Mision misiones[] = new Mision[51];
		
		
		Gestor gestor = new Gestor();
		
		
		
		//HABILIDADES
		for(int i=0; i<51;i++)
			habilidades[i] = new Habilidad("Habilidad"+ i,i+1,i+1,"tipo" + 1);
		
		
		

		Habilidad auxhabilidad[] = new Habilidad[5];
		auxhabilidad[0] = habilidades[3];
		auxhabilidad[1] = habilidades[6];
		auxhabilidad[2] = habilidades[9];
		
		gestor.anyadirHabilidad(habilidades[0]);
		gestor.anyadirHabilidad(habilidades[1]);
		gestor.anyadirHabilidad(habilidades[3]);
		gestor.anyadirHabilidad(habilidades[5]);
		gestor.anyadirHabilidad(habilidades[4]);
		gestor.anyadirHabilidad(habilidades[6]);
		gestor.anyadirHabilidad(habilidades[9]);
		
		//ITEM
		for(int i=0;i<20;i++)
			items[i] = new Armadura("Armadura " + i, i, auxhabilidad, i, i);
		for(int i=20;i<40;i++)
			items[i] = new Consumible("Consumible " + i, i, auxhabilidad, i);
		for(int i=40;i<61;i++)
			items[i] = new Arma("Arma " + i, i, auxhabilidad, i, i);
		Item auxitems []  = new Item[5];
		auxitems[0] = items[0];
		auxitems[1] = items[14];
		auxitems[2] = items[27];
		
		
		gestor.anyadirItem(items[0]);
		gestor.anyadirItem(items[1]);
		gestor.anyadirItem(items[2]);
		gestor.anyadirItem(items[14]);
		gestor.anyadirItem(items[27]);
		

		
		//Personaje
		for(int i=0;i<51;i++)
		{
			personajes[i] = new Personaje("nombre "+i, "clase "+i, 200,200,200,200,0,auxhabilidad,auxitems, false, false );
		}
		
		Personaje[] auxpersonajes = new Personaje[10];
		auxpersonajes[0] = personajes[0];
		auxpersonajes[1] = personajes[8];
		auxpersonajes[2] = personajes[9];
		
		gestor.anyadirPersonaje(personajes[0]);
		gestor.anyadirPersonaje(personajes[1]);
		gestor.anyadirPersonaje(personajes[2]);
		gestor.anyadirPersonaje(personajes[8]);
		gestor.anyadirPersonaje(personajes[9]);
	
		//Zona
		for(int i=0;i<51;i++)
		{
			zonas[i] = new Zona("zona "+i, i,auxpersonajes);
		}
		
		
		gestor.anyadirZona(zonas[1]);
		
		
		//Misiones
		for(int i=0;i<51;i++)
		{
			misiones[i] = new Mision("nombre "+i, i, personajes[i], zonas[i], items[i], i);
		}
		

		
		
		
		
		
		
		
		
	//asigHabItem
		if(gestor.asigHabItem(habilidades[3],items[0]))
			System.out.println("Error asigHabItem 1");
		else
			System.out.println("Correcto asigHabItem 1");
		
		if(gestor.asigHabItem(habilidades[5],items[1]))
			System.out.println("Correcto asigHabItem 1");
		else
			System.out.println("Error asigHabItem 1");
		
		teclado.nextLine();
		System.out.println("comprobamos el item");
		gestor.mostrarItems();
		teclado.nextLine();
		//eliminarHabItem
		if(gestor.eliminarHabItem(habilidades[4],items[1]))
			System.out.println("Error eliminarHabItem 1");
		else
			System.out.println("Correcto eliminarHabItem 1");
		
		if(gestor.eliminarHabItem(habilidades[5],items[1]))
			System.out.println("Correcto eliminarHabItem 2");
		else
			System.out.println("Error eliminarHabItem 2");
		
		if(gestor.eliminarHabItem(habilidades[5],items[1]))
			System.out.println("Error eliminarHabItem 3");
		else
			System.out.println("Correcto eliminarHabItem 3");
		
		teclado.nextLine();
		System.out.println("comprobamos el item");
		gestor.mostrarItems();
		teclado.nextLine();
		
		
		if(gestor.modEquipo(personajes[1],items[0],true)>0)
			System.out.println("Error modEquipo A 1");
		else
			System.out.println("Correcto modEquipo A 1");
		
		if(gestor.modEquipo(personajes[1],items[2],true)>0)
			System.out.println("Correcto modEquipo A 2");
		else
			System.out.println("Error modEquipo A 2");
		
		
		teclado.nextLine();
		System.out.println("comprobamos el pj");
		gestor.mostrarPersonajes();
		teclado.nextLine();
		
		if(gestor.modEquipo(personajes[1],items[1],false)>0)
			System.out.println("Error modEquipo E 1");
		else
			System.out.println("Correcto modEquipo E 1");
		
		if(gestor.modEquipo(personajes[1],items[2],false)>0)
			System.out.println("Correcto modEquipo E 2");
		else
			System.out.println("Error modEquipo E 2");
		
		if(gestor.modEquipo(personajes[1],items[2],false)>0)
			System.out.println("Error modEquipo E 3");
		else
			System.out.println("Correcto modEquipo E 3");
		
		teclado.nextLine();
		System.out.println("comprobamos el pj");
		gestor.mostrarPersonajes();
		teclado.nextLine();
		
		
		
		//ModHabPer
		if(gestor.modHabPer(personajes[1],habilidades[3],true)>0)
			System.out.println("Error modHabPer A 1");
		else
			System.out.println("Correcto modHabPer A 1");
		
		if(gestor.modHabPer(personajes[1],habilidades[1],true)>0)
			System.out.println("Correcto modHabPer A 2");
		else
			System.out.println("Error modHabPer A 2");
		
		
		teclado.nextLine();
		System.out.println("comprobamos el pj");
		gestor.mostrarPersonajes();
		teclado.nextLine();
		
		if(gestor.modHabPer(personajes[1],habilidades[0],false)>0)
			System.out.println("Error modHabPer E 1");
		else
			System.out.println("Correcto modHabPer E 1");
		
		if(gestor.modHabPer(personajes[1],habilidades[3],false)>0)
			System.out.println("Correcto modHabPer E 2");
		else
			System.out.println("Error modHabPer E 2");
		
		if(gestor.modHabPer(personajes[1],habilidades[3],false)>0)
			System.out.println("Error modHabPer E 3");
		else
			System.out.println("Correcto modHabPer E 3");
		
		teclado.nextLine();
		System.out.println("comprobamos el pj");
		gestor.mostrarPersonajes();
		teclado.nextLine();
		
		
		//addPersonajeAZona
		if(gestor.addPersonajeAZona(personajes[8],zonas[1])>0)
			System.out.println("Error addPersonajeAZona 1");
		else
			System.out.println("Correcto addPersonajeAZona 1");
		
		if(gestor.addPersonajeAZona(personajes[1],zonas[1])>0)
			System.out.println("Correcto addPersonajeAZona 2");
		else
			System.out.println("Error addPersonajeAZona 2");
		
		teclado.nextLine();
		System.out.println("comprobamos la zona");
		gestor.mostrarZonas();
		teclado.nextLine();
		
		//eliminarPersonajeAZona
		if(gestor.eliminarPersonajeAZona(personajes[2],zonas[1])>0)
			System.out.println("Error eliminarPersonajeAZona 1");
		else
			System.out.println("Correcto eliminarPersonajeAZona 1");
		
		if(gestor.eliminarPersonajeAZona(personajes[0],zonas[1])>0)
			System.out.println("Correcto eliminarPersonajeAZona 2");
		else
			System.out.println("Error eliminarPersonajeAZona 2");
		if(gestor.eliminarPersonajeAZona(personajes[0],zonas[1])>0)
			System.out.println("Error eliminarPersonajeAZona 3");
		else
			System.out.println("Correcto eliminarPersonajeAZona 3");
		
		
		
		
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		Gestor gestor = new Gestor();
		gestor.mostrarHabilidades();
		gestor.mostrarPersonajes();
		
		Habilidad hab = new Habilidad("h1",3,3,"curacion");
		Habilidad habi2 = new Habilidad("h2",3,4,"veneno");
		Habilidad habi3 = new Habilidad("h3",20,30,"fuego");
		
		gestor.anyadirHabilidad(hab);
		gestor.anyadirHabilidad(habi2);
		gestor.anyadirHabilidad(habi3);
		
		Habilidad hab2[] = new Habilidad[10];
		Habilidad hab1[] = new Habilidad[10];
		Habilidad hab3[] = new Habilidad[10];
		hab1[0] = hab;
		hab2[0] = hab;
		hab2[1] = habi2;
		hab3[0] = habi3;
		
		Armadura arm1 = new Armadura("Armadura 1",5,hab1,20,5);
		Armadura arm2 = new Armadura("Armadura 2",5,hab1,20,5);
		Consumible cons1 = new Consumible("Pocion Curacion",10,hab1,5);
		Arma arma1 = new Arma("Espada 1",15,hab3,25,2);
		

		Item equipo[] = new Item[10];
		gestor.anyadirItem(arm1);
		gestor.anyadirItem(cons1);
		gestor.anyadirItem(arma1);
		equipo[0] = arm1;
		
		Personaje per1 = new Personaje("Joan","guerrero",100,100,80,50,20,hab2,equipo,true,true);
		Personaje per2 = new Personaje("Pepito","guerrero",100,100,80,50,20,hab1,equipo,true,true);
		gestor.anyadirPersonaje(per1);
		
		gestor.guardarEnFichero();
		
		
		
		
		
		/*
		Habilidad hab2[] = new Habilidad[10];
		Habilidad hab1[] = new Habilidad[10];
		Habilidad hab3[] = new Habilidad[10];
		hab1[0] = hab;
		hab2[0] = hab;
		hab2[1] = habi2;
		hab3[0] = habi3;
		
		Armadura arm1 = new Armadura("Armadura 1",5,hab1,20,5);
		Armadura arm2 = new Armadura("Armadura 2",5,hab1,20,5);
		Consumible cons1 = new Consumible("Pocion Curacion",10,hab1,5);
		Arma arma1 = new Arma("Espada 1",15,hab3,25,2);
		
		Item equipo[] = new Item[10];
		gestor.anyadirItem(arm1);
		gestor.anyadirItem(cons1);
		gestor.anyadirItem(arma1);
		equipo[0] = arm1;
		
		
		
		//gestor.mostrarHabilidades();
		/*
		gestor.anyadirItem(arm1);
		gestor.anyadirItem(cons1);
		gestor.anyadirItem(arma1);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Habilidad hab2[] = new Habilidad[10];
		Habilidad hab1[] = new Habilidad[10];
		Habilidad hab3[] = new Habilidad[10];
		hab1[0] = hab;
		hab2[0] = hab;
		hab2[1] = habi2;
		hab3[0] = habi3;
		//Item it1 = new Item("espada",3,"arma",2,3,4,hab1);
		//Item it2 = new Item("escudo",1,"armadura",4,6,8,hab2);
		Armadura arm1 = new Armadura("Armadura 1",5,hab1,20,5);
		Armadura arm2 = new Armadura("Armadura 2",5,hab1,20,5);
		Consumible cons1 = new Consumible("Pocion Curacion",10,hab1,5);
		Arma arma1 = new Arma("Espada 1",15,hab3,25,2);
		Item equipo[] = new Item[10];
		gestor.anyadirItem(arm1);
		gestor.anyadirItem(cons1);
		gestor.anyadirItem(arma1);
		equipo[0] = arm1;
		
		equipo[1] = arma1;
		
		
		Personaje perzona[] = new Personaje[10];
		perzona[0] = per1;
		
		Zona z1 = new Zona("zona prueba",2,perzona);
		gestor.anyadirZona(z1);
		
		
		
		
		/*
		gestor.anyadirItem(it1);
		gestor.anyadirItem(it2);
		Item it3[] = new Item[10];
		it3[0] = it1;
		
		Personaje per1 = new Personaje("Joan","guerrero",100,100,80,20,50,hab2,it3,true,true);
		Personaje per2 = new Personaje("Pepe","guerrero",60,70,50,40,30,hab2,it3,true,true);
		Personaje per5 = new Personaje("Mario","curandero",80,90,60,70,150,hab2,it3,false,false); 
		gestor.anyadirPersonaje(per1);
		gestor.anyadirPersonaje(per2);
		gestor.anyadirPersonaje(per5);
		//gestor.anyadirPersonaje();		
		
		//gestor.anyadirZona();
		Personaje per3[] = new Personaje[10];
		Personaje per4[] = new Personaje[10];
		
		per3[0] = per1;
		
		per4[0] = per2;
		Zona z1 = new Zona("Zona 1",2,per3);
		Zona z2 = new Zona("Zona 2",3,per4);
		gestor.anyadirZona(z1);
		//gestor.anyadirZona(z2);
		Mision m1 = new Mision("Mision 1",5,per1,z1,it1,100);
		Mision m2 = new Mision("Mision 2",7,per2,z2,it2,200);
		gestor.anyadirMision(m1);
		gestor.menu();
		*/
		
		
		
		
		
		
		/*
		gestor.addPersonajeAZona(per2, z1);
		gestor.mostrarZonas();
		teclado.nextLine();
		System.out.println("-----------------Prueba con el eliminar-------------");
		gestor.eliminarPersonajeAZona(per1, z1);
		gestor.mostrarZonas();
		*/
		
		/*
		gestor.modHabPer(per1, habi2, true);
		gestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-----------------Prueba con el false-------------");
		gestor.modHabPer(per1, hab, false);
		gestor.mostrarPersonajes();
		*/
		/*
		gestor.modEquipo(per1, it2, true);
		gestor.mostrarPersonajes();
		teclado.nextLine();
		System.out.println("-----------------Prueba con el false-------------");
		gestor.modEquipo(per1, it1, false);
		gestor.mostrarPersonajes();
		*/
		
		/*
		gestor.asigHabItem(hab, it2);
		gestor.mostrarItems();
		teclado.nextLine();
		gestor.eliminarHabItem(habi2, it2);
		gestor.mostrarItems();
		
		
		
		//gestor.menu();
		//gestor.eliminarHabilidad(habi2);
		//gestor.eliminarItem(it1);
		//gestor.mostrarHab();
		//
		//gestor.mostrarItems();
		//gestor.eliminzarZona(z1);
		//gestor.mostrarZonas();
		//gestor.eliminarPersonaje(per1);
		//gestor.mostrarPersonajes();
		
		gestor.anyadirMisiones(m1);
		gestor.anyadirMisiones(m2);
		gestor.eliminarMision(m1);
		gestor.mostrarMisiones();
		
		//gestor.asigHabItem(habi2,it1);
		//gestor.eliminarHabItem();
		//gestor.menu();
		*/
		
		
		
		
	}

}


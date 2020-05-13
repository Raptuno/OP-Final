package fantasy;
import java.util.*;

/**
 * @author Alejandro Nieto (Gen. de plantillas Java)
 * @author Alfonso Sánchez (Prog. en Java)
 * @version 1.0
 * @created 06-may.-2020 07:19:20 a. m.
 */
public class Hada {
	
	Random r=new Random();
	public String[] fairyNames= {
			"Celestia",
			"Asteria",
			"Isis",
			"Faye",
			"Ariel",
			"Aerwyna",
			"Tania",
			"Tatiana",
			"Xylia"}; //Algunos nombres fueron tomados de Terraria (NPC Dríada)
	Vector<String> usedNames=new Vector<String>();
	
	public String Nombre;
	public Villa Villa;
	public Heroe Heroe;
	Mago villano=new Mago();
	
	
	public Hada(){
		
	}
	
	public String getName() {
		return this.Nombre;
	}
	
	public void setName(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void namer(String[] fairyNames) {
		for(int i=0; i<fairyNames.length;) {
			if (usedNames.equals(fairyNames[i])) {
				i++;
				setName(fairyNames[i+1]);
			} else {
				setName(fairyNames[i]);
			}
		}
	}
	
	public void captura(){ //Ser capturada
		villano.setBolso(villano.getBolso()+1);
	}

	public void salve(){ //Ser salvada
		Heroe.Salvar();
		namer(fairyNames);
		System.out.println(Nombre+": ¡Gracias, forastero!");
	}

	public void Volar(){
		for(int i=0; i<2; i++) {
			
		}
	}
}//end Hada
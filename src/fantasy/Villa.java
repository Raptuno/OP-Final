package fantasy;


/**
 * @author gordi (Alejandro Nieto)
 * @author Raptuno (Alfonso S�nchez)
 * @version 1.0
 * @created 06-may.-2020 07:21:03 a. m.
 */
public class Villa {

	public int Hadas=0;
	public int Casas=Hadas;
	Heroe Heroe=new Heroe();
	
	//Inicia Declaración Getters/Setters
	public int getCasas() {
		return this.Casas;
	}
	public void setCasas(int Casas) {
		this.Casas=Casas;
	}
	public int getHadas() {
		return this.Hadas;
	}
	public void setHadas(int Hadas) {
		this.Hadas=Hadas;
	}
	//Termina Declaración Getters/Setters
	
	public Villa(){

	}

	public void minusPopulat(){ //Por cada hada que robe el villano la aldea disminuye
		
	}

	public void lifePlus10(){ //+10 de vida para el heroe por casa
		if (Hadas%10==0) {
			Heroe.setVida(Heroe.getVida()+10);
		}
	}

	public void plusPopulat(){ //La villa aumenta por cada hada rescatada
		
	}
}//end Villa
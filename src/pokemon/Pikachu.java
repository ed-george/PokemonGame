package pokemon;

import exceptions.PokemonsMaxAttacks;
import attacks.Attack;
import attacks.ThunderShock;


public class Pikachu extends Pokemon {

	public Pikachu(String name, int hp, int def, int spc_def,
			int spd, int level, int exp) {
		super(name, hp, def, spc_def, spd, level, exp);
	
	//Pokemon Specific
	this.setBASE_EXP(78); 
	this.setWEAKNESS(Type.FIGHTING);
	this.setType(Type.ELECTRIC);
	this.addNewAttack(new ThunderShock());
	
		
	}

		
	

}



public class Pikachu extends Pokemon {

	Pikachu(String name, int hp, int atk, int def, int spc_atk, int spc_def,
			int spd, int level, int exp) {
		super(name, hp, atk, def, spc_atk, spc_def, spd, level, exp);
	
		//Pokemon Specific
	this.setBASE_EXP(78); 
	this.setWEAKNESS(Type.FIGHTING);
	this.setType(Type.ELECTRIC);
			
	
	}

		
	

}

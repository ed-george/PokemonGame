package pokemon;

import java.util.ArrayList;

import exceptions.PokemonsMaxAttacks;

import attacks.Attack;

import other.Utils;

/** This class is the Base class of the Pokemon object and contains the key methods used by each Pokemon object
 * 
 * @author <a href="http://edgeorgedev.co.uk">Ed George</a>
 * @version 1.0.0
 */

public class Pokemon {
	/**
	 * @serial Pokemon's attack stat
	 */
	private int ATK;
	/**
	 * @serial Pokemon's defence stat
	 */
	private int DEF;
	/**
	 * @serial Pokemon's special attack stat
	 */
	private int SPC_ATK;
	/**
	 * @serial Pokemon's special defence stat
	 */
	private int SPC_DEF;
	/**
	 * @serial Pokemon's speed stat
	 */
	private int SPD;
	
	/**
	 * @serial Pokemon's name
	 */
	private String NAME;

	/**
	 * @serial Pokemon's level
	 */
	private int LEVEL;
	/**
	 * @serial Pokemon's experience (total)
	 */
	private int EXP;
	/**
	 * @serial Pokemon's experience till next level
	 */
	private int NEXT_LEVEL;
	
	/**
	 * @serial Pokemon's maximum hp
	 */
	private int MAXHP;
	
	/**
	 * @serial Pokemon's current hp
	 */
	private int HP;
	
	/**
	 * @serial Pokemon's weakness
	 */
	private Type WEAKNESS = Type.VOID;
	
	/**
	 * @serial Pokemon's type
	 */
	private Type TYPE = Type.VOID;
	
	/**
	 * @serial Pokemon's base EXP
	 */
	private int BASE_EXP = 75;
	//as a guideline

	/**
	 * @serial Pokemon's available attacks
	 */
	private ArrayList<Attack> ATTACKS;
	
	/**
	 * @serial Pokemon's max number of attacks
	 */
	private int MAX_ATTACKS;
	
	
	/**
	 * @serial Is Pokemon Poisioned?
	 */
	private boolean Poisoned = false;
	/**
	 * @serial Is Pokemon Burnt?
	 */
	private boolean Burned = false;
	/**
	 * @serial Is Pokemon Paralized?
	 */
	private boolean Paralized = false;
	/**
	 * @serial Is Pokemon Confused?
	 */
	private boolean Confused = false;
	/**
	 * @serial Is Pokemon Asleep?
	 */
	private boolean Asleep = false;
	

/** Each new Pokemon object requires setting up it's stats through this constructor
 * 
 * @param name Name of Pokemon
 * @param hp HP of Pokemon
 * @param atk Attack Stat
 * @param def Defence Stat
 * @param spc_atk Special Attack Stat
 * @param spc_def Special Defence Stat
 * @param spd Speed Stat
 * @param level Level Stat
 * @param exp Experience
 * @throws PokemonsMaxAttacks 
 */
	public Pokemon (String name, int hp, Attack atk, int def, int spc_atk, int spc_def, int spd, int level, int exp) {

		ATTACKS = new ArrayList<Attack>();
		
		addNewAttack(atk);
		setDEF(def);
		setSPC_ATK(spc_atk);
		setSPC_DEF(spc_def);
		setSPD(spd);

		setMAXHP(hp);

		setNAME(name);
		setLEVEL(level);
		setEXP(exp);
		setNEXT_LEVEL_EXP();
		
		setMAX_ATTACKS(5);
		
	}
	
	/**
	 * Constructor for predefined Pokemon, can set their starting attacks within their own class
	 * @param name
	 * @param hp
	 * @param def
	 * @param spc_def
	 * @param spd
	 * @param level
	 * @param exp
	 * @throws PokemonsMaxAttacks
	 */
	public Pokemon (String name, int hp, int def, int spc_def, int spd, int level, int exp) {

		ATTACKS = new ArrayList<Attack>();
		
		setDEF(def);
		setSPC_DEF(spc_def);
		setSPD(spd);

		setMAXHP(hp);

		setNAME(name);
		setLEVEL(level);
		setEXP(exp);
		setNEXT_LEVEL_EXP();
		
		setMAX_ATTACKS(5);
		
	}


/**
 * Sets the Level of the Pokemon object and checks if it is valid
 * @param level New Level of Pokemon
 */
	private void setLEVEL(int level) {
		
		if(level > 0 && level <= 100){
			LEVEL = level;
			return;
		}else{
			LEVEL = 5;
		}
	}


/**
 * Set EXP of Pokemon Object
 * @param exp New EXP to set
 */
	private void setEXP(int exp) {
		if(exp >= 0){
			EXP = exp;
			return;
		}
		EXP = 0;
	}

/**
 * Sets the name of the Pokemon Object
 * @param name New name of Pokemon Object
 */
	private void setNAME(String name) {
		//should check for valid name
		//alphanumeric chars

		if(name.length() == 0){
			NAME = "???";
		}else{
			NAME = name;
		}

	}


/**
 * Get Attack Value of Pokemon Object
 * @return Attack Value 
 */
	public int getATK() {
		return ATK;
	}


/**
 * Set Pokemon Object Attack Value
 * @param aTK New attack value
 */
	public void setATK(int aTK) {
		if (aTK > 0){
			ATK = aTK; }else{
				ATK = 1;
			}

	}


	/**
	 * Get Defence Value of Pokemon Object
	 * @return Defence Value 
	 */
	public int getDEF() {
		return DEF;
	}


	/**
	 * Set Pokemon Object Defence Value
	 * @param dEF New attack value
	 */
	public void setDEF(int dEF) {
		if (dEF > 0){
			DEF = dEF; }else{
				DEF = 1;
			}
	}

	/**
	 * Get Special Attack Value of Pokemon Object
	 * @return Special Attack Value 
	 */
	public int getSPC_ATK() {
		return SPC_ATK;
	}

	/**
	 * Set Pokemon Object Special Attack Value
	 * @param sPC_ATK New special attack value
	 */
	public void setSPC_ATK(int sPC_ATK) {
		if (sPC_ATK > 0){
			SPC_ATK = sPC_ATK; }else{
				SPC_ATK = 1;
			}
	}

	/**
	 * Get Special Defence Value of Pokemon Object
	 * @return Special Defence Value 
	 */
	public int getSPC_DEF() {
		return SPC_DEF;
	}

	/**
	 * Set Pokemon Object Special Defence Value
	 * @param sPC_DEF New special defence value
	 */
	public void setSPC_DEF(int sPC_DEF) {
		if (sPC_DEF > 0){
			SPC_DEF = sPC_DEF; }else{
				SPC_DEF = 1;
			}

	}

/**
 * Get Speed Stat from Pokemon Object
 * @return Speed Stat
 */
	public int getSPD() {
		return SPD;
	}

/**
 * Set Speed Stat of Pokemon Object
 * @param sPD New Speed
 */
	public void setSPD(int sPD) {
		SPD = sPD;
	}

/**
 * Get Name of Pokemon Object
 * @return Name of Pokemon
 */
	public String getNAME() {
		return NAME;
	}

/**
 * Get Level of Pokemon Object
 * @return Level of Pokemon
 */
	public int getLEVEL() {
		return LEVEL;
	}

	/**
	 * Make Pokemon grow a single Level
	 */
	public void growLevel() {
		
		LEVEL++;
		System.out.println(getNAME() + " grew to level " + getLEVEL() + "!");

	}

/**
 * Get EXP of Pokemon Object
 * @return Total EXP Points
 */
	public int getEXP() {
		return EXP;
	}

	/**
	 * Add aditional EXP to Pokemon
	 * @param eXP Experience to add on to total EXP
	 */
	public void addEXP(int eXP) {
		EXP += eXP;
		while (EXP >= NEXT_LEVEL && LEVEL < 100){

			growLevel();

			setNEXT_LEVEL_EXP();

			returnInfo();
		}
	}

/**
 * Get the amount of experience required to grow to next level. This is determined by {@code setNEXT_LEVEL_EXP()}
 * @return Experience needed to {@code growLevel()}
 */
	public int getNEXT_LEVEL() {
		return NEXT_LEVEL;
	}

/**
 * Work out the experience required to {@code growLevel()} based on current {@code EXP}.
 * <br>
 * The formula is a cubic function and can be changed in future versions to vary the rate of growth for Pokemon Objects.<br><br>
 * This is described by the {@code exp_nxt} variable within the function. 
 */
	public void setNEXT_LEVEL_EXP() {
		//double exp_nxt = ((5.0/6.0) * Math.pow(LEVEL, 3)) - (15.0 * Math.pow(LEVEL, 2)) + (100.0 *  LEVEL) - 140.0;
		
		
		double exp_nxt = ((5.0 * Math.pow(LEVEL, 3)) / 4.0);
		
		NEXT_LEVEL = (int) Math.ceil(exp_nxt);
	}

/**
 * Get Current HP of Pokemon Object
 * @return Current HP
 */
	public int getHP() {
		return HP;
	}

/**
 * Set HP of Pokemon Object <br>
 * If it is set higher than the max possible value of HP ({@code MAXHP}) then the maximum value is used
 * @param hP New HP value
 */
	public void setHP(int hP) {
		if(hP <= MAXHP){
			HP = MAXHP;
			return;
		}else if(hP <= 0){

			HP = hP;
			return;
		}else{
			HP = 0; //Why is this even here?! >:( 
			return;
		}
	}

	/**
	 * Has the Pokemon fainted (i.e. has 0 HP)
	 * @return false if HP > 0 and true if Pokemon has 0 HP
	 */
	public boolean isFainted(){

		if (HP > 0)
			return false;

		return true;
	}

	/**
	 * Get basic stats about Pokemon
	 */
	public void returnInfo(){

		Utils.LINES();
		System.out.println(getNAME() + " LVL: " + getLEVEL() + "\t HP: " + getHP());
		System.out.println("Attack: " + getATK() + "\t Special Attack: " + getSPC_ATK());
		System.out.println("Defense: " + getDEF() + "\t Special Defense: " + getSPC_DEF());
		System.out.println("EXP: " + getEXP() + "\t NXT LVL: " + getNEXT_LEVEL());
		Utils.LINES();
	}

/**
 * Check if Pokemon Object is Poisioned
 * @return true or false
 */
	public boolean isPoisoned() {
		return Poisoned;
	}

/**
 * Set Pokemon to be Poisoned or remove Poison from Pokemon
 * @param poisoned true or false
 */
	public void setPoisoned(boolean poisoned) {
		Poisoned = poisoned;
		if (poisoned){
			System.out.println(NAME + " was poisoned!");
			return;
		}
		System.out.println(NAME + " is no longer poisoned!");
		return;
	}

	/**
	 * Check if Pokemon Object is Burnt
	 * @return true or false
	 */
	public boolean isBurned() {
		return Burned;
	}

	/**
	 * Set Pokemon to be Burnt or remove Burn from Pokemon
	 * @param burned true or false
	 */
	public void setBurned(boolean burned) {
		Burned = burned;
		if (burned){
			System.out.println(NAME + " was badly burned!");
			return;
		}
		System.out.println(NAME + " is no longer burned!");
		return;
	}

	/**
	 * Check if Pokemon Object is Paralized
	 * @return true or false
	 */
	public boolean isParalized() {
		return Paralized;
	}

	/**
	 * Set Pokemon to be Paralysed or remove Paralysis from Pokemon
	 * @param paralized true or false
	 */
	public void setParalized(boolean paralized) {
		Paralized = paralized;
		if (paralized){
			System.out.println(NAME + " was paralysed, it may be unable to attack!");
			return;
		}
		System.out.println(NAME + " is no longer paralysed!");
		return;
	}

	/**
	 * Check if Pokemon Object is Confused
	 * @return true or false
	 */
	public boolean isConfused() {
		return Confused;
	}

	/**
	 * Set Pokemon to be Confused or remove Confusion from Pokemon
	 * @param confused true or false
	 */
	public void setConfused(boolean confused) {
		Confused = confused;
		if (confused){
			System.out.println(NAME + " became confused!");
			return;
		}
		System.out.println(NAME + " snapped out of confusion!");
		return;
	}

	/**
	 * Check if Pokemon Object is Asleep
	 * @return true or false
	 */

	public boolean isAsleep() {
		return Asleep;
	}

	/**
	 * Set Pokemon to be Asleep or remove Pokemon from Sleep
	 * @param asleep true or false
	 */

	public void setAsleep(boolean asleep) {
		Asleep = asleep;
		if (asleep){
			System.out.println(NAME + " fell asleep!");
			return;
		}
		System.out.println(NAME + " woke up!");
		return;
	}

	/**
	 * Gets maximum HP value for Pokemon Object
	 * @return {@code MAXHP}
	 */
	public int getMAXHP(){
		return MAXHP;
	}
	
	/**
	 * Sets {@code MAXHP}
	 * @param mAXHP New value for  {@code MAXHP}
	 */
	public void setMAXHP(int mAXHP) {
		if(HP == MAXHP){
		MAXHP = mAXHP;
		HP = mAXHP;
		}else{
		MAXHP = mAXHP;
		}
	}

	/**
	 * Gets Base EXP of Pokemon Object
	 * @return {@code BASE_EXP}
	 */
	public int getBASE_EXP() {
		return BASE_EXP;
	}

	/**
	 * Sets the Base EXP for a Pokemon Object
	 * @param bexp New value for {@code BASE_EXP}
	 */
	public void setBASE_EXP(int bexp) {
		if(bexp > 0){
			BASE_EXP = bexp;
		}else{
			BASE_EXP = 1;
		}
	}

	/**
	 * Get Weakness of Pokemon
	 * @return {@link Type} Weakness
	 */
	public Type getWEAKNESS() {
		return WEAKNESS;
	}

	/**
	 * Get Type of Pokemon
	 * @return {@link Type} 
	 */
	public Type getTYPE(){
		return TYPE;
	}

	/**
	 * Set Weakness of Pokemon
	 * @param wEAKNESS Weakness {@link Type} of Pokemon
	 */
	protected void setWEAKNESS(Type wEAKNESS) {
		WEAKNESS = wEAKNESS;
	}
	
	/**
	 * Set Type of Pokemon
	 * @param type {@link Type} of Pokemon
	 */
	protected void setType(Type type) {
		TYPE = type;
		
	}

	/**
	 * Gets all attacks a Pokemon can perform
	 * @return {@link ArrayList<Attack>} of {@link Attack}
	 */
	public ArrayList<Attack> getATTACKS() {
		return ATTACKS;
	}

	/**
	 * Sets all attacks a Pokemon can perform
	 * @param atts ArrayList of {@link Attack}
	 */
	public void setATTACKS(ArrayList<Attack> atts) {
		ATTACKS = atts;
	}
	
	/**
	 * Adds a new attack to the Pokemon
	 * @param att {@link Attack}
	 * @return true if attack is added
	 * @throws PokemonsMaxAttacks 
	 */
	public boolean addNewAttack(Attack att) {
		if (ATTACKS.size() < 5)
			return ATTACKS.add(att);
		return false;
	}

	/**
	 * Removes the first occurrence of the attack
	 * @param att {@link Attack} 
	 * @return True if the attack is successfully removed
	 */
	public boolean removeAttack(Attack att) {
		return ATTACKS.remove(att);
	}
	
	public int getMAX_ATTACKS() {
		return MAX_ATTACKS;
	}


	public void setMAX_ATTACKS(int mAX_ATTACKS) {
		MAX_ATTACKS = mAX_ATTACKS;
	}

}	

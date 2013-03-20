package attacks;

import pokemon.Pokemon;
import pokemon.Type;

public class Scratch implements Attack {

	private int MAXPP;
	private int PP;
	private int DAMAGE;
	private int MAX_ACC;
	private int ACC;

	private final String ATTACK_NAME = "Scratch";
	private final Type TYPE = Type.NORMAL;

	public Scratch() {
		setMAX_PP(56);
		setPP(35);
		setATTACK_DAMAGE(40);
		setMAX_ATTACK_ACCURACY(100);
		setATTACK_ACCURACY(100);
	}

	@Override
	public void ATTACK_METHOD(Pokemon you, Pokemon enemy) {
		
	}

	@Override
	public String getATTACK_NAME() {
		return ATTACK_NAME;
	}

	@Override
	public int getATTACK_ACCURACY() {
		return ACC;
	}

	@Override
	public void setATTACK_ACCURACY(int aac) {
		ACC = aac;
	}

	@Override
	public int getMAX_ATTACK_ACCURACY() {
		return MAX_ACC;
	}

	@Override
	public void setMAX_ATTACK_ACCURACY(int aac) {
		MAX_ACC = aac;
	}

	@Override
	public int getATTACK_DAMAGE() {
		return DAMAGE;
	}

	@Override
	public int getPP() {
		return PP;
	}

	@Override
	public void setPP(int pp) {
		PP = pp;
	}

	@Override
	public void setMAX_PP(int pp) {
		MAXPP = pp;
	}

	@Override
	public int getMAX_PP() {
		return MAXPP;
	}

	@Override
	public Type getTYPE() {
		return TYPE;
	}

	@Override
	public void setATTACK_DAMAGE(int dam) {
		DAMAGE = dam;
	}

}


public interface Attack {

	public void ATTACK_METHOD(Pokemon you, Pokemon enemy);
	//implements the pokemon attack
	
	
	
	
	public String getATTACK_NAME();
	
	public int getATTACK_ACCURACY();
	public void setATTACK_ACCURACY(int aac);
	public int getMAX_ATTACK_ACCURACY();
	public void setMAX_ATTACK_ACCURACY(int aac);
	
	public int getATTACK_DAMAGE();
	
	public int getPP();
	public void setPP(int pp);
	
	public void setMAX_PP(int pp);
	public int getMAX_PP();
	
	public Type getTYPE();
	
	
	
}

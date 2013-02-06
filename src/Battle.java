
public class Battle {

	private Pokemon PLAYER;
	private Pokemon OPPONENT;
	private boolean YOUR_TURN;

	Battle(Pokemon player, Pokemon opponent){
		setPLAYER(player);
		setOPPONENT(opponent);
		System.out.println(PLAYER.getNAME() + " vs. ENEMY " + OPPONENT.getNAME() +"!");
		firstTurn();
		//CommenceBattle();

	}

	private void firstTurn() {

		/*
		 * 
		 * check pkmn speed. Fastest pokemon goes first
		 * 
		 */

		if(OPPONENT.getSPD() > PLAYER.getSPD()){
			setYOUR_TURN(false);
			return;
		}else{

			setYOUR_TURN(true);
			return;
		}
	}

	public void giveEXP(Pokemon winner, Pokemon loser){
		int exp_gain = (int) Math.ceil((1.5 * 1 * loser.getBASE_EXP() * loser.getLEVEL()) / 7);
		System.out.println(winner.getNAME() + " gained " + exp_gain + " EXP!");
		winner.addEXP(exp_gain);
	}

	public Pokemon getPLAYER() {
		return PLAYER;
	}
	public void setPLAYER(Pokemon pLAYER) {
		PLAYER = pLAYER;
	}
	public Pokemon getOPPONENT() {
		return OPPONENT;
	}
	public void setOPPONENT(Pokemon oPPONENT) {
		OPPONENT = oPPONENT;
	}

	public boolean isYOUR_TURN() {
		return YOUR_TURN;
	}

	public void setYOUR_TURN(boolean yOUR_TURN) {
		YOUR_TURN = yOUR_TURN;
	}

}

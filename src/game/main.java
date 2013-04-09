package game;

import exceptions.PokemonsMaxAttacks;
import attacks.Scratch;
import pokemon.Pikachu;
import pokemon.Pokemon;

public class main {

	public static void main(String[] args) {
		// UserInput ui = new UserInput();
		// ui.prompt("Pick Nickname for your Pikachu");
		// String name = ui.readString();

			
			Pokemon one = new Pikachu("Sparky", 55, 10, 10, 10, 5, 0);
			Pokemon two = new Pokemon("Charmander", 70, new Scratch(), 10, 10, 10, 35, 5, 75);
			Battle btl = new Battle(one, two);
			one.returnInfo();
			btl.giveEXP(one, two);

		return;

	}
}
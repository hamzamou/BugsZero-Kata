
package com.adaptionsoft.games.main.runner;
import java.util.Random;

import com.adaptionsoft.games.service.Game;


public class GameRunner {

	public static void main(String[] args) {
		Random rand = new Random();
		Game aGame = new Game();
		aGame.playGame(rand);
	}


}

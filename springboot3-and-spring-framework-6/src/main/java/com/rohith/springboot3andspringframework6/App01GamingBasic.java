package com.rohith.springboot3andspringframework6;

import com.rohith.springboot3andspringframework6.game.GameRunner;
import com.rohith.springboot3andspringframework6.game.MarioGame;
import com.rohith.springboot3andspringframework6.game.PacmanGame;
import com.rohith.springboot3andspringframework6.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}

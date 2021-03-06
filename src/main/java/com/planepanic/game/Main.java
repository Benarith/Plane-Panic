package com.planepanic.game;

import com.planepanic.game.gfx.DrawThread;
import com.planepanic.game.gfx.ui.Button;
import com.planepanic.game.gfx.ui.TextBox;
import com.planepanic.game.model.orders.Vector2d;

/**
 * Example main
 * 
 * @author Thomas Cheyney
 */
public class Main {

	public static void main(String[] args) throws Exception {
		DrawThread draw = new DrawThread();

		draw.start();
		Thread.sleep(1000);
		Button startGame = (Button) new Button("Start Game").setCallback(new Runnable() {
			@Override
			public void run() {
				System.out.println("Start game!");
			}
		}).setPosition(new Vector2d(490, 300));
		draw.draw(startGame);
		TextBox title = (TextBox) new TextBox("Plane Panic").setPosition(new Vector2d(536, 100));
		draw.draw(title);
	}

}

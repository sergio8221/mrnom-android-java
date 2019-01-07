package com.badlogic.androidgames.mrnom;

import com.badlogic.androidgames.framework.basic.Game;
import com.badlogic.androidgames.framework.basic.Graphics;
import com.badlogic.androidgames.framework.basic.Screen;
import com.badlogic.androidgames.framework.basic.Graphics.PixmapFormat;

public class LoadingScreen extends Screen{
	public LoadingScreen(Game game){
		super(game);
	}
	
	public void update(float deltaTime){
		Graphics g = game.getGraphics();
		Assets.background = g.newPixmap("images/background.png", PixmapFormat.RGB565);
		Assets.logo = g.newPixmap("images/logo.png",PixmapFormat.ARGB4444);
		Assets.mainMenu = g.newPixmap("images/mainmenu.png",PixmapFormat.ARGB4444);
		Assets.buttons = g.newPixmap("images/buttons.png",PixmapFormat.ARGB4444);
		Assets.help1 = g.newPixmap("images/help1.png",PixmapFormat.ARGB4444);
		Assets.help2 = g.newPixmap("images/help2.png",PixmapFormat.ARGB4444);
		Assets.help3 = g.newPixmap("images/help3.png",PixmapFormat.ARGB4444);
		Assets.numbers = g.newPixmap("images/numbers.png",PixmapFormat.ARGB4444);
		Assets.ready = g.newPixmap("images/ready.png",PixmapFormat.ARGB4444);
		Assets.pause = g.newPixmap("images/pause.png",PixmapFormat.ARGB4444);
		Assets.gameOver = g.newPixmap("images/gameover.png",PixmapFormat.ARGB4444);
		Assets.headUp = g.newPixmap("images/headup.png",PixmapFormat.ARGB4444);
		Assets.headLeft = g.newPixmap("images/headleft.png",PixmapFormat.ARGB4444);
		Assets.headDown = g.newPixmap("images/headdown.png",PixmapFormat.ARGB4444);
		Assets.headRight = g.newPixmap("images/headright.png",PixmapFormat.ARGB4444);
		
		Assets.cockUp = g.newPixmap("images/cockup.png",PixmapFormat.ARGB4444);
		Assets.cockLeft = g.newPixmap("images/cockleft.png",PixmapFormat.ARGB4444);
		Assets.cockDown = g.newPixmap("images/cockdown.png",PixmapFormat.ARGB4444);
		Assets.cockRight = g.newPixmap("images/cockright.png",PixmapFormat.ARGB4444);
		
		Assets.tail = g.newPixmap("images/tail.png",PixmapFormat.ARGB4444);
		
		Assets.taila = g.newPixmap("images/taila.png",PixmapFormat.ARGB4444);
		Assets.tailb = g.newPixmap("images/tailb.png",PixmapFormat.ARGB4444);
		Assets.tailc = g.newPixmap("images/tailc.png",PixmapFormat.ARGB4444);
		Assets.taile = g.newPixmap("images/taile.png",PixmapFormat.ARGB4444);
		Assets.tailn = g.newPixmap("images/tailn.png",PixmapFormat.ARGB4444);
		Assets.tailo = g.newPixmap("images/tailo.png",PixmapFormat.ARGB4444);
		Assets.tailp = g.newPixmap("images/tailp.png",PixmapFormat.ARGB4444);
		Assets.tailt = g.newPixmap("images/tailt.png",PixmapFormat.ARGB4444);
		Assets.tailu = g.newPixmap("images/tailu.png",PixmapFormat.ARGB4444);
		
		Assets.stain1 = g.newPixmap("images/stain1.png",PixmapFormat.ARGB4444);
		Assets.stain2 = g.newPixmap("images/stain2.png",PixmapFormat.ARGB4444);
		Assets.stain3 = g.newPixmap("images/stain3.png",PixmapFormat.ARGB4444);
		Assets.click = game.getAudio().newSound("sounds/click.ogg");
		Assets.eat = game.getAudio().newSound("sounds/eat.ogg");
		Assets.bitten = game.getAudio().newSound("sounds/bitten.ogg");
		
		
		Settings.load(game.getFileIO());
		game.setScreen(new MainMenuScreen(game));
	}
	
	public void present(float deltaTime){
		
	}
	
	public void pause(){
		
	}
	
	public void resume(){
		
	}
	
	public void dispose(){
		
	}

}

package JigsawPuzzleGame.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/** Launches the desktop (LWJGL) application. */
import JigsawPuzzleGame.JigSawPuzzleGame;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopLauncher
{
	public static void main (String[] args)
	{
		Game myGame = new JigSawPuzzleGame();
		LwjglApplication launcher = new LwjglApplication( myGame, "Game Title", 800, 600 );
	}
}
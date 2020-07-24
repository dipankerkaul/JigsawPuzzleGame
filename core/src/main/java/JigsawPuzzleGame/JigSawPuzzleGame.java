package JigsawPuzzleGame;

public class JigSawPuzzleGame extends BaseGame
{
    public void create() 
    {        
        super.create();
        setActiveScreen( new LevelScreen() );
    }
}
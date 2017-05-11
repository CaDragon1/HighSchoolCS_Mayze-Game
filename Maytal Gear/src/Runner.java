import mayflower.*;


public class Runner extends Mayflower
{
    public Runner() 
    {
    	super("Maytal Gear", 800, 600);
    }
    @Override
    public void init()
    {
    	Mayflower.setFullScreen(false);
    	World startingWorld = new OpeningScreen();
    	Mayflower.setWorld(startingWorld);
    }
    
    public static void main(String[] args)
    {
    	new Runner();
    }
}
import mayflower.*;
public class MrMay extends Actor
 {
 	
    public MrMay()
    {
    	setImage("img/mrmay.png");
    }
    
    @Override public void act()
    {
    	if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT))///Movement Start//////////////////////////////////////
    		{
				int x = getX();
				int y = getY();
				setLocation(x+5, y);
    		}
    	if(Mayflower.isKeyDown(Keyboard.KEY_LEFT))
    		{
				int x = getX();
				int y = getY();
				setLocation(x-5, y);
    		}
    	if(Mayflower.isKeyDown(Keyboard.KEY_UP))
    		{
				int x = getX();
				int y = getY();
				setLocation(x, y - 5);
    		}
    	if(Mayflower.isKeyDown(Keyboard.KEY_DOWN))
    		{
				int x = getX();
				int y = getY();
				setLocation(x, y + 5);
    		}		/////////////////////////////movement End///////////////////////////////////////////
    		
    	if(Mayflower.isKeyDown(Keyboard.KEY_D))////Rotation Start///////////////////////////////////////
    		{
				turn(5);
    		}
    		
    	if(Mayflower.isKeyDown(Keyboard.KEY_A))
    		{
				turn(-5);
    		}////Rotation End///////////////////////////////////////
    		
  
      	if(isTouching(Wall.class))
    	{
    		if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT))///AntiMovement Start//////////////////////////////////////
    			{
					int x = getX();
					int y = getY();
					setLocation(x-5, y);
    			}
    		if(Mayflower.isKeyDown(Keyboard.KEY_LEFT))
    			{
					int x = getX();
					int y = getY();
					setLocation(x+5, y);
    			}
    		if(Mayflower.isKeyDown(Keyboard.KEY_DOWN))
    		{
				int x = getX();
				int y = getY();
				setLocation(x, y -5);    			    			
    		}
    		if(Mayflower.isKeyDown(Keyboard.KEY_UP))
    			{
					int x = getX();
					int y = getY();
					setLocation(x, y + 5);    		
    			}
    
		}
    }
 } 	
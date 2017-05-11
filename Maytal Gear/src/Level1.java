/**
 * @(#)Level1.java
 *
 *
 * @author 
 * @version 1.00 2017/5/1
 */
import mayflower.*;
public class Level1 extends World{

    public Level1() {
    	setBackground("img/level1.png");
    	int[][] blocks = {{1,1,1,1,1,1,1,1},
    	{1,0,0,0,0,0,0,1},
    	{1,0,0,0,1,0,0,1},
    	{1,0,0,0,0,0,0,1},
    	{1,2,0,0,0,0,0,1},
    	{1,1,1,1,1,1,1,1}
    	};
    	int w = 100;
    	int h = 100;
    	for(int r = 0; r < blocks.length; r++){
    		for(int c = 0; c < blocks[r].length; c++){
    			if(blocks[r][c] == 1){
    				Wall wall = new Wall();
    				addObject(wall, c*w, r*h);
    			}
    			if(blocks[r][c] == 2){
    				MrMay may = new MrMay();
    				addObject(may, c*w, r*h);
    			}
    		}
    	}
    }
    	
    	
    @Override
    public void act(){
    	
    }
}
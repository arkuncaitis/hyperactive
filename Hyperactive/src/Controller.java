import java.awt.event.KeyEvent;
import processing.core.*;

/**
 * This class represents all of the controls for the game
 * @author Alyssa Kuncaitis
 * @version 1
 */
public class Controller{
	private PApplet parent;
	private boolean hasPowerUp;
	private boolean activePowerUp;

	public Controller(PApplet p){
		this.parent = p;
		this.hasPowerUp = false;
		this.setActivePowerUp(false);
	}
	
	/**
	 * Acts as a keyboard controller ActionListener for the game
	 */
	public void control(){
		while(parent.keyPressed){
			if(parent.key == PConstants.CODED){
				if(parent.keyCode == PConstants.UP){ //up
					//speed up
				}
				if(parent.keyCode == PConstants.DOWN){ //down
					//slow down
				}
				if(parent.keyCode == PConstants.LEFT){ //left
					//turn left
				}
				if(parent.keyCode == PConstants.RIGHT){ //right
					//turn right
				}
			}
			if(parent.keyCode == KeyEvent.VK_SPACE){ //space
				if(hasPowerUp){
					//activate a powerUp
					this.activePowerUp = true;
				}
				if(activePowerUp){
					//use the powerUp
				}
			}
		}
	}
	
	/**
	 * Gets the parent PApplet object
	 * @return PApplet parent
	 */
	public PApplet getParent() {
		return parent;
	}

	/**
	 * Sets the parent PApplet object
	 * @param parent JApplet parent
	 */
	public void setParent(PApplet parent) {
		this.parent = parent;
	}

	/**
	 * Determines if the user has a powerUp
	 * @return true if the player has a powerUp, false if the player does not
	 */
	public boolean isHasPowerUp() {
		return hasPowerUp;
	}

	/**
	 * Sets whether or not the player has a power up
	 * @param hasPowerUp boolean representing if the player has a powerUp
	 */
	public void setHasPowerUp(boolean hasPowerUp) {
		this.hasPowerUp = hasPowerUp;
	}

	/**
	 * Determines if the player has an active powerUp
	 * @return true if the player has an active powerUp, false if the player does not
	 */
	public boolean isActivePowerUp() {
		return activePowerUp;
	}

	/**
	 * Sets if the player has an active powerUp
	 * @param activePowerUp true if the player has an active powerUp, false if they do not
	 */
	public void setActivePowerUp(boolean activePowerUp) {
		this.activePowerUp = activePowerUp;
	}
}

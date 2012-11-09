/**
 * This class represents a base for a character, meant to be extended by classes representing specific characters to give more specific details
 * @author Alyssa Kuncaitis
 * @version 1
 */
public class Character {
	private String name;
	
	public Character(String name){
		this.setName(name);
	}

	/**
	 * Gets the character name
	 * @return the character name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the Character name
	 * @param name the character name
	 */
	public void setName(String name) {
		this.name = name;
	}
}

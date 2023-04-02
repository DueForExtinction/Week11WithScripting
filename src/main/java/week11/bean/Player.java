/**
 * 
 */
package week11.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Apr 1, 2023
 */
@Entity
public class Player {
	@Id
	@GeneratedValue
	private long id;
	private String fname;
	private String lname;
	private String position;
	
	
	public Player() {
		
	}


	public Player(String fname, String lname, String position) {
		this.fname = fname;
		this.lname = lname;
		this.position = position;
	}


	public Player(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}


	public Player(long id, String fname, String lname, String position) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.position = position;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}


	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}


	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}


	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}

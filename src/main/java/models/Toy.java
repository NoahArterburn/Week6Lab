/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Oct 5, 2023
 */
package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "toys")
@Table(name = "toys")
public class Toy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int toyId;
	
	private String commonName;
	private String StoreName;
	private double Size;
	@ManyToOne
	@JoinColumn(name = "HOMEID", nullable=false)
	private Home home = new Home();
	
	public int getToyId() {
		return toyId;
	}

	public void setToyId(int rowId) {
		this.toyId = rowId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String StoreName) {
		this.StoreName = StoreName;
	}

	public double getSize() {
		return Size;
	}

	public void setSize(double Size) {
		this.Size = Size;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}


}

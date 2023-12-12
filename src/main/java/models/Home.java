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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "home")
@Table(name = "home")
public class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int homeId;
	private String location;
	private String name;
	@OneToMany(mappedBy = "home", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Toy> toys;
	
	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Toy> getToys() {
		return toys;
	}

	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}

}

package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idRole;

	@Column(nullable=false, length=50)
	private String nomRole;

	//bi-directional many-to-one association to PersonnesRole
	@OneToMany(mappedBy="role")
	private List<PersonnesRole> personnesRoles;

	public Role() {
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return this.nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public List<PersonnesRole> getPersonnesRoles() {
		return this.personnesRoles;
	}

	public void setPersonnesRoles(List<PersonnesRole> personnesRoles) {
		this.personnesRoles = personnesRoles;
	}

	public PersonnesRole addPersonnesRole(PersonnesRole personnesRole) {
		getPersonnesRoles().add(personnesRole);
		personnesRole.setRole(this);

		return personnesRole;
	}

	public PersonnesRole removePersonnesRole(PersonnesRole personnesRole) {
		getPersonnesRoles().remove(personnesRole);
		personnesRole.setRole(null);

		return personnesRole;
	}

}
package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personnes_role database table.
 * 
 */
@Entity
@Table(name="personnes_role")
@NamedQuery(name="PersonnesRole.findAll", query="SELECT p FROM PersonnesRole p")
public class PersonnesRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Personnes_Role;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	@JoinColumn(name="Personne_IdPersonne", nullable=false)
	private Personne personne;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="Role_IdRole", nullable=false)
	private Role role;

	public PersonnesRole() {
	}

	public int getId_Personnes_Role() {
		return this.id_Personnes_Role;
	}

	public void setId_Personnes_Role(int id_Personnes_Role) {
		this.id_Personnes_Role = id_Personnes_Role;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
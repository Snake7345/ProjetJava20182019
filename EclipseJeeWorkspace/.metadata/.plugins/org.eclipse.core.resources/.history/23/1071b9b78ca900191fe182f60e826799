package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the adresse_personne database table.
 * 
 */
@Entity
@Table(name="adresse_personne")
@NamedQuery(name="AdressePersonne.findAll", query="SELECT a FROM AdressePersonne a")
public class AdressePersonne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Adresse_Personne;

	//bi-directional many-to-one association to Adresse
	@ManyToOne
	@JoinColumn(name="Adresse_IdAdresse", nullable=false)
	private Adresse adresse;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	@JoinColumn(name="Personne_IdPersonne", nullable=false)
	private Personne personne;

	public AdressePersonne() {
	}

	public int getId_Adresse_Personne() {
		return this.id_Adresse_Personne;
	}

	public void setId_Adresse_Personne(int id_Adresse_Personne) {
		this.id_Adresse_Personne = id_Adresse_Personne;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
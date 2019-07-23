package entities;

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
	private int id_Personne_Adresse;

	//bi-directional many-to-one association to Adresse
	@ManyToOne
	private Adresse adresse;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	private Personne personne;

	public AdressePersonne() {
	}

	public int getId_Personne_Adresse() {
		return this.id_Personne_Adresse;
	}

	public void setId_Personne_Adresse(int id_Personne_Adresse) {
		this.id_Personne_Adresse = id_Personne_Adresse;
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
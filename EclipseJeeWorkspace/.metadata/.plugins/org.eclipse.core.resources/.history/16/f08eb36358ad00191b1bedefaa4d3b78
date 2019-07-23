package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the modele database table.
 * 
 */
@Entity
@NamedQuery(name="Modele.findAll", query="SELECT m FROM Modele m")
public class Modele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idModele;

	private boolean actif;

	private int anneeModele;

	private String nomModele;

	private int numPlaceModele;

	//bi-directional many-to-one association to Marque
	@ManyToOne
	private Marque marque;

	//bi-directional many-to-one association to Voiture
	@OneToMany(mappedBy="modele")
	private List<Voiture> voitures;

	public Modele() {
	}

	public int getIdModele() {
		return this.idModele;
	}

	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public int getAnneeModele() {
		return this.anneeModele;
	}

	public void setAnneeModele(int anneeModele) {
		this.anneeModele = anneeModele;
	}

	public String getNomModele() {
		return this.nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}

	public int getNumPlaceModele() {
		return this.numPlaceModele;
	}

	public void setNumPlaceModele(int numPlaceModele) {
		this.numPlaceModele = numPlaceModele;
	}

	public Marque getMarque() {
		return this.marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public List<Voiture> getVoitures() {
		return this.voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Voiture addVoiture(Voiture voiture) {
		getVoitures().add(voiture);
		voiture.setModele(this);

		return voiture;
	}

	public Voiture removeVoiture(Voiture voiture) {
		getVoitures().remove(voiture);
		voiture.setModele(null);

		return voiture;
	}

}
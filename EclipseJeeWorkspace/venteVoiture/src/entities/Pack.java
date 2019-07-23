package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pack database table.
 * 
 */
@Entity
@NamedQuery(name="Pack.findAll", query="SELECT p FROM Pack p")
public class Pack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPack;

	private boolean actif;

	private String descriptionPack;

	private String nomPack;

	private float prix;

	//bi-directional many-to-one association to Voiture
	@OneToMany(mappedBy="pack")
	private List<Voiture> voitures;

	public Pack() {
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getDescriptionPack() {
		return this.descriptionPack;
	}

	public void setDescriptionPack(String descriptionPack) {
		this.descriptionPack = descriptionPack;
	}

	public String getNomPack() {
		return this.nomPack;
	}

	public void setNomPack(String nomPack) {
		this.nomPack = nomPack;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public List<Voiture> getVoitures() {
		return this.voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Voiture addVoiture(Voiture voiture) {
		getVoitures().add(voiture);
		voiture.setPack(this);

		return voiture;
	}

	public Voiture removeVoiture(Voiture voiture) {
		getVoitures().remove(voiture);
		voiture.setPack(null);

		return voiture;
	}

}
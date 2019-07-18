package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the couleur database table.
 * 
 */
@Entity
@Table(name="couleur")
@NamedQuery(name="Couleur.findAll", query="SELECT c FROM Couleur c")
public class Couleur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idCouleur;

	@Column(nullable=false, length=50)
	private String nomCouleur;

	@Column(nullable=false)
	private float prix;

	//bi-directional many-to-one association to Voiture
	@OneToMany(mappedBy="couleur")
	private List<Voiture> voitures;

	public Couleur() {
	}

	public int getIdCouleur() {
		return this.idCouleur;
	}

	public void setIdCouleur(int idCouleur) {
		this.idCouleur = idCouleur;
	}

	public String getNomCouleur() {
		return this.nomCouleur;
	}

	public void setNomCouleur(String nomCouleur) {
		this.nomCouleur = nomCouleur;
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
		voiture.setCouleur(this);

		return voiture;
	}

	public Voiture removeVoiture(Voiture voiture) {
		getVoitures().remove(voiture);
		voiture.setCouleur(null);

		return voiture;
	}

}
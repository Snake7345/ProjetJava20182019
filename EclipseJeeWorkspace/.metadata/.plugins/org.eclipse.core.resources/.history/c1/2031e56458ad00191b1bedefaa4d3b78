package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the voiture database table.
 * 
 */
@Entity
@NamedQuery(name="Voiture.findAll", query="SELECT v FROM Voiture v")
public class Voiture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNumChassisVoiture;

	private boolean actif;

	private int commande_IdCommande;

	private float prix;

	//bi-directional many-to-one association to Couleur
	@ManyToOne
	private Couleur couleur;

	//bi-directional many-to-one association to Entrepot
	@ManyToOne
	private Entrepot entrepot;

	//bi-directional many-to-one association to Modele
	@ManyToOne
	private Modele modele;

	//bi-directional many-to-one association to Moteur
	@ManyToOne
	private Moteur moteur;

	//bi-directional many-to-one association to Pack
	@ManyToOne
	private Pack pack;

	//bi-directional many-to-one association to VoitureOption
	@OneToMany(mappedBy="voiture")
	private List<VoitureOption> voitureOptions;

	public Voiture() {
	}

	public int getIdNumChassisVoiture() {
		return this.idNumChassisVoiture;
	}

	public void setIdNumChassisVoiture(int idNumChassisVoiture) {
		this.idNumChassisVoiture = idNumChassisVoiture;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public int getCommande_IdCommande() {
		return this.commande_IdCommande;
	}

	public void setCommande_IdCommande(int commande_IdCommande) {
		this.commande_IdCommande = commande_IdCommande;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Couleur getCouleur() {
		return this.couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Entrepot getEntrepot() {
		return this.entrepot;
	}

	public void setEntrepot(Entrepot entrepot) {
		this.entrepot = entrepot;
	}

	public Modele getModele() {
		return this.modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}

	public Moteur getMoteur() {
		return this.moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Pack getPack() {
		return this.pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public List<VoitureOption> getVoitureOptions() {
		return this.voitureOptions;
	}

	public void setVoitureOptions(List<VoitureOption> voitureOptions) {
		this.voitureOptions = voitureOptions;
	}

	public VoitureOption addVoitureOption(VoitureOption voitureOption) {
		getVoitureOptions().add(voitureOption);
		voitureOption.setVoiture(this);

		return voitureOption;
	}

	public VoitureOption removeVoitureOption(VoitureOption voitureOption) {
		getVoitureOptions().remove(voitureOption);
		voitureOption.setVoiture(null);

		return voitureOption;
	}

}
package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entrepot database table.
 * 
 */
@Entity
@NamedQuery(name="Entrepot.findAll", query="SELECT e FROM Entrepot e")
public class Entrepot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEntrepot;

	private String nomEntrepot;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="entrepot")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Personne
	@OneToMany(mappedBy="entrepot")
	private List<Personne> personnes;

	//bi-directional many-to-one association to Voiture
	@OneToMany(mappedBy="entrepot")
	private List<Voiture> voitures;

	//bi-directional one-to-one association to Adresse
	@OneToOne
	private Adresse adresse;

	public Entrepot() {
	}

	public int getIdEntrepot() {
		return this.idEntrepot;
	}

	public void setIdEntrepot(int idEntrepot) {
		this.idEntrepot = idEntrepot;
	}

	public String getNomEntrepot() {
		return this.nomEntrepot;
	}

	public void setNomEntrepot(String nomEntrepot) {
		this.nomEntrepot = nomEntrepot;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setEntrepot(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setEntrepot(null);

		return commande;
	}

	public List<Personne> getPersonnes() {
		return this.personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public Personne addPersonne(Personne personne) {
		getPersonnes().add(personne);
		personne.setEntrepot(this);

		return personne;
	}

	public Personne removePersonne(Personne personne) {
		getPersonnes().remove(personne);
		personne.setEntrepot(null);

		return personne;
	}

	public List<Voiture> getVoitures() {
		return this.voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Voiture addVoiture(Voiture voiture) {
		getVoitures().add(voiture);
		voiture.setEntrepot(this);

		return voiture;
	}

	public Voiture removeVoiture(Voiture voiture) {
		getVoitures().remove(voiture);
		voiture.setEntrepot(null);

		return voiture;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
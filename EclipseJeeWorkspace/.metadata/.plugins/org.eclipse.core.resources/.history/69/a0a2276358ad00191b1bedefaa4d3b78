package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCommande;

	@Temporal(TemporalType.DATE)
	private Date dateCommande;

	private String etatCommande;

	//bi-directional many-to-one association to Entrepot
	@ManyToOne
	private Entrepot entrepot;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	private Personne personne;

	//bi-directional many-to-one association to CommandeProduit
	@OneToMany(mappedBy="commande")
	private List<CommandeProduit> commandeProduits;

	//bi-directional one-to-one association to Facture
	@OneToOne
	private Facture facture;

	public Commande() {
	}

	public int getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getEtatCommande() {
		return this.etatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}

	public Entrepot getEntrepot() {
		return this.entrepot;
	}

	public void setEntrepot(Entrepot entrepot) {
		this.entrepot = entrepot;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<CommandeProduit> getCommandeProduits() {
		return this.commandeProduits;
	}

	public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

	public CommandeProduit addCommandeProduit(CommandeProduit commandeProduit) {
		getCommandeProduits().add(commandeProduit);
		commandeProduit.setCommande(this);

		return commandeProduit;
	}

	public CommandeProduit removeCommandeProduit(CommandeProduit commandeProduit) {
		getCommandeProduits().remove(commandeProduit);
		commandeProduit.setCommande(null);

		return commandeProduit;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

}
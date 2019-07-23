package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the commande_produit database table.
 * 
 */
@Entity
@Table(name="commande_produit")
@NamedQuery(name="CommandeProduit.findAll", query="SELECT c FROM CommandeProduit c")
public class CommandeProduit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Produit_Commande;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	private Commande commande;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	private Produit produit;

	public CommandeProduit() {
	}

	public int getId_Produit_Commande() {
		return this.id_Produit_Commande;
	}

	public void setId_Produit_Commande(int id_Produit_Commande) {
		this.id_Produit_Commande = id_Produit_Commande;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
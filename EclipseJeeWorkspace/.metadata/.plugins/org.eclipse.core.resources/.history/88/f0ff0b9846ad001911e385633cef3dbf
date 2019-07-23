package venteVoiture.connection;

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
	@Column(unique=true, nullable=false)
	private int id_Commande_Produit;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="Commande_IdCommande", nullable=false)
	private Commande commande;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produit_IdProduit", nullable=false)
	private Produit produit;

	public CommandeProduit() {
	}

	public int getId_Commande_Produit() {
		return this.id_Commande_Produit;
	}

	public void setId_Commande_Produit(int id_Commande_Produit) {
		this.id_Commande_Produit = id_Commande_Produit;
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
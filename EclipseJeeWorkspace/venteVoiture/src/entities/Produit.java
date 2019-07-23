package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduit;

	private boolean actif;

	private String descriptionProduit;

	private String nomProduit;

	private float prix;

	//bi-directional many-to-one association to CommandeProduit
	@OneToMany(mappedBy="produit")
	private List<CommandeProduit> commandeProduits;

	public Produit() {
	}

	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getDescriptionProduit() {
		return this.descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public String getNomProduit() {
		return this.nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public List<CommandeProduit> getCommandeProduits() {
		return this.commandeProduits;
	}

	public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

	public CommandeProduit addCommandeProduit(CommandeProduit commandeProduit) {
		getCommandeProduits().add(commandeProduit);
		commandeProduit.setProduit(this);

		return commandeProduit;
	}

	public CommandeProduit removeCommandeProduit(CommandeProduit commandeProduit) {
		getCommandeProduits().remove(commandeProduit);
		commandeProduit.setProduit(null);

		return commandeProduit;
	}

}
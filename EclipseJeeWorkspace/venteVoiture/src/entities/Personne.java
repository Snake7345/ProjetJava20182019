package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@NamedQuery(name="Personne.findAll", query="SELECT p FROM Personne p")
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersonne;

	private boolean actif;

	@Temporal(TemporalType.DATE)
	private Date datedenaissance;

	private String mailPersonne;

	private String mdpPersonne;

	private String nomPersonne;

	private String prenomPersonne;

	//bi-directional many-to-one association to AdressePersonne
	@OneToMany(mappedBy="personne")
	private List<AdressePersonne> adressePersonnes;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="personne")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Entrepot
	@ManyToOne
	private Entrepot entrepot;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	public Personne() {
	}

	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Date getDatedenaissance() {
		return this.datedenaissance;
	}

	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}

	public String getMailPersonne() {
		return this.mailPersonne;
	}

	public void setMailPersonne(String mailPersonne) {
		this.mailPersonne = mailPersonne;
	}

	public String getMdpPersonne() {
		return this.mdpPersonne;
	}

	public void setMdpPersonne(String mdpPersonne) {
		this.mdpPersonne = mdpPersonne;
	}

	public String getNomPersonne() {
		return this.nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return this.prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public List<AdressePersonne> getAdressePersonnes() {
		return this.adressePersonnes;
	}

	public void setAdressePersonnes(List<AdressePersonne> adressePersonnes) {
		this.adressePersonnes = adressePersonnes;
	}

	public AdressePersonne addAdressePersonne(AdressePersonne adressePersonne) {
		getAdressePersonnes().add(adressePersonne);
		adressePersonne.setPersonne(this);

		return adressePersonne;
	}

	public AdressePersonne removeAdressePersonne(AdressePersonne adressePersonne) {
		getAdressePersonnes().remove(adressePersonne);
		adressePersonne.setPersonne(null);

		return adressePersonne;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setPersonne(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setPersonne(null);

		return commande;
	}

	public Entrepot getEntrepot() {
		return this.entrepot;
	}

	public void setEntrepot(Entrepot entrepot) {
		this.entrepot = entrepot;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
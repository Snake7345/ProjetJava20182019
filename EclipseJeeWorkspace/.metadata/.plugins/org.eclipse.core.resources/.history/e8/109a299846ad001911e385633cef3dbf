package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the voiture_commande database table.
 * 
 */
@Entity
@Table(name="voiture_commande")
@NamedQuery(name="VoitureCommande.findAll", query="SELECT v FROM VoitureCommande v")
public class VoitureCommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Voiture_Commande;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="Commande_IdCommande", nullable=false)
	private Commande commande;

	//bi-directional many-to-one association to Voiture
	@ManyToOne
	@JoinColumn(name="Voiture_IdNumChassisVoiture", nullable=false)
	private Voiture voiture;

	public VoitureCommande() {
	}

	public int getId_Voiture_Commande() {
		return this.id_Voiture_Commande;
	}

	public void setId_Voiture_Commande(int id_Voiture_Commande) {
		this.id_Voiture_Commande = id_Voiture_Commande;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Voiture getVoiture() {
		return this.voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

}
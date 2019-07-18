package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the facture database table.
 * 
 */
@Entity
@Table(name="facture")
@NamedQuery(name="Facture.findAll", query="SELECT f FROM Facture f")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idFacture;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date dateFacture;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="Commande_IdCommande", nullable=false)
	private Commande commande;

	//bi-directional many-to-one association to ModePayment
	@ManyToOne
	@JoinColumn(name="Mode_payment_IdMode", nullable=false)
	private ModePayment modePayment;

	public Facture() {
	}

	public int getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacture() {
		return this.dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public ModePayment getModePayment() {
		return this.modePayment;
	}

	public void setModePayment(ModePayment modePayment) {
		this.modePayment = modePayment;
	}

}
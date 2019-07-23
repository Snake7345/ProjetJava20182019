package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the adresse_entrepot database table.
 * 
 */
@Entity
@Table(name="adresse_entrepot")
@NamedQuery(name="AdresseEntrepot.findAll", query="SELECT a FROM AdresseEntrepot a")
public class AdresseEntrepot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Adresse_Entrepot;

	//bi-directional many-to-one association to Adresse
	@ManyToOne
	@JoinColumn(name="Adresse_IdAdresse", nullable=false)
	private Adresse adresse;

	//bi-directional many-to-one association to Entrepot
	@ManyToOne
	@JoinColumn(name="Entrepot_IdEntrepot", nullable=false)
	private Entrepot entrepot;

	public AdresseEntrepot() {
	}

	public int getId_Adresse_Entrepot() {
		return this.id_Adresse_Entrepot;
	}

	public void setId_Adresse_Entrepot(int id_Adresse_Entrepot) {
		this.id_Adresse_Entrepot = id_Adresse_Entrepot;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Entrepot getEntrepot() {
		return this.entrepot;
	}

	public void setEntrepot(Entrepot entrepot) {
		this.entrepot = entrepot;
	}

}
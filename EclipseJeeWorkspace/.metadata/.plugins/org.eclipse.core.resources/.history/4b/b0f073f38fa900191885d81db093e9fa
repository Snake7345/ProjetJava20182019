package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the voiture_moteur database table.
 * 
 */
@Entity
@Table(name="voiture_moteur")
@NamedQuery(name="VoitureMoteur.findAll", query="SELECT v FROM VoitureMoteur v")
public class VoitureMoteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Voiture_Moteur;

	//bi-directional many-to-one association to Moteur
	@ManyToOne
	@JoinColumn(name="Moteur_IdMoteur", nullable=false)
	private Moteur moteur;

	//bi-directional many-to-one association to Voiture
	@ManyToOne
	@JoinColumn(name="Voiture_IdNumChassisVoiture", nullable=false)
	private Voiture voiture;

	public VoitureMoteur() {
	}

	public int getId_Voiture_Moteur() {
		return this.id_Voiture_Moteur;
	}

	public void setId_Voiture_Moteur(int id_Voiture_Moteur) {
		this.id_Voiture_Moteur = id_Voiture_Moteur;
	}

	public Moteur getMoteur() {
		return this.moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Voiture getVoiture() {
		return this.voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

}
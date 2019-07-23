package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the adresse database table.
 * 
 */
@Entity
@NamedQuery(name="Adresse.findAll", query="SELECT a FROM Adresse a")
public class Adresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdresse;

	private String numero;

	private String rueAdresse;

	//bi-directional many-to-one association to Cp
	@ManyToOne
	private Cp cp;

	//bi-directional many-to-one association to AdressePersonne
	@OneToMany(mappedBy="adresse")
	private List<AdressePersonne> adressePersonnes;

	//bi-directional one-to-one association to Entrepot
	@OneToOne(mappedBy="adresse")
	private Entrepot entrepot;

	public Adresse() {
	}

	public int getIdAdresse() {
		return this.idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRueAdresse() {
		return this.rueAdresse;
	}

	public void setRueAdresse(String rueAdresse) {
		this.rueAdresse = rueAdresse;
	}

	public Cp getCp() {
		return this.cp;
	}

	public void setCp(Cp cp) {
		this.cp = cp;
	}

	public List<AdressePersonne> getAdressePersonnes() {
		return this.adressePersonnes;
	}

	public void setAdressePersonnes(List<AdressePersonne> adressePersonnes) {
		this.adressePersonnes = adressePersonnes;
	}

	public AdressePersonne addAdressePersonne(AdressePersonne adressePersonne) {
		getAdressePersonnes().add(adressePersonne);
		adressePersonne.setAdresse(this);

		return adressePersonne;
	}

	public AdressePersonne removeAdressePersonne(AdressePersonne adressePersonne) {
		getAdressePersonnes().remove(adressePersonne);
		adressePersonne.setAdresse(null);

		return adressePersonne;
	}

	public Entrepot getEntrepot() {
		return this.entrepot;
	}

	public void setEntrepot(Entrepot entrepot) {
		this.entrepot = entrepot;
	}

}
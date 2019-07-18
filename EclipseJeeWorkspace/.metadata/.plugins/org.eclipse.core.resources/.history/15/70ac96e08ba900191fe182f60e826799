package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cp database table.
 * 
 */
@Entity
@Table(name="cp")
@NamedQuery(name="Cp.findAll", query="SELECT c FROM Cp c")
public class Cp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idCP;

	@Column(nullable=false, length=100)
	private String nomVilleCP;

	@Column(nullable=false)
	private int numeroCP;

	//bi-directional many-to-one association to Adresse
	@OneToMany(mappedBy="cp")
	private List<Adresse> adresses;

	public Cp() {
	}

	public int getIdCP() {
		return this.idCP;
	}

	public void setIdCP(int idCP) {
		this.idCP = idCP;
	}

	public String getNomVilleCP() {
		return this.nomVilleCP;
	}

	public void setNomVilleCP(String nomVilleCP) {
		this.nomVilleCP = nomVilleCP;
	}

	public int getNumeroCP() {
		return this.numeroCP;
	}

	public void setNumeroCP(int numeroCP) {
		this.numeroCP = numeroCP;
	}

	public List<Adresse> getAdresses() {
		return this.adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public Adresse addAdress(Adresse adress) {
		getAdresses().add(adress);
		adress.setCp(this);

		return adress;
	}

	public Adresse removeAdress(Adresse adress) {
		getAdresses().remove(adress);
		adress.setCp(null);

		return adress;
	}

}
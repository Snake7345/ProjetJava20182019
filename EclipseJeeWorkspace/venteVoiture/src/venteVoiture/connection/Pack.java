package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pack database table.
 * 
 */
@Entity
@Table(name="pack")
@NamedQuery(name="Pack.findAll", query="SELECT p FROM Pack p")
public class Pack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idPack;

	@Column(nullable=false, length=255)
	private String descriptionPack;

	@Column(nullable=false, length=100)
	private String nomPack;

	//bi-directional many-to-one association to OptionsPack
	@OneToMany(mappedBy="pack")
	private List<OptionsPack> optionsPacks;

	//bi-directional many-to-one association to Voiture
	@OneToMany(mappedBy="pack")
	private List<Voiture> voitures;

	public Pack() {
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public String getDescriptionPack() {
		return this.descriptionPack;
	}

	public void setDescriptionPack(String descriptionPack) {
		this.descriptionPack = descriptionPack;
	}

	public String getNomPack() {
		return this.nomPack;
	}

	public void setNomPack(String nomPack) {
		this.nomPack = nomPack;
	}

	public List<OptionsPack> getOptionsPacks() {
		return this.optionsPacks;
	}

	public void setOptionsPacks(List<OptionsPack> optionsPacks) {
		this.optionsPacks = optionsPacks;
	}

	public OptionsPack addOptionsPack(OptionsPack optionsPack) {
		getOptionsPacks().add(optionsPack);
		optionsPack.setPack(this);

		return optionsPack;
	}

	public OptionsPack removeOptionsPack(OptionsPack optionsPack) {
		getOptionsPacks().remove(optionsPack);
		optionsPack.setPack(null);

		return optionsPack;
	}

	public List<Voiture> getVoitures() {
		return this.voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Voiture addVoiture(Voiture voiture) {
		getVoitures().add(voiture);
		voiture.setPack(this);

		return voiture;
	}

	public Voiture removeVoiture(Voiture voiture) {
		getVoitures().remove(voiture);
		voiture.setPack(null);

		return voiture;
	}

}
package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the options database table.
 * 
 */
@Entity
@Table(name="options")
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int idOptions;

	@Column(nullable=false)
	private int actif;

	@Column(nullable=false, length=50)
	private String nomOptions;

	@Column(nullable=false)
	private float prix;

	//bi-directional many-to-one association to OptionsPack
	@OneToMany(mappedBy="option")
	private List<OptionsPack> optionsPacks;

	//bi-directional many-to-one association to VoitureOption
	@OneToMany(mappedBy="option")
	private List<VoitureOption> voitureOptions;

	public Option() {
	}

	public int getIdOptions() {
		return this.idOptions;
	}

	public void setIdOptions(int idOptions) {
		this.idOptions = idOptions;
	}

	public int getActif() {
		return this.actif;
	}

	public void setActif(int actif) {
		this.actif = actif;
	}

	public String getNomOptions() {
		return this.nomOptions;
	}

	public void setNomOptions(String nomOptions) {
		this.nomOptions = nomOptions;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public List<OptionsPack> getOptionsPacks() {
		return this.optionsPacks;
	}

	public void setOptionsPacks(List<OptionsPack> optionsPacks) {
		this.optionsPacks = optionsPacks;
	}

	public OptionsPack addOptionsPack(OptionsPack optionsPack) {
		getOptionsPacks().add(optionsPack);
		optionsPack.setOption(this);

		return optionsPack;
	}

	public OptionsPack removeOptionsPack(OptionsPack optionsPack) {
		getOptionsPacks().remove(optionsPack);
		optionsPack.setOption(null);

		return optionsPack;
	}

	public List<VoitureOption> getVoitureOptions() {
		return this.voitureOptions;
	}

	public void setVoitureOptions(List<VoitureOption> voitureOptions) {
		this.voitureOptions = voitureOptions;
	}

	public VoitureOption addVoitureOption(VoitureOption voitureOption) {
		getVoitureOptions().add(voitureOption);
		voitureOption.setOption(this);

		return voitureOption;
	}

	public VoitureOption removeVoitureOption(VoitureOption voitureOption) {
		getVoitureOptions().remove(voitureOption);
		voitureOption.setOption(null);

		return voitureOption;
	}

}
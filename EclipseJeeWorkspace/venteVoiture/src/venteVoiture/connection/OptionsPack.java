package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the options_pack database table.
 * 
 */
@Entity
@Table(name="options_pack")
@NamedQuery(name="OptionsPack.findAll", query="SELECT o FROM OptionsPack o")
public class OptionsPack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Options_Pack;

	//bi-directional many-to-one association to Option
	@ManyToOne
	@JoinColumn(name="Options_idOptions", nullable=false)
	private Option option;

	//bi-directional many-to-one association to Pack
	@ManyToOne
	@JoinColumn(name="Pack_IdPack", nullable=false)
	private Pack pack;

	public OptionsPack() {
	}

	public int getId_Options_Pack() {
		return this.id_Options_Pack;
	}

	public void setId_Options_Pack(int id_Options_Pack) {
		this.id_Options_Pack = id_Options_Pack;
	}

	public Option getOption() {
		return this.option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Pack getPack() {
		return this.pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

}
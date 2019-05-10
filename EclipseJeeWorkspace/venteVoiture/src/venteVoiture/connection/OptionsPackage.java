package venteVoiture.connection;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the options_package database table.
 * 
 */
@Entity
@Table(name="options_package")
@NamedQuery(name="OptionsPackage.findAll", query="SELECT o FROM OptionsPackage o")
public class OptionsPackage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_Options_Package;

	//bi-directional many-to-one association to Option
	@ManyToOne
	@JoinColumn(name="Options_idOptions", nullable=false)
	private Option option;

	//bi-directional many-to-one association to Package
	@ManyToOne
	@JoinColumn(name="Package_IdPackage", nullable=false)
	private Package package;

	public OptionsPackage() {
	}

	public int getId_Options_Package() {
		return this.id_Options_Package;
	}

	public void setId_Options_Package(int id_Options_Package) {
		this.id_Options_Package = id_Options_Package;
	}

	public Option getOption() {
		return this.option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Package getPackage() {
		return this.package;
	}

	public void setPackage(Package package) {
		this.package = package;
	}

}
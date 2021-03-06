package co.com.gamestore.pos.services.main.model;

public class BrandDTO{
	
	/**
	 * 
	 */
	private Integer id;
	private String name;
	
	/**
	 * Basic constructor
	 */
	public BrandDTO() {
		super();
	}
	
	
	/**
	 * Basic constructor with parameters
	 * @param id
	 * @param name
	 */
	public BrandDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BrandDTO [id=" + id + ", name=" + name + "]";
	}
	
	
}

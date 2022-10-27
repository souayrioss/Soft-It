package beans;

public class Address {

	 private Long idAddress;

	    private String street;

	    private String city;

	    private String country;

	    public Long getIdAddress() {
	        return idAddress;
	    }

	    public void setIdAddress(Long idAddress) {
	        this.idAddress = idAddress;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    @Override
	    public String toString() {
	        return "Address{" +
	                "idAddress=" + idAddress +
	                ", street='" + street + '\'' +
	                ", city='" + city + '\'' +
	                ", country='" + country + '\'' +
	                '}';
	    }
}

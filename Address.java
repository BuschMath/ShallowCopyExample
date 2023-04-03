public class Address {
    private String street;
    private String city;

    // constructor and getters/setters omitted for brevity
    Address(String a_Street, String a_City) {
        street = a_Street;
        city = a_City;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

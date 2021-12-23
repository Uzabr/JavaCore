package main.java.com.khStudy.javacore.chapter18;

public class Address_L7 {
    private String name;
    private String city;
    private String street;
    private String state;
    private String code;

    public Address_L7 (String name, String city, String street, String state, String code) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString () {
        return "Address_L7{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

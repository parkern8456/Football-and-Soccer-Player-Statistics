// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

public class Person {

    // Class attributes.
    private String name;
    private Address address;

    public Person() {
        setName("John Doe");
        setAddress(new Address());
    }

    public Person(String inName, Address addIn) {
        setName(inName);
        setAddress(addIn);
    }

    @Override
    public String toString() {
        return "Person{Name=" + name + ", Address=" + address.toString() + "} ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

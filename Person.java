public class Person {
    private String name;
    private int age;
    private Address address;

    // constructor and getters/setters omitted for brevity
    Person(String a_Name, int a_Age, Address a_Address) {
        name = a_Name;
        age = a_Age;
        address = a_Address;
    }

    String getName() {return name;}
    int getAge() {return age;}
    Address getAddress() {return address;}
}
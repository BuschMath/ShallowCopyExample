public class ShallowCopyDemo {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown");
        Person person1 = new Person("Alice", 30, address);
        Person person2 = new Person(person1.getName(), person1.getAge(), person1.getAddress());

        // change the address of person1
        person1.getAddress().setStreet("456 Broad St");

        System.out.println(person1); // prints "Person[name=Alice, age=30, address=Address[street=456 Broad St, city=Anytown]]"
        System.out.println(person2); // prints "Person[name=Alice, age=30, address=Address[street=456 Broad St, city=Anytown]]" (note: both objects have the same address)
    }
}

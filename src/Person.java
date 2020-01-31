public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    };
    // returns the person's name
    public String getName() {
        return this.name;
    };
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    };
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello, %s", this.name);
    };

    public static void main(String[] args) {
//        //output true then false because the names are the same but each is its own object so mem address != mem address
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        //
//        //output true because it makes an obj then clones it. mem add == mem add;
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        //
        //output "John", "John", "Jane", "Jane" because when you set person2 to person1 you are setting the var equal to the memory address. so when you setName its changing the value of the name property of that obj at that memory address.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    };
}

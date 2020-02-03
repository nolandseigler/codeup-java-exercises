import java.util.Arrays;
public class ArrayExercises {
    public static void main(String[] args) {
        Person[] personsArr =
                {
                        new Person("Mike"),
                        new Person("Vinny"),
                        new Person("Pauly")
                };
        for (Person person : personsArr) {
            System.out.println(person.getName());

        }
        personsArr = addPerson(personsArr, new Person("Ronnie"));
        for (Person person : personsArr) {
            System.out.println(person.getName());

        }
    }
    public static Person[] addPerson(Person[] inputArr, Person inputPerson) {
        Person[] output = Arrays.copyOf(inputArr, inputArr.length + 1);
        output[output.length - 1] = inputPerson;
        return output;
    }
}

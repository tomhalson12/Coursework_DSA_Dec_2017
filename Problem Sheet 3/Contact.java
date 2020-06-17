public class Contact implements Comparable<Contact> {
    public String firstName;
    public String lastName;

    public Contact(String f, String l) {
        firstName = f; lastName = l;
    }

    public int compareTo(Contact c) {
       	int lastNameCompare = lastName.compareTo(c.lastName);

       	if(lastNameCompare == 0){
       		return firstName.compareTo(c.firstName);
       	}
        return lastNameCompare;
    }
}

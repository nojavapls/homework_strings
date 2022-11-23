public class task3 {
    public static void main(String[] args) {

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName.replace("ё", "е"));
    }
}

public class Main {
    public static void main(String[] args) {
        // String datatype
        String name = "James";

        // Integer datatype
        int age = 5;

        // format method is used for string concatenation
        String info_about_agent = String.format("Agent %s is of age %d", name, age);
        System.out.println(String.format("%s", info_about_agent));

        // Float datatype
        double PI = 3.141567;

        // Boolean datatype
        boolean is_alive = true;

        // Char datatype
        char your_name_initials = 'A';
        String last_agent_info = String.format("Agent with initials %c is %b with life expectancy of %.3f mins",
                your_name_initials, is_alive, PI);

        System.out.println(String.format("%s", last_agent_info));
    }
}

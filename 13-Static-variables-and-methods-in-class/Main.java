public class Main {
    public static void main(String[] args) {
        Agent agent1 = new Agent("James Bond", 32);
        Agent agent2 = new Agent("Ethan Hunt", 35);
        System.out.println(agent1.number_of_agents);

        agent1.info();
    }
}

class Agent {

    // Static variable
    protected static int number_of_agents = 0;

    protected String name;
    protected int age;

    public Agent(String name, int age) {
        this.name = name;
        this.age = age;
        Agent.number_of_agents += 1;
        Agent.info();
    }

    // Static method
    public static void info() {
        System.out.println("I work for MI6");
    }
}

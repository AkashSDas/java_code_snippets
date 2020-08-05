public class Main {
    public static void main(String[] args) {
        Level lvl = Level.LOW;
        
        String en = lvl.toString();
        
        System.out.println(Level.values());
        Level[] arr = Level.values();
        for (Level e: arr) {
            System.out.println(e);
        }

        if (lvl == Level.LOW) {
            System.out.println(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.println(lvl);
        } else {
            System.out.println(lvl);
        }

        System.out.println(lvl.get_Lvl());
        System.out.println(Level.valueOf("LOW"));

        lvl.set_Lvl(999);
        System.out.println(lvl.get_Lvl());
    }

}

// enum is a collection of constants
enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int get_Lvl() {
        return this.lvlNum;
    }

    public void set_Lvl(int num) {
        this.lvlNum = num;
    }
}

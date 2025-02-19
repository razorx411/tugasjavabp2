public class appHSR {
    public static void main(String[] args) {
        HSR char1 = new HSR("Dan Heng", "Spear Strike", "The Hunt", 85);
        HSR char2 = new HSR("March 7th", "Freezing Arrow", "Preservation", 80);

        System.out.println("\n--- Informasi Karakter ---");
        System.out.println(char1);
        System.out.println(char2);

        char1.battle(char2);
    }
}


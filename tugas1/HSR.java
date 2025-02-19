import java.util.Random;

class HSR {
    private String namaChar, skill, path;
    private int power;

    HSR(String namaChar, String skill, String path, int power) {
        this.namaChar = namaChar;
        this.skill = skill;
        this.path = path;
        this.power = power;
        System.out.println("Karakter " + namaChar + " telah dibuat!");
    }

    public void setNamaChar(String namaChar) { this.namaChar = namaChar; }
    public void setSkill(String skill) { this.skill = skill; }
    public void setPath(String path) { this.path = path; }
    public void setPower(int power) { this.power = power; }

    public String getNamaChar() { return namaChar; }
    public String getSkill() { return skill; }
    public String getPath() { return path; }
    public int getPower() { return power; }

    public void battle(HSR musuh) {
        System.out.println("\n=== Battle Dimulai ===");
        System.out.println(this.namaChar + " VS " + musuh.getNamaChar());
        System.out.println(this.namaChar + " Power: " + this.power);
        System.out.println(musuh.getNamaChar() + " Power: " + musuh.getPower());

        if (this.power > musuh.getPower()) {
            System.out.println(this.namaChar + " menang melawan " + musuh.getNamaChar() + "!");
        } else if (this.power < musuh.getPower()) {
            System.out.println(musuh.getNamaChar() + " menang melawan " + this.namaChar + "!");
        } else {
            System.out.println("Pertarungan antara " + this.namaChar + " dan " + musuh.getNamaChar() + " berakhir imbang!");
        }
    }

    public String toString() {
        return "Nama: " + namaChar + " | Skill: " + skill + " | Path: " + path + " | Power: " + power;
    }
}



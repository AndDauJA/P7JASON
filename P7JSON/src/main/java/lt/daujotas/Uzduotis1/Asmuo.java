package lt.daujotas.Uzduotis1;

public abstract class Asmuo {

    String vardas;
    String pavarde;
    int age;

    public Asmuo(String vardas, String pavarde, int age) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.age = age;
    }

    protected Asmuo() {
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", age=" + age +
                '}';
    }
}

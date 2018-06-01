package tutorial;

public class Tutorial {
    public static void main(String[] args) {

        Computer comp = new Computer();

        comp.setHDD(-1);
        comp.setRAM(128);
        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
    }
}

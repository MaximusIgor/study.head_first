package tutorial;

public class Computer {
    private int hdd = 0;
    private int ram = 0;

    public int getHDD() {
        return hdd;
    }

    public void setHDD(int hdd) {
        if (hdd < 0) {
            System.out.println("Заданное значение не допустимо!");
        } else {
            this.hdd = hdd;
        }
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        if (ram < 0) {
            System.out.println("Заданное значение не допустимо!");
        } else {
            this.ram = ram;
        }
    }
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Noutbook {
    private int id;

    private String prod;
    private int ozu;
    private int ssd;
    private int diag;
    private String operSystem;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Noutbook{" +
                "ID = " + id +
                ", Производитель = " + prod +
                ", ОЗУ,ГБ = " + ozu +
                ", SSD,ГБ = " + ssd +
                ", Диагональ,дюйм = " + diag +
                ", Операционная система = " + operSystem +
                ", Цвет = " + color +
                '}' + "\n";
    }

    public List<Noutbook> filter(Set<Noutbook> noutbooks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите параметры ноутбука. " +
                "\nУкажите размер жёсткого диска в ГБ: ");
        String enterSSD = scan.nextLine();
        int intParseEnterSSD = Integer.parseInt(enterSSD);

        System.out.println("Укажите оперативную память в ГБ: ");
        String enterOZU = scan.nextLine();
        int intParseEnterOZU = Integer.parseInt(enterOZU);

        System.out.println("Укажите операционную систему: ");
        String enterOperSystem = scan.nextLine();

        System.out.println("Укажите цвет ноутбука: ");
        String enterColor = scan.nextLine();

        List<Noutbook> listNout = new ArrayList<>();

        for (Noutbook tempNout : noutbooks) {
            if (intParseEnterSSD == tempNout.ssd) {
                if (intParseEnterOZU == tempNout.ozu) {
                    if (enterOperSystem.equals(tempNout.operSystem)) {
                        if (enterColor.equals(tempNout.color)) {
                            listNout.add(tempNout);
                        }
                    }
                }
            }
        }
        return listNout;
    }

    public Set<Noutbook> newFilter(Set<Noutbook> noutbooks) {
        Scanner scan = new Scanner(System.in);

        Set<Noutbook> listNout = new HashSet<>(noutbooks);

        System.out.println("Выберите пункт фильрации: " +
                "\n1. Размер ЖД \n2. Размер оперативной памяти\n3. Тип операционной системы\n4. Цвет");
        String userFilt = scan.nextLine();

        for (int i = 0; i < userFilt.length(); i++) {

            if (1 == Character.getNumericValue(userFilt.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в ГБ: ");
                String enterSSD = scan.nextLine();
                int intParseEnterSSD = Integer.parseInt(enterSSD);

                for (Noutbook tempNout : noutbooks) {
                    if (intParseEnterSSD != tempNout.ssd) {
                        listNout.remove(tempNout);
                    }
                }
            }

            if (2 == Character.getNumericValue(userFilt.charAt(i))) {
                System.out.println("Укажите объем оперативной памяти в ГБ: ");
                String enterOZU = scan.nextLine();
                int intParseEnterOZU = Integer.parseInt(enterOZU);
                for (Noutbook tempNout : noutbooks) {
                    if (intParseEnterOZU != tempNout.ozu) {
                        listNout.remove(tempNout);
                    }
                }
            }

            if (3 == Character.getNumericValue(userFilt.charAt(i))) {
                System.out.println("Укажите операционную систему: ");
                String enterOperSystem = scan.nextLine();
                for (Noutbook tempNout : noutbooks) {
                    if ((enterOperSystem.equals(tempNout.operSystem) == false)) {
                        listNout.remove(tempNout);
                    }
                }
            }

            if (4 == Character.getNumericValue(userFilt.charAt(i))) {
                System.out.println("Укажите цвет ноутбука: ");
                String enterColor = scan.nextLine();
                for (Noutbook tempNout : noutbooks) {
                    if ((enterColor.equals(tempNout.color)) == false) {
                        listNout.remove(tempNout);
                    }
                }
            }
        }
        return listNout;
    }
}

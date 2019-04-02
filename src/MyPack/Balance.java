package MyPack;
/* теперь класс вalance, его конструктор и метод show ()

        являются открытыми.Это означает, что за пределами своего пакета
       они доступны из кода классов, не производных от классов их пакета .
*/
public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print(" --> ");
        System.out.println(name + ": $" + bal);
    }
}
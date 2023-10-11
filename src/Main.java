public class Main {
    public static void main( String[] args ) {

        Pesce p = new Pesce(true, "rosso", "pagliaccio");
        System.out.println(p.toString());
        Pesce p1 = new Pesce(false, "nero", "scemo");
        int[] d = {3,2,2};
        Pesce[] pTot = {p, p1};
        Acquario a = new Acquario(d, pTot);
        System.out.println(a.toString());
    }
}

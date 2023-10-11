public class Main {
    public static void main( String[] args ) {

        Pesce p = new Pesce(true, "rosso", "pagliaccio");
        System.out.println(p.toString());
        Pesce p1 = new Pesce(false, "nero", "scemo");
        int[] d = {3,2,2};
        Pesce[] pTot = {p, p1};
        Acquario a = new Acquario(d, pTot);
        System.out.println(a.toString());
        System.out.printf(a.getDimensioni());
        System.out.println(a.readPesce(1));
        System.out.println(a.removePesce(1));
        Pesce p2 = new Pesce(true, "ROSSO", "PAGLIACCIOpirla");
        System.out.println(a.addPesce(p2));
    }
}

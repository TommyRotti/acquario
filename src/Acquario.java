public class Acquario {

    private Pesce[] pesci;
    private int[] dimensioni;

    public Acquario(int[] dim, int dimArray){
        this.pesci = new Pesce[dimArray];
        for(int i=0; i<dim.length; i++){
            if(dim[i]>0){
              this.dimensioni[i] = dim[i];
            }
        }
    }

    public Acquario(int[] dim, Pesce[] pesci){
        this.pesci = new Pesce[pesci.length];
        for(int i=0; i<dim.length; i++){
            if(dim[i]>0){
                this.dimensioni[i] = dim[i];
            }
        }
        for(int i=0; i<this.pesci.length; i++){
            this.pesci[i] = pesci[i].clone();
        }
    }

}

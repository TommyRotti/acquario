public class Acquario {

    private Pesce[] pesci;
    private int[] dimensioni;

    public Acquario(int[] dim, int dimArray){
        this.pesci = new Pesce[dimArray];
        if(dim.length==3){
            for(int i=0; i<dim.length; i++){
                if(dim[i]>0){
                    this.dimensioni[i] = dim[i];
                }
            }
        }else{
            String s = "Inserisci solo 3 dimensioni";
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

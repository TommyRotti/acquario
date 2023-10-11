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
            String s = "Inserisci solo 3 dimensioni (lunghezza, larghezza, altezza)";
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

    public String getDimensioni(){
        String s = "";
        return s += "lunghezza: "+this.dimensioni[0]+", larghezza: "+this.dimensioni[1]+", altezza: "+this.dimensioni[2];
    }

    public Pesce readPesce(int pos){
        Pesce p = null;
        if(pos>=0 && pos<this.pesci.length){
            p = this.pesci[pos];
        }
        return p;
    }

    public boolean removePesce(int pos){
        boolean b = false;
        if(pos>=0 && pos<this.pesci.length){
            b = true;
            this.pesci[pos] = null;
        }
        return b;
    }



}

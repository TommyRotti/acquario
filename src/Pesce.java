public class Pesce {
    private boolean vita;
    private String colore, specie;

    public Pesce(boolean vita, String colore, String specie){
        if(vita==true || vita==false){
            this.vita = vita;
        }
        if(!(colore.equals(""))){
            this.colore = colore;
        }
        if(!(specie.equals(""))){
            this.specie = specie;
        }
    }

    public boolean getVita(){
        return this.vita;
    }

    public String getColore(){
        return this.colore;
    }

    public String getSpecie(){
        return this.specie;
    }

    public Pesce clone(){
        Pesce newPesce = new Pesce(this.vita, this.colore, this.specie);
        return newPesce;
    }

    public String toString(){
        String rit = "{\n";
        rit += "pesce vivo: "+this.vita+"\n";
        rit += "colore: "+this.colore+"\n";
        rit += "specie: "+this.specie+"\n";
        rit += "}";
        return rit;
    }
    
}
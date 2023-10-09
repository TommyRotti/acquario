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
    
}
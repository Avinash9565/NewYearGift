public abstract class Choclates{
    protected String candy_name;
    Choclates(String name){
        this.candy_name=name;
    }
    public String getName(){
        return candy_name
    }
    public abstract float cost();
}
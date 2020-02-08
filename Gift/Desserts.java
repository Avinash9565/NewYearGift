public abstract class desserts{
    protected String dessert_name;
    desserts(String namedessert){
        this.dessert_name=namedessert;
    }
    public String getName(){
        return dessert_name;
    }
    public abstract float cost();
}
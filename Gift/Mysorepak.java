public class Mysorepak extends Desserts
{
    private float Mysorepak_weight;
    private float mysorepak_cost;
    Mysorepak(String name_of_sweet,float mysorepak_weight,float Mysorepak_cost)
    {
        super(name_of_sweet);
        this.mysorepak_weight=Mysorepak_weight;
        this.mysorepak_cost=mysore_cost;
    }
    public float cost()
    {
        float c = (float)(Mysorepak_weight*mysorepak_cost);
        return c;
    }
}


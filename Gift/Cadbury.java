public class Cadbury extends Choclates
{
    private float cadbury_cost;
    private int no_of_cadbury;
    Cadbury(String name_of_candy,int no_of_cadbury,float cadbury_cost)
    {
        super(name_of_candy);
        this.no_of_cadbury=no_of_cadbury;
        this.cadbury_cost=cadbury_cost;
    }
    public float cost()
    {
        float c=(float)(no_of_cadbury)*(cadbury_cost);
        return c;
    }
}
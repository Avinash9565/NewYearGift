public class Eclairs extends Choclates
{
    private float eclairs_cost;
    private int no_of_eclairs;
    Fuse(String name_of_candy,int no_of_candy,float candy_cost)
    {
        super(name_of_candy);
        this.no_of_eclairs=no_of_candy;
        this.eclairs_cost=candy_cost;
    }
    public float cost()
    {
        float c=(float)(no_of_eclairs)*(eclairs_cost);
        return c;
    }
}
public class Dairymilk extends Choclates
{
    private float dairymilk_cost;
    private int no_of_dairymilks;
    Fuse(String name_of_candy,int no_of_candy,float candy_cost)
    {
        super(name_of_candy);
        this.no_of_dairymilks=no_of_candy;
        this.dairymilk_cost=candy_cost;
    }
    {
    public float cost()
        float c=(float)(no_of_dairymilks)*(dairymilk_cost);
        return c;
    }
}
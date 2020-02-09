import java.util.*;
public class NewYearGift{
    public static void main(String args[]){
        AddItems a=new AddItems();
        float c_cost,s_cost,g_cost;
        float s_weight;
        int no_of_chocolates;
        int c,o;
        HashMap<String,Integer>cho=new HashMap<>();
        HashMap<String,Integer>swe=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter your choice\n1.Adding Desserts\n2.Adding chocolates\n3.sort the choclates\n4.display\n5.exit:");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter your choice\n1.Kazuburfi\n2.Mysorepak\n3.jalebi");
                    o=sc.nextInt();
                    switch(o){
                        case 1:
                            System.out.println("Enter no of Desserts Kazuburfi\n");
                            s_sweet=sc.nextfloat();
                            Kazuburfi kz=new Kazuburfi("kazu",s_sweet,10);
                            s_cost=Kz.cost();
                            a.addSweets(s_cost,"Kazu");
                            break

                        case 2:
                            System.out.println("Enter no of Desserts Mysorepak\n");
                            s_sweet=sc.nextfloat();
                            Mysorepak kz=new Mysorepak("Mysore",s_sweet,10);
                            s_cost=Kz.cost();
                            a.addSweets(s_cost,"Mysore");
                            break

                        case 3:
                            
                            System.out.println("Enter no of Desserts jalebi\n");
                            s_sweet=sc.nextfloat();
                            Jalebi jb=new Jalebi("jalebi",s_sweet,10);
                            s_cost=jb.cost();
                            a.addSweets(s_cost,"jalebi");
                            break
                    }
                case 2:
                    System.out.println("Enter your choice\n1.Cadbury\n2.Dairymilk\n3.eclairs");
                    o=sc.nextInt();
                    switch(o){
                        case 1:
                            
                            System.out.println("Enter no of cadbury you want\n");
                            no_of_chocolates=s.nextInt();
                            Cadbury cd=new Cadbury("Cadbury",no_of_chocolates,40);
                            c_cost=cd.cost();
                            a.addChocolates(c_cost);
                            break;
                        case 2:
                            
                                System.out.println("Enter no of Dairymilk you want\n");
                                no_of_chocolates=s.nextInt();
                                Dairymilk dm=new Dairymilk("Cadbury",no_of_chocolates,40);
                                c_cost=dm.cost();
                                a.addChocolates(c_cost);
                                break;
                        case 3:
                            
                                System.out.println("Enter no of eclairs you want\n");
                                no_of_chocolates=s.nextInt();
                                Eclairs ec=new Eclairs("Cadbury",no_of_chocolates,40);
                                c_cost=ec.cost();
                                a.addChocolates(c_cost);
                                break;
                    }
                case 3:
                    a.sort()
                case 4:
                    a.display()
                case 5:
                    break
            }
        }
    }
}

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

                        case 2:

                        case 3:
                    }
                case 2:
                    System.out.println("Enter your choice\n1.Cadbury\n2.Dairymilk\n3.eclairs");
                    o=sc.nextInt();
                    switch(o){
                        case 1:
                        case 2:
                        case 3:
                    }
                case 3:
                case 4:
                case 5:
                    break
            }
        }
    }
}
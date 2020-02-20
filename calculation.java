import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter total area of the house:");
  float total_area=s.nextFloat();
  System.out.println("Choose the standard of materials from the options given below:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\nEnter your choice:");
  int material_standard=s.nextInt();
  boolean automation=false;
  if(material_standard==3)
  {
  System.out.println("Choose the automation of the house from the options given below:\n\"true\" if you want fully automated home\n\"false\" if you donot want fully automated home");
  automation=s.nextBoolean();
  }
 
  Construction_cost construction_cost_object=new Construction_cost();
  float total_construction_cost=construction_cost_object.construction_cost_calculation(total_area,material_standard,automation);
  System.out.println("The estimated construction cost of the house is: "+total_construction_cost);
  }
}
public class Construction_cost
{
  float total_construction_cost;
  public float construction_cost_calculation(float total_area,int material_standard,boolean automation)
  {
    if(material_standard==1)
    {
      total_construction_cost=total_area*1200;
      return total_construction_cost;
    }
    else if(material_standard==2)
    {
      total_construction_cost=total_area*1500;
      return total_construction_cost;
    }
    else if(material_standard==3)
    {
      if(automation==true)
      {
        total_construction_cost=total_area*2500;
        return total_construction_cost;
      }
      else
      {
        total_construction_cost=total_area*1800;
        return total_construction_cost;
      }
    }
    return 0;
  }
}

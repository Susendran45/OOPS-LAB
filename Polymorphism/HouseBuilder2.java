class ConstructionTeam
{
public void construct()
{
System.out.println("Constructing standard house:");
System.out.println("- Concrete foundation");
System.out.println("- Wooden structure");
System.out.println("- Shingle roof");
System.out.println("- 3 rooms");
}
}
class LuxuryConstructionTeam extends ConstructionTeam
{
@Override
public void construct()
{
System.out.println("Constructing luxury house:");
System.out.println("- Reinforced foundation");
System.out.println("- Steel structure");
System.out.println("- Tile roof");
System.out.println("- 5 rooms with amenities");
}
}
class EcoConstructionTeam extends ConstructionTeam
{
@Override
public void construct()
{
System.out.println("Constructing eco-friendly house:");
System.out.println("- Green foundation");
System.out.println("- Bamboo structure");
System.out.println("- Solar roof");
System.out.println("- 4 rooms with energy saving");
}
}
class HouseBuilder2
{
public static void main(String[] args)
{
ConstructionTeam t1=new ConstructionTeam();
LuxuryConstructionTeam t2=new LuxuryConstructionTeam();
EcoConstructionTeam t3=new EcoConstructionTeam();
System.out.println("=== CONSTRUCTION DEMO ===");
System.out.println("\n1. Standard house:");
t1.construct();
System.out.println("\n2. Luxury house:");
t2.construct();
System.out.println("\n3. Eco-friendly house:");
t3.construct();
}
}
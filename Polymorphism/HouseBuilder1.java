class ConstructionTeam
{
public void constructHouse()
{
System.out.println("Constructing standard house:");
System.out.println("- Concrete foundation");
System.out.println("- Wooden structure");
System.out.println("- Shingle roof");
System.out.println("- 3 rooms");
}
public void constructHouse(int rooms)
{
System.out.println("Constructing house with "+rooms+" rooms");
System.out.println("- Concrete foundation");
System.out.println("- Wooden structure");
System.out.println("- Shingle roof");
}
public void constructHouse(String f,String s,String r)
{
System.out.println("Constructing custom house:");
System.out.println("- "+f+" foundation");
System.out.println("- "+s+" structure");
System.out.println("- "+r+" roof");
System.out.println("- 3 rooms (default)");
}
public void constructHouse(String f,String s,String r,int rm)
{
System.out.println("Constructing full custom house:");
System.out.println("- "+f+" foundation");
System.out.println("- "+s+" structure");
System.out.println("- "+r+" roof");
System.out.println("- "+rm+" rooms");
}
public void constructHouse(double budget)
{
if(budget<100000)
{
constructHouse(2);
}
else if(budget<250000)
{
constructHouse(3);
}
else
{
constructHouse("Reinforced","Steel","Tile",4);
}
}
}
class HouseBuilder1
{
public static void main(String[] args)
{
ConstructionTeam t=new ConstructionTeam();
System.out.println("=== CONSTRUCTION DEMO ===");
System.out.println("\n1. Default house:");
t.constructHouse();
System.out.println("\n2. 5-room house:");
t.constructHouse(5);
System.out.println("\n3. Stone house:");
t.constructHouse("Stone","Wood","Tile");
}
}
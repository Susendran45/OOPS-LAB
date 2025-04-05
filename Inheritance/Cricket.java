class CricketPlayer 
{
String name;
int runs;
CricketPlayer(String name, int runs) 
{
this.name = name;
this.runs = runs;
}
void displayPlayer() 
{
System.out.println("Player: " + name + ", Runs: " + runs);
}
}
class Batsman extends CricketPlayer 
{
double strikeRate;
Batsman(String name, int runs, double strikeRate) 
{
super(name, runs);
this.strikeRate = strikeRate;
}
void displayBatsman() 
{
System.out.println("Strike Rate: " + strikeRate);
}
}
public class Cricket 
{
public static void main(String[] args) 
{
Batsman batsman = new Batsman("Virat Kohli", 12000, 92.5);
batsman.displayPlayer(); 
batsman.displayBatsman(); 
}
}
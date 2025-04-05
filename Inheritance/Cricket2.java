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
class Bowler extends CricketPlayer
{
int wickets;
double economy;
Bowler(String name, int runs, int wickets, double economy)
{
super(name, runs);
this.wickets = wickets;
this.economy = economy;
}
void displayBowler()
{
System.out.println("Wickets: " + wickets + ", Economy: " + economy);
}
}
class AllRounder extends Batsman
{
int wickets;
AllRounder(String name, int runs, double strikeRate, int wickets)
{
super(name, runs, strikeRate);
this.wickets = wickets;
}
void displayAllRounder()
{
System.out.println("Wickets Taken: " + wickets);
}
}
public class Cricket2
{
public static void main(String[] args)
{
System.out.println("Batsman Details:");
Batsman bat = new Batsman("Virat Kohli", 12000, 92.5);
bat.displayPlayer();
bat.displayBatsman();
System.out.println("\nBowler Details:");
Bowler bow = new Bowler("Jasprit Bumrah", 500, 300, 4.5);
bow.displayPlayer();
bow.displayBowler();
System.out.println("\nAll-Rounder Details:");
AllRounder ar = new AllRounder("Shakib Al Hasan", 6000, 85.2, 300);
ar.displayPlayer();
ar.displayBatsman();
ar.displayAllRounder();
}
}
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
double bowlingAvg;
AllRounder(String name, int runs, double strikeRate, int wickets, double bowlingAvg)
{
super(name, runs, strikeRate);
this.wickets = wickets;
this.bowlingAvg = bowlingAvg;
}
void displayAllRounder()
{
System.out.println("Wickets: " + wickets + ", Bowling Avg: " + bowlingAvg);
}
}
class WicketKeeper extends Batsman
{
int catches;
int stumpings;
WicketKeeper(String name, int runs, double strikeRate, int catches, int stumpings)
{
super(name, runs, strikeRate);
this.catches = catches;
this.stumpings = stumpings;
}
void displayWicketKeeper()
{
System.out.println("Catches: " + catches + ", Stumpings: " + stumpings);
}
}
public class Cricket3
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
AllRounder ar = new AllRounder("Shakib Al Hasan", 6000, 85.2, 300, 28.5);
ar.displayPlayer();
ar.displayBatsman();
ar.displayAllRounder();
System.out.println("\nWicket-Keeper Details:");
WicketKeeper wk = new WicketKeeper("MS Dhoni", 8000, 87.6, 250, 100);
wk.displayPlayer();
wk.displayBatsman();
wk.displayWicketKeeper();
}
}
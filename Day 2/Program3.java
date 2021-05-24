
import java.util.*;

class Player implements Comparable<Player> {     
  private String name;     
  private int age;  
  private String game;

  public Player(String name, int age, String game) {         
    this.name = name;         
    this.age = age;
    this.game = game;
  }       

  public String getName() {         
    return name;     
  }       

  public int getAge() {         
    return age;     
  }       
  
  public String getGame() {         
    return game;     
  } 
  
    public int compareTo(Player p) {
	return game.compareTo(p.getGame());
  }
 
  public String toString() {         
    return " Name: " + this.name + ", age:" + this.age + ", Game: " + this.game;     
  } 
}


public class Program3 {
    public static void main(String[] args) throws Exception
    {  
        Player player1 = new Player("John", 26, "Football");         
        Player player2 = new Player("Mart", 23, "Tennis");         
        Player player3 = new Player("Hulk", 20, "Cricket");        
        
        Comparator<Player> gameComparator = Comparator.comparing(Player::getGame);
        
    	TreeSet<Player> myTreeSet = new TreeSet<>(gameComparator);
    	myTreeSet.addAll(Arrays.asList(player1, player2, player3));
    	System.out.println("Players Sorted");
    	
    	myTreeSet = new TreeSet<>();
    	myTreeSet.addAll(Arrays.asList(player1, player2, player3));
    	myTreeSet.forEach(p -> System.out.println(p));
     
    }
}

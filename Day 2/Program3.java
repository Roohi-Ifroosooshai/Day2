
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
  
    public int compareTo(Player p)
    {
    
        if (game.compareTo(p.getGame()) < 0) {
            if(age == p.getAge()){
                int c = ((Player)p).getAge();
                return this.age - c;
            }
            return -1;
            }
        else{
            return 1;
        }
        
    }
    
  public String toString() {         
    return " Name: " + this.name + ", age:" + this.age + ", Game: " + this.game;     
  } 
}


public class Main {
    public static void main(String[] args) throws Exception
    {  
        TreeSet<Player> players = new TreeSet<>();
        
        players.add(new Player("John", 30, "Football"));
        players.add(new Player("Bob", 28, "Basketball"));
        players.add(new Player("Mary", 37, "Tennis"));
        players.add(new Player("Mark", 36, "Basketball"));
      
        for (Player p : players) {
            System.out.println(p);
        }
    }
}

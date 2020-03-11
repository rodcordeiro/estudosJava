/*I was totally inspired by The Adventure Zone podcast so here's a 
Mini RPG Character creation program*/  
import java.util.Random;
import java.io.*;

class RPGCharacter{
    public  String name;
    private String profession;
    private String race;
    private String Alignment;
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;
    
    
 
    public String getRace(){
        return race;
    }
    public String getAlignment(){
        return Alignment;
    }
    public String getProfession(){
        return profession;
    }
    
    public static int rollDice(){
            Random dice = new Random();
             int number = dice.nextInt(3) + 1; //3 is the maximum and the 1 is our minimum 
             return number;
    }
    public static int rollD20(){
        Random d20 = new Random();
        int number = d20.nextInt(20) + 1 ;
        return number;
    }
    public void setAttributes(){
        Strength = rollD20();
        Dexterity = rollD20();
        Constitution = rollD20();
        Intelligence = rollD20();
        Wisdom = rollD20();
        Charisma = rollD20();
        
    }
    
    
    public void ChosenRace(int number){
        
        switch(number){
            case 1: this.race = "Dwarf"; break;
            case 2: this.race =  "Elf"; break;
            case 3: this.race =  "Human"; break;
        }
       
        
    }
    public void ChosenAlignment(int number){
        switch(number){
            case 1: this.Alignment = "Lawful good"; break;
            case 2: this.Alignment = "True neutral"; break;
            case 3: this.Alignment = "Chaotic evil"; break; 
        }
        
    }
    public void ChosenProfession(int number){
        
        switch(number){
            case 1: this.profession = "Mage";break;
            case 2: this.profession = "Warrior"; break;
            case 3: this.profession = "Cleric"; break;
            
        }
    }
    
    
    public String toString(){
        String story = "";
        switch(rollDice()){
            case 1: story = " Your journey begins at an unfamiliar place surrounded by \n Crystals, you can't touch them otherwise you turn into a Crystal \n as well. Your job is to find who is behind this mess";break;
            
            case 2:  story = " You are the only one aware of how the world is going to \n end.Your journey is to find an Artifact that makes time stops";break;
            
            case 3:  story = " You are in the middle of the desert with a small crowd\n  asking for your help to kill a gigant robot that destroyed most of their town.";break;
            
        }
        
        return " Name: "+name+ "\n Profession/Class: "+getProfession()+ " \n Race: "+getRace() + "\n Alignment: " + getAlignment()+ "\n Strength: "+this.Strength+ "\n Dexterity: "+this.Dexterity+"\n Constitution: "+this.Constitution +"\n Intelligence: " + this.Intelligence+"\n Wisdom: "+this.Wisdom+ "\n Charisma: "+this.Charisma +  "\n Story:"+  story;
    }
    
    
}

public class Program
{
    public static void main(String[] args) throws IOException {
        BufferedReader Keyboard = new BufferedReader(new InputStreamReader(System.in));
        RPGCharacter myChar = new RPGCharacter();
        int firstNumber = myChar.rollDice();
        int secondNumber = myChar.rollDice();
        int thirdNumber = myChar.rollDice();
        int fourthNumber = myChar.rollDice();
        System.out.println("Insert character's name: ");
	String name = Keyboard.readLine();
        myChar.name = name;
        System.out.println("=====================================");
        System.out.println("           ROLL A DICE                 ");
        System.out.println("====================================");
        System.out.println("You rolled a : "+ firstNumber + " for your Profession" );
        myChar.ChosenProfession(firstNumber);
        System.out.println("You rolled a : "+ secondNumber + " for your Race" );     
        myChar.ChosenRace(secondNumber);
        System.out.println("You rolled a : "+ thirdNumber + " for your Alignment" );
        myChar.ChosenAlignment(thirdNumber);
        System.out.println(" =======================================");
        System.out.println("          "+name.toUpperCase() +" CHARACTER SHEET");
        System.out.println(" =======================================");
        myChar.setAttributes();
        System.out.println(myChar);
        
            
    }
}

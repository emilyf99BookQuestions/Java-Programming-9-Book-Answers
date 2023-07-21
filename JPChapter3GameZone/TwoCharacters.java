public class TwoCharacters {

    public static void main(String[] args){
        MyCharacter character1 = new MyCharacter();
        MyCharacter character2 = new MyCharacter();

        character1.setName("Darren");
        character1.setLives(3);
        character1.setSpecies("Human");

        character2.setName("Edgmund");
        character2.setLives(1);
        character2.setSpecies("Elf");

        showData(character1);
        showData(character2);
    }

    public static void showData(MyCharacter character){
        System.out.println(character.getName() + ", Lives: " + character.getLives() + ", Species: " + character.getSpecies());
    }

}


/* Then write an application in which you create at least two characters.
In turn, pass each character to a display method that displays the character’s
attributes. Save the application as TwoCharacters.java. */
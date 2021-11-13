public class Tile {
    
    char letter;
    int value;
    
    public Tile (char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    
    public static void printTile(Tile z) {
        System.out.println("Tile " + z.letter + " has a value of " + z.value);
    }
    
    public static void main(String[] args) {
		Tile z = new Tile('z', 10);
        printTile(z);
    }
}

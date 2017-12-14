package javamidterm_simon;

public class Player {
    
    public static int x;
    public static int y;
    public static String name;
    
    public Player(int a, int b) {
        
        x = a;
        y = b;
        
    }
    
    public Player(String nam) {
        
        name = nam;
        
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getName() {
        return name;
    }
    
}

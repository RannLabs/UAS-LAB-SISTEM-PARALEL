public class App {
    private boolean death;
    private String username;
    private int health, ammo;
    
    public App(String username, int ammo){
        this.death = false;
        this.health = 100;
        
        this.username = username;
        this.ammo = ammo;
    }
    
    
    public String getUsername() {
        return this.username;
    }
    
    public int getAmmo() {
        return this.ammo;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public boolean isDeath() {
        return this.death;
    }
    
    public void shot() {
        this.ammo -= 1;
    }
    
    public void getShot() {
        this.health -= 50;
        
        if (this.health <= 0) {
            System.out.println("You death");
            System.exit(0);
        }
    }
    
    
    public static void main(String args[]) {
        App app = new App("Rann", 10);
        
        System.out.println("Username : " + app.getUsername());
        System.out.println("Ammo     : " + app.getAmmo());
        System.out.println("Health   : " + app.getHealth());
        System.out.println("Death    : " + app.isDeath());
        
        System.out.println("");
        
        app.shot();
        System.out.println("Ammo     : " + app.getAmmo());
        
        System.out.println("");
        
        app.getShot();
        System.out.println("Health   : " + app.getHealth());
        
        System.out.println("");
        
        app.getShot();
        System.out.println("Health   : " + app.getHealth());
        
        System.out.println("");
        
        app.getShot();
        System.out.println("Health   : " + app.getHealth());
    }
}

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void  selectChar(){
        //Samurai samurai = new Samurai();
        //Knight knight = new Knight();
        //Archer archer = new Archer();

        Characters[] charList = {new Samurai(), new Knight(), new Archer()};
        for(Characters characters : charList) {
            System.out.println(
                    "ID : " + characters.getId() + "\tKarakter : "+ characters.getCharName()
                    +"\tHasar : " + characters.getDamage()
                    +"\tSağlık : " + characters.getHealth());
        }
        System.out.println("*****************************************************");
        System.out.println("Karakteri seçiniz : 1. Samuray, 2. Şovalye, 3. Okçu");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer((new Samurai()));
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Karakteriniz : " +this.getCharName() + "\tHasar : " + this.getDamage() +
                "\tSağlık : " +this.getHealth() +
                "\tPara : " +this.getMoney());

    }
    public void initPlayer(Characters characters){
        this.setDamage(characters.getDamage());
        this.setHealth(characters.getHealth());
        this.setMoney(characters.getMoney());
        this.setCharName(characters.getCharName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

}

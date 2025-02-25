package Management;

public class Player {
    private String playername;
    private int age;
    private String position;
    private String nationality;

    public Player(String name, int age, String position, String nationality) {
        this.playername = name;
        this.age = age;
        this.position = position;
        this.nationality = nationality;
    }

    public String getName() {
        return playername;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Name: "+playername +" "+"\nAge: "+age +" "+"\nPosition: "+" "+position + "\n Nationality: "+ nationality ;
    }
}
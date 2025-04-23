package academy.codillas.classwork.lesson41;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        int x = getRanking();
        int y = otherPlayer.getRanking();

        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public String toString() {
        return getName() + "-" + getRanking() + "-" + getAge();
    }
}

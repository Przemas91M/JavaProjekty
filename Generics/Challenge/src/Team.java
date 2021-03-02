public abstract class Team implements Comparable<Team>{
    private int score;
    private String name;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team o) {
        if(this.getScore() > o.getScore()){
            return -1;
        } else if(this.getScore() < o.getScore()){
            return 1;
        } else {
            return 0;
        }
    }
}

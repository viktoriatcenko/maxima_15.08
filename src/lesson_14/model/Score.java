package lesson_14.model;

public class Score {

    private Integer games;
    private Integer goals;
    private Integer points;

    public Score(Integer games, Integer points, Integer goals) {
        this.games = games;
        this.points = points;
        this.goals = goals;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}

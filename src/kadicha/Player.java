package kadicha;

public  class Player {

    int health;
    int hits;

    public Player(int health, int hits) {
        this.health = health;
        this.hits = hits;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }


}

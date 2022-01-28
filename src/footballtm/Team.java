package footballtm;

import java.util.List;

public class Team {
    private List<Players> players;
    private List<Managements> managements;

    public Team(List<Players> players, List<Managements> managements) {
        this.players = players;
        this.managements = managements;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void addPlayers(Players player) {
        players.add(player);
    }

    public List<Managements> getManagements() {
        return managements;
    }

    public void setManagements(Managements management) {
        managements.add(management);
    }
}

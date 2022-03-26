package les1;

import java.util.Arrays;

public class Team {
        String teamName;
        Animal[] team;


        public Team(Animal[] team, String teamName) {
            this.teamName = teamName;
            this.team = team;
        }

        public String getTeamName() {
            return teamName;
        }

        public Animal[] getTeam() {
            return team;
        }
    }


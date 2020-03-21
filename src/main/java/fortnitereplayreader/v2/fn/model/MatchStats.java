package fortnitereplayreader.v2.fn.model;

import fortnitereplayreader.v2.model.ReplayEvent;

public class MatchStats extends ReplayEvent {

    public long unknown;
    public long eliminations;
    public float accuracy;
    public long assists;
    public long weaponDamage;
    public long otherDamage;
    public long damageToPlayers = weaponDamage + otherDamage;
    public long revives;
    public long damageTaken;
    public long damageToStructures;
    public long materialsGathered;
    public long materialsUsed;
    public long totalTravelled;

    public MatchStats(Info eventInfo) {
        super(eventInfo);
    }
}

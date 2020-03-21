package fortnitereplayreader.v2.fn.model;

import fortnitereplayreader.v2.model.ReplayEvent;

public class TeamStats extends ReplayEvent {

    public long unknown;
    public long position;
    public long totalPlayers;

    public TeamStats(Info eventInfo) {
        super(eventInfo);
    }
}

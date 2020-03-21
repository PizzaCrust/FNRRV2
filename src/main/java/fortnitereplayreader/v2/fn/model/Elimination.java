package fortnitereplayreader.v2.fn.model;

import fortnitereplayreader.v2.model.ReplayEvent;

public class Elimination extends ReplayEvent {

    public String killerId;
    public String victimId;
    public byte gunType;
    public boolean knocked;

    public Elimination(Info eventInfo) {
        super(eventInfo);
    }

    @Override
    public String toString() {
        return "Elimination{" +
                "killerId='" + killerId + '\'' +
                ", victimId='" + victimId + '\'' +
                ", gunType=" + gunType +
                ", time=" + this.eventInfo.startTime +
                ", knocked=" + knocked +
                '}';
    }
}

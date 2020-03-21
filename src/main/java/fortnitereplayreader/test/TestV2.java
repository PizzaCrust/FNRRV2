package fortnitereplayreader.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import fortnitereplayreader.v2.UReplayReader;
import fortnitereplayreader.v2.fn.FortniteReplayReader;
import fortnitereplayreader.v2.fn.model.Elimination;
import fortnitereplayreader.v2.model.ReplayEvent;
import me.fungames.oodle.Oodle;

public class TestV2 {

    /*
    public static class TestUReplayReader extends UReplayReader {

        public TestUReplayReader(InputStream stream) {
            super(stream);
        }

        @Override
        protected void readEvent(ReplayEvent.Info event) {
            System.out.println(event);
        }

    }
     */

    public static void main(String... args) throws Exception {
        FortniteReplayReader reader = new FortniteReplayReader(new FileInputStream(new File("replay3" +
                ".replay")));
        reader.readReplay();
        System.out.println(reader.replay.meta);
        System.out.println(reader.replay.header);
        for (Elimination elimination : reader.eliminations) {
            System.out.println(elimination);
        }
        /*
        byte[] compressed = Oodle.INSTANCE.compress("test string".getBytes(), 8, 1);
        System.out.println(new String(Oodle.INSTANCE.decompress(compressed,
                "test string".getBytes().length)));

        */
        /*
        FortniteReplayReader reader2 = new FortniteReplayReader(new FileInputStream(new File(
                "replay3.replay")));
        System.out.println(reader2.getMeta().getFriendlyName());
        */
    }

}

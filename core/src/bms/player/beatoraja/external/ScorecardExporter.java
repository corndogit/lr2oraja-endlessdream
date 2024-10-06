package bms.player.beatoraja.external;

import bms.player.beatoraja.MainState;

public class ScorecardExporter implements ScreenShotExporter {
    @Override
    public boolean send(MainState state, byte[] pixels) {
        return false;
    }
}

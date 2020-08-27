package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Atrium;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;

public class AtriumView extends View {


    public AtriumView() {
        super(new Atrium());
    }

}

package org.academiadecodigo.felinux.GameObjects.drugs;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.felinux.GameObjects.map.Map;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Shroom extends GameObject {

    private Picture[] shrooms;
    private Map currentMap;
    private static int purgatoryShroomCounter = 0;
    private static int maxShrooms = 10;
    private static int counter = 0;
    int[][] purgatoryPositions;

    public Shroom(Map currentMap) {
        this.currentMap = currentMap;
        this.shrooms = new Picture[maxShrooms];

        purgatoryPositions = new int [][]{
                new int[]{306,266},
                new int[]{434,252},
                new int[]{238,366},
                new int[]{606,321},
                new int[]{362,422},
                new int[]{250,318},
                new int[]{514,366}
        };
    }

    public void checkIfIsEaten(){

    }

    public void spawnShroom(){
        int randomSpawnTimer = (int) Math.ceil(Math.random() * 600) + 50;

        if(counter <= randomSpawnTimer){
            counter++;
            return;
        }
        counter = 0;

        if(purgatoryShroomCounter == 7){
            return;
        }

        if(currentMap.getClass() == Purgatory.class) {
            this.shrooms[purgatoryShroomCounter] = new Picture(
                    purgatoryPositions[purgatoryShroomCounter][0], purgatoryPositions[purgatoryShroomCounter][1], "/img/element/shrooms/shroom.png"
            );
        }
        for (int i = 0; i < purgatoryShroomCounter; i++) {
            shrooms[i].draw();
        }
        purgatoryShroomCounter++;
    }
}

package Game;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.event.KeyEvent;

public class Frogger_1 extends PApplet {
    public static PApplet processing;

    Frog frog;
    float grid = 50;



    public static void main(String[] args) {
        PApplet.main(new String[]{Frogger_1.class.getName()});

    }
    @Override
    public void settings() {
        size(600, 610);
        processing = this;
    }

    @Override
    public void setup() {
        frog = new Frog(275, 550, grid);
    }

    @Override
    public void draw() {
        background(0);
        frog.show();
    }

    @Override
    public void keyPressed() {
            if (keyCode == UP){
                frog.move(0,-1);
            }
            else if (keyCode == DOWN){
                frog.move(0,1);
            }
            else if (keyCode == RIGHT){
                frog.move(1, 0);
            }
            else if (keyCode == LEFT){
                frog.move(-1,0);
            };
        }
}


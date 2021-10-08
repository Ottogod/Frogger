package Game;

import processing.core.PApplet;

public class Frog extends PApplet implements Action {

    float left;
    float right;
    float bottom;
    float top;


    public Frog(float x, float y, float width){
        // ATTRIBUTS !
        this.left = x;
        this.right = x+width;
        this.bottom = y;
        this.top = y + width;
    }

    void show(){
        Frogger_1.processing.fill(255);
        Frogger_1.processing.rectMode(CORNERS);
        Frogger_1.processing.rect(this.left, this.top, this.right, this.bottom);

    }

    // TRANSFORMATEURS !

    @Override
    public float left(float add) {
        this.left += add;
        return this.left;
    }

    @Override
    public float top(float add) {
        this.top += add;
        return this.top;
    }

    @Override
    public float right(float add) {
        this.right += add;
        return this.right;
    }

    @Override
    public float bottom(float add) {
        this.bottom += add;
        return this.bottom;
    }

    @Override
    public boolean intersection(Action other) {
        return (this.left(0)>= other.right(0) || this.right(0) <= other.left(0) || this.top(0)<= other.bottom(0)||this.bottom(0)>= other.top(0));
    }




    @Override
    public void move(float xdir, float ydir) {
//        left(xdir*50);
//        right(xdir*50);
//        top(ydir*50);
//        bottom(ydir*50);
        left(xdir*50);
        right(xdir*50);
        bottom(ydir*50);
        top(ydir*50);


    }


}
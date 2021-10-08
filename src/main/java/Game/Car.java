package Game;

import processing.core.PApplet;

public class Car extends PApplet implements Action {

    float left;
    float right;
    float bottom;
    float top;

    public Car(float x, float y, float width, float height){
        this.left = x;
        this.right = x+width;
        this.bottom = y;
        this.top = y+height;
    }


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
        return (this.left(0)>=other.right(0) || this.right(0) <= other.left(0)|| this.top(0)<= other.bottom(0)||this.bottom(0)>= other.top(0));
    }

   
    

    @Override
    public void move(float xdir, float ydir) {


    }
}


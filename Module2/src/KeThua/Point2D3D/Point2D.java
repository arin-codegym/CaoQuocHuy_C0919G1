package KeThua.Point2D3D;

import java.util.Arrays;

public class Point2D {
   private float x ;
   private float y ;
   private float [] xy;
    Point2D(){};

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return this.x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return this.y;
    }

    void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return this.xy;
    }

    public void setXY(float x,float y) {
    this.xy = new float[]{this.x,this.y};
    }
    @Override
    public String toString(){
        return "(" + this.x+" , "+this.y+ " )";
    }
}

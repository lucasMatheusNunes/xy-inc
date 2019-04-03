package com.xyinc.to;

public class PoiNextTO {

    private int x;
    private int y;
    private int d;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getMinDistanceX(){
        return (this.getX() - this.getD());
    }

    public int getMaxDistanceX(){
        return (this.getX() + this.getD());
    }

    public int getMinDistanceY(){
        return (this.getY() - this.getD());
    }

    public int getMaxDistanceY(){
        return (this.getY() + this.getD());
    }

}

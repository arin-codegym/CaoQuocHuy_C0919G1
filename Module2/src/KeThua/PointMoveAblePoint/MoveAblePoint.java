package KeThua.PointMoveAblePoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {
    }

    MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    private float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")" + "speed= (" + getXSpeed() + "," + getYSpeed() + ")";
        //sout chỉ trả ve hàm tótring() nếu hàm con không có thì sẽ hiển thị hàm cha còn hàm con nếu có thì chạy hàm con nhưng thực ra là có hàm cha nhung do ghi đè nên ko hiển thị hàm cha//
    }

    MoveAblePoint Move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
        // Move() Trả vê dữ liệu kiểu đối tượng của class MoveABlePoint
        //

    }

}

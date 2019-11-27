package KeThua.PointMoveAblePoint;

public class PointMoveAblePointTest {
    public static void main(String[] args) {
        Point point =new Point(2,3);
        System.out.println(point);
        MoveAblePoint moveAblePoint = new MoveAblePoint(1,2,3,4);
        System.out.println(moveAblePoint);
        moveAblePoint.Move();
        System.out.println(moveAblePoint);
    }
}

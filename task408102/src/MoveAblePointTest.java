public class MoveAblePointTest {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(10.5f,11.5f);
        System.out.println(moveAblePoint);
        moveAblePoint = new MoveAblePoint(9,9,9,9);
        System.out.println(moveAblePoint);
        moveAblePoint.Move();
        System.out.println(moveAblePoint);
    }
}



public class OpertionWithVectors {
    public static void main(String[] args) {
    VectorFromCoordinates v1 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(1,1), new Point(3,3)));
    VectorFromCoordinates v2 =
            new VectorFromCoordinates(new VectorFromPoints(new Point(0,0), new Point(-3,-3)));

    VectorFromCoordinates v3 = new VectorFromCoordinates();
        v3 = sumVectors(v1,v2);
        System.out.print(v3.x+"  ");
        System.out.print(v3.y);
       System.out.print("  angle: " + angleBetwenVectors(v1, v2));
    }

    public static VectorFromCoordinates sumVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        VectorFromCoordinates sum = new VectorFromCoordinates();
        sum.x = a.x + b.x;
        sum.y = a.y + b.y;
        return sum;
    }

    public  static VectorFromCoordinates subVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        VectorFromCoordinates sub = new VectorFromCoordinates();
        sub.x = a.x - b.x;
        sub.y = a.y - b.y;
        return sub;
    }

    public static double multiplicationVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        double res =  (a.x * b.x) + (a.y * b.y);
        return res;
    }
    public static double angleBetwenVectors(VectorFromCoordinates a, VectorFromCoordinates b){
        double res = 0;
        res =   Math.acos(multiplicationVectors(a, b) / (Math.sqrt(Math.pow(a.x,2) + Math.pow(a.y,2)) * Math.sqrt(Math.pow(b.x,2) + Math.pow(b.y,2)) ));
        res = Math.toDegrees(res);
        return res;
    }
}

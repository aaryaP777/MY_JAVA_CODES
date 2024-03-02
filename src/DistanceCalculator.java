public class DistanceCalculator {
    int dist(int x1, int x2, int y1, int y2){
        int xm = x2 - x1;
        int ym = y2 - y1;
        System.out.println("Distance of X coordinate in m: " + xm);
        System.out.println("Distance of Y coordinate in m: " + ym);
        System.out.println();
        return 0;
    }
    float dist(float x1, float x2, float y1, float y2){
        float xkm = (x2 - x1)*(0.001f);
        float ykm = (y2 - y1)*(0.001f);
        System.out.println("Distance of X coordinate in km: " + xkm);
        System.out.println("Distance of Y coordinate in km: " + ykm);
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        DistanceCalculator d = new DistanceCalculator();
        d.dist(2,6,3,4);
        d.dist(2.0f, 6.0f, 3.0f, 4.0f);
    }
}

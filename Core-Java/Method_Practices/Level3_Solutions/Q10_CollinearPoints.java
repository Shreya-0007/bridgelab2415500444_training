public class Q10_CollinearPoints {
    public static boolean collinearUsingSlope(double x1,double y1,double x2,double y2,double x3,double y3){
        double s1 = (y2 - y1) / (x2 - x1);
        double s2 = (y3 - y2) / (x3 - x2);
        double s3 = (y3 - y1) / (x3 - x1);
        return Math.abs(s1 - s2) < 1e-9 && Math.abs(s2 - s3) < 1e-9;
    }
    public static boolean collinearUsingArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return Math.abs(area) < 1e-9;
    }
    public static void main(String[] args){
        double x1=2,y1=4,x2=4,y2=6,x3=6,y3=8;
        System.out.println("Collinear by area? "+collinearUsingArea(x1,y1,x2,y2,x3,y3));
        // slope method might divide by zero if vertical; area method is safer
    }
}

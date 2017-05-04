package baidu;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 * @Author:hanxiao
 * @Description:
 * @Modified By:
 * Created by Administrator on 2017/4/27.
 */
class Point{
    String clo = "";
    int x;
    int y;
    int z;
    Point(String clo,int x,int y,int z){
        this.clo = clo;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class 三角形 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Point[] points=new Point[n];
        int m=0;
        while (m<n){
//            points[m].clo=sc.next();
//            points[m].x=sc.nextInt();
//            points[m].y=sc.nextInt();
//            points[m].z=sc.nextInt();
            Point point = new Point(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            points[m] = point;
            m++;
        }
        double result=0.0;
        double temp=0.0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    temp=count_triangle_area(points[i],points[j],points[k]);
                    if (temp>result){
                        result=temp;
                    }
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println(df.format(result));

    }
    //求三角形面积;
    //返回-1为不能组成三角形;
    public static double count_triangle_area(Point a, Point b, Point c){
        double area = -1;

        if ((!a.clo.equals(b.clo))&&(!a.clo.equals(c.clo))&&(!b.clo.equals(c.clo))||(a.clo.equals(b.clo)&&a.clo.equals(c.clo))){
            double[] side=new double[3];//存储三条边的长度;

            side[0] = sqrt(pow(a.x - b.x,2)+pow(a.y - b.y,2) + pow(a.z - b.z,2));
            side[1] = sqrt(pow(a.x - c.x,2)+pow(a.y - c.y,2) + pow(a.z - c.z,2));
            side[2] = sqrt(pow(c.x - b.x,2)+pow(c.y - b.y,2) + pow(c.z - b.z,2));

            //不能构成三角形;
            if(side[0]+side[1]<=side[2] || side[0]+side[2]<=side[1] || side[1]+side[2]<=side[0]) return area;

            //利用海伦公式。s=sqr(p*(p-a)(p-b)(p-c));
            double p = (side[0]+side[1]+side[2])/2; //半周长;
            area = sqrt(p*(p-side[0])*(p-side[1])*(p-side[2]));

            return area;
        }else {
            return area;
        }


    }
}

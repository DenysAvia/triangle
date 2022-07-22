package com.epam.rd.autotasks.triangle;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle {
double x1, y1, x2, y2, x3, y3, A, B, C;
    public Triangle(Point a, Point b, Point c) {
        //TODO
        this.x1 = a.getX();
        this.y1 = a.getY();
        this.x2 = b.getX();
        this.y2 = b.getY();
        this.x3 = c.getX();
        this.y3 = c.getY();
        A = sqrt(pow((x2-x1),2 ) + pow((y2-y1),2));
        B = sqrt(pow((x3-x2),2 ) + pow((y3-y2),2));
        C = sqrt(pow((x1-x3),2 ) + pow((y1-y3),2));
        if (A+B<=C || A+C<=B || B+C<=A) throw new IllegalArgumentException("Triangle is not exist");
    }

    public double area() {
        //TODO
        double S = (A+B+C)/2;
        double T = sqrt((S*(S-A)*(S-B)*(S-C)));
        return T;
    }

    public Point centroid(){
        //TODO
       double x = (x1+x2+x3)/3;
       double y = (y1+y2+y3)/3;
       return new Point(x, y);
    }

}

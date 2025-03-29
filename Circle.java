public class Circle
{
  double radius,area;
  Circle(double r,double a){
    r=radius;
    a=area;
    }
    void cal_area(){
    area=(22/7)*radius*radius;
    }
    void display(){
    System.out.println("The Area Of The Circle Is "+" "+area);
    }
}

public class sherearea implements ISubscriber{
  public void notifySubscriber(double r){
    double pi=22.0/7.0
    double area = 4*pi*r*r;
    System.out.println("Area= "+ area);
  }

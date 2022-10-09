package com.driver;

public class Main
{
	public static void main(String[] args) {
		Product p=new Product();
		int method1=p.product(1,2);
		int method2=p.product(3,4,5);
		double method3=p.product(6,7);
		System.out.print(method1+" "+method2+" "+method3);
	}
    public static class Product{
        public int product(int x,int y) {
            int prod=x*y;
            return prod;
        }
        public int product(int x,int y,int z) {
            int prod=x*y*z;
            return prod;
        }
        public double product(double x, double y) {
            double prod=x*y;
            return prod;
        }
    }
}


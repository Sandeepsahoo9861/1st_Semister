//Write a java program to calculate the volume of sphere, cuboid and cube by using method 
//overloading.
//Volume of a cube = s * s * s [s: Side of the cube]
//Volume of a Sphere = 4
//3
//× π × r
//3
//[r: radius
import java.util.*;
public class AreaByMethodoverloading{
 
public static double volume(int s)
{
return Math.pow(s, 3);
}
public static double volume(double r)
{
return (4.0/3)*Math.PI*Math.pow(r, 3);
}
public static int volume(int l, int b, int h)
{
return l*b*h;}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("press 1 for cube, 2 for sphere, and 3 for cuboid");
System.out.println("Enter your choice: ");
int c = sc.nextInt();
switch(c)
{
case 1: System.out.println("Enter the side of cube");
int s = sc.nextInt();
System.out.println("volume of cube is: "+volume(s));
break;
case 2: System.out.println("Enter the radius of sphere: ");
double r = sc.nextDouble();
System.out.println("volume of sphere is: "+volume(r));
break;
case 3: System.out.println("Enter the value of three sides of cuboid:");

int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();
System.out.println("volume of cuboid is: "+volume(x,y,z))
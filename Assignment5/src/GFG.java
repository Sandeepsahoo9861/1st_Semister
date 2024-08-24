import java.lang.Math.*; 

  

class GFG  
{ 

    static final double PI = 3.142; 

      

    static double cosXSeriesSum(double x,  

                                 int n) 

    { 

          // here x is in degree. 

        // we have to convert it to radian  

        // for using it with series formula,  

        // as in series expansion angle is in radian 

        

        x = x * (PI / 180.0);  

      

        double res = 1; 

        double sign = 1, fact = 1,  

                         pow = 1; 

        for (int i = 1; i < n; i++) 

        { 

            sign = sign * -1; 

            fact = fact * (2 * i - 1) *  

                               (2 * i); 

            pow = pow * x * x; 

            res = res + sign * pow / fact; 

        } 

      

        return res;  

    } 

      

    // Driver Code 

    public static void main(String[] args)  

    { 

        float x = 90; 

        int n = 3; 

        System.out.println((float)( 

            cosXSeriesSum(x, n) * 1000000) /  

                                 1000000.00); 

    } 
}
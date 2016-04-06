package RNA1;

import java.util.ArrayList;
import java.util.Random;

public class Perceptron 
{
    double alpha;
    int iterations,c;
    int x0;
    double w0;double w1;double w2;
    boolean ready;

    public Perceptron() 
    {
        ready=false;
        w0=0;
        w1=1/10;
        w2=2/10;
        x0=-1;
        iterations=100;
        alpha=0.05;
    }
    
     public Perceptron(int i,double a)
    {
        ready=false;
        newWeights();
        x0=-1;
        iterations=i;
        alpha=a;
    }
     public void newWeights()
     {
        Random r=new Random();
        w0=(r.nextDouble()-alpha);
        w1=(r.nextDouble()-alpha);
        w2=(r.nextDouble()-alpha);
     }
     public double F(double x1,double x2)
     {
         double y=0;
         y=(double)(w1*x1)+(w2*x2)+(w0*x0);
         return y;
     }
     public void OBLIVION()
     {
         ready=false;
         newWeights();
     }     
    public void Learn(ArrayList<Pun> xs)
    {
        ready=false;
        c=0;
        boolean error=true;
        newWeights();
        while(error && c<iterations)
        {
            error=false;
            for(Pun p:xs)
            {
                double x1=(double)p.x;
                double x2=(double)p.y;
                int z;
                if(F(x1,x2)<0)
                    z=-1;
                else
                    z=1;
                if(z!=p.signo)    
                {
                    error=true;
                    w0=(double)w0 + alpha * (1-p.signo * z) *p.signo* x0;
                    w1=(double)w1 + alpha * (1-p.signo * z) *p.signo* x1;
                    w2=(double)w2 + alpha * (1-p.signo * z) *p.signo* x2; 
                }
            }
            c++;
        }
        ready=true;
    }
}

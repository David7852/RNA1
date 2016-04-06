package RNA1;

import java.util.ArrayList;
import java.util.Random;

public class Adaline 
{
    double alpha;
    int iterations;
    int x0;
    double w0;double w1;double w2;
    double minerr;
    boolean ready;
    double aterror;
    
    public Adaline() 
    {
        aterror=0;
        ready=false;
        minerr=0.6;
        w0=0;
        w1=1/10;
        w2=2/10;
        x0=-1;
        iterations=100;
        alpha=0.05;
    }
    public void newWeights()
    {
        Random r=new Random();
        w0=(r.nextDouble());
        w1=(r.nextDouble());
        w2=(r.nextDouble());
    }
    
    public double F(double x)
    {
        double y=0;
        y=Math.tanh(x);
        return y;
    }
    public double df(Pun p)
    {
        
        double y=(p.x*w1)+(p.y*w2)+(x0*w0);
        y=1/(Math.cosh(y)*Math.cosh(y));
        return y;
    }
    public void OBLIVION()
    {
        ready=false;
        newWeights();
        aterror=0;
    }
    
    
    public double process(Pun p)
    {
        Double output = 0.0;
            output = (p.x*w1)+(p.y*w2)+(x0*w0);
        output = sigmoid(output);
        return output;
    }

    private Double sigmoid(Double value) 
    {
            return F(value);
    }

    public void train(ArrayList<Pun> xs) 
    {
        ready=false;
        newWeights();
        aterror=0;
        double desiredOutput = 0;
        double actualOutput = 0;
        for(Pun pp:xs)
        {
            desiredOutput = (double)pp.signo;
            actualOutput = process(pp);
            int c = 0;//c
            aterror=0.5*Math.pow(desiredOutput - actualOutput, 2);
            while(aterror > minerr && c < iterations) 
            {
                for(Pun p:xs)
                {
                    w0+=alpha*((pp.signo-process(p))*df(pp)*x0);
                    w1+=alpha*((pp.signo-process(p))*df(pp)*pp.x);
                    w2+=alpha*((pp.signo-process(p))*df(pp)*pp.y);
                }
                desiredOutput = (double)pp.signo;
                actualOutput = process(pp);
                aterror=Math.pow(desiredOutput - actualOutput, 2);
                c++;
            }
        }
        ready=true;
    }
}

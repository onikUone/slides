import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException{
        
        String path = "./sigmoid.dat";
        double[] x = new double[140+1];
        double[] y = new double[140+1];
        Arrays.fill(x, 0.0);
        Arrays.fill(y, 0.0);
        x[0] = -7.0;
        y[0] = 1.0 / (1.0 + Math.exp(- x[0]));
        for(int i=1; i<x.length; i++){
            x[i] = x[i-1] + 0.1;
            y[i] = 1.0 / (1.0 + Math.exp(- x[i]));
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path)));
        for(int i=0; i<x.length; i++){
            out.write(String.valueOf(x[i]));
            out.write("\t");
            out.write(String.valueOf(y[i]));
            out.println("");
        }
        out.close();
    }
}

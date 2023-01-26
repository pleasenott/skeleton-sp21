package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        SLList<Integer> test = new SLList<Integer>();
        AList<Integer> Ns =  new AList<Integer>();
        AList<Double> time = new AList<>();
        AList<Integer> op=new AList<>();
        int i;
        int s=1000;
        for(int j=1;j<9;j++,s=s*2)
        {
            Stopwatch sw1 = new Stopwatch();
            for(i=0;i<s;i++)
            {
                test.addLast(i);
            }
            Ns.addLast(s);
            time.addLast(sw1.elapsedTime());
            op.addLast(10000);
        }
        printTimingTable( Ns,  time, op);


    }

}

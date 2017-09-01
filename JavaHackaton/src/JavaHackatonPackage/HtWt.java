package JavaHackatonPackage;
import java.util.ArrayList;
import java.util.Collections;

public class HtWt implements Comparable<HtWt>{
    int ht;
    int wt;
    
    HtWt(int h,int w)
    {
        ht = h;
        wt = w;
    }   
    @Override
    public int compareTo(HtWt o) {
    
        if(this.ht == o.ht)
        {
            if(this.wt == o.wt)
            	return 0;
            else
                return this.wt>o.wt?1:-1;
        }
        else
        {
            return this.ht>o.ht?1:-1;
        }
        
    }

    @Override
    public String toString() {
        return "("+ht+","+wt+")";
    }
    
    static int findMaxSeqLength(int[] wts)
    {
        int fitlength = 0;
        int maxseqlength = 0;
   for(int i =1;i<wts.length;i++)
    {
        
        if(wts[i]>wts[i-1])
        {
            if((i-1)==0 || i==wts.length-1){
            fitlength+=1;}
            fitlength++;
        }
        else 
        {
            fitlength = 0;
        }
        if(fitlength>maxseqlength)
                maxseqlength = fitlength;
    }
    
    return maxseqlength;
    }

public static void main(String args[])
{
    
    ArrayList<Integer> maxSeqLengths = new ArrayList<Integer>();
    
   /* HtWt obj1 = new HtWt(65,100);
    HtWt obj2 = new HtWt(70,150);
    HtWt obj3 = new HtWt(56,90);
    HtWt obj4 = new HtWt(75,190);
    HtWt obj5 = new HtWt(60,95);
    HtWt obj6 = new HtWt(68,110);
    */
    HtWt obj1 = new HtWt(68,119);
    HtWt obj2 = new HtWt(70,200);
    HtWt obj3 = new HtWt(56,90);
    HtWt obj4 = new HtWt(75,190);
    HtWt obj5 = new HtWt(55,90);
    HtWt obj6 = new HtWt(68,110);
    
    ArrayList<HtWt> mylist = new ArrayList<>();
    mylist.add(obj1);
    mylist.add(obj2);
    mylist.add(obj3);
    mylist.add(obj4);
    mylist.add(obj5);
    mylist.add(obj6);
    Collections.sort(mylist);
   int[] wts = new int[mylist.size()];
   int j = 0;
    for(HtWt i:mylist)
    {
        System.out.println(i);
        wts[j++] = i.wt;
    }
   int maxseqlength = findMaxSeqLength(wts);
    System.out.println("length="+maxseqlength);
    
    
}
}
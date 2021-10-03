import java.util.HashSet;
import java.util.TreeSet;
public class SetExample{
    public void hastSetEx() {

        HashSet<String> hm=new HashSet<String>();
        hm.add("Raj");
        hm.add("Esha");
        hm.add("Sonali");
        hm.add("Akshay");
        hm.add("Yogesh");
        hm.add("Bala");
        hm.add("Esha");
        hm.add("Sonali");
        hm.add("Akshay");
        hm.add(null);
        hm.add(null);
        hm.add(null);
        
        
        System.out.println(hm);
        System.out.println("------------------------------");
        HashSet h=new HashSet();
        h.add("java");
        h.add(2334);
        h.add("56.999");
        h.add(999878);
        System.out.println(h);
        }

    public void treeSetEx() {


        TreeSet<String> hm=new TreeSet<String>();
        hm.add("Raj");
        hm.add("Esha");
        hm.add("Sonali");
        hm.add("Akshay");
        hm.add("Yogesh");
        hm.add("Bala");
        hm.add("Esha");
        hm.add("Sonali");
        hm.add("Akshay");
        
        
        System.out.println(hm);
        System.out.println("------------------------------");
        TreeSet <Integer> al=new TreeSet<Integer>();
        al.add(33344);
        al.add(44);
        al.add(222);
        al.add(4);
        al.add(8);
        System.out.println(al);
        // System.out.println("------------------------------");
        // TreeSet al1=new TreeSet();
        // al1.add(3);
        // al1.add(44);
        // al1.add("222");
        // al1.add(4);
        // al1.add(8);
        // System.out.println(al1); //Will throw an exception, it has to be a single data type. Either int or String.
        
        
        
        }
   
    public static void main(String[] args) {
        SetExample es=new SetExample();
        //es.hastSetEx();
        es.treeSetEx();
        }

 

   

}
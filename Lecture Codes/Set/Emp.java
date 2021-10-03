import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Emp implements Comparable<Emp>{

    private int id;
    private String name;
    private String email;
    
    public Emp(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
    }
    
    public int getId() {
    return id;
    }
    
    public void setId(int id) {
    this.id = id;
    }
    
    public String getName() {
    return name;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setEmail(String email) {
    this.email = email;
    }
    
    
    public String toString() {
    return id + " " + name + " " + email;
    }
    
    @Override
    public int compareTo(Emp e) {
    return id-e.id;
    }

    

    public void linkedHashsetEx() {
        LinkedHashSet<Emp> hm=new LinkedHashSet<Emp>();
        hm.add(new Emp(103, "Shrma", "sh@gmail.com"));
        hm.add(new Emp(101, "Raj", "r@gmail.com"));
        hm.add(new Emp(104, "Ravi", "ri@gmail.com"));
        hm.add(new Emp(102, "umesh", "u@gmail.com"));
        
        for(Emp e:hm) {
        System.out.println(e);
        }
        
        }

      
            
            
            
            
            
        public static void main(String[] args) {
        SetExample es=new SetExample();
        es.hastSetEx();
        System.out.println("---------------------------");
        es.treeSetEx();
        // System.out.println("---------------------------");
        // es.linkedHashsetEx();
        }
    
    
    }
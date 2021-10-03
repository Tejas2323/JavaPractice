public void comparableEx() {
    ArrayList<Emp> hm=new ArrayList<Emp>();
    hm.add(new Emp(103, "Shrma", "sh@gmail.com"));
    hm.add(new Emp(101, "Raj", "r@gmail.com"));
    hm.add(new Emp(104, "Ravi", "ri@gmail.com"));
    hm.add(new Emp(102, "umesh", "u@gmail.com"));
    for(Emp e:hm) {
    System.out.println(e);
    }
    System.out.println("---------------------");
    Collections.sort(hm);
    for(Emp e:hm) {
    System.out.println(e);
    }
    
    }
    
    public void sortFirst() {
    ArrayList<Student> sl=new ArrayList<Student>();
    sl.add(new Student(1,"Raj", "q@gmail.com", "09548877", "Jalgaon"));
    sl.add(new Student(4,"Abhi", "w@gmail.com", "02298877", "Kalyan"));
    sl.add(new Student(3,"Shama", "sr@gmail.com", "998998877", "Pune"));
    sl.add(new Student(5,"Sahil", "rs@gmail.com", "07778877", "Mumbai"));
    sl.add(new Student(2,"Kala", "k@gmail.com", "88898877", "Thane"));sl.add(new Student(1,"Raj", "r@gmail.com", "09998877", "Jalgaon"));
    
    for(Student s:sl) {
    System.out.println(s);
    }
    Collections.sort(sl,new StudentSortB
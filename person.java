class person {
    String name;
    int age;
    person(){
        name="radhik";
        age=19;
    }
    void displayPersonDetails(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    class employee extends person{
        double annual;
        int year;
        String national;
    employee(){
        annual=50.00;
        year=2006;
        national="indian";


    }
    void displayEmployeeDetails(){
        System.out.println("annual"+annual);
        System.out.println("year"+year);
        System.out.println("national"+national);
    }
    
    public static void main(String[] args) {
        employee emp1=new employee();
        emp1.displayPersonDetails();
    }
}
}
 class Myclass {
    int x,y,total;
    String a;
    void displayMessage()
    {
        a="welcome to java";
        System.out.println(a);
    }
    void calculation(){
        x=2;y=5;
        total=x+y;
        System.out.println(total);
    } 
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.displayMessage();
        obj.calculation();
    }
    
}

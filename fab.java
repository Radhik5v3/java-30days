class fab{
    int k=0;
    int a=0;
    int b=1;
    
    
 void fabi(){
    
    k=1;
   
    while(k<15){
        k=a+b;
        System.out.println(k);
     a=b;
     b=k;
    }
 }
 public static void main(String[] args) {
    fab fa =new fab();
    fa.fabi();
 }
}
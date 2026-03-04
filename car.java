 class car {
        String carmodel;
        int numberplate;
        void get(){
            carmodel="bmw";
            numberplate=006;
            System.out.println("carmodel"+carmodel+"numberplate"+numberplate);
        }
        class vehicle extends car{
                String bikename;
                int numberplat;
                void set(){
                    bikename="platina";
                    numberplat=007;
                    System.out.println("bikename"+bikename+"numberplate"+numberplate);
                }            
        } 
        public static void main(String[] args) {
            vehicle obj=new vehicle();
            obj.get();
            obj.set();
        }
    }
    


class CloneDemo implements Cloneable{
    int i;
    int j;
    CloneDemo(int i, int j){
        this.i = i;
        this.j = j;
    }

    protected Object clone() throws CloneNotSupportedException{
        return Object;
        
    }

    void show(){
        System.out.println("i: "+this.i+", j: "+this.j);
    }

}

class CloneTest extends CloneDemo{


    CloneTest(int i, int j){
        super(i,j);
    }

    

    public static void main(String[] args) throws CloneNotSupportedException{
        try{
            CloneDemo obj1 = new CloneDemo(5,4);
            CloneDemo obj2 = (CloneDemo)obj1.clone();
            obj2.show();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
public class ThisDemo{
    int empID;
    int empSalary = 0;
    int empAge;
    
    ThisDemo(int empID, int empSalary, int empAge){
        this.empID = empID;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    ThisDemo checkAge(ThisDemo emp2){
        System.out.println(empSalary);
        System.out.println(this.empSalary);

        if(this.empAge > emp2.empAge){
            return this;
        }
        return this;
    }

    void show(){
        System.out.println("In Show Method: "+this.empAge);
    }


    public static void main(String[] args){
        ThisDemo emp1 = new ThisDemo(1, 25000, 24);
        ThisDemo emp2 = new ThisDemo(2, 24000, 23);

        ThisDemo emp = emp1.checkAge(emp2);

        emp.show();
    }
}
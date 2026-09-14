package lessons.methods;

public class VarArgs {
    public static void main(String[] args) {

        System.out.println(max());
        System.out.println(max(10,20));
        System.out.println(max(-12,10,0,12819,1828,38,3753));

        System.out.println();

        System.out.println(sum());
        System.out.println(sum(2,4,6));
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(12,3,4,2,1,5,2,51,4,2,4,1,4,1,4,6,36,146));

        System.out.println();

        VarArgs person1 = new VarArgs();
        VarArgs person2 = new VarArgs();
        VarArgs person3 = new VarArgs();
        
        System.out.println("discount is: " + person1.discount(10,30,50,80,30));
        System.out.println("discount is: " + person2.discount(200,300,400,50,700));
        System.out.println("discount is: " + person3.discount(1000,500,3000,3500,5000));

    }
    static int max(int ...x){ // Similar to array but different
        if(x.length == 0)
            return Integer.MIN_VALUE;
        int maxNum = x[0];
        for(int i = 1; i < x.length; i++){
            if(maxNum < x[i])
                maxNum = x[i];
        }
        return maxNum;
    }
    static int sum(int ...arr){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }
    double discount(double... items){
        double sum = 0;
        double discount = 0;
        for(int i = 0; i < items.length; i++){
            sum += items[i];
        }
        if(sum <= 500)
            discount = 0.05 * sum; // 5% discount
        else if(sum >= 1000 && sum <= 2000)
            discount = 0.10 * sum; // 10% discount
        else{
            discount = 0.20 * sum; // 20% discount
        }
        return discount;
    }
    
}


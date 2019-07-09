package exercise.exercise_0708;

/*
2的个数
 */
public class Count2 {
    public static void main(String[] args) {
        System.out.println(countNumberOf2s(156257712));
    }
    public static int countNumberOf2s(int n) {
        if(n < 1){
            return 0;
        }
        long d = 10;
        int count = 0;
        while(n*10>=d){
            int tmp = n%((int)d);
            count += ((d/10)*(n/d)+(tmp>=(3*(d/10)-1) ? d/10
                    :(tmp>=2*(d/10) ? (tmp%(2*d/10)+1):0)));
            d*=10;
        }
        return count;
    }
}
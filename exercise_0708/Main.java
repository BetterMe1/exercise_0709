package exercise.exercise_0708;


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");
        for(int i=strs.length-1; i>=0; i--){
            System.out.print(strs[i]);
            if(i!=0){
                System.out.print(" ");
            }else{
                System.out.println();
            }
        }
    }
}
*/

/*
简单错误记录
 */
import java.util.*;

/*
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer>sum = new ArrayList<>();
        while(in.hasNext()){
            String[] strs = (in.next()).split("\\\\");
            String name = strs[strs.length-1];
            name= name+" "+in.next();
            int index = names.indexOf(name);
            if(index != -1){//存在
                sum.set(index,sum.get(index)+1);
            }else{
                names.add(name);
                sum.add(1);
            }
        }
        String[] namestmp = new String[names.size()];
        names.toArray(namestmp);
        Integer[] sumtmp = new Integer[sum.size()];
        sum.toArray(sumtmp);
        //排序
        for(int i=0; i<namestmp.length; i++){
            int maxIndex = i;
            for(int j=i+1; j<namestmp.length; j++){
                if(sumtmp[j] > sumtmp[maxIndex]){
                    maxIndex = j;
                }
            }
            String name1 = namestmp[maxIndex];
            System.arraycopy(namestmp,i,namestmp,i+1,maxIndex-i);
            namestmp[i] = name1;
            Integer sum1 = sumtmp[maxIndex];
            System.arraycopy(sumtmp,i,sumtmp,i+1,maxIndex-i);
            sumtmp[i] = sum1;
        }
        //输出
        for(int i=0; i<Math.min(namestmp.length,8); i++){
            String name = namestmp[i];
            String a = name.split(" ")[0];
            String b = name.split(" ")[1];
            if(a.length()>16){
                name = a.substring(a.length()-16)+" "+b;
            }
            System.out.println(name+" "+sumtmp[i]);
        }
    }
}
*/

/*
在霍格沃茨找零钱（20）
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sP = in.next().split("\\.");
        String[] sA = in.next().split("\\.");
        int[] P = new int[3];
        int[] A = new int[3];
        int[] result = new int[3];
        for(int i=0;i<3; i++){
            P[i] = Integer.parseInt(sP[i]);
            A[i] = Integer.parseInt(sA[i]);
        }
        boolean f = false;
        for(int i=0;i<3; i++){
            if(A[i] > P[i]){
                break;
            }else if(A[i] < P[i]){
                int[] tmp = {A[0],A[1],A[2]};
                A = P;
                P = tmp;
                f = true;
                break;
            }
        }
        int[] num = {0,17,29};
        int b = 0;//借位
        for(int i=2;i>=0; i--){
            A[i] = A[i]-b;
            if(A[i]>= P[i]){
                result[i] = A[i]-P[i];
                b=0;
            }else{
                b = (P[i]-A[i])/num[i]+1;
                result[i] = num[i]*b+A[i]-P[i];
            }
        }
        if(f){//钱不够支付
            System.out.print("-");
        }
        System.out.println(result[0]+"."+result[1]+"."+result[2]);
    }
}
*/

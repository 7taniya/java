import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,t,r,s=0;
         n=sc.nextInt();
         t=n;
        while(n>0){
        r=n%10;
        s=s+(r*r*r);
        n=n/10;

        }
if(s==t){
System.out.println("Armstrong");
}else{
System.out.println("Not Armstrong");
}

    }
    
}

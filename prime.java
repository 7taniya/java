import java.util.*;
public class prime {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int f=1,c=0;
    while(f<=n){
     if(n%f==0){
        c=c+1;
        
     }f++;
    }
    
     if(c==2){
        System.out.println("PRIME"+n);
    }else{
       System.out.println("NOT PRIME"+n); 
    } 
}
}

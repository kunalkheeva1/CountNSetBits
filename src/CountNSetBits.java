public class CountNSetBits {

    public static int countNSetBits(int n){
        if(n==0){
            return 0;
        }
        int p=0;
        int ans = 0;
        while(n>=Math.pow(2,p)){
            p++;
        }
        p--;
        int pp =(int)Math.pow(2,p);

        ans = p*pp/2 + n-pp+1 + countNSetBits(n-pp);
        return ans;






    }


    public static void main(String[] args) {

    }
}

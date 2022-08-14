public class CountNSetBits {

    //count the n bits
    public static int countNSetBits(int n){
        //if n is 0 then return 0
        if(n==0){
            return 0;
        }

        //take p as a power and ans to return answer at the end
        int p=0;
        int ans = 0;


        //until it becomes n or greater than it, increment it, and reduce by one after breaking the loop
        // that is because we need the closest 2^p to n
        while(n>=Math.pow(2,p)){
            p++;
        }
        p--;

        //pp is the number until which the formula works in the first step of the answer
        int pp =(int)Math.pow(2,p);

        //second step is basically for the one column next of the bits(which is basically)
        // the number - number where we found the bits already and add1
        // then call the method again for the remaining bits at the bottom right
        ans = p*pp/2 + n-pp+1 + countNSetBits(n-pp);
        return ans;
    }
    //https://youtu.be/g6OxU-hRGtY refer to this link for more details


    public static void main(String[] args) {

    }
}

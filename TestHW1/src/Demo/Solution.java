package Demo;

public class Solution {
    private static int fifty = 1;
    private static int twenty = 1;
    private static int five = 2;
    private static int one = 3;


    public static boolean check(int num){
        int sum = 0;
        for(int i=0;i<=fifty;i++){
            if(sum == num ){
                return true;
            }
            for(int j=0;j<=twenty;j++){
                if(sum == num){
                    return true;
                }
                for(int k=0;k<=five;k++){
                    if(sum == num){
                        return true;
                    }
                    for(int l=0;l<=one;l++){
                        if(sum==num){
                            return true;
                        }
                        sum += 1;
                    }
                    sum -= 4;
                    sum += 5;
                }
                sum -= 15;
                sum += 20;
            }
            sum -= 40;
            sum += 50;
        }
        return false;
    }

    public static void main(String[]args){
        System.out.println(check(29));
        System.out.println(check(0));
        System.out.println(check(84));
        System.out.println(check(11));
    }

}

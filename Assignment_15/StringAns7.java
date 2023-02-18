public class StringAns7 {
    public static void main(String[] args) {
        String s="Hello,have a good day";
        String regexString="([aeiousAEIOUS//+])";
        String s2=s.replaceAll(regexString,"");
        System.out.println(s2);     
    }                           //ans is Hll,hv  gd dy
}

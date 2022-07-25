package string;

public class Backwards {
    private String str;
    private String revStr;

    Backwards(String str) {
        this.str = str;
        this.revStr = "";
    }
    public void reverse(int idx) {
        if (idx != str.length()-1) reverse(idx+1);

        revStr += str.charAt(idx);
    }
    public String getStr(){
        return str;
    }
    public String getRevStr(){
        return revStr;
    }
}
class Demo{
    public static void main(String[] args) {
        String example = "Улет";
        int testIndex = 0;
        Backwards s = new Backwards(example);
        s.reverse(testIndex);
        String revExample = s.getRevStr();
        System.out.println(revExample.substring(0,1).toUpperCase() + revExample.substring(1).toLowerCase());
    }
}


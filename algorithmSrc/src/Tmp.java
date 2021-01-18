

public class Tmp {
    public static void switchMethod(String str){
        switch(str) {
            case "a":
                System.out.println("String is a");
            case "b":
                System.out.println("String is b");
        }
    }
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(10);
        sb.append("12345678");
        sb.insert(3,"Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}

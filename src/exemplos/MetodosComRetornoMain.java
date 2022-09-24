package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        String dc = batman();
        System.out.println(dc);
        String dc1 = superMan();
        System.out.println(dc1);
        String dc2 = wonderWoman();
        System.out.println(dc2);
        String dc3 = cyborg();
        System.out.println(dc3);
        String dc4 = theFlash();
        System.out.println(dc4);

//        System.out.println(batman());
//        System.out.println(superMan());
//        System.out.println(wonderWoman());
//        System.out.println(cyborg());
//        System.out.println(theFlash());
    }

    public static String batman(){
        return "batman";
    }
    public static String superMan(){
        return "superMan";
    }
    public static String wonderWoman(){
        return "wonderWoman";
    }
    public static String cyborg(){
        return "cyborg";
    }
    public static String theFlash(){
        return "theFlash";
    }
}

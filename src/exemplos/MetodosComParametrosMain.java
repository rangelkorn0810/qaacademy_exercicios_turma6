package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        cores1(" amarelo", " branco");
        cores2(" creme", " dark");
        cores3(" escuro"," forte");
        cores4(" gradiente",  " high");
        cores5(" ice", " junho");

        String vermelho = vermelho("vermelho1 ", "vermelho2");
        System.out.println(vermelho);
        String roxo = roxo("roxo1 ", "roxo2");
        System.out.println(roxo);
        String magenta = magenta("magenta1 ", "magneta2");
        System.out.println(magenta);
        String cyan = cyan("cyan1 ", "cyan2");
        System.out.println(cyan);
        String preto = preto("preto1 ", "preto2");
        System.out.println(preto);
    }
    public static void cores1(String a, String b){
        System.out.println("o texto é" + a + b);
    }
    public static void cores2(String c, String d){
        System.out.println("o texto é" + c + d);
    }
    public static void cores3(String e, String f){
        System.out.println("o texto é" + e + f);
    }
    public static void cores4(String g, String h){
        System.out.println("o texto é" + g + h);
    }
    public static void cores5(String i, String j){
        System.out.println("o texto é" + i + j);
    }

    public static String vermelho(String a, String b){
            return a + b;
    }
    public static String roxo(String c, String d){
        return c+d;
    }
    public static String magenta(String e, String f){
        return e+f;
    }
    public static String cyan(String g, String h){
        return g+h;
    }
    public static String preto(String i, String j){
        return i+j;
    }


}

public class App {
    public static void main(String[] args) throws Exception {
        int  indice = 10;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k+1;
            soma = soma + k;
        }

        System.out.println(soma);
    }
}

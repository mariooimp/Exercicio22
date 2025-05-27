package exercicio22.Exercicio22;

public class Exercicio22 {

    public static void main(String[] args) {
        int i = 1;
        int resultado = 0;
        
        while(i<1001) {
            resultado += i; //resultado = resultado + i;
            i++;
            
        }
        double media = resultado / 1000;
        System.out.println(media);
    }
}
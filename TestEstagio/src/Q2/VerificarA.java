package Q2;

public class VerificarA {
    public static void main(String[] args) {
        verificarA("Brasil");
    }

    public static void verificarA(String palavra){
        int quantidadeA= 0;
        for (int i = 0; i < palavra.length() ; i++) {
            if((palavra.charAt(i) == 'a') || (palavra.charAt(i) == 'A')){
                quantidadeA++;
            }
        }
        if(quantidadeA == 0){
            System.out.println("Não exite a letra A ou a na palavra: "+ palavra);
        }else {
            System.out.println("A letra a ou A exite na palavra " + palavra +" e aparece "+ quantidadeA + " vezes");
        }
    }

}

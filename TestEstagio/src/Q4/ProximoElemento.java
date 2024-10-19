package Q4;

public class ProximoElemento {

        public static void main(String[] args) {
            int[] seqA = {1, 3, 5, 7};
            int proximoA = seqA[seqA.length - 1] + 2;
            System.out.println("a) Próximo elemento: " + proximoA);

            int[] seqB = {2, 4, 8, 16, 32, 64};
            int proximoB = seqB[seqB.length - 1] * 2;
            System.out.println("b) Próximo elemento: " + proximoB);

            int[] seqC = {0, 1, 4, 9, 16, 25, 36};
            int proximoC = (seqC.length) * (seqC.length);
            System.out.println("c) Próximo elemento: " + proximoC);

            int[] seqD = {4, 16, 36, 64};
            int proximoD = (seqD.length + 2) * (seqD.length + 2);
            System.out.println("d) Próximo elemento: " + proximoD);

            int[] seqE = {1, 1, 2, 3, 5, 8};
            int proximoE = seqE[seqE.length - 1] + seqE[seqE.length - 2];
            System.out.println("e) Próximo elemento: " + proximoE);

            int[] seqF = {2, 10, 12, 16, 17, 18, 19};
            int proximoF = seqF[seqF.length - 1] + 1;
            System.out.println("f) Próximo elemento: " + proximoF);
        }


}

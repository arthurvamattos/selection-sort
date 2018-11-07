package sort;

public class Selection {

    private int[] elementos = {8, 9, 6, 5, 7, 1, 10, 4, 2, 3};

    public void imprimir() {
        for (int e : elementos)
            System.out.print(e + " ");
    }

    public void sort() {
        int aux;
        for (int i = 0; i < elementos.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[j] < elementos[menor]) {
                    menor = j;
                }
            }
            aux = elementos[i];
            elementos[i] = elementos[menor];
            elementos[menor] = aux;
        }
    }
}

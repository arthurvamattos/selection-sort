package sort;

public class Testar {

    public static void main(String[] args) {

        Selection sel = new Selection();
        System.out.println("Vetor não ordenado:");
        sel.imprimir();
        sel.sort();
        System.out.println("\nVetor ordenado:");
        sel.imprimir();
        sel.sortDecrescente();
        System.out.println("\nVetor decrescente:");
        sel.imprimir();
    }
}

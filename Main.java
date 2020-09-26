public class Main {

    public static void main(String[] args) {
        Fila<Integer> fila1 = new Fila<>(Integer.class,5);
        Fila<Integer> fila2 = new Fila<>(Integer.class,5);

        fila1.add(1);
        fila1.add(30);
        fila1.add(50);

        fila2.add(0);
        fila2.add(8);
        fila2.add(11);
        fila2.add(15);
        fila2.add(26);
        fila2.add(29);

        Fila<Integer> resultado = Ordenar.crescente(fila1,fila2);

        while(!resultado.isEmpty()) System.out.println(resultado.remove());
    }

}
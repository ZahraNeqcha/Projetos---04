public class Impressora {
    public void exibir(float valor) {
        System.out.println(valor);
    }
    public void exibir(float valor1, float valor2) {
        System.out.println(valor1 + ", " + valor2);
    }
    public void exibir(float valor, String texto) {
        System.out.println(valor + ", " + texto);
    }
    public void exibir(String texto, float valor) {
        System.out.println(texto + ", " + valor);
    }
    public void exibir(String texto1, String texto2, String texto3) {
        System.out.println(texto1 + ", " + texto2 + ", " + texto3);
    }

    public void exibir(int valor1, int valor2, String texto) {
        System.out.println(valor1 + ", " + valor2 + ", " + texto);
    }
}


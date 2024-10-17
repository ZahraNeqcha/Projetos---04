public class TesteCalculadoraCientifica {
  public static void main(String[] args) {
    CalculadoraCientifica calc = new CalculadoraCientifica();

    System.out.println("Raiz de 9 : " + calc.raiz(9));
    System.out.println("Raiz de 16.0 : " + calc.raiz(16.0));
    System.out.println("Raiz de '25' : " + calc.raiz("25"));

    System.out.println("Potência de 2^3 : " + calc.potencia((byte) 2, (byte) 3));
    System.out.println("Potência de '4' ^ '2' : " + calc.potencia("4", "2"));
    System.out.println("Potência de 5^2.5 : " + calc.potencia(5, 2.5));
  }
}
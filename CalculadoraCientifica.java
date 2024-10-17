public class CalculadoraCientifica {

  public double raiz(int valor) {
      return Math.sqrt(valor);
  }

  public double raiz(double valor) {
      return Math.sqrt(valor);
  }

  public double raiz(String valor) {
      double numero = Double.parseDouble(valor);
      return Math.sqrt(numero);
  }

  public double potencia(byte a, byte b) {
      return Math.pow(a, b);
  }
  public double potencia(String s1, String s2) {
      double base = Double.parseDouble(s1);
      double expoente = Double.parseDouble(s2);
      return Math.pow(base, expoente);
  }
  public double potencia(int a, double b) {
      return Math.pow(a, b);
  }
}
public class TesteImpressora {
  public static void main(String[] args) {
      Impressora impressora = new Impressora();

      impressora.exibir(10.5f);
      impressora.exibir(5.5f, 7.2f);
      impressora.exibir(9.8f, "Nota final");
      impressora.exibir("Resultado", 8.5f);
      impressora.exibir("Aluno", "do", "Terceiro Ano");
      impressora.exibir(2, 3, "Concluiu com exito");
  }
}
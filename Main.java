import java.util.Random;

class Main {
  public static void main(String[] args) {

            CLista L = new CLista();
            //for (int i = 5; i <= 13; i += 4)
            //    L.Diferente(i);
            L.insereFim(1);
            L.insereFim(2);
            L.insereFim(3);
            L.insereFim(1);
            L.insereFim(2);
            L.insereFim(1);
            L.imprimeFormatoLista();

//    CLista L = new CLista();
    Random R = new Random();
    
    if(L.vazia())
      System.out.println("A lista L está vazia! Qtde. elementos = "+L.quantidade());
    else
      System.out.println("A lista L possui elementos! Qtde. elementos = "+L.quantidade());

    for(int i = 0; i < 15; i++)
       L.insereFim(R.nextInt(51));

    L.imprimeFormatoLista();
    System.out.println( (L.vazia()?"A lista L está vazia!":"A lista L possui elementos!")+"Qtde. elementos = "+L.quantidade());    
    L.insereComeco(3);
    L.insereComeco(2);
    L.insereComeco(1);    

    L.imprimeFormatoLista("\nIMPRIME LISTA COM 1 2 3\n=======================");
    CPessoa p = new CPessoa("Maria da Silva", "123.456.789-10", (byte)41);
    L.insereFim(p);
    L.imprimeFormatoLista("\nIMPRIME LISTA COM MARIA\n=======================");    
    L.insereComeco(new CPessoa("Ateronesvaldo", "234.567.890-12", (byte)25));
    L.imprimeFormatoLista("\nIMPRIME LISTA COM ATERONESVALDO\n===============================");
    p = new CPessoa();
    p.setNome("Belizário Macedo Canhestro");
    p.setCPF("321.654.987-01");
    p.setIdade((byte)30);
    L.insereComeco(p);
    L.imprimeFormatoLista("\nIMPRIME LISTA COM BELIZARIO\n===========================");

    System.out.println("\n*****\nO primeiro elemento da lista é:\n"+L.retornaPrimeiro());
    System.out.println("\n*****\nO último elemento da lista é:\n"+L.retornaUltimo());
    System.out.println("\n*****\nO segundo elemento da lista é:\n"+L.retornaIndice(2));    
  }
}
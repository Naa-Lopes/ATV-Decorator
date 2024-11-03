package decorator;

//Classe principal para teste
public class ExemploDecorator {
 public static void main(String[] args) {
     // Criando a bebida base (Café)
     Bebida bebida = new Cafe();
     System.out.println(bebida.getDescricao() + ": R$ " + bebida.getCusto());

     // Adicionando Leite à bebida
     bebida = new LeiteDecorator(bebida);
     System.out.println(bebida.getDescricao() + ": R$ " + bebida.getCusto());

     // Adicionando Açúcar à bebida
     bebida = new AcucarDecorator(bebida);
     System.out.println(bebida.getDescricao() + ": R$ " + bebida.getCusto());

     // Adicionando Chocolate à bebida
     bebida = new ChocolateDecorator(bebida);
     System.out.println(bebida.getDescricao() + ": R$ " + bebida.getCusto());

     // Adicionando Chantilly à bebida
     bebida = new ChantillyDecorator(bebida);
     System.out.println(bebida.getDescricao() + ": R$ " + bebida.getCusto());
 }
}

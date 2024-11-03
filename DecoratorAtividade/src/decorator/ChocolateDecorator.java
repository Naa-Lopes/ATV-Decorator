package decorator;
public class ChocolateDecorator extends BebidaDecorator {
    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 3.0;
    }
}

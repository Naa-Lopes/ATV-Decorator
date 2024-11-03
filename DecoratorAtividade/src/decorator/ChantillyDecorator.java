package decorator;
public class ChantillyDecorator extends BebidaDecorator {
    public ChantillyDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chantilly";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 5.0;
    }
}

package decorator;
public class AcucarDecorator extends BebidaDecorator {
    public AcucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Açúcar";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.5;
    }
}

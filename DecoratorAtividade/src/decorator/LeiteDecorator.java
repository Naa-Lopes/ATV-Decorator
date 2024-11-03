package decorator;
// Decorador concreto para Leite
public class LeiteDecorator extends BebidaDecorator {
    public LeiteDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.5;
    }
}

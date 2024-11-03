package decorator;

public class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getCusto() {
        return 5.0;
    }
}

public class Pinguin implements AveNadadora {
    
    @Override
    public void comer() {
        System.out.println("O pinguin esta comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("O pinguin esta dormindo...");
    }

    @Override
    public void nadar() {
        System.out.println("O pinguin esta nadando...");
    }

    // @Override
    // public void voar() {
    //     // pinguin nao voa
    //     // deve disparar um erro
    //     throw new UnsupportedOperationException("Pinguin nao pode voar...");
    // }
}

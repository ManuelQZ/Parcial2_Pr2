public class EntregaInternacionalCommand implements Command {
    private Receptor receptor;

    public EntregaInternacionalCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaInternacional();
    }
}

class Rectangulo extends Regulares {
    // Constructor
    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.medida = base;
        this.altura = altura;
    }

    // Propiedad específica para Rectángulo
    private double altura;

    // Sobrescribe el método para calcular el área
    @Override
    public double calcularArea() {
        return medida * altura;
    }

    // Sobrescribe el método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (medida + altura);
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(getNombre() + " - Base: " + medida + ", Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println();
    }
}
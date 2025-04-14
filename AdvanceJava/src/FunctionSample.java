interface Shap {
    public void draw();
}

public class FunctionSample {
    public static void main(String[] args) {
        Shap shap1 = () -> System.out.println("draw the shap1...");
        Shap shap2 = () -> System.out.println("draw the shap2...");
        shap1.draw();
        print(() -> System.out.println("draw the shap3..."));
    }

    public static void print(Shap shap) {
        shap.draw();
    }
}

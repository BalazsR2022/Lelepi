/*Balázs Réka
 * 2023-05-23
 * SzoftI-2-E
 */
public class MainController {

    MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame();
        handleEvents();
    }

    private void handleEvents() {
        this.mainFrame.getCalcButton().addActionListener(e -> {

            this.startCalc();
        });

    }

    private void startCalc() {
        System.out.println("Mukodik");
        double hosszAPanel = Double.parseDouble(
                this.mainFrame.gethosszAPanel().getValue());
        double hosszBPanel = Double.parseDouble(
                this.mainFrame.gethosszBPanel().getValue());
        double hosszCPanel = Double.parseDouble(
                this.mainFrame.gethosszCPanel().getValue());

        double terfogat = calcTerfogat(hosszAPanel, hosszBPanel, hosszCPanel);
        this.mainFrame.getTerfogatLabel().setText("Térfogat: " + terfogat);
        
    }

    private double calcTerfogat(double hosszAPanel, double hosszBPanel, double hosszCPanel) {
        double terfogat = (hosszAPanel * hosszBPanel * hosszCPanel);

        return terfogat;
    }

}

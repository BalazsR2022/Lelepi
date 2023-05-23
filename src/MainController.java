
public class MainController {

    package controllers;

import views.MainFrame;

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
                this.mainFrame.getHosszBPanel().getValue());
        double hosszCPanel = Double.parseDouble(
                this.mainFrame.getHosszCPanel().getValue());

        Double weight = calcTerfogat(hosszAPanel, hosszBPanel, hosszCPanel);
        this.mainFrame.getTerfogatPanel().setValue(terfogat.toString());
    }

    private double calcTerfogat(double hosszAPanel, double hosszBPanel, double hosszCPanel) {
        double terfogat = (hosszAPanel * hosszBPanel * hosszCPanel);

        return terfogat;
    }
}

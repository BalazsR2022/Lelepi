/*Balázs Réka
 * 2023-05-23
 * SzoftI-2-E
 */

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
    InputPanel hosszAPanel;
    InputPanel hosszBPanel;
    InputPanel hosszCPanel;
    JButton calcButton;
    JLabel terfogatLabel;
    JPanel buttonPanel;
    JLabel label;

    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();

    }

    private void initComponent() {
        this.label = new JLabel("Balázs Réka, 2023.05.23, Szoft I-2-E");
        this.hosszAPanel = new InputPanel("a");
        this.hosszBPanel = new InputPanel("b");
        this.hosszCPanel = new InputPanel("c");
        this.buttonPanel = new JPanel();
        this.calcButton = new JButton("Számít");
        this.terfogatLabel = new JLabel("Térfogat");
    }

    private void addComponent() {
        this.add(this.label);
        this.add(this.hosszAPanel);
        this.add(this.hosszBPanel);
        this.add(this.hosszCPanel);
        this.add(this.buttonPanel);
        this.add(this.calcButton);
        this.add(this.terfogatLabel);
        

    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public InputPanel gethosszAPanel() {
        return hosszAPanel;
    }

    public InputPanel gethosszBPanel() {
        return hosszBPanel;
    }

    public InputPanel gethosszCPanel() {
        return hosszCPanel;
    }

    public JButton getCalcButton() {
        return calcButton;
    }
    public JLabel getTerfogatLabel(){
        return terfogatLabel;
    }

}

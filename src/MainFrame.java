/*Balázs Réka
 * 2023-05-23
 * SzoftI-2-E
 */

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainFrame extends JFrame {
    InputPanel hosszAPanel;
    InputPanel hosszBPanel;
    InputPanel hosszCPanel;
    JButton calcButton;
    InputPanel terfogatPanel;
    JPanel buttonPanel;

    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();
    }

    private void initComponent() {
        this.hosszAPanel = new InputPanel("a");
        this.hosszBPanel = new InputPanel("b");
        this.hosszCPanel = new InputPanel("c");
        this.buttonPanel = new JPanel();
        this.calcButton = new JButton("Számít");
        this.terfogatPanel = new InputPanel("Térfogat");
    }

    private void addComponent() {
        this.add(this.hosszAPanel);
        this.add(this.hosszBPanel);
        this.add(this.hosszCPanel);
        this.add(this.buttonPanel);
        this.add(this.calcButton);
        this.add(this.terfogatPanel);

    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}

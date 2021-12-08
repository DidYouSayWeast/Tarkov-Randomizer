import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {

    public GUI() {

        super("Tarkov Randomizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon;
        icon = new ImageIcon("images/cory1.png");
        JButton button = new JButton("Click", icon);
        button.addActionListener(this);


        JTextField HelmetOutput = new JTextField(TarkovRandomizer.ChosenHelmet, 15);
        JTextField ArmorOutput = new JTextField(TarkovRandomizer.ChosenArmor, 15);
        JTextField ArmoredRigOutput = new JTextField(TarkovRandomizer.ChosenArmoredRig, 15);
        JTextField RigOutput = new JTextField(TarkovRandomizer.ChosenRig, 15);
        JTextField BackPackOutput = new JTextField(TarkovRandomizer.ChosenBackPack, 15);
        JTextField GunOutput = new JTextField(TarkovRandomizer.ChosenGun, 15);
        JTextField RoundOutput = new JTextField(TarkovRandomizer.ChosenRound, 15);

        RoundOutput.setEditable(false);
        ArmorOutput.setEditable(false);
        ArmoredRigOutput.setEditable(false);
        HelmetOutput.setEditable(false);
        GunOutput.setEditable(false);
        BackPackOutput.setEditable(false);

        JPanel output = new JPanel();
        JLabel Helmet = new JLabel("Helmet: ");
        JLabel Armor = new JLabel("Armor: ");
        JLabel Rig = new JLabel("Rig: ");
        JLabel ArmoredRig = new JLabel("Armored Rig: ");
        JLabel Backpack = new JLabel("Backpack: ");
        JLabel Gun = new JLabel("Gun: ");
        JLabel Round = new JLabel("Round: ");

        output.add(button);

        output.add(Helmet);
        output.add(HelmetOutput);

        if (TarkovRandomizer.ChosenArmoredRig == "1") {

            output.add(Armor);
            output.add(ArmorOutput);
            output.add(Rig);
            output.add(RigOutput);
        } else {
            output.add(ArmoredRig);
            output.add(ArmoredRigOutput);
        }

        output.add(Backpack);
        output.add(BackPackOutput);
        output.add(Gun);
        output.add(GunOutput);
        output.add(Round);
        output.add(RoundOutput);
        add(output);
        setSize(250, 900);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changing Background Color
        TarkovRandomizer.Randomize();


    }
}

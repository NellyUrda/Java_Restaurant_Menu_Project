package restaurant;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PastaRestaurantWindow {

	JFrame frame;
	JLabel titleLabel, pastaLabel, salsaLabel, beverageLabel, dessertLabel;
	JPanel pastaPanel, salsaPanel, beveragePanel, dessertPanel;
	JButton calculateButton, exitButton;
	JRadioButton fusiliButton, penneRigateButton, tagliateleButton, spaghetiButton, carbonaraButton, funghiButton,
			aglioEolioButton, arrabiataButton, pestoButton, noneButton, coffeeButton, sodaButton, wineButton,
			icecreamButton, tiramisuButton;
	ButtonGroup salsaGroup;
	ButtonGroup pastaGroup;
	ButtonGroup beverageGroup;
	ButtonGroup dessertGroup;

	public HashMap<String, String> pastaType = new HashMap<String, String>();
	public HashMap<String, String> salsaType = new HashMap<String, String>();
	public HashMap<String, String> beverage = new HashMap<String, String>();
	public HashMap<String, String> dessert = new HashMap<String, String>();

	public PastaRestaurantWindow() {

	}

	public void restaurant() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(730, 400);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setResizable(false);

		titleLabel = new JLabel();
		titleLabel.setText("PASTA RESTAURANT");
		titleLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		titleLabel.setBounds(300, 0, 300, 50);
		titleLabel.setForeground(Color.cyan);

		pastaPanel = new JPanel();// pasta Panel
		pastaPanel.setBounds(50, 50, 150, 250);
		pastaPanel.setBackground(Color.LIGHT_GRAY);
		pastaPanel.setLayout(null);

		fusiliButton = new JRadioButton("fusili"); // pasta type radioButtons
		fusiliButton.setBounds(20, 45, 80, 25);
		penneRigateButton = new JRadioButton("penne rigate");
		penneRigateButton.setBounds(20, 85, 120, 25);
		tagliateleButton = new JRadioButton("tagliatele");
		tagliateleButton.setBounds(20, 125, 120, 25);
		spaghetiButton = new JRadioButton("spagheti");
		spaghetiButton.setBounds(20, 165, 120, 25);

		pastaGroup = new ButtonGroup();// add the pasta radioButons in pastaGroup
		pastaGroup.add(fusiliButton);
		pastaGroup.add(penneRigateButton);
		pastaGroup.add(tagliateleButton);
		pastaGroup.add(spaghetiButton);

		pastaPanel.add(fusiliButton);// add pasta radioButons in pastaPanel
		pastaPanel.add(penneRigateButton);
		pastaPanel.add(tagliateleButton);
		pastaPanel.add(spaghetiButton);

		pastaLabel = new JLabel(); // pasta Label
		pastaLabel.setText("PASTA type");
		pastaLabel.setBounds(80, 15, 300, 50);
		pastaLabel.setForeground(Color.LIGHT_GRAY);

		salsaPanel = new JPanel(); // salsa Panel
		salsaPanel.setBounds(210, 50, 150, 250);
		salsaPanel.setLayout(null);
		salsaPanel.setBackground(Color.LIGHT_GRAY);

		carbonaraButton = new JRadioButton("carbonara");// salsa radioButtons
		carbonaraButton.setBounds(20, 45, 100, 25);
		funghiButton = new JRadioButton("funghi");
		funghiButton.setBounds(20, 85, 100, 25);
		aglioEolioButton = new JRadioButton("aglio e olio");
		aglioEolioButton.setBounds(20, 125, 100, 25);
		arrabiataButton = new JRadioButton("arrabiata");
		arrabiataButton.setBounds(20, 165, 100, 25);
		pestoButton = new JRadioButton("pesto");
		pestoButton.setBounds(20, 205, 100, 25);

		salsaGroup = new ButtonGroup();// add salsa radioButtons in salsaGroup
		salsaGroup.add(carbonaraButton);
		salsaGroup.add(funghiButton);
		salsaGroup.add(aglioEolioButton);
		salsaGroup.add(arrabiataButton);
		salsaGroup.add(pestoButton);

		salsaPanel.add(carbonaraButton); // add salsa radiosButtons to salsaPanel
		salsaPanel.add(funghiButton);
		salsaPanel.add(aglioEolioButton);
		salsaPanel.add(arrabiataButton);
		salsaPanel.add(pestoButton);

		salsaLabel = new JLabel();// salsa Label
		salsaLabel.setText("SALSA type");
		salsaLabel.setBounds(240, 15, 300, 50);
		salsaLabel.setForeground(Color.LIGHT_GRAY);

		beveragePanel = new JPanel(); // beverage Panel
		beveragePanel.setBounds(370, 50, 150, 250);
		beveragePanel.setLayout(null);
		beveragePanel.setBackground(Color.LIGHT_GRAY);

		noneButton = new JRadioButton("none"); // beverage radioButtons
		noneButton.setBounds(20, 45, 100, 25);
		coffeeButton = new JRadioButton("coffee");
		coffeeButton.setBounds(20, 85, 100, 25);
		sodaButton = new JRadioButton("soda");
		sodaButton.setBounds(20, 125, 100, 25);
		wineButton = new JRadioButton("wine");
		wineButton.setBounds(20, 165, 100, 25);

		beverageGroup = new ButtonGroup();// add beverage radioButtons in beverageGroup
		beverageGroup.add(noneButton);
		beverageGroup.add(coffeeButton);
		beverageGroup.add(sodaButton);
		beverageGroup.add(wineButton);

		beveragePanel.add(noneButton);// add beverage radioButtons to beveragePanel
		beveragePanel.add(coffeeButton);
		beveragePanel.add(sodaButton);
		beveragePanel.add(wineButton);

		beverageLabel = new JLabel();// beverage Label
		beverageLabel.setText("BEVERAGE");
		beverageLabel.setBounds(400, 15, 300, 50);
		beverageLabel.setForeground(Color.LIGHT_GRAY);

		dessertPanel = new JPanel(); // beverage Panel
		dessertPanel.setBounds(530, 50, 150, 250);
		dessertPanel.setLayout(null);
		dessertPanel.setBackground(Color.LIGHT_GRAY);

		icecreamButton = new JRadioButton("icecream");// dessert radioButtons
		icecreamButton.setBounds(20, 45, 100, 25);
		tiramisuButton = new JRadioButton("tiramisu");
		tiramisuButton.setBounds(20, 85, 100, 25);

		dessertGroup = new ButtonGroup(); // add dessert radioButtons in dessertGroup
		dessertGroup.add(icecreamButton);
		dessertGroup.add(tiramisuButton);

		dessertPanel.add(icecreamButton);// add dessert radioButtons to dessertPanel
		dessertPanel.add(tiramisuButton);

		dessertLabel = new JLabel();
		dessertLabel.setText("DESSERT");
		dessertLabel.setBounds(550, 15, 300, 50);
		dessertLabel.setForeground(Color.LIGHT_GRAY);

		calculateButton = new JButton("Pay");// Pay Button
		calculateButton.setFocusable(false);
		calculateButton.setBounds(210, 310, 100, 40);
		calculateButton.setBackground(Color.cyan);
		calculateButton.setForeground(Color.BLACK);

		exitButton = new JButton("Exit");// exit Button
		exitButton.setFocusable(false);
		exitButton.setBounds(350, 310, 100, 40);
		exitButton.setBackground(Color.red);
		exitButton.setForeground(Color.black);

		frame.add(titleLabel);// add all the components to the frame
		frame.add(pastaPanel);
		frame.add(pastaLabel);
		frame.add(salsaPanel);
		frame.add(salsaLabel);
		frame.add(beveragePanel);
		frame.add(beverageLabel);
		frame.add(dessertPanel);
		frame.add(dessertLabel);
		frame.add(calculateButton);
		frame.add(exitButton);
		frame.setVisible(true);

		calculateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pastaType.put("fusili", "4.2"); // we put the pasta items in pastaType HashMap
				pastaType.put("penne rigate", "4.2");
				pastaType.put("tagliatele", "4.2");
				pastaType.put("spagheti", "4.2");

				salsaType.put("carbonara", "5.5");// we put the salsa items in salsaType HashMap
				salsaType.put("funghi", "4.9");
				salsaType.put("aglio e olio", "4.5");
				salsaType.put("arrabiata", "4.8");
				salsaType.put("pesto", "4.8");

				beverage.put("none", "0");// we put the beverage items in beverage HashMap
				beverage.put("coffee", "2");
				beverage.put("soda", "2.5");
				beverage.put("wine", "3.5");

				dessert.put("icecream", "3.2");// we put the dessert items in dessert HashMap
				dessert.put("tiramisu", "4.3");

				double item1 = 0;
				double item2 = 0;
				double item3 = 0;
				double item4 = 0;

				for (Entry<String, String> entry : pastaType.entrySet()) {
					if (entry.getKey().equals(getSelectedButtonText(pastaGroup))) {
																					// equal to the radioButton selected
						String value1 = entry.getValue();// get the key value from entry
						item1 = Double.parseDouble(value1);// convert it to double and sent it to item1
					}
				}
				for (Entry<String, String> entry : salsaType.entrySet()) {
					if (entry.getKey().equals(getSelectedButtonText(salsaGroup))) {
						String value2 = entry.getValue();
						item2 = Double.parseDouble(value2);
					}
				}
				for (Entry<String, String> entry : beverage.entrySet()) {
					if (entry.getKey().equals(getSelectedButtonText(beverageGroup))) {
						String value3 = entry.getValue();
						item3 = Double.parseDouble(value3);
					}
				}
				for (Entry<String, String> entry : dessert.entrySet()) {
					if (entry.getKey().equals(getSelectedButtonText(dessertGroup))) {
						String value4 = entry.getValue();
						item4 = Double.parseDouble(value4);
					}
				}
				// calculate the total price of the selected items
				JOptionPane.showMessageDialog(null,
						"TOTAL price: \n" + calculateItems(item1, item2, item3, item4) + " euros", "Message",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exitButton) {
					frame.dispose();
				}
			}
		});
	}

	public String getSelectedButtonText(ButtonGroup buttonGroup) {// return the text of the selected RadioButton
		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();
			if (button.isSelected()) {
				return button.getText();
			}
		}
		return null;
	}

	public double calculateItems(double item1, double item2, double item3, double item4) {
		return item1 + item2 + item3 + item4;
	}
}

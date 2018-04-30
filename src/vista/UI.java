package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelColores = new JPanel();
		GridBagConstraints gbc_panelColores = new GridBagConstraints();
		gbc_panelColores.insets = new Insets(0, 0, 5, 5);
		gbc_panelColores.fill = GridBagConstraints.BOTH;
		gbc_panelColores.gridx = 1;
		gbc_panelColores.gridy = 1;
		contentPane.add(panelColores, gbc_panelColores);
		GridBagLayout gbl_panelColores = new GridBagLayout();
		gbl_panelColores.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelColores.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelColores.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelColores.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelColores.setLayout(gbl_panelColores);
		
		JButton btnColor1 = new JButton("New button");
		GridBagConstraints gbc_btnColor1 = new GridBagConstraints();
		gbc_btnColor1.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor1.fill = GridBagConstraints.BOTH;
		gbc_btnColor1.gridx = 1;
		gbc_btnColor1.gridy = 1;
		panelColores.add(btnColor1, gbc_btnColor1);
		
		JButton btnColor2 = new JButton("New button");
		GridBagConstraints gbc_btnColor2 = new GridBagConstraints();
		gbc_btnColor2.fill = GridBagConstraints.VERTICAL;
		gbc_btnColor2.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor2.gridx = 1;
		gbc_btnColor2.gridy = 2;
		panelColores.add(btnColor2, gbc_btnColor2);
		
		JButton btnColor3 = new JButton("New button");
		GridBagConstraints gbc_btnColor3 = new GridBagConstraints();
		gbc_btnColor3.fill = GridBagConstraints.VERTICAL;
		gbc_btnColor3.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor3.gridx = 1;
		gbc_btnColor3.gridy = 3;
		panelColores.add(btnColor3, gbc_btnColor3);
		
		JButton btnColor4 = new JButton("New button");
		GridBagConstraints gbc_btnColor4 = new GridBagConstraints();
		gbc_btnColor4.fill = GridBagConstraints.VERTICAL;
		gbc_btnColor4.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor4.gridx = 1;
		gbc_btnColor4.gridy = 4;
		panelColores.add(btnColor4, gbc_btnColor4);
		
		JButton btnColor5 = new JButton("New button");
		GridBagConstraints gbc_btnColor5 = new GridBagConstraints();
		gbc_btnColor5.fill = GridBagConstraints.VERTICAL;
		gbc_btnColor5.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor5.gridx = 1;
		gbc_btnColor5.gridy = 5;
		panelColores.add(btnColor5, gbc_btnColor5);
		
		JPanel panelPila = new JPanel();
		GridBagConstraints gbc_panelPila = new GridBagConstraints();
		gbc_panelPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelPila.fill = GridBagConstraints.BOTH;
		gbc_panelPila.gridx = 2;
		gbc_panelPila.gridy = 1;
		contentPane.add(panelPila, gbc_panelPila);
	}

}

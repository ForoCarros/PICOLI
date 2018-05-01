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
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JPanel panelAcciones;
	protected JButton btnNewButton;
	protected JButton btnNewButton_1;
	protected JButton btnNewButton_2;
	protected JComboBox selectorColores;
	protected JPanel panelColores;
	protected JButton btnColor1;
	protected JButton btnColor2;
	protected JButton btnColor3;
	protected JButton btnColor4;
	protected JButton btnColor5;
	protected JPanel panelPila;
	protected JPanel panelColas;
	protected JPanel panelColasUno;
	protected JPanel panelColasDos;
	protected JPanel panelLista;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 30, 0, 0, 60, 0, 60, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		panelAcciones = new JPanel();
		panelAcciones.setBackground(new Color(128, 128, 128));
		panelAcciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAcciones = new GridBagConstraints();
		gbc_panelAcciones.insets = new Insets(0, 0, 5, 5);
		gbc_panelAcciones.fill = GridBagConstraints.VERTICAL;
		gbc_panelAcciones.gridx = 1;
		gbc_panelAcciones.gridy = 1;
		contentPane.add(panelAcciones, gbc_panelAcciones);
		GridBagLayout gbl_panelAcciones = new GridBagLayout();
		gbl_panelAcciones.columnWidths = new int[] { 0, 0 };
		gbl_panelAcciones.rowHeights = new int[] { 30, 0, 0, 0, 0, 30, 0 };
		gbl_panelAcciones.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panelAcciones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panelAcciones.setLayout(gbl_panelAcciones);

		btnNewButton = new JButton("op1");
		btnNewButton.setOpaque(false);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panelAcciones.add(btnNewButton, gbc_btnNewButton);

		btnNewButton_1 = new JButton("op2");
		btnNewButton_1.setOpaque(false);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panelAcciones.add(btnNewButton_1, gbc_btnNewButton_1);

		btnNewButton_2 = new JButton("op3");
		btnNewButton_2.setOpaque(false);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 3;
		panelAcciones.add(btnNewButton_2, gbc_btnNewButton_2);

		selectorColores = new JComboBox();
		GridBagConstraints gbc_selectorColores = new GridBagConstraints();
		gbc_selectorColores.insets = new Insets(0, 0, 5, 0);
		gbc_selectorColores.fill = GridBagConstraints.BOTH;
		gbc_selectorColores.gridx = 0;
		gbc_selectorColores.gridy = 4;
		panelAcciones.add(selectorColores, gbc_selectorColores);

		panelColores = new JPanel();
		panelColores.setBackground(new Color(128, 128, 128));
		panelColores.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelColores = new GridBagConstraints();
		gbc_panelColores.insets = new Insets(0, 0, 5, 5);
		gbc_panelColores.fill = GridBagConstraints.BOTH;
		gbc_panelColores.gridx = 2;
		gbc_panelColores.gridy = 1;
		contentPane.add(panelColores, gbc_panelColores);
		GridBagLayout gbl_panelColores = new GridBagLayout();
		gbl_panelColores.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelColores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelColores.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelColores.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panelColores.setLayout(gbl_panelColores);

		btnColor1 = new JButton("col1");
		btnColor1.setOpaque(false);
		GridBagConstraints gbc_btnColor1 = new GridBagConstraints();
		gbc_btnColor1.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor1.fill = GridBagConstraints.BOTH;
		gbc_btnColor1.gridx = 1;
		gbc_btnColor1.gridy = 1;
		panelColores.add(btnColor1, gbc_btnColor1);

		btnColor2 = new JButton("col2");
		btnColor2.setOpaque(false);
		GridBagConstraints gbc_btnColor2 = new GridBagConstraints();
		gbc_btnColor2.fill = GridBagConstraints.BOTH;
		gbc_btnColor2.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor2.gridx = 1;
		gbc_btnColor2.gridy = 2;
		panelColores.add(btnColor2, gbc_btnColor2);

		btnColor3 = new JButton("col3");
		btnColor3.setOpaque(false);
		GridBagConstraints gbc_btnColor3 = new GridBagConstraints();
		gbc_btnColor3.fill = GridBagConstraints.BOTH;
		gbc_btnColor3.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor3.gridx = 1;
		gbc_btnColor3.gridy = 3;
		panelColores.add(btnColor3, gbc_btnColor3);

		btnColor4 = new JButton("col4");
		btnColor4.setOpaque(false);
		GridBagConstraints gbc_btnColor4 = new GridBagConstraints();
		gbc_btnColor4.fill = GridBagConstraints.BOTH;
		gbc_btnColor4.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor4.gridx = 1;
		gbc_btnColor4.gridy = 4;
		panelColores.add(btnColor4, gbc_btnColor4);

		btnColor5 = new JButton("col5");
		btnColor5.setOpaque(false);
		GridBagConstraints gbc_btnColor5 = new GridBagConstraints();
		gbc_btnColor5.fill = GridBagConstraints.BOTH;
		gbc_btnColor5.insets = new Insets(0, 0, 5, 5);
		gbc_btnColor5.gridx = 1;
		gbc_btnColor5.gridy = 5;
		panelColores.add(btnColor5, gbc_btnColor5);

		panelPila = new JPanel();
		panelPila.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPila.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelPila = new GridBagConstraints();
		gbc_panelPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelPila.fill = GridBagConstraints.BOTH;
		gbc_panelPila.gridx = 3;
		gbc_panelPila.gridy = 1;
		contentPane.add(panelPila, gbc_panelPila);

		panelColas = new JPanel();
		panelColas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelColas.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelColas = new GridBagConstraints();
		gbc_panelColas.insets = new Insets(0, 0, 5, 5);
		gbc_panelColas.fill = GridBagConstraints.BOTH;
		gbc_panelColas.gridx = 4;
		gbc_panelColas.gridy = 1;
		contentPane.add(panelColas, gbc_panelColas);
		GridBagLayout gbl_panelColas = new GridBagLayout();
		gbl_panelColas.columnWidths = new int[] { 50, 50, 0 };
		gbl_panelColas.rowHeights = new int[] { 0, 0 };
		gbl_panelColas.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelColas.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelColas.setLayout(gbl_panelColas);

		panelColasUno = new JPanel();
		panelColasUno.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelColasUno.setBackground(new Color(180, 180, 180));
		GridBagConstraints gbc_panelColasUno = new GridBagConstraints();
		gbc_panelColasUno.insets = new Insets(0, 0, 0, 5);
		gbc_panelColasUno.fill = GridBagConstraints.BOTH;
		gbc_panelColasUno.gridx = 0;
		gbc_panelColasUno.gridy = 0;
		panelColas.add(panelColasUno, gbc_panelColasUno);

		panelColasDos = new JPanel();
		panelColasDos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelColasDos.setBackground(new Color(180, 180, 180));
		GridBagConstraints gbc_panelColasDos = new GridBagConstraints();
		gbc_panelColasDos.fill = GridBagConstraints.BOTH;
		gbc_panelColasDos.gridx = 1;
		gbc_panelColasDos.gridy = 0;
		panelColas.add(panelColasDos, gbc_panelColasDos);

		panelLista = new JPanel();
		panelLista.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLista.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelLista = new GridBagConstraints();
		gbc_panelLista.insets = new Insets(0, 0, 5, 5);
		gbc_panelLista.fill = GridBagConstraints.BOTH;
		gbc_panelLista.gridx = 5;
		gbc_panelLista.gridy = 1;
		contentPane.add(panelLista, gbc_panelLista);
	}

}

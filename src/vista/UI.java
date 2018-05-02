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

import modelo.Colores;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JPanel panelAcciones;
	protected JButton btnPedirColor;
	protected JButton btnBarajarPilas;
	protected JComboBox comboColores;
	protected JPanel panelColores;
	protected JButton btnAmarillo;
	protected JButton btnRojo;
	protected JButton btnVerde;
	protected JButton btnAzul;
	protected JButton btnNaranja;
	protected JPanel panelPila;
	protected JPanel panelColas;
	protected JPanel panelColasUno;
	protected JPanel panelColasDos;
	protected JPanel panelLista;
	protected JButton btnBorrarColor;
	protected JTextField txtMensaje;
	protected JTextField txtMonedas;
	protected JLabel lblIntentosPEdir;
	protected JLabel lblIntentosBarajar;
	protected JLabel lblIntentosBorrar;

	/**
	 * Create the frame.
	 */
	public UI() {
		setMinimumSize(new Dimension(700, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 30, 0, 0, 60, 0, 60, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblTitulo = new JLabel("HOLA PABLO");
		lblTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Broadway", Font.BOLD, 50));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 5;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		contentPane.add(lblTitulo, gbc_lblTitulo);

		JLabel lblMonedas = new JLabel("Monedas :");
		lblMonedas.setForeground(Color.WHITE);
		lblMonedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonedas.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblMonedas = new GridBagConstraints();
		gbc_lblMonedas.anchor = GridBagConstraints.EAST;
		gbc_lblMonedas.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonedas.gridx = 1;
		gbc_lblMonedas.gridy = 1;
		contentPane.add(lblMonedas, gbc_lblMonedas);

		txtMonedas = new JTextField();
		txtMonedas.setOpaque(false);
		txtMonedas.setAutoscrolls(false);
		txtMonedas.setForeground(Color.WHITE);
		txtMonedas.setEnabled(false);
		txtMonedas.setEditable(false);
		GridBagConstraints gbc_txtMonedas = new GridBagConstraints();
		gbc_txtMonedas.gridwidth = 2;
		gbc_txtMonedas.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonedas.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonedas.gridx = 2;
		gbc_txtMonedas.gridy = 1;
		contentPane.add(txtMonedas, gbc_txtMonedas);
		txtMonedas.setColumns(10);

		panelAcciones = new JPanel();
		panelAcciones.setBackground(new Color(128, 128, 128));
		panelAcciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAcciones = new GridBagConstraints();
		gbc_panelAcciones.insets = new Insets(0, 0, 5, 5);
		gbc_panelAcciones.fill = GridBagConstraints.VERTICAL;
		gbc_panelAcciones.gridx = 1;
		gbc_panelAcciones.gridy = 2;
		contentPane.add(panelAcciones, gbc_panelAcciones);
		GridBagLayout gbl_panelAcciones = new GridBagLayout();
		gbl_panelAcciones.columnWidths = new int[] { 0, 20, 0 };
		gbl_panelAcciones.rowHeights = new int[] { 30, 0, 0, 0, 0, 0 };
		gbl_panelAcciones.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelAcciones.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 };
		panelAcciones.setLayout(gbl_panelAcciones);

		comboColores = new JComboBox(Colores.values());
		GridBagConstraints gbc_comboColoressdf = new GridBagConstraints();
		gbc_comboColoressdf.insets = new Insets(0, 0, 5, 5);
		gbc_comboColoressdf.fill = GridBagConstraints.BOTH;
		gbc_comboColoressdf.gridx = 0;
		gbc_comboColoressdf.gridy = 1;
		panelAcciones.add(comboColores, gbc_comboColoressdf);

		btnPedirColor = new JButton("Pedir color");
		btnPedirColor.setOpaque(false);
		GridBagConstraints gbc_btnPedirColor = new GridBagConstraints();
		gbc_btnPedirColor.fill = GridBagConstraints.BOTH;
		gbc_btnPedirColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnPedirColor.gridx = 0;
		gbc_btnPedirColor.gridy = 2;
		panelAcciones.add(btnPedirColor, gbc_btnPedirColor);

		lblIntentosPEdir = new JLabel("");
		lblIntentosPEdir.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntentosPEdir.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIntentosPEdir = new GridBagConstraints();
		gbc_lblIntentosPEdir.fill = GridBagConstraints.VERTICAL;
		gbc_lblIntentosPEdir.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntentosPEdir.gridx = 1;
		gbc_lblIntentosPEdir.gridy = 2;
		panelAcciones.add(lblIntentosPEdir, gbc_lblIntentosPEdir);

		btnBarajarPilas = new JButton("Barajar pilas");
		btnBarajarPilas.setOpaque(false);
		GridBagConstraints gbc_btnBarajarPilas = new GridBagConstraints();
		gbc_btnBarajarPilas.fill = GridBagConstraints.BOTH;
		gbc_btnBarajarPilas.insets = new Insets(0, 0, 5, 5);
		gbc_btnBarajarPilas.gridx = 0;
		gbc_btnBarajarPilas.gridy = 3;
		panelAcciones.add(btnBarajarPilas, gbc_btnBarajarPilas);

		lblIntentosBarajar = new JLabel("");
		lblIntentosBarajar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntentosBarajar.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIntentosBarajar = new GridBagConstraints();
		gbc_lblIntentosBarajar.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntentosBarajar.gridx = 1;
		gbc_lblIntentosBarajar.gridy = 3;
		panelAcciones.add(lblIntentosBarajar, gbc_lblIntentosBarajar);

		btnBorrarColor = new JButton("Borrar color");
		GridBagConstraints gbc_btnBorrarColor = new GridBagConstraints();
		gbc_btnBorrarColor.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarColor.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarColor.gridx = 0;
		gbc_btnBorrarColor.gridy = 4;
		panelAcciones.add(btnBorrarColor, gbc_btnBorrarColor);

		lblIntentosBorrar = new JLabel("");
		lblIntentosBorrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntentosBorrar.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIntentosBorrar = new GridBagConstraints();
		gbc_lblIntentosBorrar.fill = GridBagConstraints.VERTICAL;
		gbc_lblIntentosBorrar.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntentosBorrar.gridx = 1;
		gbc_lblIntentosBorrar.gridy = 4;
		panelAcciones.add(lblIntentosBorrar, gbc_lblIntentosBorrar);

		panelColores = new JPanel();
		panelColores.setBackground(new Color(128, 128, 128));
		panelColores.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelColores = new GridBagConstraints();
		gbc_panelColores.insets = new Insets(0, 0, 5, 5);
		gbc_panelColores.fill = GridBagConstraints.BOTH;
		gbc_panelColores.gridx = 2;
		gbc_panelColores.gridy = 2;
		contentPane.add(panelColores, gbc_panelColores);
		GridBagLayout gbl_panelColores = new GridBagLayout();
		gbl_panelColores.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelColores.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelColores.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelColores.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panelColores.setLayout(gbl_panelColores);

		btnAmarillo = new JButton("Amarillo");
		btnAmarillo.setName("amarillo");
		btnAmarillo.setOpaque(false);
		GridBagConstraints gbc_btnAmarillo = new GridBagConstraints();
		gbc_btnAmarillo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAmarillo.fill = GridBagConstraints.BOTH;
		gbc_btnAmarillo.gridx = 1;
		gbc_btnAmarillo.gridy = 1;
		panelColores.add(btnAmarillo, gbc_btnAmarillo);

		btnRojo = new JButton("Rojo");
		btnRojo.setName("rojo");
		btnRojo.setOpaque(false);
		GridBagConstraints gbc_btnRojo = new GridBagConstraints();
		gbc_btnRojo.fill = GridBagConstraints.BOTH;
		gbc_btnRojo.insets = new Insets(0, 0, 5, 5);
		gbc_btnRojo.gridx = 1;
		gbc_btnRojo.gridy = 2;
		panelColores.add(btnRojo, gbc_btnRojo);

		btnVerde = new JButton("Verde");
		btnVerde.setName("verde");
		btnVerde.setOpaque(false);
		GridBagConstraints gbc_btnVerde = new GridBagConstraints();
		gbc_btnVerde.fill = GridBagConstraints.BOTH;
		gbc_btnVerde.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerde.gridx = 1;
		gbc_btnVerde.gridy = 3;
		panelColores.add(btnVerde, gbc_btnVerde);

		btnAzul = new JButton("Azul");
		btnAzul.setName("azul");
		btnAzul.setOpaque(false);
		GridBagConstraints gbc_btnAzul = new GridBagConstraints();
		gbc_btnAzul.fill = GridBagConstraints.BOTH;
		gbc_btnAzul.insets = new Insets(0, 0, 5, 5);
		gbc_btnAzul.gridx = 1;
		gbc_btnAzul.gridy = 4;
		panelColores.add(btnAzul, gbc_btnAzul);

		btnNaranja = new JButton("Naranja");
		btnNaranja.setName("naranja");
		btnNaranja.setOpaque(false);
		GridBagConstraints gbc_btnNaranja = new GridBagConstraints();
		gbc_btnNaranja.fill = GridBagConstraints.BOTH;
		gbc_btnNaranja.insets = new Insets(0, 0, 5, 5);
		gbc_btnNaranja.gridx = 1;
		gbc_btnNaranja.gridy = 5;
		panelColores.add(btnNaranja, gbc_btnNaranja);

		panelPila = new JPanel();
		panelPila.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPila.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelPila = new GridBagConstraints();
		gbc_panelPila.anchor = GridBagConstraints.NORTH;
		gbc_panelPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelPila.fill = GridBagConstraints.BOTH;
		gbc_panelPila.gridx = 3;
		gbc_panelPila.gridy = 2;
		contentPane.add(panelPila, gbc_panelPila);
		panelPila.setLayout(new BoxLayout(panelPila, BoxLayout.Y_AXIS));

		panelColas = new JPanel();
		panelColas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelColas.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelColas = new GridBagConstraints();
		gbc_panelColas.insets = new Insets(0, 0, 5, 5);
		gbc_panelColas.fill = GridBagConstraints.BOTH;
		gbc_panelColas.gridx = 4;
		gbc_panelColas.gridy = 2;
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
		gbc_panelColasUno.anchor = GridBagConstraints.NORTH;
		gbc_panelColasUno.insets = new Insets(0, 0, 0, 5);
		gbc_panelColasUno.fill = GridBagConstraints.BOTH;
		gbc_panelColasUno.gridx = 0;
		gbc_panelColasUno.gridy = 0;
		panelColas.add(panelColasUno, gbc_panelColasUno);
		panelColasUno.setLayout(new BoxLayout(panelColasUno, BoxLayout.Y_AXIS));

		panelColasDos = new JPanel();
		panelColasDos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelColasDos.setBackground(new Color(180, 180, 180));
		GridBagConstraints gbc_panelColasDos = new GridBagConstraints();
		gbc_panelColasDos.anchor = GridBagConstraints.NORTH;
		gbc_panelColasDos.fill = GridBagConstraints.BOTH;
		gbc_panelColasDos.gridx = 1;
		gbc_panelColasDos.gridy = 0;
		panelColas.add(panelColasDos, gbc_panelColasDos);
		panelColasDos.setLayout(new BoxLayout(panelColasDos, BoxLayout.Y_AXIS));

		panelLista = new JPanel();
		panelLista.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLista.setBackground(new Color(128, 128, 128));
		GridBagConstraints gbc_panelLista = new GridBagConstraints();
		gbc_panelLista.insets = new Insets(0, 0, 5, 5);
		gbc_panelLista.fill = GridBagConstraints.BOTH;
		gbc_panelLista.gridx = 5;
		gbc_panelLista.gridy = 2;
		contentPane.add(panelLista, gbc_panelLista);
		panelLista.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblMensaje = new JLabel("Mensaje :");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 3;
		contentPane.add(lblMensaje, gbc_lblMensaje);

		txtMensaje = new JTextField();
		txtMensaje.setOpaque(false);
		txtMensaje.setEnabled(false);
		txtMensaje.setAutoscrolls(false);
		txtMensaje.setEditable(false);
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.gridwidth = 4;
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMensaje.gridx = 2;
		gbc_txtMensaje.gridy = 3;
		contentPane.add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);
	}

}

package aparencia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JFTela extends JFrame {

	private JPanel contentPane;
	private JTextField text_visor;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFTela frame = new JFTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFTela() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(10, 74, 284, 318);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnAC = new JButton("AC");
		panel.add(btnAC);
		
		JButton btnMult = new JButton("X");
		panel.add(btnMult);
		
		JButton btnDiv = new JButton("\u00F7");
		panel.add(btnDiv);
		
		JButton btnDel = new JButton("DEL");
		panel.add(btnDel);
		
		JButton btn_7 = new JButton("7");
		panel.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		panel.add(btn_9);
		
		JButton btnSoma = new JButton("+");
		panel.add(btnSoma);
		
		JButton btn_4 = new JButton("4");
		panel.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		panel.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		panel.add(btn_6);
		
		JButton btnSub = new JButton("-");
		panel.add(btnSub);
		
		JButton btn_1 = new JButton("1");
		panel.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		panel.add(btn_2);
		
		JButton btn3 = new JButton("3");
		panel.add(btn3);
		
		JButton btnResult = new JButton("=");
		panel.add(btnResult);
		
		JButton btn_0 = new JButton("0");
		panel.add(btn_0);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JButton btnVirgula = new JButton(",");
		panel.add(btnVirgula);
		
		text_visor = new JTextField();
		text_visor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_visor.setHorizontalAlignment(SwingConstants.RIGHT);
		text_visor.setText("0,00");
		text_visor.setBounds(10, 11, 284, 52);
		contentPane.add(text_visor);
		text_visor.setColumns(10);
	}
}

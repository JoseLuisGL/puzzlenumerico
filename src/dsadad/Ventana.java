package dsadad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	List<String> values = Arrays.asList("","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15");
	JButton btnNewButton_1, btnNewButton_2, btnNewButton_4, btnNewButton_3, btnNewButton, btnNewButton_6, btnNewButton_5, btnNewButton_8,
		btnNewButton_9, btnNewButton_7,btnNewButton_10,btnNewButton_12, btnNewButton_11, btnNewButton_13, btnNewButton_14, btnNewButton_15;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 64, 0));
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Ne");
		lblNewLabel.setForeground(new Color(128, 64, 0));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 64, 0));
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("Ne");
		lblNewLabel_1.setForeground(new Color(128, 64, 0));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 64, 0));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Ne");
		lblNewLabel_2.setForeground(new Color(128, 64, 0));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 64, 0));
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Ne");
		lblNewLabel_3.setForeground(new Color(128, 64, 0));
		panel_3.add(lblNewLabel_3);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(128, 64, 0));
		panel_4.setBackground(new Color(128, 64, 0));
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(4, 4, 0, 0));
		
		Collections.shuffle(values);
		
		btnNewButton_1 = new JButton(values.get(0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_1);
				ganar();
			}
		});
		panel_4.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton(values.get(1));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_2);
				ganar();
			}
		});
		panel_4.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton(values.get(2));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_4);
				ganar();
			}
		});
		panel_4.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton(values.get(3));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_3);
				ganar();
			}
		});
		panel_4.add(btnNewButton_3);
		
		btnNewButton = new JButton(values.get(4));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton);
				ganar();
			}
		});
		panel_4.add(btnNewButton);
		
		btnNewButton_6 = new JButton(values.get(5));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_6);
				ganar();
			}
		});
		panel_4.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton(values.get(6));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_5);
				ganar();
			}
		});
		panel_4.add(btnNewButton_5);
		
		btnNewButton_8 = new JButton(values.get(7));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_8);
				ganar();
			}
		});
		panel_4.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton(values.get(8));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_9);
				ganar();
			}
		});
		panel_4.add(btnNewButton_9);
		
		btnNewButton_7 = new JButton(values.get(9));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_7);
				ganar();
			}
		});
		panel_4.add(btnNewButton_7);
		
		btnNewButton_10 = new JButton(values.get(10));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_10);
				ganar();
			}
		});
		panel_4.add(btnNewButton_10);
		
		btnNewButton_12 = new JButton(values.get(11));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_12);
				ganar();
			}
		});
		panel_4.add(btnNewButton_12);
		
		btnNewButton_11 = new JButton(values.get(12));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_11);
				ganar();
			}
		});
		panel_4.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton(values.get(13));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_13);
				ganar();
			}
		});
		panel_4.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton(values.get(14));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_14);
				ganar();
			}
		});
		panel_4.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton(values.get(15));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar(btnNewButton_15);
				ganar();
			}
		});
		panel_4.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Reiniciar");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(values);
				//System.out.println(values);
				btnNewButton_1.setText(values.get(0));
				btnNewButton_2.setText(values.get(1));
				btnNewButton_4.setText(values.get(2));
				btnNewButton_3.setText(values.get(3));
				btnNewButton.setText(values.get(4));
				btnNewButton_6.setText(values.get(5));
				btnNewButton_5.setText(values.get(6));
				btnNewButton_8.setText(values.get(7));
				btnNewButton_9.setText(values.get(8));
				btnNewButton_7.setText(values.get(9));
				btnNewButton_10.setText(values.get(10));
				btnNewButton_12.setText(values.get(11));
				btnNewButton_11.setText(values.get(12));
				btnNewButton_13.setText(values.get(13));
				btnNewButton_14.setText(values.get(14));
				btnNewButton_15.setText(values.get(15));
			}
		});
		panel_3.add(btnNewButton_16);
	}
	public boolean verificar(JButton btn) {
		int botonpulsado = -1;
	    int vacio = -1;
	    JButton[] botones = {btnNewButton_1, btnNewButton_2, btnNewButton_4, btnNewButton_3, 
	                         btnNewButton, btnNewButton_6, btnNewButton_5, btnNewButton_8, 
	                         btnNewButton_9, btnNewButton_7, btnNewButton_10, btnNewButton_12, 
	                         btnNewButton_11, btnNewButton_13, btnNewButton_14, btnNewButton_15};
	    for (int i = 0; i < botones.length; i++) {
	        if (botones[i] == btn) {
	        	botonpulsado = i; 
	        } else if (botones[i].getText().equals("")) {
	        	vacio = i;
	        }
	    }
	    if ((botonpulsado == vacio - 1 && botonpulsado % 4 != 3) || (botonpulsado == vacio + 1 && vacio % 4 != 3) || 
	    		botonpulsado == vacio - 4 || botonpulsado == vacio + 4) {
	        String temp = btn.getText();
	        btn.setText("");
	        botones[vacio].setText(temp); 
	        return true;
	    }
	    
	    return false;
	}
	
	public void ganar() {
		
		if(btnNewButton_1.getText().equals("1") && btnNewButton_2.getText().equals("2") && btnNewButton_4.getText().equals("3")
				&& btnNewButton_3.getText().equals("4") && btnNewButton.getText().equals("5") && btnNewButton_6.getText().equals("6") && 
				btnNewButton_5.getText().equals("7") && btnNewButton_8.getText().equals("8") && btnNewButton_9.getText().equals("9")
				&& btnNewButton_7.getText().equals("10") && btnNewButton_10.getText().equals("11") && btnNewButton_12.getText().equals("12") && 
				btnNewButton_11.getText().equals("13") && btnNewButton_13.getText().equals("14") && btnNewButton_14.getText().equals("15")
				&& btnNewButton_15.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Has ganado", "Ganaste", JOptionPane.INFORMATION_MESSAGE);
		}
				
	}
	
}
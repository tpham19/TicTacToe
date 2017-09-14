package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * A TicTacToe game created through Java Swing
 *
 */
public class TicTacToe {

	private JFrame frame;
	private String startGame = "X";
	private int xCount = 0;
	private int oCount = 0;
	private JButton btn1 = new JButton("");
	private JButton btn2 = new JButton("");
	private JButton btn3 = new JButton("");
	private JButton btn4 = new JButton("");
	private JButton btn5 = new JButton("");
	private JButton btn6 = new JButton("");
	private JButton btn7 = new JButton("");
	private JButton btn8 = new JButton("");
	private JButton btn9 = new JButton("");
	private JTextField txtCountX;
	private JTextField txtCountO;

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the application.
	 */
	public TicTacToe() {
		initialize();
	}

	// Methods

	private void choosePlayer() {
		if (startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		} else {
			startGame = "X";
		}
	}

	private void gameScore() {
		txtCountX.setText(String.valueOf(xCount));
		txtCountO.setText(String.valueOf(oCount));
	}

	private void gameWinner() {
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		if (b1.equals("X") && b2.equals("X") && b3.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b4.equals("X") && b5.equals("X") && b6.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b7.equals("X") && b8.equals("X") && b9.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b1.equals("X") && b4.equals("X") && b7.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b2.equals("X") && b5.equals("X") && b8.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b3.equals("X") && b6.equals("X") && b9.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b1.equals("X") && b5.equals("X") && b9.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		if (b3.equals("X") && b5.equals("X") && b7.equals("X")) {
			JOptionPane.showMessageDialog(frame, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}

		/// Player O Winning Combinations ///

		if (b1.equals("O") && b2.equals("O") && b3.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b4.equals("O") && b5.equals("O") && b6.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b7.equals("O") && b8.equals("O") && b9.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b1.equals("O") && b4.equals("O") && b7.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b2.equals("O") && b5.equals("O") && b8.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b3.equals("O") && b6.equals("O") && b9.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b1.equals("O") && b5.equals("O") && b9.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}

		if (b3.equals("O") && b5.equals("O") && b7.equals("O")) {
			JOptionPane.showMessageDialog(frame, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
				} else {
					btn1.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_1.add(btn1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
				} else {
					btn2.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_2.add(btn2, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
				} else {
					btn3.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_3.add(btn3, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel lblPlayerX = new JLabel("Player X:");
		lblPlayerX.setFont(new Font("Lucida Grande", Font.BOLD, 48));
		panel_4.add(lblPlayerX, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		txtCountX = new JTextField();
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setFont(new Font("Lucida Grande", Font.BOLD, 48));
		txtCountX.setText("0");
		panel_5.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
				} else {
					btn4.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_6.add(btn4, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
				} else {
					btn5.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_7.add(btn5, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
				} else {
					btn6.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_8.add(btn6, BorderLayout.CENTER);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblPlayerO = new JLabel("Player O:");
		lblPlayerO.setFont(new Font("Lucida Grande", Font.BOLD, 48));
		panel_9.add(lblPlayerO, BorderLayout.CENTER);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		txtCountO = new JTextField();
		txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountO.setFont(new Font("Lucida Grande", Font.BOLD, 48));
		txtCountO.setText("0");
		panel_10.add(txtCountO, BorderLayout.CENTER);
		txtCountO.setColumns(10);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
				} else {
					btn7.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_11.add(btn7, BorderLayout.CENTER);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
				} else {
					btn8.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_12.add(btn8, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
				} else {
					btn9.setForeground(Color.BLUE);
				}
				choosePlayer();
				gameWinner();
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 96));
		panel_13.add(btn9, BorderLayout.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
			}
		});
		btnReset.setFont(new Font("Lucida Grande", Font.BOLD, 58));
		panel_14.add(btnReset, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.BOLD, 58));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}
}
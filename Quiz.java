import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Quiz extends JFrame {

	private JPanel contentPane;
	int counter = 0;
	private final Action action = new SwingAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
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
	public Quiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel start = new JPanel();
		start.setBounds(39, 11, 307, 213);
		contentPane.add(start);
		start.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BTS Quiz!");
		lblNewLabel.setBounds(113, 28, 59, 30);
		start.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How well do you know BTS?");
		lblNewLabel_1.setBounds(77, 59, 196, 14);
		start.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6");
		lblNewLabel_2.setBounds(77, 107, 146, 14);
		start.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6\u10E6");
		lblNewLabel_3.setBounds(77, 168, 136, 14);
		start.add(lblNewLabel_3);
		
		JPanel first = new JPanel();
		first.setBounds(39, 11, 307, 213);
		contentPane.add(first);
		first.setLayout(null);
		
		JLabel lblJungkook = new JLabel("What is Jungkook's nickname?");
		lblJungkook.setBounds(71, 42, 171, 14);
		first.add(lblJungkook);
		
		
		JPanel second = new JPanel();
		second.setBounds(39, 11, 307, 213);
		contentPane.add(second);
		second.setLayout(null);
		
		JLabel lblRM = new JLabel("What position is RM?");
		lblRM.setBounds(105, 26, 146, 14);
		second.add(lblRM);
		
		
		
		JPanel third = new JPanel();
		third.setBounds(39, 11, 307, 213);
		contentPane.add(third);
		third.setLayout(null);
		
		JLabel lblSuga = new JLabel("What is Suga's favourite drink?");
		lblSuga.setBounds(77, 29, 173, 14);
		third.add(lblSuga);
		
		
		
		JPanel fourth = new JPanel();
		fourth.setBounds(39, 11, 307, 213);
		contentPane.add(fourth);
		fourth.setLayout(null);
		
		JLabel lblJimin = new JLabel("What is Jimin's BT21 character name?");
		lblJimin.setBounds(60, 31, 179, 14);
		fourth.add(lblJimin);
		
		
		
		JPanel fifth = new JPanel();
		fifth.setBounds(39, 11, 307, 213);
		contentPane.add(fifth);
		fifth.setLayout(null);
		
		JLabel lblBTS = new JLabel("What electronic brand sponsors BTS?");
		lblBTS.setBounds(60, 33, 203, 14);
		fifth.add(lblBTS);
		
		
		
		JPanel score = new JPanel();
		score.setBounds(39, 11, 307, 213);
		contentPane.add(score);
		score.setLayout(null);
		
		JButton btnBTSQuiz = new JButton("Start!");
		btnBTSQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setVisible(false);
				first.setVisible(true);
			}
		});
		
		btnBTSQuiz.setBounds(99, 134, 89, 23);
		start.add(btnBTSQuiz);
		
		JButton btnJungkookF = new JButton("Maknae on top");
		btnJungkookF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first.setVisible(false);
				second.setVisible(true);
			}
		});
		btnJungkookF.setBounds(10, 98, 112, 23);
		first.add(btnJungkookF);
		
		JButton btnJungkookT = new JButton("Golden Maknae");
		btnJungkookT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				first.setVisible(false);
				second.setVisible(true);
			}
		});
		btnJungkookT.setBounds(163, 98, 105, 23);
		first.add(btnJungkookT);
		
		JButton btnRMF = new JButton("Dancer");
		btnRMF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second.setVisible(false);
				third.setVisible(true);
			}
		});
		
		btnRMF.setBounds(10, 73, 89, 23);
		second.add(btnRMF);
		
		JButton btnRMT = new JButton("Leader");
		btnRMT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				second.setVisible(false);
				third.setVisible(true);
			}
		});
		
		btnRMT.setBounds(188, 73, 89, 23);
		second.add(btnRMT);
		
		JButton btnSugaF = new JButton("Boba");
		btnSugaF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				third.setVisible(false);
				fourth.setVisible(true);
			}
		});
		
		btnSugaF.setBounds(21, 73, 89, 23);
		third.add(btnSugaF);
		
		JButton btnSugaT = new JButton("Iced Americano");
		btnSugaT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				third.setVisible(false);
				fourth.setVisible(true);
			}
		});
		
		btnSugaT.setBounds(158, 73, 121, 23);
		third.add(btnSugaT);
		
		JButton btnJiminF = new JButton("ChimChim");
		btnJiminF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourth.setVisible(false);
				fifth.setVisible(true);
			}
		});
		
		btnJiminF.setBounds(10, 93, 89, 23);
		fourth.add(btnJiminF);
		
		JButton btnJiminT = new JButton("Chimmy");
		btnJiminT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				fourth.setVisible(false);
				fifth.setVisible(true);
			}
		});
		
		btnJiminT.setBounds(208, 93, 89, 23);
		fourth.add(btnJiminT);
		
		JButton btnBTSF = new JButton("Apple Inc.");
		btnBTSF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifth.setVisible(false);
				score.setVisible(true);
			}
		});
		
		btnBTSF.setBounds(25, 92, 89, 23);
		fifth.add(btnBTSF);
		
		JButton btnBTST = new JButton("Samsung Electronics");
		btnBTST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				fifth.setVisible(false);
				score.setVisible(true);
			}
		});
		
		btnBTST.setBounds(160, 92, 137, 23);
		fifth.add(btnBTST);
		
		
		JLabel lblScore = new JLabel("Number");
		lblScore.setBounds(127, 119, 46, 14);
		score.add(lblScore);
		
		JButton btnScore = new JButton("Score");
		btnScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblScore.setText(String.valueOf(counter));
				
			}
		});
		btnScore.setBounds(103, 52, 89, 23);
		score.add(btnScore);
		
		JLabel lblComment = new JLabel("[Comment]");
		lblComment.setBounds(127, 144, 46, 14);
		score.add(lblComment);
		
		first.setVisible(false);
		second.setVisible(false);
		third.setVisible(false);
		fourth.setVisible(false);
		fifth.setVisible(false);
		score.setVisible(false);
		start.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

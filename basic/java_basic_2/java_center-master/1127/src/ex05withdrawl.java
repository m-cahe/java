import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import DAO.DAO;
import model.insertVO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex05withdrawl {

	private JFrame frame;
	private JTextField textField_id;
	private JTextField textField_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex05withdrawl window = new ex05withdrawl();
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
	public ex05withdrawl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField_id = new JTextField();
		textField_id.setBounds(114, 52, 287, 44);
		frame.getContentPane().add(textField_id);
		textField_id.setColumns(10);

		textField_pw = new JTextField();
		textField_pw.setColumns(10);
		textField_pw.setBounds(114, 131, 287, 44);
		frame.getContentPane().add(textField_pw);

		JLabel lbl_id = new JLabel("id");
		lbl_id.setBounds(12, 55, 57, 41);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("pw");
		lbl_pw.setBounds(12, 134, 57, 41);
		frame.getContentPane().add(lbl_pw);

		JButton btn_delete = new JButton("delete");
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertVO vo = new insertVO(textField_id.getText(), textField_pw.getText());
				DAO dao = new DAO();
				int result = dao.withDrawal(vo);
				if (result > 0) {
					// 팝업창 띄우기
					JOptionPane.showMessageDialog(null, "삭제 성공", "삭제창", JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, "삭제 실패", "실패창", JOptionPane.ERROR_MESSAGE);
				}
				ex01login.main(null);
				frame.dispose();
			}
		});
		btn_delete.setBounds(85, 247, 316, 90);
		frame.getContentPane().add(btn_delete);
	}
}

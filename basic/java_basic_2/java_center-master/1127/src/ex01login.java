import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import DAO.DAO;
import model.insertVO;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex01login {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
//JDBC - GUI 연동

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex01login window = new ex01login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ex01login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(110, 130, 532, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		text_id = new JTextField();
		text_id.setBounds(75, 140, 330, 38);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);

		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(75, 210, 330, 38);
		frame.getContentPane().add(text_pw);

		JButton btn_login = new JButton("login");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// 1.txt_id, txt_pw 텍스트가져오기
				// 2. 이값들을 INsertVO 묶어주기
				// 3. DAO생성
				insertVO vo = new insertVO(text_id.getText(), text_pw.getText());
				DAO dao = new DAO();
				// 4. dao안에 로그인기능 수행
				String name = dao.login(vo);
				if (name != null) {
					// 로그인 성공시 ex03mypage로 이동
					ex03mypage ex03mypage = new ex03mypage(name);
					frame.dispose();
				}

			}
		});
		btn_login.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btn_login.setBounds(37, 284, 378, 38);
		frame.getContentPane().add(btn_login);

		JButton btn_insert = new JButton("join Membership");
		btn_insert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ex02insert.main(null);
				frame.dispose();
			}
		});

		btn_insert.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btn_insert.setBounds(37, 352, 378, 38);

		frame.getContentPane().add(btn_insert);

		JButton btn_delete = new JButton("membership With drawal");
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ex05withdrawl.main(null);
				frame.dispose();
			}
		});
		btn_delete.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btn_delete.setBounds(37, 433, 378, 38);
		frame.getContentPane().add(btn_delete);

		JLabel lbl_id = new JLabel("ID	:");
		lbl_id.setFont(new Font("Dubai", Font.ITALIC, 17));
		lbl_id.setBounds(20, 142, 43, 32);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("PW	:");
		lbl_pw.setFont(new Font("Dubai", Font.ITALIC, 17));
		lbl_pw.setBounds(20, 212, 43, 32);
		frame.getContentPane().add(lbl_pw);

		JLabel lbl_title = new JLabel("LOGIN SYSTEM");
		lbl_title.setFont(new Font("Bookman Old Style", Font.ITALIC, 35));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setToolTipText("");
		lbl_title.setBounds(75, 58, 330, 54);

		frame.getContentPane().add(lbl_title);
	}
}

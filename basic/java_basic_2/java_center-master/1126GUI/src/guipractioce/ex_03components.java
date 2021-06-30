package guipractioce;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

public class ex_03components {

	private JFrame frame;
	private JTextField text_name;
	private JRadioButton rb_man, btn_woman;
	private int R, G, B = 0;

	JButton btn_color;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_03components window = new ex_03components();
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
	public ex_03components() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_1043741226582700");

		JPanel panel = new JPanel();
		panel.setToolTipText("\uD654\uBA74 1");
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);

		JLabel lbl_name = new JLabel("\uC774    \uB8F8");
		lbl_name.setBounds(22, 30, 84, 29);
		panel.add(lbl_name);

		text_name = new JTextField();
		text_name.setBounds(124, 32, 238, 25);
		panel.add(text_name);
		text_name.setColumns(10);

		JLabel lbl_gender = new JLabel("\uC131    \uBCC4");
		lbl_gender.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_gender.setBounds(-47, 69, 110, 34);
		panel.add(lbl_gender);

		// button�̶�� components�� �ϳ��� �׷����� ��� �����ϴ� ��ü
		ButtonGroup group = new ButtonGroup();

		rb_man = new JRadioButton("\uB0A8\uC790");
		rb_man.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//Ŭ���ϴ¼��� rd_man�� �ִ� text�� �����ͼ� �ܼ�â�� ����ϱ�
				System.out.println(rb_man.getText());
			}
		});
		rb_man.setBounds(130, 75, 121, 23);
		panel.add(rb_man);

		btn_woman = new JRadioButton("\uC5EC\uC790");
		btn_woman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//Ŭ���ϴ¼��� btn_woman�� �ִ� text�� �����ͼ� �ܼ�â�� ����ϱ�

				System.out.println(btn_woman.getText());
			}
		});
		btn_woman.setBounds(255, 75, 121, 23);
		panel.add(btn_woman);
		// �� ���� ��ư�� setbounds �� �� �׷쿡 �߰�!!
		group.add(rb_man);
		group.add(btn_woman);

		JLabel lbl_hobby = new JLabel("\uCDE8    \uBBF8");
		lbl_hobby.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_hobby.setBounds(-47, 126, 110, 34);
		panel.add(lbl_hobby);

		JCheckBox cb_code = new JCheckBox("\uCF54\uB529");
		cb_code.setBounds(116, 132, 57, 23);
		panel.add(cb_code);

		JCheckBox cb_movie = new JCheckBox("\uC601\uD654");
		cb_movie.setBounds(202, 132, 62, 23);
		panel.add(cb_movie);

		JCheckBox cb_book = new JCheckBox("\uB3C5\uC11C");
		cb_book.setBounds(288, 132, 74, 23);
		panel.add(cb_book);

		JLabel lbl_combo = new JLabel("\uC870    \uD569");
		lbl_combo.setBounds(22, 186, 57, 15);
		panel.add(lbl_combo);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//���� ������ ������ ���� ������ͼ� �ܼ�â�� ���
				// 1. �޺��ڽ����� ������ ���� ������ ����
				System.out.println(comboBox.getSelectedItem());
				// 2. ����ϱ�
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uD53C\uC790 + \uC18C\uC8FC",
				"\uC721\uD68C + \uB9C9\uAC78\uB9AC", "\uBC29\uC5B4 + \uC18C\uB9E5" }));
		comboBox.setBounds(133, 186, 155, 15);
		panel.add(comboBox);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);

		btn_color = new JButton("color change!!!~~");
		btn_color.setForeground(SystemColor.textHighlight);
		btn_color.setFont(new Font("Dubai", Font.ITALIC, 20));
		btn_color.setBounds(29, 436, 353, 60);
		panel_1.add(btn_color);

		JSlider slider_r = new JSlider();
		slider_r.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// JSlider���� ��ġ���� �������� ���
				R = slider_r.getValue();
				// btn_color ��ư�� ������ �ٲܲ�
				// setBackground(Color ��ü)
				btn_color.setBackground(new Color(R, G, B));
				btn_color.setForeground(new Color(255 - R, 255 - G, 255 - B));

			}
		});
		slider_r.setMinorTickSpacing(10);
		slider_r.setMajorTickSpacing(50);
		slider_r.setForeground(Color.RED);
		slider_r.setSnapToTicks(true);
		slider_r.setPaintTicks(true);
		slider_r.setPaintLabels(true);
		slider_r.setMaximum(255);
		slider_r.setBounds(29, 25, 353, 40);
		panel_1.add(slider_r);

		JSlider slider_g = new JSlider();
		slider_g.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				G = slider_g.getValue();
				btn_color.setBackground(new Color(R, G, B));
				btn_color.setForeground(new Color(255 - R, 255 - G, 255 - B));
			}
		});
		slider_g.setForeground(Color.GREEN);
		slider_g.setMinorTickSpacing(10);
		slider_g.setMajorTickSpacing(50);
		slider_g.setSnapToTicks(true);
		slider_g.setPaintTicks(true);
		slider_g.setPaintLabels(true);
		slider_g.setMaximum(255);
		slider_g.setBounds(29, 135, 353, 40);
		panel_1.add(slider_g);

		JSlider slider_b = new JSlider();
		slider_b.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				B = slider_b.getValue();
				btn_color.setBackground(new Color(R, G, B));
				btn_color.setForeground(new Color(255 - R, 255 - G, 255 - B));
			}
		});
		slider_b.setForeground(Color.BLUE);
		slider_b.setMinorTickSpacing(10);
		slider_b.setMajorTickSpacing(50);
		slider_b.setMaximum(255);
		slider_b.setSnapToTicks(true);
		slider_b.setPaintTicks(true);
		slider_b.setPaintLabels(true);
		slider_b.setBounds(29, 251, 353, 46);
		panel_1.add(slider_b);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 21, 363, 502);
		panel_2.add(scrollPane);

		// column ���� ����ִ� String 1���� �迭
		String[] column = { "�̸�", "����", "����" };
		// data�� ����ִ� Object(�ֻ��� Ŭ���� ������ �迭)
		Object[][] data = { { "����", "20", "��" }, { "����ȣ", "21", "��" }, { "������", "28", "��" }, { "��������", "32", "��" },
				{ "����ȣ", "28", "��" }, { "������", "30", "��" }, { "����", "20", "��" }, { "����ȣ", "21", "��" },
				{ "������", "28", "��" }, { "��������", "32", "��" }, { "����ȣ", "28", "��" }, { "������", "30", "��" },
				{ "����", "20", "��" }, { "����ȣ", "21", "��" }, { "������", "28", "��" }, { "��������", "32", "��" },
				{ "����ȣ", "28", "��" }, { "������", "30", "��" }, { "����", "20", "��" }, { "����ȣ", "21", "��" },
				{ "������", "28", "��" }, { "��������", "32", "��" }, { "����ȣ", "28", "��" }, { "������", "30", "��" },
				{ "����", "20", "��" }, { "����ȣ", "21", "��" }, { "������", "28", "��" }, { "��������", "32", "��" },
				{ "����ȣ", "28", "��" }, { "������", "30", "��" } };

		table = new JTable(data, column);
		// table ������ ����(ĭ��) ũ�⸦ �����ϴ� ���
		table.setRowHeight(25);
		//scrollPane������ scroll ������ �ʴ´�!!!
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
	}
}

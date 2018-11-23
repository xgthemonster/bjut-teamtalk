package tt;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class UserInterface extends JFrame {
	JFrame jay = new JFrame();

	JPanel pnlMain;

	JPanel centerPanel;

	JPanel eastPanel;

	JMenuBar mbMain;

	JMenu mnu001, mnu002;

	JMenuItem mnu01, mnu02, mnu03, mnu04, mnu05, mnu06, mnu07;

	JToolBar t;

	JButton btn01;

	JButton btn02;
	
	static JTextArea txaShow;

	static JTextField txaInput;
	
	JButton btnSend;
	
	JButton btnExit;

	//����������

	public UserInterface() {
		super("ĳ�λ��飬��������һ����������");
		
		// ����˵���
		mbMain = new JMenuBar();
		mnu001 = new JMenu("����001��f��");
		mnu002 = new JMenu("����002��k��");// �����е��ǿ�ݼ��������趨

		mnu001.setMnemonic('f');
		mnu002.setMnemonic('k');

		mbMain.add(mnu001);
		mbMain.add(mnu002);

		mnu01 = new JMenuItem("01��");
		mnu02 = new JMenuItem("02��");
		mnu03 = new JMenuItem("03��");
		mnu04 = new JMenuItem("04��");
		mnu05 = new JMenuItem("05��");
		mnu06 = new JMenuItem("06��");
		mnu07 = new JMenuItem("07��");

		mnu001.add(mnu01);
		mnu001.add(mnu02);
		mnu001.add(mnu03);
		mnu001.add(mnu04);
		mnu002.add(mnu05);
		mnu002.add(mnu06);
		mnu002.add(mnu07);
		setJMenuBar(mbMain);

		// ���칤����,,�������ұ��е�գ����Լ�ͼ��ʲô��
		final JToolBar tb = new JToolBar();

		// ��Ӱ�ť��������
		JButton btn01 = null;
		JButton btn02 = null;
		btn01 = maketbButton("01", "01", "01");
		btn02 = maketbButton("02", "02", "02");
		tb.add(btn01);
		tb.add(btn02);
		final JPanel pnlMain = new JPanel(new BorderLayout());
		setContentPane(pnlMain);
		pnlMain.add(tb, BorderLayout.PAGE_START);

		// ��������������
		centerPanel = new showPanel();
		eastPanel = new otherPanel();
		add(centerPanel, "Center");
		add(eastPanel, "East");

		// ���ô�������
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	// ���칤������ť����maketbButon()��Ȼ�������ӹ���
	JButton maketbButton(final String strAction, final String txtToolTip, final String strAlter) {
		// ��ʼ�����߰�ť,���ð�ť�����������ʾ��Ϣ
		final JButton btnTemp = new JButton();
		btnTemp.setActionCommand(strAction);
		btnTemp.setToolTipText(txtToolTip);
		btnTemp.setText(strAlter);
		return btnTemp;
	}

	
	//	 centerPanel ����
	class showPanel extends JPanel {


		public showPanel() {
			setLayout(new FlowLayout());

			txaShow = new JTextArea("", 18, 48);
			txaInput = new JTextField(48);
			btnSend = new JButton("�������");
			btnExit = new JButton("�˳�");

			add(txaShow);
			add(txaInput);
			add(btnSend);
			add(btnExit);
			
		}
	}

	//	 eastPanel ���� ���ܻ�û��ȷ������ҪϹ���˰�
	class otherPanel extends JPanel {
		JButton btn01;

		JButton btn02;

		JButton btn03;

		JButton btn04;

		JButton btn05;

		public otherPanel() {
			setLayout(new GridLayout(5, 1));

			btn01 = new JButton("����1");
			btn02 = new JButton("����2");
			btn03 = new JButton("����3");
			btn04 = new JButton("����4");
			btn05 = new JButton("����5");

			add(btn01);
			add(btn02);
			add(btn03);
			add(btn04);
			add(btn05);
		}
	}
}

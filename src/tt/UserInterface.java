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

	//都是声明！

	public UserInterface() {
		super("某次会议，，可以用一个变量代替");
		
		// 构造菜单栏
		mbMain = new JMenuBar();
		mnu001 = new JMenu("功能001（f）");
		mnu002 = new JMenu("功能002（k）");// 括号中的是快捷键，可以设定

		mnu001.setMnemonic('f');
		mnu002.setMnemonic('k');

		mbMain.add(mnu001);
		mbMain.add(mnu002);

		mnu01 = new JMenuItem("01项");
		mnu02 = new JMenuItem("02项");
		mnu03 = new JMenuItem("03项");
		mnu04 = new JMenuItem("04项");
		mnu05 = new JMenuItem("05项");
		mnu06 = new JMenuItem("06项");
		mnu07 = new JMenuItem("07项");

		mnu001.add(mnu01);
		mnu001.add(mnu02);
		mnu001.add(mnu03);
		mnu001.add(mnu04);
		mnu002.add(mnu05);
		mnu002.add(mnu06);
		mnu002.add(mnu07);
		setJMenuBar(mbMain);

		// 构造工具栏,,工具栏右边有点空，可以加图案什么的
		final JToolBar tb = new JToolBar();

		// 添加按钮到工具栏
		JButton btn01 = null;
		JButton btn02 = null;
		btn01 = maketbButton("01", "01", "01");
		btn02 = maketbButton("02", "02", "02");
		tb.add(btn01);
		tb.add(btn02);
		final JPanel pnlMain = new JPanel(new BorderLayout());
		setContentPane(pnlMain);
		pnlMain.add(tb, BorderLayout.PAGE_START);

		// 添加其他功能面板
		centerPanel = new showPanel();
		eastPanel = new otherPanel();
		add(centerPanel, "Center");
		add(eastPanel, "East");

		// 设置窗口属性
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	// 构造工具栏按钮方法maketbButon()当然可以增加功能
	JButton maketbButton(final String strAction, final String txtToolTip, final String strAlter) {
		// 初始化工具按钮,设置按钮命令，及设置提示信息
		final JButton btnTemp = new JButton();
		btnTemp.setActionCommand(strAction);
		btnTemp.setToolTipText(txtToolTip);
		btnTemp.setText(strAlter);
		return btnTemp;
	}

	
	//	 centerPanel 的类
	class showPanel extends JPanel {


		public showPanel() {
			setLayout(new FlowLayout());

			txaShow = new JTextArea("", 18, 48);
			txaInput = new JTextField(48);
			btnSend = new JButton("点击发送");
			btnExit = new JButton("退出");

			add(txaShow);
			add(txaInput);
			add(btnSend);
			add(btnExit);
			
		}
	}

	//	 eastPanel 的类 功能还没有确定，我要瞎编了啊
	class otherPanel extends JPanel {
		JButton btn01;

		JButton btn02;

		JButton btn03;

		JButton btn04;

		JButton btn05;

		public otherPanel() {
			setLayout(new GridLayout(5, 1));

			btn01 = new JButton("变量1");
			btn02 = new JButton("变量2");
			btn03 = new JButton("变量3");
			btn04 = new JButton("变量4");
			btn05 = new JButton("变量5");

			add(btn01);
			add(btn02);
			add(btn03);
			add(btn04);
			add(btn05);
		}
	}
}
